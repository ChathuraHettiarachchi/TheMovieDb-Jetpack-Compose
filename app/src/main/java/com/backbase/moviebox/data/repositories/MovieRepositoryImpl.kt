package com.backbase.moviebox.data.repositories

import com.backbase.moviebox.data.remote.MovieDbAPI
import com.backbase.moviebox.data.remote.dto.GenreDto
import com.backbase.moviebox.data.remote.dto.MovieDetailsDto
import com.backbase.moviebox.data.remote.dto.MovieDto
import com.backbase.moviebox.domain.repository.MovieRepository
import javax.inject.Inject

/**
 * MovieAPI implementation from domain repository. This implements the actions defined in the
 * repo of domain package.
 * Reason is to support great scalability.
 */
class MovieRepositoryImpl @Inject constructor(
    private val api: MovieDbAPI
) : MovieRepository {

    /**
     * Get now playing movies
     */
    override suspend fun getNowPlayingMovies(): MovieDto {
        return api.getNowPlayingMovies()
    }

    /**
     * Get popular movies.
     *
     * @param pageNumber will be used in pagination
     */
    override suspend fun getPopularMovies(pageNumber: Int): MovieDto {
        return api.getPopularMovies(page = pageNumber)
    }

    /**
     * Get movie details
     *
     * @param id will be the movie id that needs to find the details of
     */
    override suspend fun getMovieDetails(id: Long): MovieDetailsDto {
        return api.getMovieDetails(movieId = id)
    }

    /**
     * Get genre list from the API
     */
    override suspend fun getMovieGenres(): GenreDto {
        return api.getMovieGenres()
    }
}