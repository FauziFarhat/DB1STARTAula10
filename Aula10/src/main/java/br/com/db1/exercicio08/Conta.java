package br.com.db1.exercicio08;

public abstract class Conta {
	private Agencia agencia;
	private ContaPoupanca contaPoupanca;
	private Pessoa pessoa;
	private Integer numero;
	private String digitoVerificador;
	private Banco banco;
	
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
	public String getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}
	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
}
