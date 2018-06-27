package ead5.com.br.calculoclt.calculo;

import java.math.BigDecimal;


public class FGTS extends CalculoBase{
	
	private int meses = 0;
	private BigDecimal saldoFGTS;
	
	BigDecimal b1 = new BigDecimal(0.8);
	BigDecimal d1 = new BigDecimal(meses);
	
	
	//construtor
	public FGTS(BigDecimal valor, int meses) {
		super(valor);
		this.meses = meses;
	}

		

		@Override
		public BigDecimal calcularAbsoluto() {
			
				return saldoFGTS.add(d1.multiply(valor.multiply(b1)));
		}

		@Override
		protected boolean isDesconto() {
			return true;
		}
}
