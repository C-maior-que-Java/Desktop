package model;

public class Administrador extends Funcionario {
    
    private static final int numIngredientes = 20;
    private final Cardapio cardapio;
    
    public Administrador(int ID, String nome, Cardapio cardapio) {
        super(ID, nome);
        this.cardapio = cardapio;
        
    }
    
    //deve adicionar um novo produto ao cardapio
    public void adicionarAoCardapio(Cardapio cardapio, Produto produto) {
        cardapio.adicionarAoCardapio(produto);
    }
    
    public void removerDoCardapio(Cardapio cardapio, Produto produto) {
        cardapio.removerDoCardapio(produto);
    }
}
