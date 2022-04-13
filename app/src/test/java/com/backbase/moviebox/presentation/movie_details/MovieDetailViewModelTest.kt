package com.backbase.moviebox.presentation.movie_details

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.os.Bundle
import android.provider.SyncStateContract
import androidx.compose.ui.unit.Constraints
import androidx.lifecycle.SavedStateHandle
import com.backbase.moviebox.MainCoroutineRule
import com.backbase.moviebox.common.Constants
import com.backbase.moviebox.data.repositories.FakeMovieRepository
import com.backbase.moviebox.domain.use_case.get_details.GetMovieDetailsUseCase
import com.backbase.moviebox.domain.use_case.get_genres.GetMovieGenresUseCase
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MovieDetailViewModelTest {

    private lateinit var viewModelError: MovieDetailViewModel
    private lateinit var viewModelSuccess: MovieDetailViewModel

    private lateinit var repository: FakeMovieRepository
    private lateinit var savedState: SavedStateHandle

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @Before
    fun setup() {
        repository = FakeMovieRepository()
        savedState = SavedStateHandle().apply {
            set(Constants.MOVIE_ID, "100")
        }

        viewModelError = MovieDetailViewModel(
            GetMovieDetailsUseCase(repository.apply {
                setShouldReturnNetworkError(true)
            }),
            GetMovieGenresUseCase(repository.apply { setShouldReturnNetworkError(true) }),
            savedState
        )

        viewModelSuccess = MovieDetailViewModel(
            GetMovieDetailsUseCase(repository.apply {
                setShouldReturnNetworkError(false)
            }),
            GetMovieGenresUseCase(repository.apply { setShouldReturnNetworkError(false) }),
            savedState
        )
    }

    @Test
    fun `error on getDetails isTrue`(){
        val result = viewModelError.stateDetails.value
        assertThat(result.error.isNotBlank()).isTrue()
    }

    @Test
    fun `success on getDetails isTrue`(){
        val result = viewModelSuccess.stateDetails.value
        assertThat(result.data.backdrop_path.isNotBlank()).isTrue()
    }

    @Test
    fun `success on getDetails and movie object has correct data isTrue`(){
        val result = viewModelSuccess.stateDetails.value
        assertThat(result.data.id == 100).isTrue()
    }

    // genre vm action test
    @Test
    fun `error on genres isTrue`(){
        val result = viewModelError.state.value
        assertThat(result.error.isNotBlank()).isTrue()
    }

    @Test
    fun `success on genres isTrue`(){
        val result = viewModelSuccess.state.value
        assertThat(result.data.isNotEmpty()).isTrue()
    }

    @Test
    fun `success on genres and genre object has correct data isTrue`(){
        val result = viewModelSuccess.state.value
        assertThat(result.data.size > 1).isTrue()
        assertThat(result.data[1].name == "genre1").isTrue()
    }
}