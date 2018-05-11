package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValeTransporteTest {

	@Test
	public void testarValeTransporte() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeTransporte(salario, salario * 0.6, true);
		assertEquals(120, calculo.calcularAbsoluto(), 0);
	}

	@Test
	public void testarValeTransporteFalse() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeTransporte(salario, salario * 0.6, false);
		assertEquals(120, calculo.calcularAbsoluto(), 0);
	}
	
	@Test
	public void testarValeTransporteSemDesconto() {
		
		double salario = 2000;
		
		CalculoBase calculo = new ValeTransporte(salario, salario * 0.6, false);
		assertEquals(0, calculo.calcularAbsoluto(), 0);
	}
	
	
	
}
