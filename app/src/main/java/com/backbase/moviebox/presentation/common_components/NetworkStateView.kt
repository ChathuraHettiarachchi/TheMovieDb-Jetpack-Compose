package com.backbase.moviebox.presentation.common_components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Theaters
import androidx.compose.material.icons.outlined.WifiOff
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.backbase.moviebox.theme.text

@Composable
fun NetworkStateView(isNotConnected: Boolean) {
    AnimatedVisibility(
        visible = isNotConnected,
        enter = fadeIn(
            // Overwrites the initial value of alpha to 0.4f for fade in, 0 by default
            initialAlpha = 0.4f
        ),
        exit = fadeOut(
            // Overwrites the default animation with tween
            animationSpec = tween(durationMillis = 250)
        )
    ) {
        // Content that needs to appear/disappear goes here:
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(Color.Red),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Outlined.WifiOff, contentDescription = "error", tint = MaterialTheme.colors.onSurface)
            Text(text="No network connection", color=MaterialTheme.colors.onSurface, modifier = Modifier.padding(start = 8.dp), fontSize = 14.sp)
        }
    }
}

@Composable
@Preview
fun NetworkStateViewPreview(){
    NetworkStateView(true)
}