package com.nevesrafa.desafio_mb.telas.eventos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nevesrafa.desafio_mb.classes.Evento
import com.nevesrafa.desafio_mb.databinding.EventoBinding

class EventosAdapter(val eventos: List<Evento>) : RecyclerView.Adapter<EventosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventosViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = EventoBinding.inflate(inflater, parent, false)
        val viewHolder = EventosViewHolder(binding)
        return viewHolder
    }

    override fun onBindViewHolder(holder: EventosViewHolder, position: Int) {
        val evento = eventos[position]
        holder.escreveNaTela(evento)

    }

    override fun getItemCount(): Int {
        return eventos.size
    }
}