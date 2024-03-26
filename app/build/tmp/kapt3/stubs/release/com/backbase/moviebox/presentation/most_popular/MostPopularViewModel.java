package com.backbase.moviebox.presentation.most_popular;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0006H\u0002J\u0006\u0010\u0018\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lcom/backbase/moviebox/presentation/most_popular/MostPopularViewModel;", "Landroidx/lifecycle/ViewModel;", "popularMoviesUseCase", "Lcom/backbase/moviebox/domain/use_case/get_popular/GetPopularMoviesUseCase;", "(Lcom/backbase/moviebox/domain/use_case/get_popular/GetPopularMoviesUseCase;)V", "_currentPage", "", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/backbase/moviebox/presentation/most_popular/MostPopularDataState;", "_totalPages", "pages", "", "Lcom/backbase/moviebox/domain/model/Movie;", "getPages", "()Landroidx/compose/runtime/MutableState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getData", "", "getPopularMovies", "page", "requestNextPage", "app_release"})
public final class MostPopularViewModel extends androidx.lifecycle.ViewModel {
    private final com.backbase.moviebox.domain.use_case.get_popular.GetPopularMoviesUseCase popularMoviesUseCase = null;
    private final androidx.compose.runtime.MutableState<com.backbase.moviebox.presentation.most_popular.MostPopularDataState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.backbase.moviebox.presentation.most_popular.MostPopularDataState> state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.backbase.moviebox.domain.model.Movie>> pages = null;
    private int _totalPages = 1;
    private int _currentPage = 2;
    
    @javax.inject.Inject()
    public MostPopularViewModel(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.use_case.get_popular.GetPopularMoviesUseCase popularMoviesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.backbase.moviebox.presentation.most_popular.MostPopularDataState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.backbase.moviebox.domain.model.Movie>> getPages() {
        return null;
    }
    
    /**
     * get popular movies as user scroll through
     */
    private final void getPopularMovies(int page) {
    }
    
    /**
     * Will request the next page if there are other pages
     */
    public final void requestNextPage() {
    }
    
    /**
     * Request data from API
     */
    public final void getData() {
    }
}