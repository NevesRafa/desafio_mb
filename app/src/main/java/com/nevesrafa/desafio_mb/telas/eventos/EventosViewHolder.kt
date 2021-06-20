package com.nevesrafa.desafio_mb.telas.eventos

import androidx.recyclerview.widget.RecyclerView
import com.nevesrafa.desafio_mb.R
import com.nevesrafa.desafio_mb.classes.Evento
import com.nevesrafa.desafio_mb.databinding.EventoBinding
import java.text.DecimalFormat

class EventosViewHolder(val binding: EventoBinding) : RecyclerView.ViewHolder(binding.root) {


    fun escreveNaTela(evento: Evento, clique: (Evento) -> Unit) {

        val formatador = DecimalFormat()
        formatador.minimumFractionDigits = 2

        val valorFormatado = formatador.format(evento.valorUnitario)

        val context = binding.root.context

        binding.nomeDoEvento.text = evento.nomeDoEvento
        binding.data.text = context.getString(R.string.data, evento.data)
        binding.horario.text = context.getString(R.string.hora, evento.horaInicio, evento.horaFim)
        binding.local.text = context.getString(R.string.local, evento.local)
        binding.valor.text = context.getString(R.string.valor, valorFormatado)

        binding.root.setOnClickListener { clique(evento) }
    }
}