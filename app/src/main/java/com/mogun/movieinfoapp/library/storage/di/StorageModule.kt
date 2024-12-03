package com.mogun.movieinfoapp.library.storage.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.mogun.movieinfoapp.library.storage.helpers.DataConverter
import com.mogun.movieinfoapp.library.storage.IStorage
import com.mogun.movieinfoapp.library.storage.StorageManager
import com.mogun.movieinfoapp.library.storage.helpers.DataEncoding
import com.mogun.movieinfoapp.library.storage.prefs.SharedPrefsStorageProvider
import com.mogun.movieinfoapp.library.storage.prefs.StorageProvider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule {

    @Singleton
    @Provides
    fun bindOnDiscStorage(
        storage: StorageProvider,
        converter: DataConverter,
        encoding: DataEncoding
    ): IStorage = StorageManager(storage, converter, encoding)

    @Provides
    fun provideSharePrefStorageProvider(provider: SharedPrefsStorageProvider): StorageProvider =
        provider

}
