package model.produto;

public class Bebida extends Produto {
    
    // atributos
    private String tipo;
    
    // construtor
    public Bebida(String nome, float preco, String tipo) {
        super(nome,preco);
        this.tipo = tipo;
    }
    
    // getters
    public String getTipo() {
        
        return this.tipo;
    }
    
    // setters
    public void setTipo(String tipo) {
        
        this.tipo = tipo;
    }

    @Override
    public float getPreco() {
        return this.preco;
    }

    @Override
    public String getNome() {
        return this.nome + " - " + this.tipo;
    }
}