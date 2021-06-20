package com.nevesrafa.desafio_mb.mascaras

import android.text.Editable
import android.text.TextWatcher

class MascaraCEP : TextWatcher {
    var editando = false

    // Não usa!
    override fun beforeTextChanged(text: CharSequence?, start: Int, count: Int, after: Int) {}

    // Não usa!
    override fun onTextChanged(text: CharSequence?, start: Int, before: Int, count: Int) {}

    //Logica da mascara
    override fun afterTextChanged(editable: Editable?) {

        //If feito para nao ter chamadas indesejadas
        if (editando == true) {
            return
        }
        editando = true

        val digitadoSemMascara =
            editable.toString().replace("-", "") //pega valor do campo e retira a mascara
        var novoValor = digitadoSemMascara

        if (digitadoSemMascara.length > 5) {
            novoValor =
                digitadoSemMascara.substring(0..4)//corta no indice que passar como parametro
            novoValor += "-" // adiciona o traço após o 5 digito
            novoValor += digitadoSemMascara.substring(5) // adiciona o resto
        }

        editable?.clear() // limpa o campo editText
        editable?.append(novoValor) // adiciona o valor com mascara

        editando = false //termina o mascara
    }
}