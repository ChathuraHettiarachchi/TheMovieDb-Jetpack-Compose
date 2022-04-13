package com.backbase.moviebox.presentation.most_popular

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.backbase.moviebox.MainCoroutineRule
import com.backbase.moviebox.data.repositories.FakeMovieRepository
import com.backbase.moviebox.domain.use_case.get_popular.GetPopularMoviesUseCase
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MostPopularViewModelTest{
    private lateinit var viewModelError: MostPopularViewModel
    private lateinit var viewModelSuccess: MostPopularViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @Before
    fun setup(){
        viewModelError = MostPopularViewModel(GetPopularMoviesUseCase(FakeMovieRepository().apply {setShouldReturnNetworkError(true)}))
        viewModelSuccess = MostPopularViewModel(GetPopularMoviesUseCase(FakeMovieRepository().apply {setShouldReturnNetworkError(false)}))
    }

    @Test
    fun `error on getNowPlayingMovies isTrue`(){
        val result = viewModelError.state.value
        assertThat(result.error.isNotBlank()).isTrue()
    }

    @Test
    fun `success on getNowPlayingMovies isTrue`(){
        val result = viewModelSuccess.state.value
        assertThat(result.data.results.isNotEmpty()).isTrue()
    }

    @Test
    fun `success on getNowPlayingMovies and movie object two present isTrue`(){
        val result = viewModelSuccess.state.value
        assertThat(result.data.results.size>2).isTrue()
        assertThat(result.data.results[1].original_title == "title1").isTrue()
    }

    @Test
    fun `verify that next page request will append data to previous list of movies`(){
        val result = viewModelSuccess.state.value
        val pages = viewModelSuccess.pages.value

        assertThat(result.data.results.size>2).isTrue()
        assertThat(result.data.results[1].original_title == "title1").isTrue()
        assertThat(pages.size>2).isTrue()

        viewModelSuccess.requestNextPage()
        assertThat(pages.size>4).isTrue()
        assertThat(pages[1].original_title == "title1").isTrue()
        assertThat(pages[3].original_title == "title").isTrue()
    }
}