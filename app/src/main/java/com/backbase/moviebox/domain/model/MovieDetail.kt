package com.backbase.moviebox.domain.model

import com.backbase.moviebox.data.remote.dto.*
import com.backbase.moviebox.data.remote.dto.Genre

data class MovieDetail(
    val backdrop_path: String,
    val genres: List<Genre>,
    val id: Int,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val runtime: Int,
    val spoken_languages: List<SpokenLanguage>,
    val title: String,
)
