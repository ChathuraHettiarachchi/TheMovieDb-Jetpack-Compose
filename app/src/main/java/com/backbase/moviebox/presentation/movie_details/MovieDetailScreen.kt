package com.backbase.moviebox.presentation.movie_details


import android.app.Activity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.BackHandler
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.backbase.moviebox.presentation.common_components.ErrorView
import com.backbase.moviebox.presentation.common_components.LoadingView
import com.backbase.moviebox.presentation.common_components.ToolbarWithButtonView
import com.backbase.moviebox.theme.primary

@Composable
fun MovieDetailScreen(
    navController: NavController?,
    movieId: String?,
    viewModel: MovieDetailViewModel = hiltViewModel()
) {
    val stateDetails = viewModel.stateDetails.value
    val dispatcher = LocalOnBackPressedDispatcherOwner.current!!.onBackPressedDispatcher

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(primary),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            ToolbarWithButtonView(title = stateDetails.data.original_title, onClick = {
                dispatcher.onBackPressed()
            })
            Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

            }
        }
    }
    if (stateDetails.error.isNotBlank()) {
        ErrorView(stateDetails.error)
    }
    if(stateDetails.isLoading){
        LoadingView()
    }
}

@Composable
@Preview
fun MovieDetailScreenPreview() {
    MovieDetailScreen(null, null)
}