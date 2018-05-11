package ead5.com.br.CalculoCLT;

public class DemaisBeneficios extends CalculoBase{
	
	private double demBeneficios;

	public double getDemBeneficios() {
		return demBeneficios;
	}

	public void setDemBeneficios(double demBeneficios) {
		this.demBeneficios = demBeneficios;
	}

	
	//construtor
	public DemaisBeneficios(double valor, double demBeneficios) {
		super(valor);
		this.demBeneficios = demBeneficios;
	}
	
	@Override
	public double calcularAbsoluto() {
		
		return valor + demBeneficios;
	}

	@Override
	protected boolean isDesconto() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
