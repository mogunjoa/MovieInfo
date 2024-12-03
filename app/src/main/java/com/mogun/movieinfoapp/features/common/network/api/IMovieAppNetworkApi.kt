package com.mogun.movieinfoapp.features.common.network.api

import com.mogun.movieinfoapp.features.common.network.model.MovieResponse
import com.mogun.movieinfoapp.library.network.model.ApiResult

interface IMovieAppNetworkApi {
    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}