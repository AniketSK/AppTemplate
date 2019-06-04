package com.aniketkadam.movietracker.movielist

import com.aniketkadam.movietracker.movielist.network.MovieApis
import javax.inject.Inject


class ModelStore @Inject constructor() {
    @Inject
    lateinit var movieApis: MovieApis

    val movies by lazy { movieApis.getNowPlaying() }
}

sealed class MovieRetrieveal {
    object Loading
    data class Content(val movies: List<Movie>)
    data class Error(val error: Throwable)
}