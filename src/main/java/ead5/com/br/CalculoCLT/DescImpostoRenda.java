//CONVERTIDO

package ead5.com.br.CalculoCLT;

import java.math.BigDecimal;

public class DescImpostoRenda extends CalculoBase  {
	
	private int dependentes;
	
	BigDecimal b1 = new BigDecimal(1903.98);
	BigDecimal b2 = new BigDecimal(2826.66);
	BigDecimal b3 = new BigDecimal(3751.05);
	BigDecimal b4 = new BigDecimal(3751.06);
	BigDecimal b5 = new BigDecimal(4664.68);
	BigDecimal b6 = new BigDecimal(4664.68);
	BigDecimal b7 = new BigDecimal(4664.68);
	BigDecimal d1 = new BigDecimal(0.92);
	BigDecimal d2 = new BigDecimal(0.85);
	BigDecimal d3 = new BigDecimal(0.78);
	BigDecimal d4 = new BigDecimal(0.72);
	BigDecimal v1 = new BigDecimal(0);
	BigDecimal v2 = new BigDecimal(189.59);
	BigDecimal v3 = new BigDecimal(dependentes);
	
	
	
		
	
	//construtor
	public DescImpostoRenda(BigDecimal valor, int dependentes) {
		super(valor);
		this.dependentes = dependentes;
	}

	
	
	@Override
	public BigDecimal calcularAbsoluto() {
		
		BigDecimal desconto = v1;
		BigDecimal descINSS = new DescINSS(valor).calcularAbsoluto();
		
		if (descINSS.compareTo(b1) < 1903.98) {
			return valor;
		} 
		
		else if (descINSS.compareTo(b1) >= 1903.98 && descINSS.compareTo(b2) <= 2826.65 ) {

			desconto = descINSS.multiply(d1);
			return desconto.subtract(v2.multiply(v3));
		} 
		 
		else if (descINSS.compareTo(b2) >= 2826.66 && descINSS.compareTo(b3) <= 3751.05) {

			desconto = descINSS.multiply(d2);
			return desconto.subtract(v2.multiply(v3));
		} 
		else if (descINSS.compareTo(b4) >= 3751.06 && descINSS.compareTo(b5) <= 4664.68 ) {
			desconto = descINSS.multiply(d3);
			return desconto.subtract(v2.multiply(v3));
		}

		else {
			desconto = descINSS.multiply(d4);
			return desconto.subtract(v2.multiply(v3));
		}
	}
	

	@Override
	protected boolean isDesconto() {
		return true;
	}
}