package com.backbase.moviebox.domain.repository;

import java.lang.System;

/**
 * MovieRepository with API interfaces to override
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/backbase/moviebox/domain/repository/MovieRepository;", "", "getMovieDetails", "Lcom/backbase/moviebox/data/remote/dto/MovieDetailsDto;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieGenres", "Lcom/backbase/moviebox/data/remote/dto/GenreDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlayingMovies", "Lcom/backbase/moviebox/data/remote/dto/MovieDto;", "getPopularMovies", "pageNumber", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNowPlayingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopularMovies(int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieDetails(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDetailsDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.GenreDto> continuation);
    
    /**
     * MovieRepository with API interfaces to override
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}