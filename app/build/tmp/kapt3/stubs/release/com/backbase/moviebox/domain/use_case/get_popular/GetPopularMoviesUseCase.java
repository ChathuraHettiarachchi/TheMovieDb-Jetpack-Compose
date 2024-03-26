package com.backbase.moviebox.domain.use_case.get_popular;

import java.lang.System;

/**
 * GetPopularMoviesUseCase is used to get popular movies
 * Can use for pagination
 * Have used kotlin flow and will emit results from time to time
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/backbase/moviebox/domain/use_case/get_popular/GetPopularMoviesUseCase;", "", "repository", "Lcom/backbase/moviebox/domain/repository/MovieRepository;", "(Lcom/backbase/moviebox/domain/repository/MovieRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/backbase/moviebox/common/Resource;", "Lcom/backbase/moviebox/domain/model/MoviePage;", "pageId", "", "app_release"})
public final class GetPopularMoviesUseCase {
    private final com.backbase.moviebox.domain.repository.MovieRepository repository = null;
    
    @javax.inject.Inject()
    public GetPopularMoviesUseCase(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.repository.MovieRepository repository) {
        super();
    }
    
    /**
     * Used kotlin operator function, so it's corresponding member function is called automatically
     *
     * @param pageId pagination requested page
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.backbase.moviebox.common.Resource<com.backbase.moviebox.domain.model.MoviePage>> invoke(int pageId) {
        return null;
    }
}