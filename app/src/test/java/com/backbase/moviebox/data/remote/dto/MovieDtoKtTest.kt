package com.backbase.moviebox.data.remote.dto

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MovieDtoKtTest {

    val movieDto = MovieDto(
        Dates("", ""),
        1,
        listOf(
            MovieItem(backdrop_path = "path", original_title = "title"),
            MovieItem(backdrop_path = "path1", original_title = "title1"),
            MovieItem(backdrop_path = "path2", original_title = "title2")
        ),
        2,
        6
    )

    @Test
    fun `verify movieDto can convert to listOfMovies isTrue`() {
        val listOfMovies = movieDto.toMovies()
        assertThat(listOfMovies.size == 3).isTrue()
    }

    @Test
    fun `verify movieDto_toMovies set correct data isTrue`() {
        val listOfMovies = movieDto.toMovies()
        assertThat(listOfMovies[1].backdrop_path == "path1").isTrue()
    }

    @Test
    fun `verify movieDto can convert to moviePage isTrue`() {
        val page = movieDto.toPage()
        assertThat(page.page==1).isTrue()
    }

    @Test
    fun `verify movieDto_toPage set correct data isTrue`() {
        val page = movieDto.toPage()
        assertThat(page.results[1].backdrop_path == "path1").isTrue()
    }
}