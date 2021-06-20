package com.nevesrafa.desafio_mb.telas.meus_ingressos

import com.google.firebase.auth.FirebaseAuth
import com.nevesrafa.desafio_mb.mock.GeradorDeDados

class MeusIngressosPresenter(val activity: MeusIngressosActivity) {

    val listaMeusIngressos = GeradorDeDados.listaIngressos()

    fun filtraUsuario() {

        val email = FirebaseAuth.getInstance().currentUser?.email

        val listaFiltrada = listaMeusIngressos.filter { it.usuario == email }
        activity.mostraIngresso(listaFiltrada)
    }

}