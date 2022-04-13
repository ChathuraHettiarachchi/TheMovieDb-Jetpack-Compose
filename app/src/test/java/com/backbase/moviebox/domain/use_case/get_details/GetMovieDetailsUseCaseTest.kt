package com.backbase.moviebox.domain.use_case.get_details

import app.cash.turbine.test
import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.data.repositories.FakeMovieRepository
import com.backbase.moviebox.domain.use_case.get_genres.GetMovieGenresUseCase
import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class GetMovieDetailsUseCaseTest{
    private lateinit var useCaseError: GetMovieDetailsUseCase
    private lateinit var useCaseSuccess: GetMovieDetailsUseCase

    private val id = 100L

    @Before
    fun setup(){
        useCaseError = GetMovieDetailsUseCase(FakeMovieRepository().apply { setShouldReturnNetworkError(true) })
        useCaseSuccess = GetMovieDetailsUseCase(FakeMovieRepository().apply { setShouldReturnNetworkError(false) })
    }

    @Test
    fun `verify state change from loading to error on API or any error`() = runBlocking{
        useCaseError.invoke(id).test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitError = awaitItem()
            assertThat(emitError).isInstanceOf(Resource.Error::class.java)

            awaitComplete()
        }
    }

    @Test
    fun `verify state change from loading to success on API success`() = runBlocking{
        useCaseSuccess.invoke(id).test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitSuccess = awaitItem()
            assertThat(emitSuccess).isInstanceOf(Resource.Success::class.java)

            awaitComplete()
        }
    }

    @Test
    fun `verify API success return movie details`() = runBlocking{
        useCaseSuccess.invoke(id).test {
            val emitLoading = awaitItem()
            assertThat(emitLoading).isInstanceOf(Resource.Loading::class.java)

            val emitSuccess = awaitItem()
            assertThat(emitSuccess).isInstanceOf(Resource.Success::class.java)

            assertThat(emitSuccess.data!!.id == 100).isTrue()

            awaitComplete()
        }
    }
}