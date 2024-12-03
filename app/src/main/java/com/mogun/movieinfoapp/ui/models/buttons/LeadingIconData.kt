package com.mogun.movieinfoapp.ui.models.buttons

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LeadingIconData (
    @DrawableRes val iconDrawable: Int,
    @StringRes val iconContentDescription: Int?,
)