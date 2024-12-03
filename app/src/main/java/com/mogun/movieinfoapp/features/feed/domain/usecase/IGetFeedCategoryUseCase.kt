package com.mogun.movieinfoapp.features.feed.domain.usecase

import com.mogun.movieinfoapp.features.common.entity.CategoryEntity
import com.mogun.movieinfoapp.features.common.entity.EntityWrapper
import com.mogun.movieinfoapp.features.feed.domain.enum.SortOrder

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
}