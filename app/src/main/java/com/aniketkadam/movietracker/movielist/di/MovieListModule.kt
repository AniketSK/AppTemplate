package com.aniketkadam.movietracker.movielist.di

import com.aniketkadam.movietracker.movielist.ModelStore
import com.aniketkadam.movietracker.movielist.network.MovieApis
import dagger.Module
import dagger.Provides

@Module
class MovieListModule {
    @Provides
    fun providesModelStore(movieApis: MovieApis) = ModelStore()
}