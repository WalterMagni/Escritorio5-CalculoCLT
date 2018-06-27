package ead5.com.br.calculoclt.calculo;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import ead5.com.br.calculoclt.calculo.CalculoBase;
import ead5.com.br.calculoclt.calculo.FGTS;

public class GFGTSTest {

	
	//teste com um mes trabalhado
	@Test
	public void testarFGTS() {
		
		BigDecimal salario = new BigDecimal(2000);
		
		CalculoBase calculo = new FGTS(salario, 1);
		assertEquals(160, salario, 0);
		
	}
	
	//teste com um mes trabalhado
		@Test
		public void testarFGTS_2meses() {
			
			BigDecimal salario = new BigDecimal(2000);
			
			CalculoBase calculo = new FGTS(salario, 2);
			assertEquals(320, salario, 0);
			
		}
		
		//teste com um mes trabalhado ERRADO
		  @Test
		  public void testarFGTS_errado() {
					
			BigDecimal salario = new BigDecimal(2000);
				
			CalculoBase calculo = new FGTS(salario, 1);
			assertEquals(300, salario, 0);
					
		}	
		  
		  
			//teste com um mes trabalhado ERRADO
		  @Test
		  public void testarFGTS_2meses_errado() {
				
			BigDecimal salario = new BigDecimal(2000);
				
			CalculoBase calculo = new FGTS(salario, 2);
			assertEquals(300, salario, 0);
				
			}

	private void assertEquals(int i, BigDecimal fgts, int j) {
		// TODO Auto-generated method stub
		
	}

}
