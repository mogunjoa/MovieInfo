package com.mogun.movieinfoapp.features.feed.presentation.input

interface IFeedViewModelInput {
    fun openDetail(movieName: String)
    fun openInfoDialog()
    fun refreshFeed()
}