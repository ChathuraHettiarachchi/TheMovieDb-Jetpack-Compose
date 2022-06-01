package com.backbase.moviebox.presentation.movie_details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/backbase/moviebox/presentation/movie_details/MovieDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "movieDetailsUseCase", "Lcom/backbase/moviebox/domain/use_case/get_details/GetMovieDetailsUseCase;", "genresUseCase", "Lcom/backbase/moviebox/domain/use_case/get_genres/GetMovieGenresUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/backbase/moviebox/domain/use_case/get_details/GetMovieDetailsUseCase;Lcom/backbase/moviebox/domain/use_case/get_genres/GetMovieGenresUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_stateDetails", "Landroidx/compose/runtime/MutableState;", "Lcom/backbase/moviebox/presentation/movie_details/MovieDetailState;", "_stateGenre", "Lcom/backbase/moviebox/presentation/movie_details/GenreState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "stateDetails", "getStateDetails", "getData", "", "getDetails", "id", "", "getGenres", "app_debug"})
public final class MovieDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.backbase.moviebox.domain.use_case.get_details.GetMovieDetailsUseCase movieDetailsUseCase = null;
    private final com.backbase.moviebox.domain.use_case.get_genres.GetMovieGenresUseCase genresUseCase = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final androidx.compose.runtime.MutableState<com.backbase.moviebox.presentation.movie_details.MovieDetailState> _stateDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.backbase.moviebox.presentation.movie_details.MovieDetailState> stateDetails = null;
    private final androidx.compose.runtime.MutableState<com.backbase.moviebox.presentation.movie_details.GenreState> _stateGenre = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.backbase.moviebox.presentation.movie_details.GenreState> state = null;
    
    @javax.inject.Inject()
    public MovieDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.use_case.get_details.GetMovieDetailsUseCase movieDetailsUseCase, @org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.use_case.get_genres.GetMovieGenresUseCase genresUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.backbase.moviebox.presentation.movie_details.MovieDetailState> getStateDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.backbase.moviebox.presentation.movie_details.GenreState> getState() {
        return null;
    }
    
    /**
     * get details from API
     */
    private final void getDetails(java.lang.String id) {
    }
    
    /**
     * get genres from API
     */
    private final void getGenres() {
    }
    
    /**
     * Request data from API
     */
    public final void getData() {
    }
}