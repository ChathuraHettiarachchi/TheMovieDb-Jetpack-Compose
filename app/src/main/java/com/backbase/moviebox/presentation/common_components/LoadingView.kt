package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.*
import com.backbase.moviebox.R
import com.backbase.moviebox.common.TestTag

/**
 * Loading view, will contains lottie animation
 * Used to display the any loading action in the app
 */
@Composable
fun LoadingView() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.searching))
    val progress by animateLottieCompositionAsState(composition, iterations = LottieConstants.IterateForever)
    Column(modifier = Modifier.testTag(TestTag.LOADING)) {
        LottieAnimation(
            composition,
            progress,
        )
    }
}

@Composable
@Preview
fun LoadingViewPreview(){
    LoadingView()
}
