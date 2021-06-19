package com.nevesrafa.desafio_mb.telas.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.nevesrafa.desafio_mb.databinding.ActivitySplashBinding
import com.nevesrafa.desafio_mb.telas.inicial.InicialActivity
import com.nevesrafa.desafio_mb.telas.login.LoginAcitivity

class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding
    lateinit var presenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = SplashPresenter(this)

        // Validando login tempo de 5 segundos (5000L)
        Handler().postDelayed({
            presenter.validaLogin()
        }, 5000L)
    }

    fun abreTelaInicial() {
        val intent = Intent(this, InicialActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun abreTelaLogin() {
        val intent = Intent(this, LoginAcitivity::class.java)
        startActivity(intent)
        finish()
    }
}