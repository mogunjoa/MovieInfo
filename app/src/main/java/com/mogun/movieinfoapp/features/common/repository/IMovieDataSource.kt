package com.mogun.movieinfoapp.features.common.repository

import com.mogun.movieinfoapp.features.common.entity.CategoryEntity
import com.mogun.movieinfoapp.features.common.entity.EntityWrapper
import com.mogun.movieinfoapp.features.common.entity.MovieDetailEntity
import com.mogun.movieinfoapp.features.feed.domain.enum.SortOrder

interface IMovieDataSource {
    suspend fun getCategories(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
    suspend fun getMovieDetail(movieName: String): MovieDetailEntity
}