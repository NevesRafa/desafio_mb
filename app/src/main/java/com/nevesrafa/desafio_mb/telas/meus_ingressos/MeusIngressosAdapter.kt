package com.nevesrafa.desafio_mb.telas.meus_ingressos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nevesrafa.desafio_mb.classes.MeusIngressos
import com.nevesrafa.desafio_mb.databinding.MeuIngressoBinding

class MeusIngressosAdapter : RecyclerView.Adapter<MeusIngressosViewHolder>() {

    val ingressos = mutableListOf<MeusIngressos>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeusIngressosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MeuIngressoBinding.inflate(inflater, parent, false)
        val viewHolder = MeusIngressosViewHolder(binding)
        return viewHolder
    }

    override fun onBindViewHolder(holder: MeusIngressosViewHolder, position: Int) {
        val meuIngresso = ingressos[position]
        holder.escrevaNaTela(meuIngresso)
    }

    override fun getItemCount(): Int {
        return ingressos.size
    }


    fun adicionaIngressos(listaFiltrada: List<MeusIngressos>) {
        ingressos.clear()  // Limpa a lista.
        ingressos.addAll(listaFiltrada) // Add a lista toda.
        notifyDataSetChanged() // Reconstroi a lista.
    }
}