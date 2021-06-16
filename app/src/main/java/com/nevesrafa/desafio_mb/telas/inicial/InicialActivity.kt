package com.nevesrafa.desafio_mb.telas.inicial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nevesrafa.desafio_mb.databinding.AcitivityInicialBinding
import com.nevesrafa.desafio_mb.telas.eventos.EventosActivity
import com.nevesrafa.desafio_mb.telas.meus_ingressos.MeusIngressosActivity

class InicialActivity : AppCompatActivity() {

    lateinit var binding: AcitivityInicialBinding
    lateinit var presenter: InicialPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcitivityInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = InicialPresenter(this)

        binding.botaoEventos.setOnClickListener {
            abreEventos()
        }

        binding.botaoMeusIngressos.setOnClickListener {
            abreMeusIngressos()
        }
    }

    fun abreEventos() {
        val intent = Intent(this, EventosActivity::class.java)
        startActivity(intent)
    }

    fun abreMeusIngressos() {
        val intent = Intent(this, MeusIngressosActivity::class.java)
        startActivity(intent)
    }
}
