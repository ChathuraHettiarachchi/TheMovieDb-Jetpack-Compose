package com.backbase.moviebox.data.repositories

import com.backbase.moviebox.data.remote.MovieDbAPI
import com.backbase.moviebox.data.remote.dto.GenreDto
import com.backbase.moviebox.data.remote.dto.MovieDetailsDto
import com.backbase.moviebox.data.remote.dto.MovieDto
import com.backbase.moviebox.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api: MovieDbAPI
) : MovieRepository {
    override suspend fun getNowPlayingMovies(): MovieDto {
        return api.getNowPlayingMovies()
    }

    override suspend fun getPopularMovies(pageNumber: Int): MovieDto {
        return api.getPopularMovies(page = pageNumber)
    }

    override suspend fun getMovieDetails(id: Long): MovieDetailsDto {
        return api.getMovieDetails(movieId = id)
    }

    override suspend fun getMovieGenres(): GenreDto {
        return api.getMovieGenres()
    }
}