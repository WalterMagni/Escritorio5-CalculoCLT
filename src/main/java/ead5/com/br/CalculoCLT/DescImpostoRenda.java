package ead5.com.br.CalculoCLT;

public class DescImpostoRenda extends CalculoBase  {
	
	private int dependentes;
	
	
	
	//construtor
	public DescImpostoRenda(double valor, int dependentes) {
		super(valor);
		this.dependentes = dependentes;
	}

	
	
	@Override
	public double calcularAbsoluto() {
		
		double descINSS = new DescINSS(valor).calcularAbsoluto();
		
		if (valor <= 1903.98) {
			return 0;
		} 
		
		double desconto = 0;
		 
		if (valor <= 1903.98 && valor >= 2826.65 ) {

			desconto = descINSS * 0.92;
			return desconto - 189.59 * dependentes;
		} 
		else if (descINSS <= 2826.66 && descINSS >= 3751.05 ) {
			desconto = descINSS * 0.85;
			return desconto  - 189.59 * dependentes;
		}
		else if (descINSS <= 3751.06 && descINSS >= 4664.68 ) {
			desconto = descINSS * 0.78;
			return desconto  - 189.59 * dependentes;
		}
		else {
			desconto = descINSS * 0.72;
			return desconto  - 189.59 * dependentes;
		}
	}

	

	@Override
	protected boolean isDesconto() {
		return true;
	}
}
