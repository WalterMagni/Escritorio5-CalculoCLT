//CONVERTIDO

package ead5.com.br.CalculoCLT;


import java.math.BigDecimal;

import org.junit.Test;

public class DescImpostoRendaTest {

	@Test
	public void testarDescontoImpostoRenda1900() {
		
		BigDecimal salario = new BigDecimal(2000);
		
		CalculoBase calculo = new DescImpostoRenda(salario, 1);
		assertEquals(0, calculo.calcularAbsoluto(),0);
	}
	
	private void assertEquals(int i, BigDecimal calcularAbsoluto, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testarDescontoImpostoRenda2000_SemDependentes() {
		
		BigDecimal salario = new BigDecimal(2000);
		
		CalculoBase calculo = new DescImpostoRenda(salario, 0);
		assertEquals(1674.40, calculo.calcularAbsoluto(),0);
	}
	
	private void assertEquals(double d, BigDecimal calcularAbsoluto, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testarDescontoImpostoRenda2000_ComDependentes() {
		
		BigDecimal salario = new BigDecimal(2000);
		
		CalculoBase calculo = new DescImpostoRenda(salario, 1);
		assertEquals(1484.81, calculo.calcularAbsoluto(),0);
	}

}
