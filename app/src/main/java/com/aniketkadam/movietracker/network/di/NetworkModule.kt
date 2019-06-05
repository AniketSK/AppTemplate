package com.aniketkadam.movietracker.network.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

private const val BASE_URL = "baseUrl"

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(
        @Named(BASE_URL) baseUrl: String,
        converterFactory: GsonConverterFactory,
        callAdapterFactory: RxJava2CallAdapterFactory
    ) = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(converterFactory)
        .addCallAdapterFactory(callAdapterFactory)
        .build()

    @Singleton
    @Provides
    fun provideSerializerFactory(): GsonConverterFactory = GsonConverterFactory.create()

    @Singleton
    @Provides
    fun provideCallAdapter() = RxJava2CallAdapterFactory.create()

    @Singleton
    @Named(BASE_URL)
    @Provides
    fun getBaseUrl() = "https://api.themoviedb.org"
}