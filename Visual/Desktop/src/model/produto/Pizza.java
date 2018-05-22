package model.produto;

public class Pizza extends Produto {
    
    public class Sabor {
        private String nome;
        private String[] ingredientes;
        
        public Sabor(String nome, String[] ingredientes){
            this.nome = nome;
            this.ingredientes = ingredientes;
        }
        
        public String getNome() {
            return this.nome;
        }
        
        public String[] getIngredientes() {
            return this.ingredientes;
        }
    }
    
    
    public enum Tamanho{
        
        //implementando enum pra obter precos diferentes de acordo com o tamanho da pizza
        PEQUENO(4.50f), MEDIO(10.50f), GRANDE(15.60f);
        private float preco;
        
        Tamanho(float preco) {
            this.preco = preco;
        }
        
        public float getPreco() {
            return this.preco;
        }
    }
    
    // atributos
    private Tamanho tamanho;
    protected Sabor sabor;
    
    /*
        Sobrecarga do construtor da classe Pizza. Tamanho MEDIO default
    */    
    public Pizza(String nome , float preco, int ID, Tamanho t) {
        this(nome, preco, ID, t, null);
    }
    
    /*
        Sobrecarga do construtor da classe Pizza. Tamanho MEDIO default
    */
    public Pizza(String nome , float preco, int ID) {
        this(nome, preco, ID, Tamanho.MEDIO, null);
    }
    
    /*
        Construtor da classe Pizza
    */
    public Pizza(String nome , float preco, int ID, Tamanho t, Sabor sabor) {
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