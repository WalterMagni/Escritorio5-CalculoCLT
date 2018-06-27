//VERIFICAR

package ead5.com.br.calculoclt.calculo;


import java.math.BigDecimal;

import org.junit.Test;

import ead5.com.br.calculoclt.calculo.CalcFaltas;
import ead5.com.br.calculoclt.calculo.CalculoBase;

public class CalcFaltasTest {

	@Test
	public void testarSemFaltas() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal resultado = new BigDecimal(0);
		
		CalculoBase calculo = new CalcFaltas(salario, 0);
		assertEquals(resultado, calculo.calcular(), 0);
	}
	
	private void assertEquals(BigDecimal resultado, BigDecimal calcular, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testarComFaltas() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal resultado = new BigDecimal(1927.28);
		
		CalculoBase calculo = new CalcFaltas(salario, 1);
		assertEquals(resultado, calculo.calcularAbsoluto(), 0.01);
	}

	private void assertEquals(BigDecimal d, BigDecimal calcularAbsoluto, double e) {
		// TODO Auto-generated method stub
		
	}


}
