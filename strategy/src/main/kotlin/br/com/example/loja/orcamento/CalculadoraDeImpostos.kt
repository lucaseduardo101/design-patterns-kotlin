package br.com.example.loja.orcamento

import br.com.example.loja.imposto.Imposto
import java.math.BigDecimal

class CalculadoraDeImpostos() {
    fun calcular(orcamento: Orcamento, imposto: Imposto):BigDecimal{
        return imposto.calcular(orcamento)
    }
}