package model.cliente;

public class Cliente {
    
    // atributos
    private String nome;
    private String telefone;
    private String endereco;
    private int mesa;    
    
    // construtor
    public Cliente(String nome, String telefone, String endereco) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.mesa = -1; // a principio o cliente ainda nao foi alocado a uma mesa
    }
    
    // getters
    public String getNome() {
        return this.nome;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public int getMesa() {
        return mesa;
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
    
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}