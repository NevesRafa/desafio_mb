package com.nevesrafa.desafio_mb.telas.eventos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nevesrafa.desafio_mb.databinding.ActivityEventosBinding

class EventosActivity : AppCompatActivity() {

    lateinit var binding: ActivityEventosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventosBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}