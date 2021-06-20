package com.nevesrafa.desafio_mb.mock

import com.nevesrafa.desafio_mb.classes.Evento
import com.nevesrafa.desafio_mb.classes.MeusIngressos

object GeradorDeDados {

    fun listaEventos(): List<Evento> {

        return listOf(
            Evento(
                1,
                "Palestra Comercial: Construindo uma empresa lucrativa",
                "Empresarial",
                "20/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                80
            ),
            Evento(
                2,
                "Treinamento Empresarial",
                "Empresarial",
                "21/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                33
            ),
            Evento(
                3,
                "Feira de Empreendedorismo 2021",
                "Empresarial",
                "22/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                15
            ),
            Evento(
                5,
                "Treinamento Kotlin",
                "Empresarial",
                "24/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                18
            ),
            Evento(
                6,
                "Palestra Economia Aplicada",
                "Universitário",
                "25/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                90
            ),
            Evento(
                7,
                "Palestra Carreira Profissional",
                "Universitário",
                "26/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                46
            ),
            Evento(
                8,
                "Palestra Motivacional",
                "Universitário",
                "27/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                90
            ),
            Evento(
                9,
                "Workshop Administração 2021",
                "Universitário",
                "28/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                71
            ),
            Evento(
                10,
                "Workshop Tecnologia da Informação",
                "Universitário",
                "29/06/2021",
                "16:00",
                "17:00",
                "Campinas",
                "rafaelneves02@gmail.com",
                50.00,
                300,
                300
            )
        )
    }

    fun listaIngressos(): List<MeusIngressos> {

        return listOf(
            MeusIngressos(1, "rafaelneves02@gmail.com", 2),
            MeusIngressos(5, "rafaelneves02@gmail.com", 1),
            MeusIngressos(6, "rafaelneves02@gmail.com", 3),
            MeusIngressos(8, "rafaelneves02@gmail.com", 2),
            MeusIngressos(3, "nicollastneves@gmail.com", 2),
            MeusIngressos(5, "nicollastneves@gmail.com", 2),
            MeusIngressos(10, "nicollastneves@gmail.com", 2)
        )
    }
}