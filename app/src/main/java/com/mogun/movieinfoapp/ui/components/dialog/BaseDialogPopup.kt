package com.mogun.movieinfoapp.ui.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mogun.movieinfoapp.ui.components.dialog.components.button.DialogButtonColumn
import com.mogun.movieinfoapp.ui.components.dialog.components.content.DialogContentWrapper
import com.mogun.movieinfoapp.ui.components.dialog.components.title.DialogTitleWrapper
import com.mogun.movieinfoapp.ui.models.dialog.DialogButton
import com.mogun.movieinfoapp.ui.models.dialog.DialogContent
import com.mogun.movieinfoapp.ui.models.dialog.DialogText
import com.mogun.movieinfoapp.ui.models.dialog.DialogTitle
import com.mogun.movieinfoapp.ui.theme.MovieInfoAppTheme
import com.mogun.movieinfoapp.ui.theme.Paddings

@Composable
fun BaseDialogPopup(
    dialogTitle: DialogTitle? = null,
    dialogContent: DialogContent? = null,
    buttons: List<DialogButton>? = null,
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = Paddings.none
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        shape = MaterialTheme.shapes.large,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            dialogTitle?.let {
                DialogTitleWrapper(it)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(
                        top = Paddings.xlarge,
                        start = Paddings.xlarge,
                        end = Paddings.xlarge,
                        bottom = Paddings.xlarge,
                    ),
            ) {
                dialogContent?.let { DialogContentWrapper(it) }
                buttons?.let { DialogButtonColumn(it) }
            }
        }
    }
}

@Preview
@Composable
fun BaseDialogPopupPreview() {
    MovieInfoAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Header("TITLE"),
            dialogContent = DialogContent.Large(
                DialogText.Default("CONTENT CONTENT CONTENT CONTENT CONTENT v v CONTENT CONTENT CONTENT CONTENT")
            ),
            buttons = listOf(
                DialogButton.Secondary("OK"),
                DialogButton.UnderlinedText("CANCEL")
            )
        )
    }
}

@Preview
@Composable
fun BaseDialogPopupPreview2() {
    MovieInfoAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("TITLE"),
            dialogContent = DialogContent.Default(
                DialogText.Default("CONTENT CONTENT CONTENT CONTENT CONTENT v v CONTENT CONTENT CONTENT CONTENT")
            ),
            buttons = listOf(
                DialogButton.Secondary("OK"),
                DialogButton.UnderlinedText("CANCEL")
            )
        )
    }
}

@Preview
@Composable
fun BaseDialogPopupPreview3() {
    MovieInfoAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("TITLE"),
            dialogContent = DialogContent.Rating(
                DialogText.Rating(
                    text = "Jurassic Park",
                    rating = 8.2f
                )
            ),
            buttons = listOf(
                DialogButton.Primary("OK"),
                DialogButton.Secondary("CANCEL")
            )
        )
    }
}



