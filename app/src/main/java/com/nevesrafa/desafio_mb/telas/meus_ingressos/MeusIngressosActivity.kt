package com.nevesrafa.desafio_mb.telas.meus_ingressos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nevesrafa.desafio_mb.databinding.ActivityMeusIngressosBinding

class MeusIngressosActivity : AppCompatActivity() {

    lateinit var binding: ActivityMeusIngressosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMeusIngressosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}