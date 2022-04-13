package com.backbase.moviebox.common

object Constants {
    // it is best to add this to gradle, so we can remove it with BuildConfig or gradle.properties
    // using gitignore, for this one let's have it here
    const val API_KEY = "11245ed4526d2f51019f511d08a66728"

    const val BASE_URL = "https://api.themoviedb.org/"
    const val MOVIE_ID = "movie_id"
    const val POSTER_URL = "https://image.tmdb.org/t/p/w500"
}

object TestTag{
    const val SPLASH = "splash"
    const val LOADING = "loading"
}