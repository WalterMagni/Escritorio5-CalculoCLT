//CONVERTIDO

package ead5.com.br.calculoclt.calculo;


import java.math.BigDecimal;

import org.junit.Test;

import ead5.com.br.calculoclt.calculo.CalculoBase;
import ead5.com.br.calculoclt.calculo.DemaisBeneficios;

public class DemaisBeneficiosTest {

	@Test
	public void testarDemaisBeneficiosCom() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal adicional = new BigDecimal(1000);
		
		
		CalculoBase calculo = new DemaisBeneficios(salario, adicional);
		assertEquals(3000, calculo.calcular(), 0);
		
	}

	private void assertEquals(int i, BigDecimal calcular, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testarDemaisBeneficiosSem() {
		
		BigDecimal salario = new BigDecimal(2000);
		BigDecimal adicional = new BigDecimal(0);
		
		CalculoBase calculo = new DemaisBeneficios(salario, adicional);
		assertEquals(3000, calculo.calcular(), 0);
		
	}
}
