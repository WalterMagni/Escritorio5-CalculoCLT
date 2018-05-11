package ead5.com.br.CalculoCLT;

public class DescINSS extends CalculoBase {
	

	
	//construtor
	public DescINSS(double valor ) {
		super(valor);
		
	}
	

	@Override
	public double calcularAbsoluto() {
		
			
			if (valor <= 1556.94) {
				return valor * 0.92;
			}
			else if (valor >= 1556.95 && valor <= 2594.92) {
				return valor * 0.91;
			}
			else if (valor >= 2594.93 && valor <= 5189.82) {
				return valor * 0.89;
			}
			else {
				return valor * 0.89;
			}		

	}


	@Override
	protected boolean isDesconto() {
		return true;
	}
	

}
