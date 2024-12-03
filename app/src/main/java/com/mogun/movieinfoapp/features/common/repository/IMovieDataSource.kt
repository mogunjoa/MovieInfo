package com.mogun.movieinfoapp.features.common.repository

interface IMovieDataSource {
    suspend fun getMovieList()
}