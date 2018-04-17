import java.util.ArrayList;

public class Cardapio {

    // o cardápio contém uma lista de Produtos
    private ArrayList<Produto> produtos;

    // construtor
    public Cardapio(Produto... produtos) {

        this.produtos = produtos;
    }

    // métodos
    public void visualizarCardapio() {

        for (Produto p : this.produtos) {
            System.out.printf("%s\n", p);
        }
    }

    public void atualizarCardapio(Produto... produtos) {

        this.produtos = produtos;
    }



}