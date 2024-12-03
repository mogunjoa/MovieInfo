package com.mogun.movieinfoapp.features.feed.domain.usecase

import com.mogun.movieinfoapp.features.common.entity.CategoryEntity
import com.mogun.movieinfoapp.features.common.entity.EntityWrapper
import com.mogun.movieinfoapp.features.common.repository.IMovieDataSource
import com.mogun.movieinfoapp.features.feed.domain.enum.SortOrder
import javax.inject.Inject

class GetFeedCategoryUseCase @Inject constructor(
    private val dataSource: IMovieDataSource
): IGetFeedCategoryUseCase {
    override suspend fun invoke(sortOrder: SortOrder?): EntityWrapper<List<CategoryEntity>> {
        return dataSource.getCategories(sortOrder)
    }
}