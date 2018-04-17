package Desktop;

import java.util.ArrayList;

public class Cardapio{

    // o cardápio contém uma lista de Produtos
    private ArrayList<Produto> produtos;

    // construtor
    public Cardapio(Produto... produtos) {
    	for(Produto prod : produtos) {
    		this.produtos.add(prod);
    	}
    }

    // métodos
    public void visualizarCardapio() {

        for (Produto p : this.produtos) {
            System.out.printf("%s\n", p);
        }
    }

    /*	Removi do programa o método "atualizar Cardapio"
     * 	Pois não fazia o menor sentido, att. Capeletti
     */
    
    public void adicionarAoCardapio(Produto produto) {
    	if(produtos.contains(produto))
    		return;
    	produtos.add(produto);
    }
    
    
    public void removerDoCardapio(Produto produto) {
    	produtos.remove(produto);
    }
    
    //retorna o produto que tenha ID correspondente ou null se o produto não existir no cardápio
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