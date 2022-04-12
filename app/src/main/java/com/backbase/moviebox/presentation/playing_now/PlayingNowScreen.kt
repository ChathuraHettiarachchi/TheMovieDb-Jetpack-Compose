package com.backbase.moviebox.presentation.playing_now

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.backbase.moviebox.navigation.MovieScreenList
import com.backbase.moviebox.presentation.common_components.ScreenTitleView
import com.backbase.moviebox.presentation.playing_now.components.MovieItemView
import com.backbase.moviebox.theme.text

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PlayingNowScreen(
    navController: NavController?,
    viewModel: PlayingNowViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            ScreenTitleView(title = "Playing now", paddingStart = 16)
            LazyVerticalGrid(cells = GridCells.Fixed(2)) {
                items(state.movies.size) { index ->
                    MovieItemView(movie = state.movies[index], onMovieClick = {
                        navController?.navigate(MovieScreenList.MovieDetail.route + "/${state.movies[index].id}")
                    })
                }
            }
        }
    }
    if (state.error.isNotBlank()) {
        Text(
            text = state.error,
            color = text,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )
    }
    if(state.isLoading){
        CircularProgressIndicator()
    }
}

@Composable
@Preview
fun PlayingNowScreenPreview() {
    PlayingNowScreen(null)
}