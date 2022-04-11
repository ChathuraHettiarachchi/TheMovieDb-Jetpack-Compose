package com.backbase.moviebox.domain.repository

import com.backbase.moviebox.data.remote.dto.GenreDto
import com.backbase.moviebox.data.remote.dto.MovieDetailsDto
import com.backbase.moviebox.data.remote.dto.MovieDto

interface MovieRepository {
    suspend fun getNowPlayingMovies(): MovieDto
    suspend fun getPopularMovies(): MovieDto
    suspend fun getMovieDetails(): MovieDetailsDto
    suspend fun getMovieGenres(): GenreDto
}