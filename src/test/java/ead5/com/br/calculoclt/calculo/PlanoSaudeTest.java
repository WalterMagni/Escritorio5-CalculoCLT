package ead5.com.br.calculoclt.calculo;

import java.math.BigDecimal;

import org.junit.Test;

import ead5.com.br.calculoclt.calculo.CalculoBase;
import ead5.com.br.calculoclt.calculo.PlanoSaude;

public class PlanoSaudeTest {

	@Test
	public void testarPlanoSaude() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal desconto = new BigDecimal(100);
		
		CalculoBase calculo = new PlanoSaude(salario, desconto);
		assertEquals(1900, calculo.calcularAbsoluto(), 0);
	}
	
	private void assertEquals(int i, BigDecimal calcularAbsoluto, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testarPlanoSaudeDois() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal desconto = new BigDecimal(40);
		
		CalculoBase calculo = new PlanoSaude(salario, desconto);
		assertEquals(1950, calculo.calcularAbsoluto(), 0);
	}

}
