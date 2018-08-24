package br.com.db1.exercicio08;

public class Conta {
	private Agencia agencia;
	private ContaPoupanca contaPoupanca;
	private Pessoa pessoa;
	private Integer numero;
	private Integer digitoVerificador;
	
	public Conta(Pessoa pessoaParametro, Agencia agenciaParametro) {
		this.pessoa = pessoaParametro;
		this.agencia = agenciaParametro;
	}
	public void calcularDigitoVerificador() {
		
	}
	public Boolean validarDigitoVerificador() {
		return true;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	
}
