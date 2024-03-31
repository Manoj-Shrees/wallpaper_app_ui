package com.dreamer.wallpaper_app_11.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule
{

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit{

        return Retrofit.Builder().baseUrl("https://manojshrees.dev/wallpaperapp/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

}