package com.nevesrafa.desafio_mb.telas.splash

import com.google.firebase.auth.FirebaseAuth

class SplashPresenter(val activity: SplashActivity) {

    fun validaLogin() {
        val user = FirebaseAuth.getInstance().currentUser

        if (user != null) {
            activity.abreTelaInicial()
        } else {
            activity.abreTelaLogin()
        }
    }
}