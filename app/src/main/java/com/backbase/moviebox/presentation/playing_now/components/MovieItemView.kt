package com.backbase.moviebox.presentation.playing_now.components

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.backbase.moviebox.presentation.common_components.RatingView
import com.backbase.moviebox.theme.primary
import com.backbase.moviebox.theme.text
import com.backbase.moviebox.theme.textRating
import com.backbase.moviebox.R
import com.backbase.moviebox.common.Constants
import com.backbase.moviebox.domain.model.Movie

@Composable
fun MovieItemView(movie: Movie, onMovieClick: (Movie) -> Unit) {
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data("${Constants.POSTER_URL}${movie.poster_path}")
            .size(Size.ORIGINAL)
            .build(),
        placeholder = painterResource(R.drawable.movie_placeholder)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { onMovieClick(movie) }
    ) {
        Column() {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp),
                shape = RoundedCornerShape(14.dp)
            ) {
                Image(
                    painter = painter,
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            MovieItemInfoView(movie = movie)
        }
    }
}

@Composable
fun MovieItemInfoView(movie: Movie) {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier
                    .weight(1f, fill = false)
                    .padding(end = 4.dp),
                text = movie.original_title,
                fontSize = 14.sp,
                color = text,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
            RatingView(rating = (movie.vote_average * 10).toInt())
        }

        Text(text = movie.release_date, fontSize = 14.sp, color = textRating)
    }

}

@Composable
@Preview
fun MovieItemViewPreview() {
    MovieItemView(
        Movie(
            original_title = "Harry Potter",
            release_date = "2022-02-20",
            vote_average = 5.6,
            poster_path = "/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg"
        ),
        {}
    )
}