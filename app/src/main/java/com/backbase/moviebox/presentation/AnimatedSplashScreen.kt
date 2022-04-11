package com.backbase.moviebox.presentation

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.Image
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.backbase.moviebox.R
import com.backbase.moviebox.theme.accent
import com.backbase.moviebox.theme.primary
import com.backbase.moviebox.theme.primaryNight

@Composable
fun AnimatedSplashScreen() {
    Splash()
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier
            .background(if (isSystemInDarkTheme()) primary else primaryNight)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(modifier = Modifier.size(250.dp), painter = painterResource(id = R.drawable.app_logo), contentDescription = "Logo")
    }
}

@Composable
@Preview
fun SplashScreenPreview(){
    Splash()
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun SplashScreenDarkPreview(){
    Splash()
}