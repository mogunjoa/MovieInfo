package com.mogun.movieinfoapp.library.storage.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.mogun.movieinfoapp.library.storage.usecases.IStorageClearUseCase
import com.mogun.movieinfoapp.library.storage.usecases.StorageClearUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class StorageClearUseCaseModule {

    @Binds
    @Singleton
    abstract fun bindStorageClearUseCase(
        storageClearUserCase: StorageClearUseCase
    ): IStorageClearUseCase
}
