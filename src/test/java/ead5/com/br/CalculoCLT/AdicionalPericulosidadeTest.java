//CONVERTIDO

package ead5.com.br.CalculoCLT;


import java.math.BigDecimal;

import org.junit.Test;

public class AdicionalPericulosidadeTest {


	
	@Test
	public void testarAdicionalPericulosidadeTrue() {
		
		BigDecimal salario = new BigDecimal(2000);
		
		CalculoBase calculo = new AdicionalPericulosidade(salario, true);
		assertEquals(600, calculo.calcular(),0);
	}
	
	
	private void assertEquals(int i, BigDecimal calcular, int j) {
		// TODO Auto-generated method stub
		
	}


	@Test
	public void testarAdicionalPericulosidadeFalse() {
		
		BigDecimal salario = new BigDecimal(2000);
		
		CalculoBase calculo = new AdicionalPericulosidade(salario, false);
		assertEquals(salario, calculo.calcular(),0);
	}
	
	private void assertEquals(BigDecimal salario, BigDecimal calcular, int j) {
		// TODO Auto-generated method stub
		
	}

}