package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlanoSaudeTest {

	@Test
	public void testarPlanoSaude() {
		
		double salario = 2000;
		
		CalculoBase calculo = new PlanoSaude(salario, 100);
		assertEquals(1900, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testarPlanoSaudeDois() {
		
		double salario = 2000;
		
		CalculoBase calculo = new PlanoSaude(salario, 40);
		assertEquals(1950, calculo.calcularAbsoluto(), 0);
	}

}
