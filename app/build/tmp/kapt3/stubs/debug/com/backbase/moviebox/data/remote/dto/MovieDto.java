package com.backbase.moviebox.data.remote.dto;

import java.lang.System;

/**
 * MovieDto will used by both PlayNow, Popular movies API calls
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/backbase/moviebox/data/remote/dto/MovieDto;", "", "dates", "Lcom/backbase/moviebox/data/remote/dto/Dates;", "page", "", "results", "", "Lcom/backbase/moviebox/data/remote/dto/MovieItem;", "total_pages", "total_results", "(Lcom/backbase/moviebox/data/remote/dto/Dates;ILjava/util/List;II)V", "getDates", "()Lcom/backbase/moviebox/data/remote/dto/Dates;", "getPage", "()I", "getResults", "()Ljava/util/List;", "getTotal_pages", "getTotal_results", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MovieDto {
    @org.jetbrains.annotations.NotNull()
    private final com.backbase.moviebox.data.remote.dto.Dates dates = null;
    private final int page = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.backbase.moviebox.data.remote.dto.MovieItem> results = null;
    private final int total_pages = 0;
    private final int total_results = 0;
    
    /**
     * MovieDto will used by both PlayNow, Popular movies API calls
     */
    @org.jetbrains.annotations.NotNull()
    public final com.backbase.moviebox.data.remote.dto.MovieDto copy(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.data.remote.dto.Dates dates, int page, @org.jetbrains.annotations.NotNull()
    java.util.List<com.backbase.moviebox.data.remote.dto.MovieItem> results, int total_pages, int total_results) {
        return null;
    }
    
    /**
     * MovieDto will used by both PlayNow, Popular movies API calls
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * MovieDto will used by both PlayNow, Popular movies API calls
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * MovieDto will used by both PlayNow, Popular movies API calls
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MovieDto(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.data.remote.dto.Dates dates, int page, @org.jetbrains.annotations.NotNull()
    java.util.List<com.backbase.moviebox.data.remote.dto.MovieItem> results, int total_pages, int total_results) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.backbase.moviebox.data.remote.dto.Dates component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.backbase.moviebox.data.remote.dto.Dates getDates() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.backbase.moviebox.data.remote.dto.MovieItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.backbase.moviebox.data.remote.dto.MovieItem> getResults() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotal_pages() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getTotal_results() {
        return 0;
    }
}