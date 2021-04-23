package com.github.rafzsz.main;

import com.github.rafzsz.notafiscal.NotaFiscal;
import com.github.rafzsz.notafiscal.Produto;

public class Programa {

	public static void main(String[] args) {
		
		NotaFiscal nota = new NotaFiscal();
			nota.setNum(1);
			nota.setData("23-04-2021");
			nota.setChave(3332);
			nota.setCnpjEmissor(765555);
			nota.setNomeEmissor("Casas Bahia");
			nota.setNomeCliente("Rafael Souza");
			nota.setListaProdutos("Cama, mesa, banho");
		Produto produto = new Produto();
			produto.setId(1);
			produto.setNome("Cama");
			produto.setQuantidade(1);
			produto.setValor(350);
			produto.setDescricao("Cama Box");
			
			System.out.println("			***Nota Fiscal!***");
	        System.out.println("Numero da Nota: " + nota.getNum() + "	Data: " + nota.getData() + "	Chave: " + nota.getChave());
	        System.out.println("Nome do Estabelecimento: " + nota.getNomeEmissor() + "		CNPJ: " + nota.getCnpjEmissor());
	        System.out.println("Nome do cliente: " + nota.getNomeCliente() + "			Lista: " + nota.getListaProdutos());
	        System.out.println("_____________________________________________________________________________");
	        System.out.println("			  ***Produto***");
	        System.out.println("Nome do Produto: " + produto.getNome() + "		ID: " + produto.getId());
	        System.out.println("Quantidade: " + produto.getQuantidade() + "			Valor: " + produto.getValor());
	        System.out.println("Descrição do produto: " + produto.getDescricao());
	        System.out.println("_____________________________________________________________________________");
	}
}