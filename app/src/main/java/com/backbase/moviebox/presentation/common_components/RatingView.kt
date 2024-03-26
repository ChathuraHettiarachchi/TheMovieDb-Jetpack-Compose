package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.backbase.moviebox.theme.*

/**
 * Rating view, can used to display rating value and dot icon with glowing shadow
 * any rating > 50 will be green and below will be red
 * either green or red, it will use liner gradient to fill the dot and shadow
 *
 * @param rating will be the rating value
 */
@Composable
fun RatingView(rating: Int){
    Row(horizontalArrangement = Arrangement.Start) {
        Column() {
            Spacer(Modifier.height(3.dp))
            RatingDot(rating = rating)
        }
        Spacer(Modifier.width(2.dp))
        Text(text = "$rating%", color = textRating, fontSize = 13.sp, textAlign = TextAlign.Center)
    }
}

/**
 * RatingDot, can used to display rating dot with glowing shadow
 * any rating > 50 will be green and below will be red
 * either green or red, it will use liner gradient to fill the dot and shadow
 *
 * @param rating will be the rating value
 */
@Composable
fun RatingDot(rating: Int){
    Box(
        modifier = Modifier
            .size(18.dp)
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        if (rating > 50) greenRatingShadow else redRatingShadow,
                        Color.Transparent
                    )
                )
            )
            .padding(bottom = 4.dp),
        contentAlignment = Alignment.Center
    ){
        Surface(
            shape = CircleShape,
            modifier = Modifier
                .size(12.dp)
                .background(Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .size(17.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                if (rating > 50) greenRatingStart else redRatingStart,
                                if (rating > 50) greenRatingEnd else redRatingEnd
                            )
                        )
                    )
            )
        }

    }
}

@Composable
@Preview
fun RatingViewPreview(){
    Column() {
        RatingView(42)
        Spacer(Modifier.height(10.dp))
        RatingView(82)
    }
}