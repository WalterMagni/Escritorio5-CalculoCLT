//CONVERTIDO

package ead5.com.br.calculoclt.calculo;

import java.math.BigDecimal;

public class ValeTransporte extends CalculoBase{

	private BigDecimal valeT;
	private boolean cond;
	
	BigDecimal b1 = new BigDecimal(0.6);
	BigDecimal erro = new BigDecimal("Valor Invalido");
	
	

	public BigDecimal getValeT() {
		return valeT;
	}

	public void setValeT(BigDecimal valeT) {
		this.valeT = valeT;
	}

	//construtor
	public ValeTransporte(BigDecimal valor, BigDecimal valeT, boolean cond) {
		super(valor);
		this.valeT = valeT;
		this.cond = cond;
	}

	@Override
	public BigDecimal calcularAbsoluto() {
		if (cond) {
			
			BigDecimal teto = valor.multiply(b1);
			
			
			if (valeT.compareTo(teto) >= 0.6) {
				return teto;
			}

				return valeT;
		
		}
		else {
			return valor;
		}
	}

	@Override
	protected boolean isDesconto() {
		return true;
	}
	
}