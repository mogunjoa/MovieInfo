package com.mogun.movieinfoapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.mogun.movieinfoapp.ui.theme.color.ColorSet
import androidx.compose.material3.Typography
import androidx.compose.runtime.ReadOnlyComposable
import com.mogun.movieinfoapp.ui.theme.color.MyColors

private val LocalColors = staticCompositionLocalOf { ColorSet.Red.LightColors }

@Composable
fun MovieInfoAppTheme(
    myColors: ColorSet = ColorSet.Red,
    typography: Typography = Typography,
    shapes: Shapes = Shapes,
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
            typography = typography,
            shapes = shapes,
            content = content
        )
    }
}

val MaterialTheme.colorScheme: MyColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current