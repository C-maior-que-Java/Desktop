package model.produto;

public abstract class Pizza extends Produto {
    
    public static class Sabor {
        private String nome;    //deixar esses atributos final?
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
    protected Tamanho tamanho;
    protected Sabor sabor;
    
    /*
        Sobrecarga do construtor da classe Pizza. Tamanho MEDIO default
    */    
    public Pizza(String nome , float preco, Tamanho t) {
        this(nome, preco, t, null);
    }
    
    /*
        Sobrecarga do construtor da classe Pizza. Tamanho MEDIO default
    */
    public Pizza(String nome , float preco) {
        this(nome, preco, Tamanho.MEDIO, null);
    }
    
    /*
        Construtor da classe Pizza
    */
    public Pizza(String nome , float preco, Tamanho t, Sabor sabor) {
        super(nome, preco);
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
            case MEDIO  : tamanho = Tamanho.MEDIO; break;
            case PEQUENO: tamanho = Tamanho.PEQUENO; break;
            case GRANDE : tamanho = Tamanho.GRANDE; break;
        }
    }
    
    @Override
    public String getNome(){
        String saida = "Pizza de " + sabor.getNome();
        return saida;
    }
    
    
    //Sobrescrita do método getPreco: retorna valor de acordo com o tamanho da pizza, preco padrao é o da pizza média
    @Override
    public float getPreco(){
        
        switch(tamanho){
            case MEDIO  : break;
            case PEQUENO: this.preco *= 0.8;
            case GRANDE : this.preco *= 1.3;
        }
        return preco;
    }
    
    public float getPrecoDeTamanho(Tamanho t){
        
        switch(t){
            case MEDIO  : break;
            case PEQUENO: this.preco *= 0.8;
            case GRANDE : this.preco *= 1.3;
        }
        return preco;
    }
    
    //exibe todos os ingredientes da pizza

    
    public abstract String verIngredientes();
    
}