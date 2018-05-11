package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemaisBeneficiosTest {

	@Test
	public void testarDemaisBeneficiosCom() {
		
		double salario = 2000;
		
		CalculoBase calculo = new DemaisBeneficios(salario, 1000);
		assertEquals(3000, calculo.calcular(), 0);
		
	}

	@Test
	public void testarDemaisBeneficiosSem() {
		
		double salario = 2000;
		
		CalculoBase calculo = new DemaisBeneficios(salario, 0);
		assertEquals(3000, calculo.calcular(), 0);
		
	}
}
