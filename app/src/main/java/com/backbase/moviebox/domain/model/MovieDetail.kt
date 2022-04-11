package com.backbase.moviebox.domain.model

import com.backbase.moviebox.data.remote.dto.*
import com.backbase.moviebox.data.remote.dto.Genre

data class MovieDetail(
    val backdrop_path: String = "",
    val genres: List<Genre> = emptyList(),
    val id: Int = 0,
    val original_title: String = "",
    val overview: String = "",
    val popularity: Double = 0.0,
    val poster_path: String = "",
    val release_date: String = "",
    val runtime: Int = 0,
    val spoken_languages: List<SpokenLanguage> = emptyList(),
    val title: String = "",
)
