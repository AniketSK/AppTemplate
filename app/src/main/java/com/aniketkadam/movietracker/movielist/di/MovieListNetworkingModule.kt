package com.aniketkadam.movietracker.movielist.di

import com.aniketkadam.movietracker.movielist.network.MovieApis
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MovieListNetworkingModule {

    @Provides
    fun provideMoviesApi(retrofit: Retrofit) = retrofit.create(MovieApis::class.java)

}