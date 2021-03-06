package com.backbase.moviebox.data.remote.dto

/**
 * GenreDto will catch genres from API when converting with GSON
 */
data class GenreDto(
    val genres: List<Genre>
)

/**
 *  GenreDto to convert list of genre to loading
 */
fun GenreDto.toGenres(): List<com.backbase.moviebox.domain.model.Genre> {
    return genres.map {
        com.backbase.moviebox.domain.model.Genre(
            id = it.id,
            name = it.name
        )
    }.toList() as List<com.backbase.moviebox.domain.model.Genre>
}