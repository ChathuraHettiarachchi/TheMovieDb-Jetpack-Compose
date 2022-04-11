package com.backbase.moviebox.presentation.movie_details

import com.backbase.moviebox.domain.model.Genre
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MovieDetail
import com.backbase.moviebox.domain.model.MoviePage

data class GenreState(
    val isLoading: Boolean = false,
    val data: List<Genre> = emptyList(),
    val error: String = ""
)
