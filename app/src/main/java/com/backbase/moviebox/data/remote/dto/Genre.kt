package com.backbase.moviebox.data.remote.dto

/**
 * Genre will be used in mapping data from API response with GSON converter where Genre object is
 * present. Not nullable
 */
data class Genre(
    val id: Int,
    val name: String
)
