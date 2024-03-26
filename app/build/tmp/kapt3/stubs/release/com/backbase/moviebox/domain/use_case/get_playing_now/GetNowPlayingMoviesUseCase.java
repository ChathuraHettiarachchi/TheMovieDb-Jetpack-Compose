package com.backbase.moviebox.domain.use_case.get_playing_now;

import java.lang.System;

/**
 * GetNowPlayingMoviesUseCase is used to get now playing movies
 * Have used kotlin flow and will emit results from time to time
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/backbase/moviebox/domain/use_case/get_playing_now/GetNowPlayingMoviesUseCase;", "", "repository", "Lcom/backbase/moviebox/domain/repository/MovieRepository;", "(Lcom/backbase/moviebox/domain/repository/MovieRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/backbase/moviebox/common/Resource;", "", "Lcom/backbase/moviebox/domain/model/Movie;", "app_release"})
public final class GetNowPlayingMoviesUseCase {
    private final com.backbase.moviebox.domain.repository.MovieRepository repository = null;
    
    @javax.inject.Inject()
    public GetNowPlayingMoviesUseCase(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.repository.MovieRepository repository) {
        super();
    }
    
    /**
     * Used kotlin operator function, so it's corresponding member function is called automatically
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.backbase.moviebox.common.Resource<java.util.List<com.backbase.moviebox.domain.model.Movie>>> invoke() {
        return null;
    }
}