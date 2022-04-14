package com.backbase.moviebox.presentation.most_popular.components

import android.widget.Space
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.backbase.moviebox.common.addEmptyLines
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.navigation.MovieScreenList
import com.backbase.moviebox.presentation.common_components.RatingView
import com.backbase.moviebox.presentation.common_components.ScreenTitleView
import com.backbase.moviebox.theme.accent
import com.backbase.moviebox.theme.textDescription

/**
 * PopularMovieInfo view, can used to display main info of a movie
 *
 * @param movie movie object from domain package
 * @param navController is the main navigation controller of the application
 */
@Composable
fun PopularMovieInfoView(movie: Movie, navController: NavController?) {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        ScreenTitleView(
            title = movie.original_title,
            isCentered = true,
            size = 20,
            top = 12,
            bottom = 8,
            paddingEnd = 16,
            paddingStart = 16
        )
        RatingView(rating = (movie.vote_average * 10).toInt())
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            text = movie.overview.addEmptyLines(3),
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
            color = MaterialTheme.colors.onBackground,
            textAlign = TextAlign.Center,
            fontSize = 14.sp
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clickable(enabled = true, role = Role.Button) {
                    navController?.navigate(MovieScreenList.MovieDetail.route + "/${movie.id}")
                },
            text = "See more",
            color = MaterialTheme.colors.secondary,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
@Preview
fun PopularMovieInfoViewPreview() {
    PopularMovieInfoView(
        Movie(
            id = 675353,
            original_title = "Sonic the Hedgehog 2",
            overview = "After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations. Sonic teams up with his own sidekick, Tails, and together they embark on a globe-trotting journey to find the emerald before it falls into the wrong hands.",
            vote_average = 5.6,
            poster_path = "/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg"
        ), null
    )
}