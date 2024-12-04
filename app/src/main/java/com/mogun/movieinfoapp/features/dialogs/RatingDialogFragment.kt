package com.mogun.movieinfoapp.features.dialogs

import com.mogun.movieinfoapp.R
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.navigation.fragment.navArgs
import com.mogun.movieinfoapp.BaseDialogFragment
import com.mogun.movieinfoapp.ui.components.dialog.DialogPopup
import com.mogun.movieinfoapp.ui.components.dialog.Rating
import com.mogun.movieinfoapp.ui.models.buttons.LeadingIconData
import com.mogun.movieinfoapp.ui.models.dialog.DialogButton
import com.mogun.movieinfoapp.ui.theme.MovieInfoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RatingDialogFragment : BaseDialogFragment() {

    private val args: RatingDialogFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialog?.apply {
            isCancelable = true
            setCanceledOnTouchOutside(true)
            window?.setBackgroundDrawable(ColorDrawable(requireContext().getColor(R.color.transparent)))
        }

        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MovieInfoAppTheme (
//                    themeState = themeStateemeViewModel.themeState.collectAsState()
                ) {
                    DialogPopup.Rating(
                        movieName = args.movieName,
                        rating = args.rating,
                        buttons = listOf(
                            DialogButton.Primary(
                                title = getString(R.string.submit),
                                leadingIconData = LeadingIconData(
                                    iconDrawable = R.drawable.ic_send,
                                    iconContentDescription = R.string.submit
                                )
                            ) {
                                dismiss()
                            },
                            DialogButton.Secondary(getString(R.string.cancel)) {
                                dismiss()
                            }
                        )
                    )
                }
            }
        }
    }
}
