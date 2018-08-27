package br.com.db1.exercicio08;

import br.com.db1.exercicio08.type.TipoLogradouro;

public class Endereco {
	
	
	private String logradouro;
	private Integer cep;
	private TipoLogradouro tipoLogradouro;
	
	public String exibirCepFormatado() {
		return "";
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

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
	
}
