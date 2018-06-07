package model.funcionario;

public abstract class Funcionario {
    
    protected int ID;
    protected String nome;
    
    
    //m�todo construtor
    public Funcionario(int ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }
    
    //Setters e getters
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract String getNome();
    
    public int getID() {
        return ID;
    }
}
