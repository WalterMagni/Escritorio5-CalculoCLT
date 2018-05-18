//CONVERTIDO

package ead5.com.br.CalculoCLT;

import java.math.BigDecimal;

public class DescINSS extends CalculoBase {
	
	BigDecimal b1 = new BigDecimal(1556.94);
	BigDecimal b2 = new BigDecimal(1556.95);
	BigDecimal b3 = new BigDecimal(2594.92);
	BigDecimal b4 = new BigDecimal(2594.93);
	BigDecimal b5 = new BigDecimal(5189.82);
	BigDecimal d1 = new BigDecimal(0.92);
	BigDecimal d2 = new BigDecimal(0.91);
	BigDecimal d3 = new BigDecimal(0.89);
	BigDecimal erro = new BigDecimal("Valor Invalido");
	BigDecimal valorV = new BigDecimal(0);

	
	//construtor
	public DescINSS(BigDecimal valor) {
		super(valor);
		
	}
	

	@Override
	public BigDecimal calcularAbsoluto() {
		
		if (valor.equals(valorV)) {
			
			return erro;
		}
		
		else {
			
			if (valor.compareTo(b1) <= 1556.94) {
				return valor.multiply(d1);
			}
			else if (valor.compareTo(b2) >= 1556.95 && valor.compareTo(b3) <= 2594.92) {
				return valor.multiply(d2);
			}
			else if (valor.compareTo(b4) >= 2594.93 && valor.compareTo(b5) <= 5189.82) {
				return valor.multiply(d3);
			}
			else {
				return valor.multiply(d3);
			}		
			
		}
			
			

	}


	@Override
	protected boolean isDesconto() {
		return true;
	}
	

}