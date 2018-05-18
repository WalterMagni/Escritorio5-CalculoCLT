//CONVERTIDO

package ead5.com.br.CalculoCLT;

import java.math.BigDecimal;

import org.junit.Test;

public class ValeRefeicaoTest {

	@Test
	public void testar22DiasCerto() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal valor = new BigDecimal(20);
		
		
		
		CalculoBase calculo = new ValeRefeicao(salario, valor, 5);
		assertEquals(1912, calculo.calcularAbsoluto(), 0);
	}
	
	private void assertEquals(int i, BigDecimal calcularAbsoluto, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testar22DiasErrado() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal valor = new BigDecimal(20);
		
		CalculoBase calculo = new ValeRefeicao(salario, valor, 5);
		assertEquals(1900, calculo.calcularAbsoluto(), 0);
	}
		
	@Test
	public void testar26DiasCerto() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal valor = new BigDecimal(20);
		
		CalculoBase calculo = new ValeRefeicao(salario, valor, 6);
		assertEquals(1896, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testar26DiasErrado() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal valor = new BigDecimal(20);
		
		CalculoBase calculo = new ValeRefeicao(salario, valor, 6);
		assertEquals(1800, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testar15DiasCerto() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal valor = new BigDecimal(20);
		
		CalculoBase calculo = new ValeRefeicao(salario, valor, 15);
		assertEquals(1940, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testar15DiasErrado() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal valor = new BigDecimal(20);
		
		CalculoBase calculo = new ValeRefeicao(salario, valor, 15);
		assertEquals(1900, calculo.calcularAbsoluto(), 0);
	}
	
}
