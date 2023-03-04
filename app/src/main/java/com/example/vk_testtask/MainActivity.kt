package com.example.vk_testtask

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import com.example.vk_testtask.gifsListScreen.domain.entity.GifEntity
import com.example.vk_testtask.gifsListScreen.presentation.GifsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

	private val viewModel by viewModel<GifsViewModel>()
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val text = findViewById<TextView>(R.id.textText)

		viewModel.liveData.observe(this) {
			text.text = it[0].gifUrl
		}

		viewModel.getSth()


	}

	private fun handle(liveData: LiveData<List<GifEntity>>) {

	}
}