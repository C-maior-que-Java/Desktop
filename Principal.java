package Desktop;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		boolean x = true, y;
		
		Cardapio cardapio = new Cardapio();
		Funcionario ativo = new Administrador(0, "admin", cardapio);
		ArrayList<Funcionario> listaFun = new ArrayList<Funcionario>();
		
		listaFun.add(ativo);
		
		while(x) {
			
			System.out.println("Menu Pizzaria:");
			System.out.println("Digite 1 para cadastrar novo funcionário");
			System.out.println("2 para alterar o cardápio");
			System.out.println("3 para visualizar o cardápio");
			System.out.println("4 para fazer um novo pedido");
			System.out.println("5 para alterar um pedido já finalizado");
			System.out.println("6 para cancelar um pedido já finalizado");
			System.out.println("7 para sair do sistema");
			
			switch (s.nextInt()) {
			case 1:		//cadastrar novo funcionario
				
				System.out.println("Digite 1 para Adm, 2 para Atendente");
				
				int tipo = s.nextInt();
				if(tipo == 1) {
					
				}else if(tipo == 2) {
					
				}else {
					System.out.println("tipo de funcionário inválido");
					
				}	//fim do switch
			break;
			case 2:		//mexer no cardapio, só adm pode
				
				if(ativo instanceof Administrador) {
					System.out.println("Digite 1 para adicionar um produto ao cardápio");
					System.out.println("2 para remover");
					System.out.println("3 para sair");
					
					y = true;
					while(y) {
						
						switch(s.nextInt()) {
						
						case 1:		//adiciona um item ao cardapio
							
							((Administrador) ativo).adicionarAoCardapio(cardapio);
							
						break;
						case 2:		//remove um item através do ID fornecido pelo usuário
							
							((Administrador) ativo).removerDoCardapio(cardapio);
							
						break;
						case 3:		//sai do laço e volta para o menu principal
							
							y = false;
							
						}	//fim do switch
						
					}	//fim do while(y)

				}	//fim do instanceof
				
			break;
			case 3:		//visualizar cardápio
				
				cardapio.visualizarCardapio();
				
			break;
			case 4:		//fazer novo pedido
				
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
				}
				
				
			break;
			case 5:		//alterar pedido
				
				System.out.println("Digite o nº do pedido a ser alterado");
				//pega na lista de pedidos o pedido de nº correspondente
				//e altera o pedido conforme desejo do cliente
			
			break;
			case 6:		//cancelar pedido feito
				
			break;
			case 7:		//finaliza o programa
				x = false;
			
			}	//fim do switch
			
		}	//fim do while(x)
		
		s = null;
		
	}	//fim do método principal
	
}
