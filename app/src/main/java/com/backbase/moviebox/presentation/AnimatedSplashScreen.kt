package com.backbase.moviebox.presentation

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.opengl.Visibility
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.Image
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.backbase.moviebox.R
import com.backbase.moviebox.common.TestTag
import com.backbase.moviebox.navigation.MovieScreenList
import com.backbase.moviebox.theme.accent
import com.backbase.moviebox.theme.primary
import com.backbase.moviebox.theme.primaryNight
import kotlinx.coroutines.delay

/**
 * Custom animated splash screen
 */
@Composable
fun AnimatedSplashScreen(navController: NavHostController) {
    var startAnimation by remember { mutableStateOf(false) }
    var visibility by remember { mutableStateOf(true) }
    val alphaAnim = animateFloatAsState(targetValue = if(startAnimation) 1f else 0f, animationSpec = tween(durationMillis = 2500))
    
    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(3500)
        navController.popBackStack()
        visibility = false
        navController.navigate(MovieScreenList.MainScreen.route)
    }

    Splash(alpha = alphaAnim.value, visibility = visibility)
}

@Composable
fun Splash(alpha: Float, visibility: Boolean = true) {
    Box(
        modifier = Modifier
            .background(if (isSystemInDarkTheme()) primary else primaryNight)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        AnimatedVisibility(visible = visibility) {
            Image(modifier = Modifier
                .size(300.dp)
                .alpha(alpha * alpha)
                .testTag(TestTag.SPLASH), painter = painterResource(id = R.drawable.app_logo), contentDescription = "Logo")
        }
    }
}

@Composable
@Preview
fun SplashScreenPreview(){
    Splash(alpha = 1f)
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun SplashScreenDarkPreview(){
    Splash(alpha = 1f)
}