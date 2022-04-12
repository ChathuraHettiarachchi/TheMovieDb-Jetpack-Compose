package com.backbase.moviebox.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.backbase.moviebox.presentation.AnimatedSplashScreen
import com.backbase.moviebox.presentation.MainScreen
import com.backbase.moviebox.presentation.most_popular.MostPopularScreen
import com.backbase.moviebox.presentation.movie_details.MovieDetailScreen
import com.backbase.moviebox.presentation.playing_now.PlayingNowScreen

@Composable
fun MovieNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = MovieScreenList.SplashScreen.route){
        composable(route = MovieScreenList.SplashScreen.route){
            AnimatedSplashScreen(navController)
        }
        composable(route = MovieScreenList.MainScreen.route){
            MainScreen()
        }
        composable(route = MovieScreenList.MostPopular.route){
            MostPopularScreen()
        }
        composable(route = MovieScreenList.PlayingNow.route){
            PlayingNowScreen(navController)
        }
        composable(route = MovieScreenList.MovieDetail.route+"/{movie_id}"){
            MovieDetailScreen(navController, it.arguments?.getString("movie_id"))
        }
    }
}