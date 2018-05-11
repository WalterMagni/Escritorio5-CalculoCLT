package ead5.com.br.CalculoCLT;

public class ValeRefeicao extends CalculoBase{
	
	private double valeR;
	private int qtdeDias;
	
	
	public double getValeR() {
		return valeR;
	}

	public void setValeR(double valeR) {
		this.valeR = valeR;
	}

	//construtor
	public ValeRefeicao(double valor, double valeR, int qtdeDias) {
		super(valor);
		this.valeR = valeR;
		this.qtdeDias = qtdeDias;
	}
		

	@Override
	public double calcularAbsoluto() {
		
		//segunda a sexta / 5 por 2
				if (qtdeDias == 5) {
					valeR = valeR*22;
					valor = valor - valeR * 0.2;
					return valor;
				}
				//segunda a sabado / 5 por 1
				else if (qtdeDias == 6) {
					valeR = valeR*26;
					valor = valor - valeR * 0.2;
					return valor;
				}		
			    // 12 por 36
				else {
					valeR = valeR*15;
					valor = valor - valeR * 0.2;
					return valor;
				}			
	}

	@Override
	protected boolean isDesconto() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	
	 

}
