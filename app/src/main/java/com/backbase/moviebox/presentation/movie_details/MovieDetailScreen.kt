package com.backbase.moviebox.presentation.movie_details


import android.annotation.SuppressLint
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.backbase.moviebox.domain.model.Genre
import com.backbase.moviebox.presentation.common_components.ErrorView
import com.backbase.moviebox.presentation.common_components.LoadingView
import com.backbase.moviebox.presentation.common_components.MoviePosterView
import com.backbase.moviebox.presentation.common_components.ToolbarWithButtonView
import com.backbase.moviebox.presentation.movie_details.components.DescriptionView
import com.backbase.moviebox.presentation.movie_details.components.GenreChipCollectionView
import com.backbase.moviebox.presentation.movie_details.components.LanguageChipCollectionView
import com.backbase.moviebox.presentation.movie_details.components.TitleDescriptionView
import com.backbase.moviebox.theme.primary
import java.text.SimpleDateFormat

@SuppressLint("SimpleDateFormat")
@Composable
fun MovieDetailScreen(
    navController: NavController?,
    movieId: String?,
    viewModel: MovieDetailViewModel = hiltViewModel()
) {
    val stateDetails = viewModel.stateDetails.value
    val stateGenres = viewModel.state.value

    val dispatcher = LocalOnBackPressedDispatcherOwner.current!!.onBackPressedDispatcher

    if(!stateDetails.isLoading) {
        val parser = SimpleDateFormat("yyyy-MM-dd")
        val formatter = SimpleDateFormat("MMMM, dd yyyy")
        val formattedDate =
            parser.parse(stateDetails.data.release_date)?.let { formatter.format(it) }

        var runtime = "N/A"
        try {
            val hours: Int = stateDetails.data.runtime / 60
            val minutes: Int = stateDetails.data.runtime % 60

            runtime = "${hours}h$minutes"
        } catch (ignored: NullPointerException) {
        }

        var genres = emptyList<Genre>()
        if(!stateGenres.isLoading){
            genres = stateDetails.data.genres.map { genre ->
                stateGenres.data.filter { item ->
                    item.id == genre.id
                }.toList().first()
            }
        }

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
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    LazyColumn() {
                        item {
                            Row(
                                Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                MoviePosterView(stateDetails.data.poster_path)
                            }
                        }
                        item {
                            Column(
                                Modifier
                                    .fillMaxWidth()
                            ) {
                                Spacer(modifier = Modifier.height(16.dp))
                                TitleDescriptionView(
                                    title = "Released on",
                                    description = formattedDate.toString()
                                )
                                TitleDescriptionView(title = "Lasts", description = runtime, bottomMargin = 6)
                                Spacer(modifier = Modifier.height(2.dp))
                                DescriptionView(description = stateDetails.data.overview)
                                Spacer(modifier = Modifier.height(2.dp))
                                LanguageChipCollectionView(languages = stateDetails.data.spoken_languages)
                                Spacer(modifier = Modifier.height(8.dp))
                                GenreChipCollectionView(genres = genres)
                                Spacer(modifier = Modifier.height(24.dp))
                            }
                        }
                    }
                }
            }
        }
    }
    if (stateDetails.error.isNotBlank()) {
        ErrorView(stateDetails.error)
    }
    if (stateDetails.isLoading) {
        LoadingView()
    }
}

@Composable
@Preview
fun MovieDetailScreenPreview() {
    MovieDetailScreen(null, null)
}