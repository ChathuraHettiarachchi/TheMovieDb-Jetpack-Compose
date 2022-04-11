package com.backbase.moviebox.domain.model

data class MoviePage(
    val page: Int = 0,
    val results: List<Movie> = emptyList(),
    val total_pages: Int = 0,
    val total_results: Int = 0
)