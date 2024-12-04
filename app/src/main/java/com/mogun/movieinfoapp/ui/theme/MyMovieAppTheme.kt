package com.mogun.movieinfoapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import com.mogun.movieinfoapp.ui.config.ComponentConfig
import com.mogun.movieinfoapp.ui.config.DefaultComponentConfig
import com.mogun.movieinfoapp.ui.theme.color.ColorSet
import com.mogun.movieinfoapp.ui.theme.color.MyColors

private val LocalColors = staticCompositionLocalOf { ColorSet.Red.LightColors }

@Composable
fun MovieInfoAppTheme(
    themeState: State<ComponentConfig> = mutableStateOf(
        DefaultComponentConfig.RED_THEME
    ),
    content: @Composable () -> Unit
) {
    val myTheme by remember { themeState }

    val colorScheme = if(myTheme.isDarkTheme) {
        myTheme.colors.DarkColors
    } else {
        myTheme.colors.LightColors
    }

    CompositionLocalProvider(LocalColors provides colorScheme) {
        MaterialTheme(
            colorScheme = colorScheme.material,
            typography =myTheme.typography,
            shapes = myTheme.shapes,
            content = content
        )
    }
}

val MaterialTheme.colorScheme: MyColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current