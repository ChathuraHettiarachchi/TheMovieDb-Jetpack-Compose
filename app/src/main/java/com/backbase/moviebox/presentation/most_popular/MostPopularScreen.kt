package com.backbase.moviebox.presentation.most_popular

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.backbase.moviebox.common.toDp
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.navigation.MovieScreenList
import com.backbase.moviebox.presentation.common_components.ErrorView
import com.backbase.moviebox.presentation.common_components.LoadingView
import com.backbase.moviebox.presentation.common_components.ScreenTitleView
import com.backbase.moviebox.presentation.most_popular.components.PopularMovieInfoView
import com.backbase.moviebox.presentation.movie_details.MovieDetailViewModel
import com.backbase.moviebox.presentation.playing_now.components.MovieItemView
import com.backbase.moviebox.theme.primary

@Composable
fun MostPopularScreen(
    navController: NavController?,
    viewModel: MostPopularViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(primary),
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            ScreenTitleView(title = "Most popular", paddingStart = 16)
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .weight(2f, true)){
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .weight(1f, true)) {
                PopularMovieInfoView(movie =  Movie(
                    id = 675353,
                    original_title = "Sonic the Hedgehog 2",
                    overview = "After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations. Sonic teams up with his own sidekick, Tails, and together they embark on a globe-trotting journey to find the emerald before it falls into the wrong hands.",
                    vote_average = 5.6,
                    poster_path = "/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg"
                ), navController = navController)
            }
        }
    }
    if (state.error.isNotBlank()) {
        ErrorView(state.error)
    }
    if (state.isLoading) {
        LoadingView()
    }
}

@Composable
@Preview
fun MostPopularScreenPreview() {
    MostPopularScreen(null)
}