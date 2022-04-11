package com.backbase.moviebox.presentation.playing_now

import com.backbase.moviebox.domain.model.Movie

data class PlayingNowListState(
    val isLoading: Boolean = false,
    val movies: List<Movie> = emptyList(),
    val error: String = ""
)
