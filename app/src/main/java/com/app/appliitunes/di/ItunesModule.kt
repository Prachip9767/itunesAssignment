package com.app.appliitunes.di

import android.content.Context
import androidx.room.Room
import com.app.appliitunes.di.Constants.BASE_URL
import com.app.appliitunes.remote.ApiClient
import com.app.appliitunes.remote.database.ItunesDao
import com.app.appliitunes.remote.database.ItunesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ItunesModule {
    @Provides
    fun apiService(): ApiClient {
        val builder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return builder.create(ApiClient::class.java)
    }

    @Singleton
    @Provides
    fun roomDb(@ApplicationContext context: Context): ItunesDatabase {
        val builder = Room.databaseBuilder(
            context, ItunesDatabase::class.java, "_itunesDb"
        )
        builder.fallbackToDestructiveMigration()
        return builder.build()
    }

    @Singleton
    @Provides
    fun dataToDao(db: ItunesDatabase): ItunesDao{
        return db.getResponseFromDao()
    }
}
object Constants {
    const val BASE_URL = "https://itunes.apple.com/"
}