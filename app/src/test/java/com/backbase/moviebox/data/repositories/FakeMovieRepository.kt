package com.backbase.moviebox.data.repositories

import com.backbase.moviebox.data.remote.dto.*
import com.backbase.moviebox.domain.repository.MovieRepository
import java.net.SocketException

class FakeMovieRepository : MovieRepository {

    private var shouldReturnNetworkError = false

    fun setShouldReturnNetworkError(value: Boolean) {
        shouldReturnNetworkError = value
    }

    override suspend fun getNowPlayingMovies(): MovieDto {
        if (shouldReturnNetworkError)
            throw SocketException("Unable to get the data object from server")
        else
            return MovieDto(
                Dates("", ""),
                1,
                listOf(
                    MovieItem(backdrop_path = "path", original_title = "title"),
                    MovieItem(backdrop_path = "path1", original_title = "title1"),
                    MovieItem(backdrop_path = "path2", original_title = "title2")
                ),
                2,
                6
            )
    }

    override suspend fun getPopularMovies(pageNumber: Int): MovieDto {
        if (shouldReturnNetworkError)
            throw SocketException("Unable to get the data object from server")
        else
            return MovieDto(
                Dates("", ""),
                1,
                listOf(
                    MovieItem(backdrop_path = "path", original_title = "title"),
                    MovieItem(backdrop_path = "path1", original_title = "title1"),
                    MovieItem(backdrop_path = "path2", original_title = "title2")
                ),
                2,
                6
            )
    }

    override suspend fun getMovieDetails(id: Long): MovieDetailsDto {
        if (shouldReturnNetworkError)
            throw SocketException("Unable to get the data object from server")
        else
            return MovieDetailsDto(
                backdrop_path = "path",
                genres = listOf(Genre(0, "genre0"), Genre(1, "genre1")),
                id = 100,
                overview = "This is Overview"
            )
    }

    override suspend fun getMovieGenres(): GenreDto {
        if (shouldReturnNetworkError)
            throw SocketException("Unable to get the data object from server")
        else
            return GenreDto(
                listOf(Genre(0, "genre0"), Genre(1, "genre1"))
            )
    }
}