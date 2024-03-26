package com.backbase.moviebox.di;

import java.lang.System;

/**
 * DI module fo the application
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/backbase/moviebox/di/AppModule;", "", "()V", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "providesMovieDbAPI", "Lcom/backbase/moviebox/data/remote/MovieDbAPI;", "client", "providesMovieRepository", "Lcom/backbase/moviebox/domain/repository/MovieRepository;", "api", "app_release"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.backbase.moviebox.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    /**
     * OkHttpClient from connection timeouts and logs
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    /**
     * Retrofit instance for the application
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.backbase.moviebox.data.remote.MovieDbAPI providesMovieDbAPI(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    /**
     * Movie repo that will create an instance of impl of the repo.
     * Using this to call the APIs
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.backbase.moviebox.domain.repository.MovieRepository providesMovieRepository(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.data.remote.MovieDbAPI api) {
        return null;
    }
}