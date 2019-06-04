package com.aniketkadam.movietracker.di

import com.aniketkadam.movietracker.movielist.MainActivity
import com.aniketkadam.movietracker.movielist.di.MovieListModule
import com.aniketkadam.movietracker.movielist.di.MovieListNetworkingModule
import com.aniketkadam.movietracker.network.di.NetworkModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MovieListModule::class, MovieListNetworkingModule::class, NetworkModule::class])
    abstract fun bindMainActivity(): MainActivity
}