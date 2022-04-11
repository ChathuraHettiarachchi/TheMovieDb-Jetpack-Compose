package com.backbase.moviebox.presentation.movie_details

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.backbase.moviebox.common.Constants
import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.domain.model.MovieDetail
import com.backbase.moviebox.domain.model.MoviePage
import com.backbase.moviebox.domain.use_case.get_details.GetMovieDetailsUseCase
import com.backbase.moviebox.domain.use_case.get_genres.GetMovieGenresUseCase
import com.backbase.moviebox.domain.use_case.get_playing_now.GetNowPlayingMoviesUseCase
import com.backbase.moviebox.domain.use_case.get_popular.GetPopularMoviesUseCase
import com.backbase.moviebox.presentation.most_popular.MostPopularDataState
import com.backbase.moviebox.presentation.playing_now.PlayingNowListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    private val movieDetailsUseCase: GetMovieDetailsUseCase,
    private val genresUseCase: GetMovieGenresUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _stateDetails = mutableStateOf<MovieDetailState>(MovieDetailState())
    val stateDetails: State<MovieDetailState> = _stateDetails

    private val _stateGenre = mutableStateOf<GenreState>(GenreState())
    val state: State<GenreState> = _stateGenre

    init {
        getGenres()
        savedStateHandle.get<String>(Constants.MOVIE_ID)?.let { id ->
            getDetails(id)
        }
    }

    private fun getDetails(id: String) {
        movieDetailsUseCase(movie = id.toLong()).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _stateDetails.value = MovieDetailState(data = result.data ?: MovieDetail())
                }
                is Resource.Loading -> {
                    _stateDetails.value = MovieDetailState(isLoading = true)
                }
                is Resource.Error -> {
                    _stateDetails.value = MovieDetailState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun getGenres() {
        genresUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _stateGenre.value = GenreState(data = result.data ?: emptyList())
                }
                is Resource.Loading -> {
                    _stateGenre.value = GenreState(isLoading = true)
                }
                is Resource.Error -> {
                    _stateGenre.value = GenreState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }
            }
        }.launchIn(viewModelScope)
    }
}