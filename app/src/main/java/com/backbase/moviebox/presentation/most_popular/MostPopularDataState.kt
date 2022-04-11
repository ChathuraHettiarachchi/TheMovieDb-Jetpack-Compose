package com.backbase.moviebox.presentation.most_popular

import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MoviePage

data class MostPopularDataState(
    val isLoading: Boolean = false,
    val data: MoviePage = MoviePage(),
    val error: String = ""
)
