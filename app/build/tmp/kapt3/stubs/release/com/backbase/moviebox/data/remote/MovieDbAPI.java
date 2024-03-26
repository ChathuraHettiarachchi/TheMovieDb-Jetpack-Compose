package com.backbase.moviebox.data.remote;

import java.lang.System;

/**
 * MovieBox app API list
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ/\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u000f\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\u00020\u000e2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u000f\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/backbase/moviebox/data/remote/MovieDbAPI;", "", "getMovieDetails", "Lcom/backbase/moviebox/data/remote/dto/MovieDetailsDto;", "movieId", "", "apiKey", "", "lan", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieGenres", "Lcom/backbase/moviebox/data/remote/dto/GenreDto;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlayingMovies", "Lcom/backbase/moviebox/data/remote/dto/MovieDto;", "page", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface MovieDbAPI {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/3/movie/now_playing")
    public abstract java.lang.Object getNowPlayingMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lan, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/3/movie/popular")
    public abstract java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lan, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/3/movie/{movieId}")
    public abstract java.lang.Object getMovieDetails(@retrofit2.http.Path(value = "movieId")
    long movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.MovieDetailsDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/3/genre/movie/list")
    public abstract java.lang.Object getMovieGenres(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.backbase.moviebox.data.remote.dto.GenreDto> continuation);
    
    /**
     * MovieBox app API list
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}