package br.com.db1.exercicio02;

import br.com.db1.exercicio02.type.Tamanho;

public class Roupa {
	
	private Tamanho tamanho;
	private String marca;
	private Integer anoFabricacao;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	
}
