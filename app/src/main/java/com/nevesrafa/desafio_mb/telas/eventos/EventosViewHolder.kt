package com.nevesrafa.desafio_mb.telas.eventos

import androidx.recyclerview.widget.RecyclerView
import com.nevesrafa.desafio_mb.classes.Evento
import com.nevesrafa.desafio_mb.databinding.EventoBinding

class EventosViewHolder(val binding: EventoBinding) : RecyclerView.ViewHolder(binding.root) {

    fun escreveNaTela(evento: Evento) {
        binding.nomeDoEvento.text = evento.nomeDoEvento
        binding.data.text = evento.data
        binding.horario.text = "${evento.horaInicio} - ${evento.horaFim}"
        binding.local.text = evento.local
        binding.valor.text = "R\$${evento.valorUnitario.toString()}"
    }
}