package com.nevesrafa.desafio_mb.telas.compra

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nevesrafa.desafio_mb.R
import com.nevesrafa.desafio_mb.classes.Evento
import com.nevesrafa.desafio_mb.databinding.ActivityCompraBinding
import java.text.DecimalFormat

class CompraActivity : AppCompatActivity() {

    lateinit var binding: ActivityCompraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val eventoSelecionado = intent.getParcelableExtra<Evento>("evento selecionado")

        // Formatando valor do evento

        val formatador = DecimalFormat()
        formatador.minimumFractionDigits = 2

        val valorFormatado = formatador.format(eventoSelecionado?.valorUnitario)

        // Ligando os dados do evento com meu XML

        binding.contatoCrompra.text = getString(R.string.contato, eventoSelecionado?.contato)
        binding.dataCompra.text = getString(R.string.data, eventoSelecionado?.data)
        binding.tipoCompra.text = getString(R.string.tipo, eventoSelecionado?.tipo)
        binding.horarioCompra.text = getString(
            R.string.hora,
            "${eventoSelecionado?.horaInicio} - ${eventoSelecionado?.horaFim}"
        )
        binding.localCompra.text = getString(R.string.local, eventoSelecionado?.local)
        binding.nomeEventoCompra.text = eventoSelecionado?.nomeDoEvento
        binding.quantidadeDisponivelCompra.text = getString(
            R.string.quantidade_vendido,
            eventoSelecionado?.quantidadeVendido.toString(),
            eventoSelecionado?.lotacao.toString()
        )
        binding.valorCompra.text = getString(R.string.valor, valorFormatado)

    }
}