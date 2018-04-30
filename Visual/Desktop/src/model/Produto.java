package model;

public class Produto {
    
    private String nome;
    private float preco;
    private int ID;
    
    
    public Produto(String nome, float preco, int ID) {
        this.nome = nome;
        this.preco = preco;
        this.ID = ID;
    }
    
    public String getNome() {
        return nome;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public int getID() {
        return ID;
    }
    
    
    //retorna uma string com nome, pre�o e ingredientes do produto
    public String getInfo() {
        String info;
        info = ID + ": " + nome + ", " + preco + ", ";
        
        return info;
    }
    
}
