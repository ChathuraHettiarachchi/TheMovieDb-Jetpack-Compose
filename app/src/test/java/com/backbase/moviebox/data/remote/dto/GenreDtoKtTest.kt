package com.backbase.moviebox.data.remote.dto

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class GenreDtoKtTest{
    val genreDto = GenreDto(
        listOf(Genre(0, "genre0"), Genre(1, "genre1"))
    )

    @Test
    fun `verify genreDto can generate genre list isTrue`(){
        val data = genreDto.toGenres()
        assertThat(data.size == 2).isTrue()
    }

    @Test
    fun `verify genreDto_genre_list contains correct values isTrue`(){
        val data = genreDto.toGenres()
        assertThat(data[1].id == 1 && data[1].name == "genre1").isTrue()
    }
}