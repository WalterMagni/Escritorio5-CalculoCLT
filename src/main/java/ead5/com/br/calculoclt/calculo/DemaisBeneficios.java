//CONVERTIDO

package ead5.com.br.calculoclt.calculo;

import java.math.BigDecimal;

public class DemaisBeneficios extends CalculoBase{
	
	private BigDecimal demBeneficios;

	public BigDecimal getDemBeneficios() {
		return demBeneficios;
	}

	public void setDemBeneficios(BigDecimal demBeneficios) {
		this.demBeneficios = demBeneficios;
	}

	
	//construtor
	public DemaisBeneficios(BigDecimal valor, BigDecimal demBeneficios) {
		super(valor);
		this.demBeneficios = demBeneficios;
	}
	
	@Override
	public BigDecimal calcularAbsoluto() {
		
		return valor.add(demBeneficios);
	}

	@Override
	protected boolean isDesconto() {
		// TODO Auto-generated method stub
		return false;
	}
	
}