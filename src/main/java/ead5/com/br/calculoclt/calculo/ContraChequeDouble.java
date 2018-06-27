package ead5.com.br.calculoclt.calculo;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContraChequeDouble {

	private double valorBruto;
	private int faltas;
	
	@JsonProperty
	private double descontoPlanoSaude;
	
	private boolean recebeAdicionalPericulosidade;
	private double valeRefeicao;
	private double valeTransporte;
	private double valeAlimentacao;
	private int diasTrabalhos;
	private double beneficios;
    private int meses;
	private double FGTS;
    
    
	
	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public boolean isRecebeAdicionalPericulosidade() {
		return recebeAdicionalPericulosidade;
	}

	public void setRecebeAdicionalPericulosidade(boolean recebeAdicionalPericulosidade) {
		this.recebeAdicionalPericulosidade = recebeAdicionalPericulosidade;
	}

	public int getDiasTrabalhos() {
		return diasTrabalhos;
	}

	public void setDiasTrabalhos(int diasTrabalhos) {
		this.diasTrabalhos = diasTrabalhos;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public void setDescontoPlanoSaude(double descontoPlanoSaude) {
		this.descontoPlanoSaude =  descontoPlanoSaude;
	}

	public void setValeRefeicao(double valeRefeicao) {
		this.valeRefeicao =  valeRefeicao;
	}

	public void setValeTransporte(double valeTransporte) {
		this.valeTransporte =  valeTransporte;
	}

	public void setValeAlimentacao(double valeAlimentacao) {
		this.valeAlimentacao =  valeAlimentacao;
	}

	public void setBeneficios(double beneficios) {
		this.beneficios =  beneficios;
	}
	
	public void setFGTS(double fGTS) {
		FGTS = fGTS;
	}

	public ContraChequeDouble(double valorBruto, int faltas, double descontoPlanoSaude, boolean recebeAdicionalPericulosidade,
			double valeRefeicao, double valeTransporte, double valeAlimentacao, double beneficios, int diasTrabalhados, double FGTS, int meses) {
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
	    this.FGTS = FGTS;
  }
	
	


	public double getDescontoFaltasAbsoluto() {
		return new CalcFaltas(valorBruto, faltas).calcularAbsoluto();
	}
	public BigDecimal getDescontoFaltas() {
		return new CalcFaltas(valorBruto, faltas).calcular();
	}
	
	public BigDecimal getDescontoPlanoSaudeAbsoluto() {
		return new PlanoSaude(valorBruto, descontoPlanoSaude).calcularAbsoluto();
	}
	
	public BigDecimal getDescontoPlanoSaude() {
		return new PlanoSaude(valorBruto, descontoPlanoSaude).calcular();
	}
	
	public BigDecimal getAdicionalPericulosidade() {
		return new AdicionalPericulosidade(valorBruto, recebeAdicionalPericulosidade).calcular();
	}
	
	public BigDecimal getValeAlimentacaoAbsoluto() {
		return new ValeAlimentacao(valorBruto, valeAlimentacao, diasTrabalhos).calcularAbsoluto();
	}
	
	public BigDecimal getValeAlimentacao() {
		return new ValeAlimentacao(valorBruto, valeAlimentacao, diasTrabalhos).calcular();
	}
	
	public BigDecimal getValeRefeicaoAbsoluto() {
		return new ValeRefeicao(valorBruto, valeRefeicao, diasTrabalhos).calcularAbsoluto();
	}
	
	public BigDecimal getValeRefeicao() {
		return new ValeRefeicao(valorBruto, valeRefeicao, diasTrabalhos).calcular();
	}
	
	public BigDecimal getValeTransporteAbsoluto() {
		
		BigDecimal b1 = new BigDecimal(0);
		
		return new ValeTransporte(valorBruto, valeTransporte, valeTransporte.compareTo(b1) > 0).calcularAbsoluto();
	}
	
	public BigDecimal getValeTransporte() {
		
		BigDecimal b1 = new BigDecimal(0);
		
		return new ValeTransporte(valorBruto, valeTransporte, valeTransporte.compareTo(b1) > 0).calcular();
	}
	
	public BigDecimal getBeneficios() {
		return new DemaisBeneficios(valorBruto, beneficios).calcular();
	}
	
	public BigDecimal getFGTS(){
		return new FGTS(valorBruto, meses).calcularAbsoluto();
	}
	
	
}
