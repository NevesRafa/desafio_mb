package com.nevesrafa.desafio_mb.telas.eventos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nevesrafa.desafio_mb.classes.Evento
import com.nevesrafa.desafio_mb.databinding.EventoBinding

class EventosAdapter(val clique: (Evento) -> Unit) : RecyclerView.Adapter<EventosViewHolder>() {

    val eventos = mutableListOf<Evento>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventosViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = EventoBinding.inflate(inflater, parent, false)
        val viewHolder = EventosViewHolder(binding)
        return viewHolder
    }

    override fun onBindViewHolder(holder: EventosViewHolder, position: Int) {
        val evento = eventos[position]
        holder.escreveNaTela(evento, clique)

    }

    override fun getItemCount(): Int {
        return eventos.size
    }


    fun adicionaEventos(listaEvento: List<Evento>) {
        eventos.clear()  // Limpa a lista.
        eventos.addAll(listaEvento) // Add a lista toda.
        notifyDataSetChanged() // Reconstroi a lista.

    }
}