package model.produto;

import gerador.Geravel;

public abstract class Produto implements Geravel{
    
    private static int id = 0;
    
    protected String nome;
    protected float preco;
    protected int ID;
    
    public Produto(String nome,float preco) {
        this.nome = nome;
        this.preco = preco;
        this.gerarId();
        this.ID = id;        
    }
    
    public abstract float getPreco();
    
    public void setPreco(float p){
        preco = p;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getinfo(){
        return null;
    }

    public abstract String getNome();

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public int gerarId() {
        id += 1;
        return id;
    }
}
