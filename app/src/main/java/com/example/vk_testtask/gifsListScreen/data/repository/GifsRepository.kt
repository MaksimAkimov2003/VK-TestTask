package com.example.vk_testtask.gifsListScreen.data.repository

import com.example.vk_testtask.gifsListScreen.data.api.GifsService

class GifsRepository(private val api: GifsService) {

	suspend fun getGifs(userResponse: String) {
		api.getListOfGifs(userResponse = userResponse)
	}
}