package com.mogun.movieinfoapp.features.detail.domain.usecase

import com.mogun.movieinfoapp.features.common.entity.MovieDetailEntity

interface IGetMovieDetailUseCase {
    suspend operator fun invoke(name: String): MovieDetailEntity
}
