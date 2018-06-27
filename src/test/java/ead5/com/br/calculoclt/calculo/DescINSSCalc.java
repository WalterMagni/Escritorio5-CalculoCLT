//CONVERTIDO

package ead5.com.br.calculoclt.calculo;

import java.math.BigDecimal;

import org.junit.Test;

import ead5.com.br.calculoclt.calculo.CalculoBase;
import ead5.com.br.calculoclt.calculo.DescINSS;

public class DescINSSCalc {

	@Test
	public void testarINSS2000_certo() {
		
		BigDecimal salario = new BigDecimal(2000);
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(1820, calculo.calcularAbsoluto(),0);
		
	}
	
	private void assertEquals(int i, BigDecimal calcularAbsoluto, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testarINSS2000_errado() {
		
		BigDecimal salario = new BigDecimal(2000);
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(1860, calculo.calcularAbsoluto(),0);
		
	}
	
	
	
	@Test
	public void testarINSS1400_certo() {
		
		BigDecimal salario = new BigDecimal(1400);
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(1288, calculo.calcularAbsoluto(),0);
		
	}
	
	@Test
	public void testarINSS1400_errado() {
		
		BigDecimal salario = new BigDecimal(1400);
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(1248, calculo.calcularAbsoluto(),0);
		
	}
	

	@Test
	public void testarINSS3000_certo() {
		
		BigDecimal salario = new BigDecimal(3000);
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(2670, calculo.calcularAbsoluto(),0);
		
	}
	
	@Test
	public void testarINSS3000_errado() {
		
		BigDecimal salario = new BigDecimal(3000);
		
		CalculoBase calculo = new DescINSS(salario);
		assertEquals(2690, calculo.calcularAbsoluto(),0);
		
	}
	

}
