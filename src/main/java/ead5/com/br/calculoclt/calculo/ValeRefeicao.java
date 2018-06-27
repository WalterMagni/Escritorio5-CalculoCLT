//CONVERTIDO

package ead5.com.br.calculoclt.calculo;

import java.math.BigDecimal;

public class ValeRefeicao extends CalculoBase{
	
	private BigDecimal valeR;
private int qtdeDias;
	
	BigDecimal d1 = new BigDecimal(5);
	BigDecimal d2 = new BigDecimal(6);
	BigDecimal d3 = new BigDecimal(15);
	BigDecimal b1 = new BigDecimal(0.2);
	BigDecimal erro = new BigDecimal("Valor Invalido");
	BigDecimal valorV = new BigDecimal(0);
	

	public BigDecimal getValeA() {
		return valeR;
	}

	public void setValeA(BigDecimal valeR) {
		this.valeR = valeR;
	}

	// construtor
	public ValeRefeicao(BigDecimal valor, BigDecimal valeR, int qtdeDias) {
		super(valor);
		this.valeR = valeR;
		this.qtdeDias = qtdeDias;
	}

	@Override
	public BigDecimal calcularAbsoluto() {

		if (qtdeDias < 0 && qtdeDias > 31) {
			return erro;
		}else {

			// segunda a sexta / 5 por 2
				if (qtdeDias == 5) {
					valeR = valeR.multiply(d1);
					valor = valor .subtract((valeR.multiply(b1)));
					return valor;
				}
				// segunda a sabado / 5 por 1
				else if (qtdeDias == 6) {
					valeR = valeR.multiply(d2);
					valor = valor .subtract((valeR.multiply(b1)));
					return valor;
				}
				// 12 por 36
				else {
					valeR = valeR.multiply(d3);
					valor = valor .subtract((valeR.multiply(b1)));
					return valor;
				}
			}
		
		}

	@Override
	protected boolean isDesconto() {
		// TODO Auto-generated method stub
		return true;
	}

	
	
	
	 

}