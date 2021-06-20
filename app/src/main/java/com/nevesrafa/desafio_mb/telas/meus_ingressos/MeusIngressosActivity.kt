package com.nevesrafa.desafio_mb.telas.meus_ingressos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.nevesrafa.desafio_mb.classes.MeusIngressos
import com.nevesrafa.desafio_mb.databinding.ActivityMeusIngressosBinding

class MeusIngressosActivity : AppCompatActivity() {

    lateinit var binding: ActivityMeusIngressosBinding
    lateinit var presenter: MeusIngressosPresenter
    val adapter: MeusIngressosAdapter = MeusIngressosAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMeusIngressosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MeusIngressosPresenter(this)

        // Configuração do RecycleView.

        binding.lista.layoutManager = LinearLayoutManager(this)
        binding.lista.adapter = adapter
        binding.lista.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        presenter.filtraUsuario()
    }

    fun mostraIngresso(listaFiltrada: List<MeusIngressos>) {
        adapter.adicionaIngressos(listaFiltrada)
    }
}