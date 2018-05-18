//CONVERTIDO

package ead5.com.br.CalculoCLT;

import java.math.BigDecimal;

public class ValeAlimentacao extends CalculoBase {

	private BigDecimal valeA;
	private int qtdeDias;
	
	BigDecimal d1 = new BigDecimal(5);
	BigDecimal d2 = new BigDecimal(6);
	BigDecimal d3 = new BigDecimal(15);
	BigDecimal b1 = new BigDecimal(0.2);
	BigDecimal erro = new BigDecimal("Valor Invalido");
	BigDecimal valorV = new BigDecimal(0);
	

	public BigDecimal getValeA() {
		return valeA;
	}

	public void setValeA(BigDecimal valeA) {
		this.valeA = valeA;
	}

	// construtor
	public ValeAlimentacao(BigDecimal valor, BigDecimal valeA, int qtdeDias) {
		super(valor);
		this.valeA = valeA;
		this.qtdeDias = qtdeDias;
	}

	@Override
	public BigDecimal calcularAbsoluto() {

		// segunda a sexta / 5 por 2
		
		if (qtdeDias < 0 && qtdeDias > 31) {
			return erro;
		}else {
			if (qtdeDias == 5) {
				valeA = valeA.multiply(d1);
				valor = valor .subtract((valeA.multiply(b1)));
				return valor;
			}
			// segunda a sabado / 5 por 1
			else if (qtdeDias == 6) {
				valeA = valeA.multiply(d2);
				valor = valor .subtract((valeA.multiply(b1)));
				return valor;
			}
			// 12 por 36
			else {
				valeA = valeA.multiply(d3);
				valor = valor .subtract((valeA.multiply(b1)));
				return valor;
			}
		}
				
		
		
	}

	@Override
	protected boolean isDesconto() {
		return true;
	}

}