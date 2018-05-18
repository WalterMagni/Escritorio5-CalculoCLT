//CONVERTIDO

package ead5.com.br.CalculoCLT;

import java.math.BigDecimal;

public class AdicionalPericulosidade extends CalculoBase{

	private boolean cond;
	BigDecimal b1 = new BigDecimal(0.3);
	
	
	//construtor
	public AdicionalPericulosidade(BigDecimal valor, boolean cond) {
		super(valor);
		this.cond = cond;
		
	}
	

	@Override
	public BigDecimal calcularAbsoluto() {
		
		if (cond == true) {
			return valor.multiply(b1);
		}
		else {			
			return valor;
		}
	}


	@Override
	protected boolean isDesconto() {
		return false;
	}
	
}