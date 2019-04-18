package com.example.moviedemo

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiMovies {

    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovies(): Observable<MovieResponse>
}