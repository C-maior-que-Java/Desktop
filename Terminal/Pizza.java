package Desktop;
public class Pizza extends Produto {

    // atributos
    public enum Tamanho{
    	PEQUENO, MEDIO, GRANDE;
    }
    private String sabor;
    private String[] ingredientes;

    private Tamanho tamanho;
    
    //construtor
    public Pizza(String nome, float preco, String[] ingredientes, int ID, String sabor, Tamanho t) {
    	super(nome, preco, ID);
        this.sabor = sabor;
        this.ingredientes = ingredientes;
        switch (t){
        	case PEQUENO: tamanho = Tamanho.PEQUENO; break;
        	case MEDIO  : tamanho = Tamanho.MEDIO; break;
        	case GRANDE : tamanho = Tamanho.GRANDE; break;
        }
    }

    // getters
    public Tamanho getTamanho() { return tamanho; }

    public String getSabor() { return this.sabor; }

    public void setSabor(String sabor) { this.sabor = sabor; }
    
    // setters
    public void setTamanho(Tamanho t) {
    	switch(t) {
    		case PEQUENO: tamanho = Tamanho.PEQUENO; break;
    		case MEDIO 	: tamanho = Tamanho.MEDIO; break;
    		case GRANDE : tamanho = Tamanho.GRANDE; break;
    	}
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
    
  //checa se ha um ingrediente especifico na pizza
  	public boolean temIngrediente(String ingrediente) {
  		for(String i : ingredientes) {
  			if(ingrediente == i)
  				return true;
  		}
  		return false;
  	}

}