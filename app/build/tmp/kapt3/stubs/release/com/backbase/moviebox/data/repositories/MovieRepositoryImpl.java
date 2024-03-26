package com.backbase.moviebox.data.repositories;

import java.lang.System;

/**
 * MovieAPI implementation from domain repository. This implements the actions defined in the
 * repo of domain package.
 * Reason is to support great scalability.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/backbase/moviebox/data/repositories/MovieRepositoryImpl;", "Lcom/backbase/moviebox/domain/repository/MovieRepository;", "api", "Lcom/backbase/moviebox/data/remote/MovieDbAPI;", "(Lcom/backbase/moviebox/data/remote/MovieDbAPI;)V", "getMovieDetails", "Lcom/backbase/moviebox/data/remote/dto/MovieDetailsDto;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieGenres", "Lcom/backbase/moviebox/data/remote/dto/GenreDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlayingMovies", "Lcom/backbase/moviebox/data/remote/dto/MovieDto;", "getPopularMovies", "pageNumber", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class MovieRepositoryImpl implements com.backbase.moviebox.domain.repository.MovieRepository {
    private final com.backbase.moviebox.data.remote.MovieDbAPI api = null;
    
    @javax.inject.Inject()
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.backbase.moviebox.data.remote.MovieDbAPI api) {
        super();
    }
    
    /**
     * Get now playing movies
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNowPlayingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDto> continuation) {
        return null;
    }
    
    /**
     * Get popular movies.
     *
     * @param pageNumber will be used in pagination
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopularMovies(int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDto> continuation) {
        return null;
    }
    
    /**
     * Get movie details
     *
     * @param id will be the movie id that needs to find the details of
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieDetails(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDetailsDto> continuation) {
        return null;
    }
    
    /**
     * Get genre list from the API
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.GenreDto> continuation) {
        return null;
    }
}