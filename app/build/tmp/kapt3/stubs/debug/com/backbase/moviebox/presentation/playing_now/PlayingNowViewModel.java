package com.backbase.moviebox.presentation.playing_now;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/backbase/moviebox/presentation/playing_now/PlayingNowViewModel;", "Landroidx/lifecycle/ViewModel;", "nowPlayingMoviesUseCase", "Lcom/backbase/moviebox/domain/use_case/get_playing_now/GetNowPlayingMoviesUseCase;", "(Lcom/backbase/moviebox/domain/use_case/get_playing_now/GetNowPlayingMoviesUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/backbase/moviebox/presentation/playing_now/PlayingNowListState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getPlayingNowMovies", "", "app_debug"})
public final class PlayingNowViewModel extends androidx.lifecycle.ViewModel {
    private final com.backbase.moviebox.domain.use_case.get_playing_now.GetNowPlayingMoviesUseCase nowPlayingMoviesUseCase = null;
    private final androidx.compose.runtime.MutableState<com.backbase.moviebox.presentation.playing_now.PlayingNowListState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.backbase.moviebox.presentation.playing_now.PlayingNowListState> state = null;
    
    @javax.inject.Inject()
    public PlayingNowViewModel(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.use_case.get_playing_now.GetNowPlayingMoviesUseCase nowPlayingMoviesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.backbase.moviebox.presentation.playing_now.PlayingNowListState> getState() {
        return null;
    }
    
    /**
     * get all playing now movie list from API
     */
    public final void getPlayingNowMovies() {
    }
}