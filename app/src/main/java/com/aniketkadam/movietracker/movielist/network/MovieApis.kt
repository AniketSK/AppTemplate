package com.aniketkadam.movietracker.movielist.network

import com.aniketkadam.movietracker.movielist.Movie
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

private val API_KEY = "87498287f26e2102f4542c63d56e44ef"

interface MovieApis {

    @GET("/movie/now_playing")
    fun getNowPlaying(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("language") language: String? = null,
        @Query("page") page: Int? = null,
        @Query("region") region: String? = null
    ): Single<List<Movie>>

}