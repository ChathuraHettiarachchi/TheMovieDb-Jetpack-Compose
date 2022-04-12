package com.backbase.moviebox.presentation.common_components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.backbase.moviebox.R

@Composable
fun LoadingView() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.searching))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition,
        progress,
    )
}

@Composable
@Preview
fun LoadingViewPreview(){
    LoadingView()
}
