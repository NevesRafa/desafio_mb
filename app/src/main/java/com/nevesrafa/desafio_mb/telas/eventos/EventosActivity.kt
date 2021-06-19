package com.nevesrafa.desafio_mb.telas.eventos

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.nevesrafa.desafio_mb.classes.Evento
import com.nevesrafa.desafio_mb.databinding.ActivityEventosBinding
import com.nevesrafa.desafio_mb.telas.compra.CompraActivity

class EventosActivity : AppCompatActivity() {

    lateinit var binding: ActivityEventosBinding
    lateinit var presenter: EventosPresenter
    lateinit var adapter: EventosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = EventosPresenter(this)

        adapter = EventosAdapter({ evento ->
            val intent = Intent(this, CompraActivity::class.java)
            intent.putExtra("evento selecionado", evento)
            startActivity(intent)
        })

        // Configuração do RecycleView.

        binding.lista.layoutManager = LinearLayoutManager(this)
        binding.lista.adapter = adapter
        binding.lista.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        // Checando se o filtro está selecionado.

        binding.empresarial.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked == true) {
                presenter.mostraEmpresarial()
            }
        }

        presenter.mostrarTodosEventos()
    }

    fun mostraEventos(listaFiltrada: List<Evento>) {
        adapter.adicionaEventos(listaFiltrada)

    }
}