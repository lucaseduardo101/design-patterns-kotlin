package br.com.example.loja.imposto

import br.com.example.loja.orcamento.Orcamento
import java.math.BigDecimal

interface Imposto {
    fun calcular(orcamento: Orcamento):BigDecimal
}