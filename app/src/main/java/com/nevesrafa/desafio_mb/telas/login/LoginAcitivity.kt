package com.nevesrafa.desafio_mb.telas.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.firebase.ui.auth.AuthUI
import com.nevesrafa.desafio_mb.R
import com.nevesrafa.desafio_mb.databinding.ActivityLoginBinding
import com.nevesrafa.desafio_mb.telas.inicial.InicialActivity

class LoginAcitivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    lateinit var presenter: LoginPresenter
    val fluxoDeLogin = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = LoginPresenter(this)

        // Configurando Firebase Login

        binding.botaoCriarLogin.setOnClickListener {
            val providers = listOf(
                AuthUI.IdpConfig.EmailBuilder().build(),
                AuthUI.IdpConfig.GoogleBuilder().build()
            )

            val intent = AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setIsSmartLockEnabled(false)
                .setTheme(R.style.Theme_Desafio_MB)
                .setAvailableProviders(providers)
                .build()

            startActivityForResult(intent, fluxoDeLogin)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == fluxoDeLogin) {
            if (resultCode == Activity.RESULT_OK) {
                abreTelaInicial()
            } else {
                Toast.makeText(this, "Erro no Login, tente novamente =)", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun abreTelaInicial() {
        val intent = Intent(this, InicialActivity::class.java)
        startActivity(intent)
        finish()
    }
}