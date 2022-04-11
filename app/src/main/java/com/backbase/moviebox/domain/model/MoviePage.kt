package com.backbase.moviebox.domain.model

data class MoviePage(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)