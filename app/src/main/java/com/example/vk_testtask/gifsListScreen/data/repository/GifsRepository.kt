package com.example.vk_testtask.gifsListScreen.data.repository

import com.example.vk_testtask.gifsListScreen.data.api.GifsService
import com.example.vk_testtask.gifsListScreen.data.mapper.toEntity
import com.example.vk_testtask.gifsListScreen.domain.entity.GifEntity

class GifsRepository(private val api: GifsService) {

	suspend fun getGifs(userResponse: String): List<GifEntity> {
		return api.getListOfGifs(userResponse = userResponse).toEntity()
	}
}