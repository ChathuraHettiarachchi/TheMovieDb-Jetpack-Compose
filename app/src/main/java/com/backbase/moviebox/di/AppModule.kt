package com.backbase.moviebox.di

import com.backbase.moviebox.common.Constants
import com.backbase.moviebox.data.remote.MovieDbAPI
import com.backbase.moviebox.data.repositories.MovieRepositoryImpl
import com.backbase.moviebox.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * DI module fo the application
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /**
     * OkHttpClient from connection timeouts and logs
     */
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    /**
     * Retrofit instance for the application
     */
    @Provides
    @Singleton
    fun providesMovieDbAPI(client: OkHttpClient): MovieDbAPI {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieDbAPI::class.java)
    }

    /**
     * Movie repo that will create an instance of impl of the repo.
     * Using this to call the APIs
     */
    @Provides
    @Singleton
    fun providesMovieRepository(api: MovieDbAPI): MovieRepository {
        return MovieRepositoryImpl(api)
    }
}