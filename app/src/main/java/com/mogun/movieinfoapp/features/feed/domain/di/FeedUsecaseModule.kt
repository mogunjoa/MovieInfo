package com.mogun.movieinfoapp.features.feed.domain.di

import com.mogun.movieinfoapp.features.feed.domain.usecase.GetFeedCategoryUseCase
import com.mogun.movieinfoapp.features.feed.domain.usecase.IGetFeedCategoryUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class FeedUseCaseModule {

    @Singleton
    @Binds
    abstract fun bindGetMovieListUseCase(getMovieListUseCase: GetFeedCategoryUseCase): IGetFeedCategoryUseCase
}