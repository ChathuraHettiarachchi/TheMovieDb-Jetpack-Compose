package com.backbase.moviebox.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = primaryNight,
    secondary = accentNight,
    background = backgroundNight,
    onSecondary = textNight,
    onSurface = textDescriptionNight,
    secondaryVariant = genreNight,
    surface = genreTextNight,
    primaryVariant = textRatingNight,
    error = backgroundSplashNight,
)

private val LightColorPalette = lightColors(
    primary = primary,
    secondary = accent,
    background = background,
    onSecondary = text,
    onSurface = textDescription,
    secondaryVariant = genre,
    surface = genreText,
    primaryVariant = textRating,
    error = backgroundSplash,
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