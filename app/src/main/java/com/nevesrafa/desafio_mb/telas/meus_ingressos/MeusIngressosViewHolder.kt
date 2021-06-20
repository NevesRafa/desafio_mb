package com.nevesrafa.desafio_mb.telas.meus_ingressos

import androidx.recyclerview.widget.RecyclerView
import com.nevesrafa.desafio_mb.R
import com.nevesrafa.desafio_mb.classes.MeusIngressos
import com.nevesrafa.desafio_mb.databinding.MeuIngressoBinding
import com.nevesrafa.desafio_mb.mock.GeradorDeDados

class MeusIngressosViewHolder(val binding: MeuIngressoBinding) :
    RecyclerView.ViewHolder(binding.root) {


    fun escrevaNaTela(meuIngresso: MeusIngressos) {

        val context = binding.root.context

        //Percorrendo a lista de eventos e buscando o evento do ingresso.
        val dadosDoEvento =
            GeradorDeDados.listaEventos().firstOrNull { it.eventoId == meuIngresso.eventoId }

        binding.nomeDoEventoMeuIngresso.text = dadosDoEvento?.nomeDoEvento
        binding.dataMeuIngresso.text = context.getString(R.string.data, dadosDoEvento?.data)
        binding.horarioMeuIngresso.text =
            context.getString(R.string.hora, dadosDoEvento?.horaInicio, dadosDoEvento?.horaFim)
        binding.localMeuIngresso.text = context.getString(R.string.local, dadosDoEvento?.local)
        binding.quantidadeMeuIngresso.text =
            context.getString(R.string.quantidade, meuIngresso.quantidade.toString())

    }
}