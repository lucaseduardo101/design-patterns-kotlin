package br.com.example.loja.imposto

import br.com.example.loja.orcamento.Orcamento
import java.math.BigDecimal

class ICMS: Imposto {
    override fun calcular(orcamento: Orcamento): BigDecimal {
        return orcamento.valor.multiply(BigDecimal("0.1"))
    }
}