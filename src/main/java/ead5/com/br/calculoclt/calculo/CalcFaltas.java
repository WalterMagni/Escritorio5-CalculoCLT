//CONVERTIDO

package ead5.com.br.calculoclt.calculo;

import java.math.BigDecimal;


public class CalcFaltas extends CalculoBase{

	private int faltas;
	BigDecimal b1 = new BigDecimal(220);
	BigDecimal b2 = new BigDecimal(8);
	BigDecimal b3 = new BigDecimal(faltas);
	BigDecimal erro = new BigDecimal("Valor Invalido");
	BigDecimal valorV = new BigDecimal(0);
	
	
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	//construtor
	public CalcFaltas(BigDecimal valor, int faltas) {
		super(valor);
		this.faltas = faltas;
	}
	
	
	@Override
	public BigDecimal calcularAbsoluto() {
		
		
		BigDecimal Valorhoras, diaHoras;
		
		Valorhoras = valor.divide(b1);
		
		diaHoras = Valorhoras.multiply(b2);
		
		if (faltas < 0 && faltas > 31 && valor.equals(valorV)) {
			
			return erro;
		}
		
		else {
			if (faltas == 0 ) {
				return b3;
			} 
			
			else {
				return valor.subtract((diaHoras.multiply(b3))); 
			}
		}
	}
	@Override
	protected boolean isDesconto() {
		return true;
	}

	
}