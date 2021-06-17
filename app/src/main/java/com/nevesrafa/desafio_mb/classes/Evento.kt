package com.nevesrafa.desafio_mb.classes

class Evento(
    val eventoId: Int,
    val nomeDoEvento: String,
    val tipo: String,
    val data: String,
    val horaInicio: String,
    val horaFim: String,
    val local: String,
    val contato: String,
    val valorUnitario: Double,
    val lotacao: Int,
    val quantidadeVendido: Int
) {
}