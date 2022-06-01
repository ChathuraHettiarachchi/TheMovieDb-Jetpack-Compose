package com.backbase.moviebox.presentation.common_components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u00a8\u0006\u0007"}, d2 = {"MoviePosterView", "", "posterPath", "", "isDetails", "", "MoviePosterViewPreview", "app_debug"})
public final class MoviePosterViewKt {
    
    /**
     * MoviePoster view, used in places where only the rounded corner poster is shown
     * Has ability to change from adapting to screen width or 300x210 size
     *
     * @param posterPath will be used to set the poster url part
     * @param isDetails can used to change the size to adapt the screen width or 300x210 size
     */
    @androidx.compose.runtime.Composable()
    public static final void MoviePosterView(@org.jetbrains.annotations.NotNull()
    java.lang.String posterPath, boolean isDetails) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void MoviePosterViewPreview() {
    }
}