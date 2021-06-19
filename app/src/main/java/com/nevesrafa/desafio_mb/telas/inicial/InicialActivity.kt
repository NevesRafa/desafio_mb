package com.nevesrafa.desafio_mb.telas.inicial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseUser
import com.nevesrafa.desafio_mb.R
import com.nevesrafa.desafio_mb.databinding.AcitivityInicialBinding
import com.nevesrafa.desafio_mb.telas.eventos.EventosActivity
import com.nevesrafa.desafio_mb.telas.meus_ingressos.MeusIngressosActivity
import com.nevesrafa.desafio_mb.telas.splash.SplashActivity

class InicialActivity : AppCompatActivity() {

    lateinit var binding: AcitivityInicialBinding
    lateinit var presenter: InicialPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcitivityInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = InicialPresenter(this)

        presenter.pegaUsuario()

        binding.botaoEventos.setOnClickListener {
            abreEventos()
        }

        binding.botaoMeusIngressos.setOnClickListener {
            abreMeusIngressos()
        }

        binding.botaosair.setOnClickListener {
            presenter.sair()
        }
    }

    fun abreEventos() {
        val intent = Intent(this, EventosActivity::class.java)
        startActivity(intent)
    }

    fun abreMeusIngressos() {
        val intent = Intent(this, MeusIngressosActivity::class.java)
        startActivity(intent)
    }

    fun mostrarUsuario(usuario: FirebaseUser?) {
        binding.usuario.text = getString(R.string.ola, usuario?.displayName)
        Glide.with(this)
            .load(usuario?.photoUrl)
            .circleCrop()
            .into(binding.imagemUsuario)
    }

    fun abreSplash() {
        val intent = Intent(this, SplashActivity::class.java)
        startActivity(intent)
        finish()
    }
}

