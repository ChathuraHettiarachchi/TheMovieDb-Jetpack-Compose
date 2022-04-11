package com.backbase.moviebox.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.outlined.LocalActivity
import androidx.compose.material.icons.outlined.Theaters
import androidx.compose.ui.graphics.vector.ImageVector

sealed class MovieScreenList(
    val route: String,
    val title: String,
    val icon: ImageVector = Icons.Default.Done
) {
    object MainScreen : MovieScreenList(
        route = "main_screen",
        title = "Main Screen",
    )

    object PlayingNow : MovieScreenList(
        route = "playing_now",
        title = "Playing Now",
        icon = Icons.Outlined.Theaters,
    )

    object MostPopular : MovieScreenList(
        route = "most_popular",
        title = "Most Popular",
        icon = Icons.Outlined.LocalActivity
    )

    object MovieDetail : MovieScreenList(
        route = "movie_detail",
        title = "Movie Details"
    )

    object SplashScreen : MovieScreenList(
        route = "splash_screen",
        title = "Splash Screen"
    )

}
