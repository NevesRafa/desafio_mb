package com.nevesrafa.desafio_mb.telas.eventos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.nevesrafa.desafio_mb.databinding.ActivityEventosBinding

class EventosActivity : AppCompatActivity() {

    lateinit var binding: ActivityEventosBinding
    lateinit var presenter: EventosPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = EventosPresenter(this)

        val adapter = EventosAdapter(presenter.listaEventos)
        binding.lista.layoutManager = LinearLayoutManager(this)
        binding.lista.adapter = adapter
        binding.lista.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
    }
}