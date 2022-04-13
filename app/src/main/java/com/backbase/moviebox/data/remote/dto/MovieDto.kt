package com.backbase.moviebox.data.remote.dto

import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MoviePage

/**
 * MovieDto will used by both PlayNow, Popular movies API calls
 */
data class MovieDto(
    val dates: Dates,
    val page: Int,
    val results: List<MovieItem>,
    val total_pages: Int,
    val total_results: Int
)

/**
 * Not used in the project
 */
data class Dates(
    val maximum: String = "",
    val minimum: String = ""
)

/**
 * MovieItem will used by the GSON converter to map movie object
 */
data class MovieItem(
    val adult: Boolean = false,
    val backdrop_path: String = "",
    val genre_ids: List<Int> = emptyList(),
    val id: Int = 0,
    val original_language: String = "",
    val original_title: String = "",
    val overview: String = "",
    val popularity: Double = 0.0,
    val poster_path: String = "",
    val release_date: String = "",
    val title: String = "",
    val video: Boolean = false,
    val vote_average: Double = 0.0,
    val vote_count: Int = 0
)

/**
 * MovieDto to convert list of movies
 */
fun MovieDto.toMovies(): MutableList<Movie> {
    return results.map {
        Movie(
            backdrop_path = it.backdrop_path ?: "",
            genre_ids = it.genre_ids,
            id = it.id,
            original_title = it.original_title,
            overview = it.overview,
            popularity = it.popularity,
            poster_path = it.poster_path,
            release_date = it.release_date,
            title = it.title,
            vote_average = it.vote_average,
            vote_count = it.vote_count
        )
    }.toList() as MutableList<Movie>
}

/**
 * MovieDto convert to movie page for pagination logic
 */
fun MovieDto.toPage(): MoviePage {
    return MoviePage(
        page = page,
        results = this.toMovies(),
        total_pages = total_pages,
        total_results = total_results
    )
}