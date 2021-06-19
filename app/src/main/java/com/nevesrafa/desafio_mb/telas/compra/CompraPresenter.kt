package com.nevesrafa.desafio_mb.telas.compra

import com.nevesrafa.desafio_mb.classes.Evento

class CompraPresenter(val activity: CompraActivity) {

    lateinit var guardaEvento: Evento

    fun fazCompra(quantidadeDigitada: Int?) {

        if (quantidadeDigitada == 0 || quantidadeDigitada == null) {
            activity.mostraErroVazio()
        } else if (quantidadeDigitada > guardaEvento.quantidadeDisponivel()) {
            activity.mostraErroMaiorQueLimite()
        } else {
            activity.mostraCompraConcluida()
        }


    }
}