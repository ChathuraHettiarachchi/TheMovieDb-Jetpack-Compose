package com.backbase.moviebox.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = primaryNight,
    primaryVariant = primaryNight,
    secondary = accentNight,
    background = primaryNight
)

private val LightColorPalette = lightColors(
    primary = primary,
    primaryVariant = primary,
    secondary = accentNight,
    background = primary
)

@Composable
fun MovieBoxTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content,
    )
}