package br.com.db1.exercicio08;

public class PessoaFisica {
	private Integer cpf;

	public Boolean validarCpf() {
		return true;
	}
	public String formatarCpf() {
		return "CPF FORMATADO KKK";
	}
	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
}
