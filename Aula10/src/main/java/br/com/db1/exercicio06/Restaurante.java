package br.com.db1.exercicio06;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Restaurante {
	private List<Telefone> telefones;
	private List<Pedido> pedidos;
	private String nome;
	private Boolean serveArmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;
	
	public Restaurante() {
		this.telefones = new ArrayList<Telefone>();
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getServeArmoco() {
		return serveArmoco;
	}
	public void setServeArmoco(Boolean serveArmoco) {
		this.serveArmoco = serveArmoco;
	}
	public Boolean getServeJantar() {
		return serveJantar;
	}
	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}
	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}
	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}
	
	
}
