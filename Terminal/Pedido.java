package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	
	private final int numero;
	private final ArrayList<Produto> listaProdutos;
	private String nota;
	private Scanner s;
	
	public Pedido() {
		this.numero = GeradorNumPedido.getNumPedido();
		listaProdutos = new ArrayList<Produto>();
	}
	
	public int getNumPedido() {
		return numero;
	}
	
	//adiciona ao pedido a quantidade do produto especificado
	public void adicionarProduto(Cardapio cardapio) {
		
		s = new Scanner(System.in);
		Produto p=null;
		int qtd;
		
		cardapio.visualizarCardapio();
		System.out.println("Digite o ID do produto desejado");
		
		p = cardapio.getProduto(s.nextInt());
		while(p == null) {
			System.out.println("ID inv�lido, digite novamente");
			p = cardapio.getProduto(s.nextInt());
		}
		
		System.out.println("Digite a quantidade desejada");
		qtd = s.nextInt();
		
		while(qtd > 0) {
			listaProdutos.add(p);
			qtd--;
		}
	}
	
	
	//adiciona alguma observacao ao pedido, como por Exemplo: "sem azeitona"
	public void adicionarNota(String nota) {
		this.nota = nota;
	}
	
	//remove o(s) produto(s) do pedido
	public void removerProduto(Cardapio cardapio) {
		s = new Scanner(System.in);
		int id, qtd;
		Produto p;
		
		cardapio.visualizarCardapio();
		System.out.println("Digite o ID do produto a ser deletado");
		id = s.nextInt();
		
		p = cardapio.getProduto(id);
		while(p == null) {
			System.out.println("ID invalido, digite novamente");
			p = cardapio.getProduto(s.nextInt());
		}
		
		System.out.println("Digite a quantidade e remover do pedido");
		qtd = s.nextInt();
		
		while(qtd > 0) {
			listaProdutos.remove(p);
			qtd--;
		}
		
	}
	
	public void finalizarPedido() {
		//enviar o pedido para algum arrayList
		//atendente deve ter acesso a esse arrayList
	}
	
	
	//mostra o pedido no console, tem que melhorar o funcionamento disso ainda
	public void visualizarPedido() {
		String saida = "";
		for(Produto i : listaProdutos) {
			saida = saida + ", " + i.getNome();
		}
		saida = saida + '\n' + "nota: " + nota;
		
		System.out.println(saida);
	}
}
