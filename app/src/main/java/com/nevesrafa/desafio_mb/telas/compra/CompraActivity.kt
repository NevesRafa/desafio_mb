package com.nevesrafa.desafio_mb.telas.compra

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nevesrafa.desafio_mb.databinding.ActivityCompraBinding

class CompraActivity : AppCompatActivity() {

    lateinit var binding: ActivityCompraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompraBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}