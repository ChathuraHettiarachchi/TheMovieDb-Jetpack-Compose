package com.backbase.moviebox.data.remote.dto

import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MoviePage

data class MovieDto(
    val dates: Dates,
    val page: Int,
    val results: List<MovieItem>,
    val total_pages: Int,
    val total_results: Int
)

data class Dates(
    val maximum: String,
    val minimum: String
)

data class MovieItem(
    val adult: Boolean,
    val backdrop_path: String?,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)

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

fun MovieDto.toPage(): MoviePage {
    return MoviePage(
        page = page,
        results = this.toMovies(),
        total_pages = total_pages,
        total_results = total_results
    )
}