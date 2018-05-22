
package model.busca;

import java.util.ArrayList;
import model.cliente.Cliente;
import model.pedido.Pedido;
import model.produto.Bebida;
import model.produto.Pizza;
import model.produto.Produto;

/**
 *
 * @author Matheus
 */
public class Search {
    
    /*  Nessa classe estão funções estáticas responsáveis pela busca de objetos
    *   Nos diversos arrayLists usados no projeto
    *   Muitas das funções são sobrecarregadas para permitir a busca com parâmetros diferentes
    */
    
    // Este método realiza uma busca num arrayList à procura do produto de nome correspondente
    public static Produto procurarProduto(ArrayList<Produto> produtos, String nome){
        for(Produto produto : produtos){
            if(produto instanceof Bebida){
                if(produto.getNome().equalsIgnoreCase(nome))
                    return produto;
            }
            else if(produto instanceof Pizza){
                if(((Pizza) produto).getNome().equalsIgnoreCase(nome))
                    return produto;
            }
        }
        return null;
    }
    
    // Este procura no arrayList pelo ID correspondente
    public static Produto procurarProduto(ArrayList<Produto> produtos, int ID){
        for(Produto produto : produtos){
            if(produto.getID() == ID)
                return produto;
        }
        return null;
    }
    
    // Este procura nos pedidos pelo numero do pedido
    public static Pedido procurarPedido(ArrayList<Pedido> pedidos, int numero){
        for(Pedido pedido : pedidos){
            if(pedido.getNumPedido() == numero)
                return pedido;
        }
        return null;
    }
    
    // Estre procura nos pedidos pelo cliente que fez a compra
    public static Pedido procurarPedido(ArrayList<Pedido> pedidos, Cliente cliente){
        for(Pedido pedido : pedidos){
            if(pedido.getCliente() == cliente)
                return pedido;
        }
        return null;
    }
    
    public static Cliente procurarCliente(ArrayList<Cliente> clientes, String nome){
        for(Cliente cliente : clientes){
            if(cliente.getNome().equalsIgnoreCase(nome))
                return cliente;
        }
        return null;
    }
    
}
