package br.com.example.loja.orcamento

import br.com.example.loja.imposto.ICMS
import br.com.example.loja.imposto.ISS
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

internal class CalculadoraDeImpostosTest{
    @Test
    fun testarCalculadoraDeImpostosICMS(){
        val calculadoraDeImpostos = CalculadoraDeImpostos()
        var orcamento = Orcamento(BigDecimal("100"))

        assertEquals(BigDecimal("10.0"),calculadoraDeImpostos.calcular(orcamento, ICMS()))
    }
    @Test
    fun testarCalculadoraDeImpostosISS(){
        val calculadoraDeImpostos = CalculadoraDeImpostos()
        var orcamento = Orcamento(BigDecimal("100"))

        assertEquals(BigDecimal("6.00"),calculadoraDeImpostos.calcular(orcamento, ISS()))
    }

}

