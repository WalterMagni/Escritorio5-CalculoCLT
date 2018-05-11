package ead5.com.br.CalculoCLT;

public abstract class CalculoBase {

	protected double valor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//construtor
	public CalculoBase(double valor) {
		super();
		this.valor = valor;
	}
	
	public abstract double calcularAbsoluto();
	
	protected abstract boolean isDesconto();
	
	public double calcular() {
		
		if (isDesconto()) {
			
			return calcularAbsoluto() * -1;
		}
		
		return calcularAbsoluto();
	}
	
	
	
}
