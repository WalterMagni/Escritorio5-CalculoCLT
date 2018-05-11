package ead5.com.br.CalculoCLT;

public class ContraCheque {

	
	private double valorBruto;
	private int faltas;
	private double descontoPlanoSaude;
	private boolean recebeAdicionalPericulosidade;
	private double valeRefeicao;
	private double valeTransporte;
	private double valeAlimentacao;
	private int diasTrabalhos;
	private double beneficios;
	
	
	public ContraCheque(double valorBruto, int faltas, double descontoPlanoSaude, boolean recebeAdicionalPericulosidade,
			double valeRefeicao, double valeTransporte, double valeAlimentacao, double beneficios, int diasTrabalhados) {
		super();
		this.valorBruto = valorBruto;
		this.faltas = faltas;
		this.descontoPlanoSaude = descontoPlanoSaude;
		this.recebeAdicionalPericulosidade = recebeAdicionalPericulosidade;
		this.valeRefeicao = valeRefeicao;
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;
		this.beneficios = beneficios;
		this.diasTrabalhos = diasTrabalhados;
	}
	
	
	public double getDescontoFaltasAbsoluto() {
		return new CalcFaltas(valorBruto, faltas).calcularAbsoluto();
	}
	public double getDescontoFaltas() {
		return new CalcFaltas(valorBruto, faltas).calcular();
	}
	
	public double getDescontoPlanoSaudeAbsoluto() {
		return new PlanoSaude(valorBruto, descontoPlanoSaude).calcularAbsoluto();
	}
	
	public double getDescontoPlanoSaude() {
		return new PlanoSaude(valorBruto, descontoPlanoSaude).calcular();
	}
	
	public double getAdicionalPericulosidade() {
		return new AdicionalPericulosidade(valorBruto, recebeAdicionalPericulosidade).calcular();
	}
	
	public double getValeAlimentacaoAbsoluto() {
		return new ValeAlimentacao(valorBruto, valeAlimentacao, diasTrabalhos).calcularAbsoluto();
	}
	
	public double getValeAlimentacao() {
		return new ValeAlimentacao(valorBruto, valeAlimentacao, diasTrabalhos).calcular();
	}
	
	public double getValeRefeicaoAbsoluto() {
		return new ValeRefeicao(valorBruto, valeRefeicao, diasTrabalhos).calcularAbsoluto();
	}
	
	public double getValeRefeicao() {
		return new ValeRefeicao(valorBruto, valeRefeicao, diasTrabalhos).calcular();
	}
	
	public double getValeTransporteAbsoluto() {
		return new ValeTransporte(valorBruto, valeTransporte, valeTransporte > 0).calcularAbsoluto();
	}
	
	public double getValeTransporte() {
		return new ValeTransporte(valorBruto, valeTransporte, valeTransporte > 0).calcular();
	}
	
	public double getBeneficios() {
		return new DemaisBeneficios(valorBruto, beneficios).calcular();
	}
	
	
	
}
