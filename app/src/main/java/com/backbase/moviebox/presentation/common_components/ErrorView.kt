package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.*
import com.backbase.moviebox.R
import com.backbase.moviebox.theme.text

/**
 * Error view, will contain lottie animation and error text container
 * Used to display the any error in the app
 *
 * @param error will be the error message need set to the view
 */
@Composable
fun ErrorView(error: String = "Something went wrong") {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.error))
    val progress by animateLottieCompositionAsState(composition, iterations = LottieConstants.IterateForever)

    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
        LottieAnimation(
            composition,
            progress,
            modifier = Modifier.height(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = error,
            color = text,
            fontSize = 14.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
@Preview
fun ErrorViewPreview() {
    ErrorView()
}
