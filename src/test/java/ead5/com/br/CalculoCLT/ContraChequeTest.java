package ead5.com.br.CalculoCLT;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContraChequeTest {

	//cenario1
	
	@Test
	public void testarContraChequeTest1() {
		
		double salario = 1800;
		
		ContraCheque calculo = new ContraCheque(salario, 0, 60, false, 20, 10, 0, 0, 22);
		assertEquals(0, calculo.getDescontoFaltas(),0); //sem falta
		assertEquals(1740, calculo.getDescontoPlanoSaudeAbsoluto(),0); //desconto de 60rs
		assertEquals(1800, calculo.getBeneficios(),0); // sem adicional
		assertEquals(88, calculo.getValeRefeicao(),0); 
		assertEquals(108, calculo.getValeTransporteAbsoluto(),0);

		
	}

}
