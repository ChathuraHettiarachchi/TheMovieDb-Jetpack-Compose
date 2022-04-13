package com.backbase.moviebox.domain.use_case.get_playing_now

import android.arch.core.executor.testing.InstantTaskExecutorRule
import app.cash.turbine.test
import com.backbase.moviebox.MainCoroutineRule
import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.data.repositories.FakeMovieRepository
import com.backbase.moviebox.domain.model.Movie
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.flow.collect

import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class GetNowPlayingMoviesUseCaseTest {

    private lateinit var useCaseError: GetNowPlayingMoviesUseCase
    private lateinit var useCaseSuccess: GetNowPlayingMoviesUseCase

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        useCaseError = GetNowPlayingMoviesUseCase(FakeMovieRepository().apply {
            setShouldReturnNetworkError(value = true)
        })
        useCaseSuccess = GetNowPlayingMoviesUseCase(FakeMovieRepository().apply {
            setShouldReturnNetworkError(value = false)
        })
    }

    @Test
    fun `verify state change from loading to error on API or any error`() = runBlocking{
        useCaseError.invoke().test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitError = awaitItem()
            assertThat(emitError).isInstanceOf(Resource.Error::class.java)

            awaitComplete()
        }
    }

    @Test
    fun `verify state change from loading to success on API success`() = runBlocking{
        useCaseSuccess.invoke().test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitSuccess = awaitItem()
            assertThat(emitSuccess).isInstanceOf(Resource.Success::class.java)

            awaitComplete()
        }
    }

    @Test
    fun `verify API success return movie list`() = runBlocking{
        useCaseSuccess.invoke().test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitSuccess = awaitItem()
            assertThat(emitSuccess).isInstanceOf(Resource.Success::class.java)
            
            assertThat(emitSuccess.data!!.size>2).isTrue()

            awaitComplete()
        }
    }
}