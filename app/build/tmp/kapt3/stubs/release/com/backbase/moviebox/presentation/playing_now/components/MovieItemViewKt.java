package com.backbase.moviebox.presentation.playing_now.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a$\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0007\u00a8\u0006\b"}, d2 = {"MovieItemInfoView", "", "movie", "Lcom/backbase/moviebox/domain/model/Movie;", "MovieItemView", "onMovieClick", "Lkotlin/Function1;", "MovieItemViewPreview", "app_release"})
public final class MovieItemViewKt {
    
    /**
     * MovieItem view, is the grid cell on playing now movies page
     *
     * @param movie will be the movie object from domain package
     * @param onMovieClick is the click event of the movie
     */
    @androidx.compose.runtime.Composable()
    public static final void MovieItemView(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.model.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.backbase.moviebox.domain.model.Movie, kotlin.Unit> onMovieClick) {
    }
    
    /**
     * MovieItemInfoView view, is the grid cell info part of playing now movies page
     *
     * @param movie will be the movie object from domain package
     */
    @androidx.compose.runtime.Composable()
    public static final void MovieItemInfoView(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.model.Movie movie) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void MovieItemViewPreview() {
    }
}