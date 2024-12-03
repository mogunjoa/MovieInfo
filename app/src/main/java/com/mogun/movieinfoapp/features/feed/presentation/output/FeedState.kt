package com.mogun.movieinfoapp.features.feed.presentation.output

import com.mogun.movieinfoapp.features.common.entity.CategoryEntity

sealed class FeedState {
    object Loading: FeedState()
    class Main(
        val categories: List<CategoryEntity>
    ): FeedState()

    class Failed(
        val reason: String,
    ): FeedState()
}