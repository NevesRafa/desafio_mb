package com.nevesrafa.desafio_mb.telas.eventos

import android.os.Handler
import com.nevesrafa.desafio_mb.mock.GeradorDeDados

class EventosPresenter(val activity: EventosActivity) {

    val listaEventos = GeradorDeDados.listaEventos()


    fun mostraEmpresarial() {

        val listaFiltrada = listaEventos.filter { it.tipo == "Empresarial" }

        activity.mostraEventos(listaFiltrada)

    }

    fun mostraUniversitario() {

        val listaFiltrada = listaEventos.filter { it.tipo == "Universitário" }

        activity.mostraEventos(listaFiltrada)
    }

    fun mostrarTodosEventos() {
        activity.mostraLoading()

        Handler().postDelayed({
            activity.escondeLoading()
            activity.mostraEventos(listaEventos)
        }, 4000L)
    }


}


