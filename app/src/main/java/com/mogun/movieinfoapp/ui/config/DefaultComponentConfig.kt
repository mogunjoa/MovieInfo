package com.mogun.movieinfoapp.ui.config

import com.mogun.movieinfoapp.ui.theme.Shapes
import com.mogun.movieinfoapp.ui.theme.Typography
import com.mogun.movieinfoapp.ui.theme.color.ColorSet

object DefaultComponentConfig {
    val RED_THEME = ComponentConfig(
        colors = ColorSet.Red,
        shapes = Shapes,
        typography = Typography,
        isDarkTheme = false
    )

    val BLUE_THEME = ComponentConfig(
        colors = ColorSet.Blue,
        shapes = Shapes,
        typography = Typography,
        isDarkTheme = false
    )

    private var currentConfig = RED_THEME
    private var themeColorSet: ColorSet = ColorSet.Red
}

