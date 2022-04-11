package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.backbase.moviebox.R
import com.backbase.moviebox.common.Constants
import com.backbase.moviebox.domain.model.Movie

@Composable
fun MoviePosterView(movie: Movie) {
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data("${Constants.POSTER_URL}${movie.poster_path}")
            .size(Size.ORIGINAL)
            .build(),
        placeholder = painterResource(R.drawable.movie_placeholder)
    )

    Box(modifier = Modifier.padding(16.dp)){
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(285.dp),
            shape = RoundedCornerShape(14.dp),
            elevation = 12.dp
        ) {
            Image(
                painter = painter,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
@Preview
fun MoviePosterViewPreview() {
    MoviePosterView(
        Movie(
            id = 675353,
            original_title = "Sonic the Hedgehog 2",
            overview = "After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations. Sonic teams up with his own sidekick, Tails, and together they embark on a globe-trotting journey to find the emerald before it falls into the wrong hands.",
            vote_average = 5.6,
            poster_path = "/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg"
        )
    )
}