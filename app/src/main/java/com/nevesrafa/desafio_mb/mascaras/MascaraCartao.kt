package com.nevesrafa.desafio_mb.mascaras

import android.text.Editable
import android.text.TextWatcher

class MascaraCartao : TextWatcher {
    var editando = false

    //Não usa!
    override fun beforeTextChanged(text: CharSequence?, start: Int, count: Int, after: Int) {}

    //Não usa!
    override fun onTextChanged(text: CharSequence?, start: Int, before: Int, count: Int) {}

    //Logica da mascara
    override fun afterTextChanged(editable: Editable?) {
        //If feito para nao ter chamadas indesejadas
        if (editando == true) {
            return
        }
        editando = true

        val digitadoSemMascara =
            editable.toString().replace(" ", "") //pega valor do campo e retira a mascara
        var novoValor = "" //inicia vazio

        //se não for a primeira posição e for 4,8,12 ou 16 adiciona espaço
        digitadoSemMascara.forEachIndexed { indice, digito ->
            if (indice > 0 && indice % 4 == 0) {
                novoValor += " "
            }

            novoValor += digito
        }

        editable?.clear()
        editable?.append(novoValor)

        editando = false
    }
}