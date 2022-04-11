package com.backbase.moviebox.data.remote.dto

data class GenreDto(
    val genres: List<Genre>
)

fun GenreDto.toGenres(): List<com.backbase.moviebox.domain.model.Genre> {
    return genres.map {
        com.backbase.moviebox.domain.model.Genre(
            id = it.id,
            name = it.name
        )
    }.toList() as List<com.backbase.moviebox.domain.model.Genre>
}