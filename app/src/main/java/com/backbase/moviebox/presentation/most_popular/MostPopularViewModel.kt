package com.backbase.moviebox.presentation.most_popular

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MoviePage
import com.backbase.moviebox.domain.use_case.get_playing_now.GetNowPlayingMoviesUseCase
import com.backbase.moviebox.domain.use_case.get_popular.GetPopularMoviesUseCase
import com.backbase.moviebox.presentation.playing_now.PlayingNowListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MostPopularViewModel @Inject constructor(
    private val popularMoviesUseCase: GetPopularMoviesUseCase
) : ViewModel() {

    private val _state = mutableStateOf<MostPopularDataState>(MostPopularDataState())
    val state: State<MostPopularDataState> = _state
    val pages = mutableStateOf<MutableList<Movie>>(mutableListOf())

    private var _totalPages: Int = 1
    private var _currentPage: Int = 2

    init {
        getPopularMovies()
    }

    private fun getPopularMovies(page: Int = 1) {
        popularMoviesUseCase(pageId = page).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value =
                        MostPopularDataState(data = result.data ?: MoviePage(), isLoading = false)

                    _totalPages = _state.value.data.total_pages
                    _currentPage = _state.value.data.page

                    val data: MutableList<Movie> = pages.value
                    data.addAll(result.data!!.results)
                    pages.value = data
                }
                is Resource.Loading -> {
                    _state.value = MostPopularDataState(isLoading = true)
                }
                is Resource.Error -> {
                    _state.value = MostPopularDataState(
                        isLoading = false,
                        error = result.message ?: "An unexpected error occurred"
                    )
                }
            }
        }.launchIn(viewModelScope)
    }

    fun requestNextPage() {
        if (_currentPage < _totalPages) {
            getPopularMovies(++_currentPage)
        } else {
            _state.value = MostPopularDataState(
                error = "No more pages found in the TMDB server"
            )
        }
    }
}