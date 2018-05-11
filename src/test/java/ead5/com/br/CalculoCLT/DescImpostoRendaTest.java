package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescImpostoRendaTest {

	@Test
	public void testarDescontoImpostoRenda1900() {
		
		double salario = 1900;
		
		CalculoBase calculo = new DescImpostoRenda(salario, 1);
		assertEquals(0, calculo.calcularAbsoluto(),0);
	}
	
	@Test
	public void testarDescontoImpostoRenda2000_SemDependentes() {
		
		double salario = 2000;
		
		CalculoBase calculo = new DescImpostoRenda(salario, 0);
		assertEquals(1674.40, calculo.calcularAbsoluto(),0);
	}
	
	@Test
	public void testarDescontoImpostoRenda2000_ComDependentes() {
		
		double salario = 2000;
		
		CalculoBase calculo = new DescImpostoRenda(salario, 1);
		assertEquals(1484.81, calculo.calcularAbsoluto(),0);
	}

}
