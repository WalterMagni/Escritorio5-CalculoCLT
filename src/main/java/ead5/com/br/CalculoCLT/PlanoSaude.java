//CONVERTIDO

package ead5.com.br.CalculoCLT;

import java.math.BigDecimal;

public class PlanoSaude extends CalculoBase{

	private BigDecimal descPlanoSaude;
	BigDecimal erro = new BigDecimal("Valor Invalido");
	BigDecimal base = new BigDecimal(0);
	BigDecimal topo = new BigDecimal(100);
	
	public BigDecimal getDescPlanoSaude() {
		return descPlanoSaude;
	}
	public void setDescPlanoSaude(BigDecimal descPlanoSaude) {
		this.descPlanoSaude = descPlanoSaude;
	}
	
	//construtor
	public PlanoSaude(BigDecimal valor, BigDecimal descPlanoSaude) {
		super(valor);
		this.descPlanoSaude = descPlanoSaude;
	}
	

	@Override
	public BigDecimal calcularAbsoluto() {
		
		if (descPlanoSaude.compareTo(base) < 0 && descPlanoSaude.compareTo(topo) > 100 ) {
			return erro;
		}
		
		return valor.subtract(descPlanoSaude);
	}
	@Override
	protected boolean isDesconto() {
		return true;
	}
	
	
	
	
}