package com.backbase.moviebox.presentation.movie_details;

import java.lang.System;

/**
 * State for movie details
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/backbase/moviebox/presentation/movie_details/MovieDetailState;", "", "isLoading", "", "data", "Lcom/backbase/moviebox/domain/model/MovieDetail;", "error", "", "(ZLcom/backbase/moviebox/domain/model/MovieDetail;Ljava/lang/String;)V", "getData", "()Lcom/backbase/moviebox/domain/model/MovieDetail;", "getError", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class MovieDetailState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final com.backbase.moviebox.domain.model.MovieDetail data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String error = null;
    
    /**
     * State for movie details
     */
    @org.jetbrains.annotations.NotNull()
    public final com.backbase.moviebox.presentation.movie_details.MovieDetailState copy(boolean isLoading, @org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.model.MovieDetail data, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
        return null;
    }
    
    /**
     * State for movie details
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * State for movie details
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * State for movie details
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MovieDetailState() {
        super();
    }
    
    public MovieDetailState(boolean isLoading, @org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.domain.model.MovieDetail data, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.backbase.moviebox.domain.model.MovieDetail component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.backbase.moviebox.domain.model.MovieDetail getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getError() {
        return null;
    }
}