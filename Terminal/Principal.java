package Desktop;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		boolean x = true, y;
		
		
		Cardapio cardapio = new Cardapio( 
				new Produto("Coca-cola", 10.50f, 123),
				new Produto("Pizza de calabresa", 12.50f, 123),
				new Produto("Pizza de mussarela", 11.50f, 123)
		);
		Funcionario ativo = new Administrador(0, "admin", cardapio);
		ArrayList<Funcionario> listaFun = new ArrayList<Funcionario>();
		
		listaFun.add(ativo);
		
		while(x) {
			
			System.out.println("Menu Pizzaria:");
			System.out.println("Digite 1 para cadastrar novo funcionario");
			System.out.println("Digite 2 para alterar o cardapio");
			System.out.println("Digite 3 para visualizar o cardapio");
			System.out.println("Digite 4 para fazer um novo pedido");
			System.out.println("Digite 5 para alterar um pedido ja finalizado");
			System.out.println("Digite 6 para cancelar um pedido ja finalizado");
			System.out.println("Digite 7 para sair do sistema");
			
			switch (s.nextInt()) {
			case 1:		//cadastrar novo funcionario
				
				System.out.println("Digite 1 para Adm, 2 para Atendente");
				
				int tipo = s.nextInt();
				/*if(tipo == 1) {
					
				}else if(tipo == 2) {
					
				}else {
					System.out.println("tipo de funcionario invalido");
					
				}*/	//fim do switch
				System.out.println("Funcionalidade ainda não implementada ! Voltando para o MENU.\n");
				
			break;
			case 2:		//mexer no cardapio, apenas adm pode
				
				/*if(ativo instanceof Administrador) {
					System.out.println("Digite 1 para adicionar um produto ao cardapio");
					System.out.println("Digite 2 para remover um produto do cardapio");
					System.out.println("Digite 3 para voltar ao menu");
					
					y = true;
					while(y) {
						
						switch(s.nextInt()) {
						
						case 1:		//adiciona um item ao cardapio
							
							((Administrador) ativo).adicionarAoCardapio(cardapio);
							
						break;
						case 2:		//remove um item atraves do ID fornecido pelo usuario
							
							((Administrador) ativo).removerDoCardapio(cardapio);
							
						break;
						case 3:		//sai do laco e volta para o menu principal
							
							y = false;
							
						}	//fim do switch
						
					}	//fim do while(y)

				}	//fim do instanceof */
				System.out.println("Funcionalidade ainda não implementada ! Voltando para o MENU.\n");
				
			break;
			case 3:		//visualizar cardapio
				cardapio.visualizarCardapio();
				
			break;
			case 4:		//fazer novo pedido
				
				System.out.println("Funcionalidade ainda não implementada ! Voltando para o MENU.\n");
				
				/*
				 * 
				y = true;
				Pedido pedido = new Pedido();
				
				while(y) {
					switch (s.nextInt()) {
					case 1:
						pedido.adicionarProduto(cardapio);
					break;
					case 2:
						pedido.removerProduto(cardapio);
					break;
					case 3:
						pedido.visualizarPedido();
					break;
					case 4:
						pedido.adicionarNota(s.nextLine());
					break;
					case 5:
						//finaliza o pedido e retorna ao menu
						pedido.finalizarPedido();
						y = false;
					case 6:
						//cancela o pedido
						y = false;
					}
				}*/
				
				
			break;
			case 5:		//alterar pedido
				
				System.out.println("Funcionalidade ainda não implementada ! Voltando para o MENU.\n");
				
				//System.out.println("Digite o numero do pedido a ser alterado");
				//pega na lista de pedidos o pedido de numero correspondente
				//e altera o pedido conforme desejo do cliente
			
			break;
			case 6:		//cancelar pedido feito
				
				System.out.println("Funcionalidade ainda não implementada ! Voltando para o MENU.\n");
				
			break;
			case 7:		//finaliza o programa
				x = false;
			break;
			
			}	//fim do switch
			
		}	//fim do while(x)
		
		s = null;
		
	}	//fim do metodo principal
	
}
