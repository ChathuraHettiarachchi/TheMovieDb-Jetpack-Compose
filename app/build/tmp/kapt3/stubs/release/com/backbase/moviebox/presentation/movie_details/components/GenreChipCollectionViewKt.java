package com.backbase.moviebox.presentation.movie_details.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0007\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"GenreChipCollectionView", "", "genres", "", "Lcom/backbase/moviebox/domain/model/Genre;", "GenreChipCollectionViewPreview", "GenreChipView", "lan", "", "app_release"})
public final class GenreChipCollectionViewKt {
    
    /**
     * GenreChipCollection will use flowRow to populate and distribute all genres that are
     * available. If the width is not enough, it will expand the height
     *
     * @param genres will be the list of genres from the movie
     */
    @androidx.compose.runtime.Composable()
    public static final void GenreChipCollectionView(@org.jetbrains.annotations.Nullable()
    java.util.List<com.backbase.moviebox.domain.model.Genre> genres) {
    }
    
    /**
     * GenreChip view will act as a text holder for type of genre
     *
     * @param lan will be the text
     */
    @androidx.compose.runtime.Composable()
    public static final void GenreChipView(@org.jetbrains.annotations.NotNull()
    java.lang.String lan) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void GenreChipCollectionViewPreview() {
    }
}