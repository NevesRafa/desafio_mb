package com.nevesrafa.desafio_mb.telas.compra

import com.nevesrafa.desafio_mb.classes.Evento

class CompraPresenter(val activity: CompraActivity) {

    lateinit var eventoSelecionado: Evento

    fun fazCompra(quantidadeDigitada: Int?) {

        if (quantidadeDigitada == 0 || quantidadeDigitada == null) {
            activity.mostraErroVazio()
        } else if (quantidadeDigitada > eventoSelecionado.quantidadeDisponivel()) {
            activity.mostraErroMaiorQueLimite()
        } else {
            val valorDaCompra = eventoSelecionado.valorUnitario * quantidadeDigitada
            activity.mostraTelaDePagamento(valorDaCompra)
        }
    }
}