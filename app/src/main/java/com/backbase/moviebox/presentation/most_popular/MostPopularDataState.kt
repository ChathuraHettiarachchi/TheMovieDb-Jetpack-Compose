package com.backbase.moviebox.presentation.most_popular

import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MoviePage

/**
 * State for popular movie list
 */
data class MostPopularDataState(
    var isLoading: Boolean = false,
    var data: MoviePage = MoviePage(),
    var error: String = ""
)
