package com.backbase.moviebox.domain.use_case.get_genres

import app.cash.turbine.test
import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.data.repositories.FakeMovieRepository
import com.backbase.moviebox.domain.use_case.get_details.GetMovieDetailsUseCase
import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class GetMovieGenresUseCaseTest{
    private lateinit var useCaseGenreError: GetMovieGenresUseCase
    private lateinit var useCaseGenreSuccess: GetMovieGenresUseCase

    @Before
    fun setup(){
        useCaseGenreError = GetMovieGenresUseCase(FakeMovieRepository().apply { setShouldReturnNetworkError(true) })
        useCaseGenreSuccess = GetMovieGenresUseCase(FakeMovieRepository().apply { setShouldReturnNetworkError(false) })
    }

    // genre useCase testing
    @Test
    fun `verify genre state change from loading to error on API or any error`() = runBlocking{
        useCaseGenreError.invoke().test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitError = awaitItem()
            assertThat(emitError).isInstanceOf(Resource.Error::class.java)

            awaitComplete()
        }
    }

    @Test
    fun `verify genre state change from loading to success on API success`() = runBlocking{
        useCaseGenreSuccess.invoke().test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitSuccess = awaitItem()
            assertThat(emitSuccess).isInstanceOf(Resource.Success::class.java)

            awaitComplete()
        }
    }

    @Test
    fun `verify genre API success return genre details`() = runBlocking{
        useCaseGenreSuccess.invoke().test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitSuccess = awaitItem()
            assertThat(emitSuccess).isInstanceOf(Resource.Success::class.java)

            assertThat(emitSuccess.data!!.size>1).isTrue()
            Truth.assertThat(emitSuccess.data!![1].name == "genre1").isTrue()

            awaitComplete()
        }
    }
}