package com.mogun.movieinfoapp.features.common.network.api

import com.google.gson.reflect.TypeToken
import com.mogun.movieinfoapp.features.common.network.model.MovieResponse
import com.mogun.movieinfoapp.library.network.model.ApiResult
import com.mogun.movieinfoapp.library.network.retrofit.NetworkRequestFactory
import javax.inject.Inject

class MovieAppNetworkApi @Inject constructor(
    private val networkRequestFactory: NetworkRequestFactory,
): IMovieAppNetworkApi {
    override suspend fun getMovies(): ApiResult<List<MovieResponse>> {
        return networkRequestFactory.create(
            url = "top250.json",
            type = object : TypeToken<List<MovieResponse>>(){}.type,
        )
    }
}