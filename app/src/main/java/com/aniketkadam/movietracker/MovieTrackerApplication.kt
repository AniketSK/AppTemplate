package com.aniketkadam.movietracker

import com.aniketkadam.movietracker.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MovieTrackerApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector

    protected val applicationInjector =
        DaggerAppComponent.builder().application(this).build()

}