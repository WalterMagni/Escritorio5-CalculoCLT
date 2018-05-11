package ead5.com.br.CalculoCLT;

public class ValeTransporte extends CalculoBase{

	private double valeT;
	private boolean cond;

	public double getValeT() {
		return valeT;
	}

	public void setValeT(double valeT) {
		this.valeT = valeT;
	}

	//construtor
	public ValeTransporte(double valor, double valeT, boolean cond) {
		super(valor);
		this.valeT = valeT;
		this.cond = cond;
	}

	@Override
	public double calcularAbsoluto() {
		if (cond) {
			
			double teto = valor * 0.06;
			if (valeT >= teto) {
				return teto;
			}

				return valeT;
		
		}
		else {
			return 0;
		}
	}

	@Override
	protected boolean isDesconto() {
		return true;
	}
	
}
