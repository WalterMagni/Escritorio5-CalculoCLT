package ead5.com.br.CalculoCLT;

public class CalcFaltas extends CalculoBase{

	private double faltas;
	
	public double getFaltas() {
		return faltas;
	}
	public void setFaltas(double faltas) {
		this.faltas = faltas;
	}
	
	//construtor
	public CalcFaltas(double valor, double faltas) {
		super(valor);
		this.faltas = faltas;
	}
	
	
	@Override
	public double calcularAbsoluto() {
		
		double Valorhoras, diaHoras;
		
		Valorhoras = valor/220;
		
		diaHoras = Valorhoras*8;
		
		if (faltas == 0 ) {
			return 0;
		}
		else {
			return valor - (diaHoras * faltas); 
		}
	}
	@Override
	protected boolean isDesconto() {
		return true;
	}

	
}
