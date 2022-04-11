package com.backbase.moviebox.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.outlined.LocalActivity
import androidx.compose.material.icons.outlined.Theaters
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object PlayingNow : BottomBarScreen(
        route = "playing_now",
        title = "Playing Now",
        icon = Icons.Outlined.Theaters,
    )

    object MostPopular : BottomBarScreen(
        route = "most_popular",
        title = "Most Popular",
        icon = Icons.Outlined.LocalActivity
    )

    object MovieDetail : BottomBarScreen(
        route = "movie_detail",
        title = "Movie Details",
        icon = Icons.Default.Done
    )

}
