package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdicionalPericulosidadeTest {

	@Test
	public void testarAdicionalPericulosidadeTrue() {
		
		double salario = 2000;
		
		CalculoBase calculo = new AdicionalPericulosidade(salario, true);
		assertEquals(600, calculo.calcular(),0);
	}
	
	@Test
	public void testarAdicionalPericulosidadeFalse() {
		
		double salario = 2000;
		
		CalculoBase calculo = new AdicionalPericulosidade(salario, false);
		assertEquals(salario, calculo.calcular(),0);
	}

}
