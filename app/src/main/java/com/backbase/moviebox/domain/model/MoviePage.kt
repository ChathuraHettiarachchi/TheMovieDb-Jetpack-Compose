package com.backbase.moviebox.domain.model

/**
 * UI moviePage model
 */
data class MoviePage(
    var page: Int = 0,
    var results: MutableList<Movie> = mutableListOf(),
    var total_pages: Int = 0,
    var total_results: Int = 0
)