package model;

public class Pizza extends Produto {
    
    public class Sabor{
        String nome;
        String[] ingredientes;
        
        public Sabor(String nome, String[] ingredientes){
            this.nome = nome;
            this.ingredientes = ingredientes;
        }
    }
    // atributos
    public enum Tamanho{
        PEQUENO, MEDIO, GRANDE;
    }
    
    //implementar algo pra obter precos diferentes
    
    private Tamanho tamanho;
    private Sabor sabor;
    
    //construtor
    public Pizza(String nome , float preco, int ID, Tamanho t) {
        super(nome, preco, ID);
        this.sabor = sabor;
        switch (t){
            case PEQUENO: tamanho = Tamanho.PEQUENO; break;
            case MEDIO  : tamanho = Tamanho.MEDIO; break;
            case GRANDE : tamanho = Tamanho.GRANDE; break;
        }
    }
    
    // getters
    public Tamanho getTamanho() { return tamanho; }
    
    public Sabor getSabor() { return this.sabor; }
    
    public void setSabor(Sabor sabor) { this.sabor = sabor; }
    
    // setters
    public void setTamanho(Tamanho t) {
        switch(t) {
            case PEQUENO: tamanho = Tamanho.PEQUENO; break;
            case MEDIO  : tamanho = Tamanho.MEDIO; break;
            case GRANDE : tamanho = Tamanho.GRANDE; break;
        }
    }
    
    public void setIngredientes(String[] x){
        sabor.ingredientes = x;
    }
    
    public String[] getIngredientes(){
        return sabor.ingredientes;
    }
    
    @Override
    public String getNome(){
        return sabor.nome;
    }
    
    //exibe todos os ingredientes da pizza
    public String verIngredientes() {
        String saida = "";
        
        if(sabor.ingredientes.length == 0){
            return null;
        }
        
        for(int i = 0; i < sabor.ingredientes.length; i++) {
            
            saida = saida + sabor.ingredientes[i];
            if(i != sabor.ingredientes.length -1) {
                saida = saida + ", ";
            }
        }
        return saida;
    }
    
    //checa se ha um ingrediente especifico na pizza
    public boolean temIngrediente(String ingrediente) {
        for(String i : sabor.ingredientes) {
            if(ingrediente == i)
                return true;
        }
        return false;
    }
    
}