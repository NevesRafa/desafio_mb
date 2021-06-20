package com.nevesrafa.desafio_mb.telas.pagamento

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nevesrafa.desafio_mb.R
import com.nevesrafa.desafio_mb.databinding.ActivityPagamentoBinding
import com.nevesrafa.desafio_mb.mascaras.MascaraAno
import com.nevesrafa.desafio_mb.mascaras.MascaraCEP
import com.nevesrafa.desafio_mb.mascaras.MascaraCartao
import java.text.DecimalFormat

class PagamentoActivity : AppCompatActivity() {


    lateinit var binding: ActivityPagamentoBinding
    lateinit var presenter: PagamentoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagamentoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = PagamentoPresenter(this)

        val valorCompra = intent.getDoubleExtra("valor total", 0.0)

        val formatador = DecimalFormat()
        formatador.minimumFractionDigits = 2

        binding.valor.text = getString(R.string.valor, formatador.format(valorCompra))

        binding.cep.editText?.addTextChangedListener(MascaraCEP())
        binding.dataVencimento.editText?.addTextChangedListener(MascaraAno())
        binding.numeroCartao.editText?.addTextChangedListener(MascaraCartao())

        binding.pagarBotao.setOnClickListener {
            presenter.confirmarCompra(
                binding.nomeCartao.editText?.text.toString(),
                binding.numeroCartao.editText?.text.toString(),
                binding.dataVencimento.editText?.text.toString(),
                binding.codigoSeguranca.editText?.text.toString(),
                binding.cep.editText?.text.toString()
            )
        }
    }

    fun mostraErroNumeroDoCartao() {
        Toast.makeText(this, getString(R.string.cartao_invalido), Toast.LENGTH_LONG).show()
    }

    fun mostraErroDataVencimento() {
        Toast.makeText(this, getString(R.string.erro_data_vencimento), Toast.LENGTH_LONG).show()
    }

    fun mostraErroCodSeguranca() {
        Toast.makeText(this, getString(R.string.erro_cod_seguranca), Toast.LENGTH_LONG).show()
    }

    fun mostraErroCep() {
        Toast.makeText(this, getString(R.string.erro_cep), Toast.LENGTH_LONG).show()
    }

    fun mostraErroNome() {
        Toast.makeText(this, getString(R.string.erro_nome), Toast.LENGTH_LONG).show()
    }

    fun validacaoCartaoOk() {
        Toast.makeText(this, getString(R.string.validacao_ok), Toast.LENGTH_LONG).show()
        finish()
    }


}