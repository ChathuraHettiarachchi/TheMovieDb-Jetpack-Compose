package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
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

/**
 * MoviePoster view, used in places where only the rounded corner poster is shown
 * Has ability to change from adapting to screen width or 300x210 size
 *
 * @param posterPath will be used to set the poster url part
 * @param isDetails can used to change the size to adapt the screen width or 300x210 size
 */
@Composable
fun MoviePosterView(posterPath: String, isDetails: Boolean = false) {
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data("${Constants.POSTER_URL}${posterPath}")
            .size(Size.ORIGINAL)
            .build(),
        placeholder = painterResource(R.drawable.movie_placeholder)
    )

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    val height = if(isDetails) (screenWidth - 40).dp else 300.dp
    val weight = if(isDetails) (((screenWidth)/3)*2).dp else 210.dp

    Box(modifier = Modifier.padding(bottom = 16.dp)){
        Card(
            modifier = Modifier
                .width(weight)
                .height(height),
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
        "/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg"
    )
}