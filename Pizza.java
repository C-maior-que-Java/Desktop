public class Pizza extends Produto {

    // atributos
    private int tamanho;
    private String sabor;

    //construtor
    public Pizza(int tamanho, String sabor) {

        this.tamanho = tamanho;
        this.sabor = sabor;
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

    public void setSabor(int sabor) {
        
        this.sabor = sabor;
    }

}