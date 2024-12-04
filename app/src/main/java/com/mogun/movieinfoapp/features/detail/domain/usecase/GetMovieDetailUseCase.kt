package com.mogun.movieinfoapp.features.detail.domain.usecase

import com.mogun.movieinfoapp.features.common.entity.MovieDetailEntity
import com.mogun.movieinfoapp.features.common.repository.IMovieDataSource
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(
    private val dataSource: IMovieDataSource
) : IGetMovieDetailUseCase {
    override suspend fun invoke(name: String): MovieDetailEntity {
        return dataSource.getMovieDetail(name)
    }
}
