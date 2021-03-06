package com.backbase.moviebox.presentation.playing_now

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.domain.use_case.get_playing_now.GetNowPlayingMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.lang.Thread.sleep
import javax.inject.Inject

@HiltViewModel
class PlayingNowViewModel @Inject constructor(
    private val nowPlayingMoviesUseCase: GetNowPlayingMoviesUseCase
) : ViewModel() {

    // state for movie list
    private val _state = mutableStateOf<PlayingNowListState>(PlayingNowListState())
    val state: State<PlayingNowListState> = _state

    init {
        getPlayingNowMovies()
    }

    /**
     * get all playing now movie list from API
     */
    fun getPlayingNowMovies(){
        nowPlayingMoviesUseCase().onEach { result ->
            when(result){
                is Resource.Success ->{
                    _state.value = PlayingNowListState(isLoading = false, movies = result.data ?: emptyList())
                }
                is Resource.Loading ->{
                    _state.value = PlayingNowListState(isLoading = true)
                }
                is Resource.Error ->{
                    _state.value = PlayingNowListState(error = result.message ?: "An unexpected error occurred")
                }
            }
        }.launchIn(viewModelScope)
    }
}