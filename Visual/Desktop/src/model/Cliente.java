package model;

public class Cliente {
    
    // atributos
    private String nome;
    private String telefone;
    private String endereco;
    
    // construtor
    public Cliente(String nome, String telefone, String endereco) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    // getters
    public String getNome() {
        return this.nome;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}