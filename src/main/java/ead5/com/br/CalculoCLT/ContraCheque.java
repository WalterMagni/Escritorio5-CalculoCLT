//CONVERTIDO

package ead5.com.br.CalculoCLT;

import java.math.BigDecimal;

public class ContraCheque {

	
	private BigDecimal valorBruto;
	private int faltas;
	private BigDecimal descontoPlanoSaude;
	private boolean recebeAdicionalPericulosidade;
	private BigDecimal valeRefeicao;
	private BigDecimal valeTransporte;
	private BigDecimal valeAlimentacao;
	private int diasTrabalhos;
	private BigDecimal beneficios;
	
	
	public ContraCheque(BigDecimal valorBruto, int faltas, BigDecimal descontoPlanoSaude, boolean recebeAdicionalPericulosidade,
			BigDecimal valeRefeicao, BigDecimal valeTransporte, BigDecimal valeAlimentacao, BigDecimal beneficios, int diasTrabalhados) {
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
	
	
	public BigDecimal getDescontoFaltasAbsoluto() {
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
	
	
	
}