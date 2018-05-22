package model.produto;

public class Produto {
    
    private String nome;
    private float preco;
    private int ID;
    
    public Produto( String nome,float preco, int ID) {
        this.nome = nome;
        this.preco = preco;
        this.ID = ID;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float p){
        preco = p;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setID(int id){
        ID = id;
    }
    
    public String getinfo(){
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
