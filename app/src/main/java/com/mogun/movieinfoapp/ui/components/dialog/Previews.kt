package com.mogun.movieinfoapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mogun.movieinfoapp.ui.models.buttons.LeadingIconData
import com.mogun.movieinfoapp.ui.models.dialog.DialogButton
import com.mogun.movieinfoapp.ui.theme.MovieInfoAppTheme
import com.mogun.movieinfoapp.R

@Preview
@Composable
fun AlertPreview() {
    MovieInfoAppTheme {
        DialogPopup.Alert(
            title = "Title",
            bodyText = "blasha apofapfoa",
            buttons = listOf(
                DialogButton.UnderlinedText("Ok") {}
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MovieInfoAppTheme {
        DialogPopup.Default(
            title = "Title",
            bodyText = "blasha apofapfoa",
            buttons = listOf(
                DialogButton.Primary("Ok") {},
                DialogButton.SecondaryBorderless("Cancel") {}
            )
        )
    }
}

@Preview
@Composable
fun RatinPreview() {
    MovieInfoAppTheme {
        DialogPopup.Rating(
            movieName = "The Lord of the Rings",
            rating = 7.5f,
            buttons = listOf(
                DialogButton.Primary(
                    title = "OPEN",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null,
                    )
                ),
                DialogButton.SecondaryBorderless("Cancel") {}
            )
        )
    }
}