package br.com.db1.exercicio06;

import br.com.db1.exercicio06.type.TipoLogradouro;

public class Endereco {
	private Restaurante restaurante;
	private TipoLogradouro tipoLogradouro;
	private String logradouro;
	private Integer cep;
	
	public String exibirCepFormatado() {
		return "CEP FORMATADO KKK";
	}
	
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	
}
