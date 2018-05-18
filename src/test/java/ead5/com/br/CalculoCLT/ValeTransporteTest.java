//CONVERTIDO

package ead5.com.br.CalculoCLT;


import java.math.BigDecimal;

import org.junit.Test;

public class ValeTransporteTest {

	@Test
	public void testarValeTransporte() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal teto = new BigDecimal(0.6);
		
		CalculoBase calculo = new ValeTransporte(salario, salario.multiply(teto), true);
		assertEquals(120, calculo.calcularAbsoluto(), 0);
	}

	private void assertEquals(int i, BigDecimal calcularAbsoluto, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testarValeTransporteFalse() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal teto = new BigDecimal(0.6);
		
		CalculoBase calculo = new ValeTransporte(salario, salario.multiply(teto), false);
		assertEquals(120, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testarValeTransporteSemDesconto() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal teto = new BigDecimal(0.6);
		
		CalculoBase calculo = new ValeTransporte(salario, salario.multiply(teto), false);
		assertEquals(0, calculo.calcularAbsoluto(), 0);
	}
	
	
	
}
