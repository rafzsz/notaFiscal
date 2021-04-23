package com.github.rafzsz.notafiscal;


public class NotaFiscal {
	
	private int num;
	private String data;
	private int chave;
	private double cnpjEmissor;
	private String nomeEmissor;
	private String docCliente;
	private String nomeCliente;
	private String listaProdutos;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public double getCnpjEmissor() {
		return cnpjEmissor;
	}
	public void setCnpjEmissor(double cnpjEmissor) {
		this.cnpjEmissor = cnpjEmissor;
	}
	public String getNomeEmissor() {
		return nomeEmissor;
	}
	public void setNomeEmissor(String nomeEmissor) {
		this.nomeEmissor = nomeEmissor;
	}
	public String getDocCliente() {
		return docCliente;
	}
	public void setDocCliente(String docCliente) {
		this.docCliente = docCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(String listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	
}