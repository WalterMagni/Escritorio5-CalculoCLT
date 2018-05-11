package ead5.com.br.CalculoCLT;

public class ValeAlimentacao extends CalculoBase {

	private double valeA;
	private int qtdeDias;

	public double getValeA() {
		return valeA;
	}

	public void setValeA(double valeA) {
		this.valeA = valeA;
	}

	// construtor
	public ValeAlimentacao(double valor, double valeA, int qtdeDias) {
		super(valor);
		this.valeA = valeA;
		this.qtdeDias = qtdeDias;
	}

	@Override
	public double calcularAbsoluto() {

		// segunda a sexta / 5 por 2
		if (qtdeDias == 5) {
			valeA = valeA * 22;
			valor = valor - (valeA * 0.2);
			return valor;
		}
		// segunda a sabado / 5 por 1
		else if (qtdeDias == 6) {
			valeA = valeA * 26;
			valor = valor - (valeA * 0.2);
			return valor;
		}
		// 12 por 36
		else {
			valeA = valeA * 15;
			valor = valor - (valeA * 0.2);
			return valor;
		}
	}

	@Override
	protected boolean isDesconto() {
		return true;
	}

}
