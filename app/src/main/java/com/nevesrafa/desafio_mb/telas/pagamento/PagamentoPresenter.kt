package com.nevesrafa.desafio_mb.telas.pagamento

class PagamentoPresenter(val activity: PagamentoActivity) {

    fun confirmarCompra(
        nomeCartao: String,
        numeroCartao: String,
        vencimentoCartao: String,
        codSeguranca: String,
        cep: String
    ) {
        if (numeroCartao.length < 19) {
            activity.mostraErroNumeroDoCartao()
        } else if (vencimentoCartao.length < 5) {
            activity.mostraErroDataVencimento()
        } else if (codSeguranca.length < 3) {
            activity.mostraErroCodSeguranca()
        } else if (cep.length < 9) {
            activity.mostraErroCep()
        } else if (nomeCartao.isEmpty() || nomeCartao.isBlank()) {
            activity.mostraErroNome()
        } else {
            activity.validacaoCartaoOk()
        }

    }
}