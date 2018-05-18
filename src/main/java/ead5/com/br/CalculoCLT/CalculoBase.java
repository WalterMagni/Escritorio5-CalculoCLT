//CONVERTIDO

package ead5.com.br.CalculoCLT;

import java.math.BigDecimal;

public abstract class CalculoBase {

	protected BigDecimal valor;
	BigDecimal b1 = new BigDecimal(-1);
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	//construtor
	public CalculoBase(BigDecimal valor) {
		super();
		this.valor = valor;
	}
	

	public abstract BigDecimal calcularAbsoluto();
	
	protected abstract boolean isDesconto();
	
	public BigDecimal calcular() {
		
		if (isDesconto()) {
			
			return calcularAbsoluto().multiply(b1);
		}
		
		return calcularAbsoluto();
	}
	
	
	
}