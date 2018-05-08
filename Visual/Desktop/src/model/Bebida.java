package Desktop;

public class Bebida extends Produto {

    // atributos
    private String tipo;
    private String nome;

    // construtor
    public Bebida(String nome, float preco, int ID, String tipo) {
    	super(preco, ID);
        this.tipo = tipo;
        this.nome = nome;
    }

    // getters
    public String getTipo() {

        return this.tipo;
    }

    // setters
    public void setTipo(String tipo) {

        this.tipo = tipo;
    }
}