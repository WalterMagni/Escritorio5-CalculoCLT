package ead5.com.br.CalculoCLT;

public class PlanoSaude extends CalculoBase{

	private double descPlanoSaude;
	
	public double getDescPlanoSaude() {
		return descPlanoSaude;
	}
	public void setDescPlanoSaude(double descPlanoSaude) {
		this.descPlanoSaude = descPlanoSaude;
	}
	
	//construtor
	public PlanoSaude(double valor, double descPlanoSaude) {
		super(valor);
		this.descPlanoSaude = descPlanoSaude;
	}
	

	@Override
	public double calcularAbsoluto() {
		return valor - descPlanoSaude;
	}
	@Override
	protected boolean isDesconto() {
		return true;
	}
	
	
	
	
}
