package com.nevesrafa.desafio_mb.telas.inicial

import com.google.firebase.auth.FirebaseAuth

class InicialPresenter(val activity: InicialActivity) {

    fun pegaUsuario() {
        val usuario = FirebaseAuth.getInstance().currentUser
        activity.mostrarUsuario(usuario)
    }

    fun sair() {
        FirebaseAuth.getInstance().signOut()
        activity.abreSplash()
    }
}