package Desktop;

public class Bebida extends Produto {

    // atributos
    private String tipo;

    // construtor
    public Bebida(String nome, float preco, int ID, String tipo) {
    	super(nome, preco, ID);
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
}