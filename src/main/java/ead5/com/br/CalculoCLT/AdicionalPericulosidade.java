package ead5.com.br.CalculoCLT;

public class AdicionalPericulosidade extends CalculoBase{

	private boolean cond;
	
	
	//construtor
	public AdicionalPericulosidade(double valor, boolean cond) {
		super(valor);
		this.cond = cond;
		
	}
	

	@Override
	public double calcularAbsoluto() {
		
		if (cond == true) {
			return valor * 0.3;
		}
		else {			
			return valor;
		}
	}


	@Override
	protected boolean isDesconto() {
		return false;
	}
	
}
