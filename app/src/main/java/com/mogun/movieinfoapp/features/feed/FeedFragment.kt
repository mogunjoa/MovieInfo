package com.mogun.movieinfoapp.features.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mogun.movieinfoapp.features.feed.presentation.viewmodel.FeedViewModel
import com.mogun.movieinfoapp.ui.theme.MovieInfoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FeedFragment: Fragment() {

    val viewModel: FeedViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel.getMovies()
        return ComposeView(requireContext()).apply {
            setContent {
                MovieInfoAppTheme {
                    Text("FeedFragment")
                }
            }
        }
    }
}