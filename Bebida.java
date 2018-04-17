public class Bebida extends Produto {

    // atributos
    private String tipo;

    // construtor
    public Bebida(String tipo) {

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