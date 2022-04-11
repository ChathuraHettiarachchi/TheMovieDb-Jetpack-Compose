package com.backbase.moviebox.data.remote

import com.backbase.moviebox.data.remote.dto.GenreDto
import com.backbase.moviebox.data.remote.dto.MovieDetailsDto
import com.backbase.moviebox.data.remote.dto.MovieDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieDbAPI {
    @GET("/3/movie/now_playing")
    fun getNowPlayingMovies(
        @Query("api_key") apiKey: String,
        @Query("language") lan: String = "en-US",
        @Query("page") page: String = "undefined"
    ): MovieDto

    @GET("/3/movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String,
        @Query("language") lan: String = "en-US",
        @Query("page") page: Int = 0
    ): MovieDto

    @GET("/3/movie/{movieId}")
    fun getMovieDetails(
        @Path("movieId") movieId:Long,
        @Query("api_key") apiKey: String,
        @Query("language") lan: String = "en-US"
    ): MovieDetailsDto

    @GET("/3/movie/list")
    fun getMovieGenres(
        @Query("api_key") apiKey: String,
        @Query("language") lan: String = "en-US"
    ): GenreDto
}