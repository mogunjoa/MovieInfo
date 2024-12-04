package com.mogun.movieinfoapp

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.mogun.movieinfoapp.features.common.viewmodel.ThemeViewModel

open class BaseDialogFragment : DialogFragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
