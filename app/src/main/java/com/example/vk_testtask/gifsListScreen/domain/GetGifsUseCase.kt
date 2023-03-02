package com.example.vk_testtask.gifsListScreen.domain

import com.example.vk_testtask.gifsListScreen.data.repository.GifsRepository

class GetGifsUseCase(private val gifsRepository: GifsRepository) {

	suspend fun execute(userResponse: String) {
		gifsRepository.getGifs(userResponse = userResponse)
	}
}