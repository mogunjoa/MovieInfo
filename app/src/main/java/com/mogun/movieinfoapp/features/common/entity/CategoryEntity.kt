package com.mogun.movieinfoapp.features.common.entity

data class CategoryEntity(
    val id: Int,
    val genre: String,
    val movieFeedEntities: List<MovieFeedItemEntity>
)
