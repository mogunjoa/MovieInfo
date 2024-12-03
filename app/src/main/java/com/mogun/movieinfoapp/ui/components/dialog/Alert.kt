package com.mogun.movieinfoapp.ui.components.dialog

import androidx.compose.runtime.Composable
import com.mogun.movieinfoapp.ui.models.dialog.DialogButton
import com.mogun.movieinfoapp.ui.models.dialog.DialogContent
import com.mogun.movieinfoapp.ui.models.dialog.DialogText
import com.mogun.movieinfoapp.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Alert(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(title),
        dialogContent = DialogContent.Default(
            DialogText.Default(bodyText)
        ),
        buttons = buttons
    )
}
