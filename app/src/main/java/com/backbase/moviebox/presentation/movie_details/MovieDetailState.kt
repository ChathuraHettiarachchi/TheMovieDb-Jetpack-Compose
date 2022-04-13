package com.backbase.moviebox.presentation.movie_details

import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MovieDetail
import com.backbase.moviebox.domain.model.MoviePage

/**
 * State for movie details
 */
data class MovieDetailState(
    val isLoading: Boolean = false,
    val data: MovieDetail = MovieDetail(),
    val error: String = ""
)
