package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcFaltasTest {

	@Test
	public void testarSemFaltas() {
		
		double salario = 2000;
		
		CalculoBase calculo = new CalcFaltas(salario, 0);
		assertEquals(0, calculo.calcular(), 0);
	}
	
	@Test
	public void testarComFaltas() {
		
		double salario = 2000;
		
		CalculoBase calculo = new CalcFaltas(salario, 1);
		assertEquals(1927.28, calculo.calcularAbsoluto(), 0);
	}


}
