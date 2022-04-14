package com.backbase.moviebox.presentation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.backbase.moviebox.navigation.MovieScreenList
import com.backbase.moviebox.navigation.MovieNavGraph
import com.backbase.moviebox.theme.accent
import com.backbase.moviebox.theme.primary
import com.backbase.moviebox.theme.textRating
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

/**
 * Bottom navigation holder
 */
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        MovieNavGraph(navController = navController)
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        MovieScreenList.PlayingNow,
        MovieScreenList.MostPopular
    )

    LaunchedEffect(key1 = true){
        delay(500)
        navController.navigate(MovieScreenList.PlayingNow.route)
    }

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val currentRoute = navBackStackEntry?.destination?.route?.substringBeforeLast("/")

    if (currentRoute?.substringBeforeLast("/") != MovieScreenList.MovieDetail.route) {
        BottomNavigation(elevation = 12.dp, backgroundColor = MaterialTheme.colors.primary) {
            screens.forEach {
                AddItem(
                    screen = it,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: MovieScreenList,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        selectedContentColor = MaterialTheme.colors.secondary,
        unselectedContentColor = MaterialTheme.colors.primaryVariant,
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}