package com.backbase.moviebox.presentation.playing_now

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.backbase.moviebox.MainCoroutineRule
import com.backbase.moviebox.data.repositories.FakeMovieRepository
import com.backbase.moviebox.domain.use_case.get_playing_now.GetNowPlayingMoviesUseCase
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class PlayingNowViewModelTest{

    private lateinit var viewModelError: PlayingNowViewModel
    private lateinit var viewModelSuccess: PlayingNowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @Before
    fun setup(){
        viewModelError = PlayingNowViewModel(GetNowPlayingMoviesUseCase(FakeMovieRepository().apply {setShouldReturnNetworkError(true)}))
        viewModelSuccess = PlayingNowViewModel(GetNowPlayingMoviesUseCase(FakeMovieRepository().apply {setShouldReturnNetworkError(false)}))
    }

    @Test
    fun `error on getNowPlayingMovies isTrue`(){
        val result = viewModelError.state.value
        assertThat(result.error.isNotBlank()).isTrue()
    }

    @Test
    fun `success on getNowPlayingMovies isTrue`(){
        val result = viewModelSuccess.state.value
        assertThat(result.movies.isNotEmpty()).isTrue()
    }

    @Test
    fun `success on getNowPlayingMovies and movie object two present isTrue`(){
        val result = viewModelSuccess.state.value
        assertThat(result.movies.size>2).isTrue()
        assertThat(result.movies[1].original_title == "title1").isTrue()
    }
}