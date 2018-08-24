package br.com.db1.exercicio04;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.db1.exercicio04.type.Sexo;

public class Pessoa {
	private Sexo sexo;
	private List<Telefone> telefones;
	private String nome;
	private Date dataNascimento;
	
	public Pessoa() {
		this.telefones = new ArrayList<Telefone>();
	}
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
	public List<Telefone> getTelefones(){
		return telefones;
	}
	public void addTelefone(Telefone telefone) {
		this.telefones.add(telefone);
	}
	
	
}
