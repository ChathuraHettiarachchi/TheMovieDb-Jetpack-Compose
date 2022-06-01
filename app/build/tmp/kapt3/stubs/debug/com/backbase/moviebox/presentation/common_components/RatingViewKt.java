package com.backbase.moviebox.presentation.common_components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0007\u00a8\u0006\u0006"}, d2 = {"RatingDot", "", "rating", "", "RatingView", "RatingViewPreview", "app_debug"})
public final class RatingViewKt {
    
    /**
     * Rating view, can used to display rating value and dot icon with glowing shadow
     * any rating > 50 will be green and below will be red
     * either green or red, it will use liner gradient to fill the dot and shadow
     *
     * @param rating will be the rating value
     */
    @androidx.compose.runtime.Composable()
    public static final void RatingView(int rating) {
    }
    
    /**
     * RatingDot, can used to display rating dot with glowing shadow
     * any rating > 50 will be green and below will be red
     * either green or red, it will use liner gradient to fill the dot and shadow
     *
     * @param rating will be the rating value
     */
    @androidx.compose.runtime.Composable()
    public static final void RatingDot(int rating) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void RatingViewPreview() {
    }
}