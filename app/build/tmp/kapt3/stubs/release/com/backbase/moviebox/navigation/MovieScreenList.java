package com.backbase.moviebox.navigation;

import java.lang.System;

/**
 * Navigation screen list
 *
 * @param route will be the path or route to the page
 * @param title will be the page title, used in the bottom navigation bar
 * @param icon will used to set icon to the bottom navigation
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/backbase/moviebox/navigation/MovieScreenList;", "", "route", "", "title", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getRoute", "()Ljava/lang/String;", "getTitle", "MainScreen", "MostPopular", "MovieDetail", "PlayingNow", "SplashScreen", "Lcom/backbase/moviebox/navigation/MovieScreenList$MainScreen;", "Lcom/backbase/moviebox/navigation/MovieScreenList$PlayingNow;", "Lcom/backbase/moviebox/navigation/MovieScreenList$MostPopular;", "Lcom/backbase/moviebox/navigation/MovieScreenList$MovieDetail;", "Lcom/backbase/moviebox/navigation/MovieScreenList$SplashScreen;", "app_release"})
public abstract class MovieScreenList {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.graphics.vector.ImageVector icon = null;
    
    private MovieScreenList(java.lang.String route, java.lang.String title, androidx.compose.ui.graphics.vector.ImageVector icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.graphics.vector.ImageVector getIcon() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/backbase/moviebox/navigation/MovieScreenList$MainScreen;", "Lcom/backbase/moviebox/navigation/MovieScreenList;", "()V", "app_release"})
    public static final class MainScreen extends com.backbase.moviebox.navigation.MovieScreenList {
        @org.jetbrains.annotations.NotNull()
        public static final com.backbase.moviebox.navigation.MovieScreenList.MainScreen INSTANCE = null;
        
        private MainScreen() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/backbase/moviebox/navigation/MovieScreenList$PlayingNow;", "Lcom/backbase/moviebox/navigation/MovieScreenList;", "()V", "app_release"})
    public static final class PlayingNow extends com.backbase.moviebox.navigation.MovieScreenList {
        @org.jetbrains.annotations.NotNull()
        public static final com.backbase.moviebox.navigation.MovieScreenList.PlayingNow INSTANCE = null;
        
        private PlayingNow() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/backbase/moviebox/navigation/MovieScreenList$MostPopular;", "Lcom/backbase/moviebox/navigation/MovieScreenList;", "()V", "app_release"})
    public static final class MostPopular extends com.backbase.moviebox.navigation.MovieScreenList {
        @org.jetbrains.annotations.NotNull()
        public static final com.backbase.moviebox.navigation.MovieScreenList.MostPopular INSTANCE = null;
        
        private MostPopular() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/backbase/moviebox/navigation/MovieScreenList$MovieDetail;", "Lcom/backbase/moviebox/navigation/MovieScreenList;", "()V", "app_release"})
    public static final class MovieDetail extends com.backbase.moviebox.navigation.MovieScreenList {
        @org.jetbrains.annotations.NotNull()
        public static final com.backbase.moviebox.navigation.MovieScreenList.MovieDetail INSTANCE = null;
        
        private MovieDetail() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/backbase/moviebox/navigation/MovieScreenList$SplashScreen;", "Lcom/backbase/moviebox/navigation/MovieScreenList;", "()V", "app_release"})
    public static final class SplashScreen extends com.backbase.moviebox.navigation.MovieScreenList {
        @org.jetbrains.annotations.NotNull()
        public static final com.backbase.moviebox.navigation.MovieScreenList.SplashScreen INSTANCE = null;
        
        private SplashScreen() {
            super(null, null, null);
        }
    }
}