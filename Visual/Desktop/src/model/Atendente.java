package model;

import java.util.Scanner;

public class Atendente extends Funcionario {
    
    
    private Scanner s;
    
    //m�todo construtor
    public Atendente(int ID, String nome) {
        super(ID, nome);
    }
    
    
    /*realiza o pedido para o cliente
    * deve-se poder adicionar, remover, vizualizar o pedido aqui
    */
    public void fazerPedidoPCliente() {
        s = new Scanner(System.in);
        
        switch (s.nextInt()) {
            case 1:
                //produto = cardapio.getProduct(s.nextInt());
                //novo_pedido.adicionarProduto(produto, qtd);
                //pegar um produto pelo ID no cardapio
            case 2:
                //produto = cardapio.getProduct(s.nextInt());
                //novo_pedido.removerProduto(produto, qtd);
                //remove pelo ID do produto
            case 3:
                /*			.
                * 			.
                * 			.
                */
                //case x:
                //novo_pedido.finalizarPedido();
                
        }
        //produto = null;
    }
    
    
    /*Deve modificar um pedido j� finalizado por um cliente
    *
    */
    public boolean alterarPedido(int ID) {
        return true;
        
    }
    
    /*Deve cancelar o pedido
    *
    */
    public boolean cancelarPedido(int ID) {
        return true;
        
    }
}
