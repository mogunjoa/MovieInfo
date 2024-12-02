package com.mogun.movieinfoapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.mogun.movieinfoapp.ui.theme.color.ColorSet

private val LocalColors = staticCompositionLocalOf { ColorSet.Red.LightColors }

@Composable
fun MovieInfoAppTheme(
    myColors: ColorSet,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> myColors.DarkColors
        else -> myColors.LightColors
    }

    CompositionLocalProvider(LocalColors provides colorScheme) {
        MaterialTheme(
            colorScheme = colorScheme.material,
            typography = Typography,
            content = content
        )
    }
}