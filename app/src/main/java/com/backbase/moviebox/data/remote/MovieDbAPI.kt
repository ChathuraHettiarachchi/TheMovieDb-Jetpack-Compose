package com.backbase.moviebox.data.remote

import com.backbase.moviebox.common.Constants
import com.backbase.moviebox.data.remote.dto.GenreDto
import com.backbase.moviebox.data.remote.dto.MovieDetailsDto
import com.backbase.moviebox.data.remote.dto.MovieDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieDbAPI {
    @GET("/3/movie/now_playing")
    suspend fun getNowPlayingMovies(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") lan: String = "en-US",
        @Query("page") page: String = "undefined"
    ): MovieDto

    @GET("/3/movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") lan: String = "en-US",
        @Query("page") page: Int = 1
    ): MovieDto

    @GET("/3/movie/{movieId}")
    suspend fun getMovieDetails(
        @Path("movieId") movieId:Long,
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") lan: String = "en-US"
    ): MovieDetailsDto

    @GET("/3/genre/movie/list")
    suspend fun getMovieGenres(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") lan: String = "en-US"
    ): GenreDto
}