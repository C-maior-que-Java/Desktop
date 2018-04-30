package model;

public class Pizza extends Produto {
    
    // atributos
    private int tamanho;
    private String sabor;
    private String[] ingredientes;
    
    //construtor
    public Pizza(String nome, float preco, String[] ingredientes, int ID, int tamanho, String sabor) {
        super(nome, preco, ID);
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.ingredientes = ingredientes;
    }
    
    // getters
    public int getTamanho() {
        
        return this.tamanho;
    }
    
    public String getSabor() {
        
        return this.sabor;
    }
    
    // setters
    public void setTamanho(int tamanho) {
        
        this.tamanho = tamanho;
    }
    
    public void setSabor(String sabor) {
        
        this.sabor = sabor;
    }
    
    //exibe todos os ingredientes da pizza
    public void verIngredientes() {
        String saida = "";
        
        for(int i = 0; i < ingredientes.length; i++) {
            saida = saida + ingredientes[i];
            if(i != ingredientes.length -1) {
                saida = saida + ", ";
            }
        }
        System.out.println(saida);
    }
    
    //checa se h� um ingrediente especifico na pizza
    public boolean temIngrediente(String ingrediente) {
        for(String i : ingredientes) {
            if(ingrediente == i)
                return true;
        }
        return false;
    }
    
}