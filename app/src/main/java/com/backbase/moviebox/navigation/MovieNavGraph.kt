package com.backbase.moviebox.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.backbase.moviebox.presentation.most_popular.MostPopularScreen
import com.backbase.moviebox.presentation.movie_details.MovieDetailScreen
import com.backbase.moviebox.presentation.playing_now.PlayingNowScreen

@Composable
fun MovieNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.PlayingNow.route){
        composable(route = BottomBarScreen.MostPopular.route){
            MostPopularScreen()
        }
        composable(route = BottomBarScreen.PlayingNow.route){
            PlayingNowScreen()
        }
        composable(route = BottomBarScreen.MovieDetail.route){
            MovieDetailScreen()
        }
    }
}