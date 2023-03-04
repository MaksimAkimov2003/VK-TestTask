package com.example.vk_testtask.gifsListScreen.domain.useCase

import com.example.vk_testtask.gifsListScreen.data.repository.GifsRepository
import com.example.vk_testtask.gifsListScreen.domain.entity.GifEntity

class GetGifsUseCase(private val gifsRepository: GifsRepository) {

	suspend fun execute(userResponse: String): List<GifEntity> {
		return gifsRepository.getGifs(userResponse = userResponse)
	}
}