package com.example.vk_testtask.gifsDetailsScreen

import com.example.vk_testtask.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DetailsService {

	@GET("/v1/gifs/{gifId}")
	fun getGifDetails(
		@Path("gifId")
		gifId: String,

		@Query("api_key")
		apiKey: String = BuildConfig.API_KEY
	)
}