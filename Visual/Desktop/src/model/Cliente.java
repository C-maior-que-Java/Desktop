package model;

public class Cliente {
    
    // atributos
    private String nome;
    private int telefone;
    
    // construtor
    public Cliente(String nome, int telefone) {
        
        this.nome = nome;
        this.telefone = telefone;
    }
    
    // getters
    public String getNome() {
        return this.nome;
    }
    
    public int getTelefone() {
        return this.telefone;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}