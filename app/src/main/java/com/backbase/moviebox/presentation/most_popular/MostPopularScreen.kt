package com.backbase.moviebox.presentation.most_popular

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.backbase.moviebox.R
import com.backbase.moviebox.common.ConnectionState
import com.backbase.moviebox.common.Constants
import com.backbase.moviebox.common.lerp
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.presentation.common_components.*
import com.backbase.moviebox.presentation.connectivityState
import com.backbase.moviebox.presentation.most_popular.components.PopularMovieInfoView
import com.backbase.moviebox.theme.primary
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import kotlin.math.absoluteValue

/**
 * MostPopularScreen list all the popular movies
 */
@OptIn(ExperimentalPagerApi::class)
@Composable
fun MostPopularScreen(
    navController: NavController?,
    viewModel: MostPopularViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    val pagerState = rememberPagerState()
    val pages = viewModel.pages.value

    val connection by connectivityState()
    val isConnected = connection === ConnectionState.Available


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.primary),
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            ScreenTitleView(title = "Most popular", paddingStart = 16, isCentered = true)
            NetworkStateView(!isConnected)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f, true)
            ) {
                HorizontalPager(
                    count = pages.size,
                    state = pagerState,
                    contentPadding = PaddingValues(horizontal = 64.dp)
                ) { page ->
                    // custom logic to support pagination for pager
                    if (page > pages.size - 6 && !state.isLoading) {
                        viewModel.requestNextPage()
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .graphicsLayer {
                                val pageOffset =
                                    calculateCurrentOffsetForPage(page).absoluteValue

                                // scaling of poster view to change the size a little :)
                                lerp(
                                    start = 0.85f,
                                    stop = 1f,
                                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                                ).also { scale ->
                                    scaleX = scale
                                    scaleY = scale
                                }

                                // We animate the alpha, between 50% and 100%
                                alpha = lerp(
                                    start = 0.5f,
                                    stop = 1f,
                                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                                )
                            },
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        if (pages.size > 0 && page < pages.size)
                            MoviePosterView(posterPath = pages[page].poster_path, isDetails = true)
                    }
                }
            }
            if (pages.size > 0) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, true)
                ) {
                    PopularMovieInfoView(
                        movie = if (pages.size > 0) pages[pagerState.currentPage] else Movie(),
                        navController = navController
                    )
                }
            }
        }
    }
    if (state.error.isNotBlank()) {
        if (isConnected) {
            if (state.error.contains(Constants.HOST_ERROR))
                viewModel.getData()
            else
                ErrorView(state.error)
        } else
            NetworkErrorView()
    }
    if (state.isLoading && pages.size == 0) {
        LoadingView()
    }
}

@Composable
@Preview
fun MostPopularScreenPreview() {
    MostPopularScreen(null)
}