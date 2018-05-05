package model;

import java.util.ArrayList;

public class Cardapio{
    
    // o cardapio contem uma lista de Produtos
    private ArrayList<Produto> produtos;
    
    // construtor
    public Cardapio(Produto... produtos) {
        this.produtos = new ArrayList<Produto>();
        for(Produto prod : produtos) {
            this.produtos.add(prod);
        }
    }
    
    // metodos
    public void visualizarCardapio() {
        
        for (Produto p : this.produtos) {
            System.out.println(p.getInfo());
        }
    }
    
    /*	Removi do programa o metodo "atualizar Cardapio"
    * 	Pois nao fazia o menor sentido, att. Capeletti
    */
    
    public void adicionarAoCardapio(Produto produto) {
        if(produtos.contains(produto))
            return;
        produtos.add(produto);
    }
    
    
    public void removerDoCardapio(Produto produto) {
        produtos.remove(produto);
    }
    
    //retorna o produto que tenha ID correspondente ou null se o produto nao existir no cardapio
    public Produto getProduto(int ID) {
        Produto p;
        
        for(int i = 0; i < produtos.size(); i++) {
            p = produtos.get(i);
            if(p.getID() == ID)
                return p;
        }
        return null;
    }
    
}