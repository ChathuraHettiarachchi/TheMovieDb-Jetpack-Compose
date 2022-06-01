package com.backbase.moviebox.domain.model;

import java.lang.System;

/**
 * UI moviePage model
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r\u00a8\u0006!"}, d2 = {"Lcom/backbase/moviebox/domain/model/MoviePage;", "", "page", "", "results", "", "Lcom/backbase/moviebox/domain/model/Movie;", "total_pages", "total_results", "(ILjava/util/List;II)V", "getPage", "()I", "setPage", "(I)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "getTotal_pages", "setTotal_pages", "getTotal_results", "setTotal_results", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MoviePage {
    private int page;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.backbase.moviebox.domain.model.Movie> results;
    private int total_pages;
    private int total_results;
    
    /**
     * UI moviePage model
     */
    @org.jetbrains.annotations.NotNull()
    public final com.backbase.moviebox.domain.model.MoviePage copy(int page, @org.jetbrains.annotations.NotNull()
    java.util.List<com.backbase.moviebox.domain.model.Movie> results, int total_pages, int total_results) {
        return null;
    }
    
    /**
     * UI moviePage model
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * UI moviePage model
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * UI moviePage model
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MoviePage() {
        super();
    }
    
    public MoviePage(int page, @org.jetbrains.annotations.NotNull()
    java.util.List<com.backbase.moviebox.domain.model.Movie> results, int total_pages, int total_results) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.backbase.moviebox.domain.model.Movie> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.backbase.moviebox.domain.model.Movie> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.backbase.moviebox.domain.model.Movie> p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTotal_pages() {
        return 0;
    }
    
    public final void setTotal_pages(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotal_results() {
        return 0;
    }
    
    public final void setTotal_results(int p0) {
    }
}