package com.nevesrafa.desafio_mb.telas.eventos

import androidx.recyclerview.widget.RecyclerView
import com.nevesrafa.desafio_mb.classes.Evento
import com.nevesrafa.desafio_mb.databinding.EventoBinding
import java.text.DecimalFormat

class EventosViewHolder(val binding: EventoBinding) : RecyclerView.ViewHolder(binding.root) {


    fun escreveNaTela(evento: Evento, clique: (Evento) -> Unit) {

        val formatador = DecimalFormat()
        formatador.minimumFractionDigits = 2

        val valorFormatado = formatador.format(evento.valorUnitario)



        binding.nomeDoEvento.text = evento.nomeDoEvento
        binding.data.text = evento.data
        binding.horario.text = "${evento.horaInicio} - ${evento.horaFim}"
        binding.local.text = evento.local
        binding.valor.text = "R\$${valorFormatado}"

        binding.root.setOnClickListener { clique(evento) }
    }
}