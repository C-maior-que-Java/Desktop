package model;

public class Funcionario {
    
    private int ID;
    private String nome;
    
    
    //m�todo construtor
    public Funcionario(int ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }
    
    //Setters e getters
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getID() {
        return ID;
    }
}
