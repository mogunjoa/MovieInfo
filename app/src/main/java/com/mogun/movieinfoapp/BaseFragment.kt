package com.mogun.movieinfoapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.mogun.movieinfoapp.features.common.viewmodel.ThemeViewModel

open class BaseFragment : Fragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
