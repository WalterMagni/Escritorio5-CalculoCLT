package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValeAlimentacaoTest {

	@Test
	public void testar22DiasCerto() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeAlimentacao(salario, 20, 5);
		assertEquals(1912, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testar22DiasErrado() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeAlimentacao(salario, 20, 5);
		assertEquals(1900, calculo.calcularAbsoluto(), 0);
	}
		
	@Test
	public void testar26DiasCerto() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeAlimentacao(salario, 20, 6);
		assertEquals(1896, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testar26DiasErrado() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeAlimentacao(salario, 20, 6);
		assertEquals(1800, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testar15DiasCerto() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeAlimentacao(salario, 20, 15);
		assertEquals(1940, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testar15DiasErrado() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeAlimentacao(salario, 20, 15);
		assertEquals(1900, calculo.calcularAbsoluto(), 0);
	}
	
}
