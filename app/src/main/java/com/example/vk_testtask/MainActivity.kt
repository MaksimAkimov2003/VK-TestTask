package com.example.vk_testtask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.vk_testtask.gifsListScreen.data.api.GifsService
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

	private val api by inject<GifsService>()
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)


		lifecycleScope.launch {
			api.getListOfGifs(userResponse = "Anime")
		}
	}
}