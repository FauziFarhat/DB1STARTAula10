package br.com.db1.exercicio04;

import java.util.Date;

import br.com.db1.exercicio04.type.Sexo;

public class Pessoa {
	Sexo sexo;
	private String nome;
	private Date dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
