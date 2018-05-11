package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescINSSCalc {

	@Test
	public void testarINSS2000_certo() {
		
		double salario = 2000;
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(1820, calculo.calcularAbsoluto(),0);
		
	}
	
	@Test
	public void testarINSS2000_errado() {
		
		double salario = 2000;
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(1860, calculo.calcularAbsoluto(),0);
		
	}
	
	
	
	@Test
	public void testarINSS1400_certo() {
		
		double salario = 1400;
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(1288, calculo.calcularAbsoluto(),0);
		
	}
	
	@Test
	public void testarINSS1400_errado() {
		
		double salario = 1400;
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(1248, calculo.calcularAbsoluto(),0);
		
	}
	

	@Test
	public void testarINSS3000_certo() {
		
		double salario = 3000;
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(2670, calculo.calcularAbsoluto(),0);
		
	}
	
	@Test
	public void testarINSS3000_errado() {
		
		double salario = 3000;
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(2690, calculo.calcularAbsoluto(),0);
		
	}
	

}
