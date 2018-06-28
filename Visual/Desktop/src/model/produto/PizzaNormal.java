package model.produto;

public class PizzaNormal extends Pizza {

    public PizzaNormal(String nome, float preco, Tamanho t) {
        super(nome, preco, t);
    }
    
    public PizzaNormal(String nome, float preco) {
        super(nome, preco);
    }
    
    @Override
    public String verIngredientes() {
        String saida = "";
        
        if(sabor.getIngredientes().length == 0){
            return null;
        }
        
        for(int i = 0; i < sabor.getIngredientes().length; i++) {
            
            saida = saida + sabor.getIngredientes()[i];
            if(i != sabor.getIngredientes().length -1) {
                saida = saida + ", ";
            }
        }
        return saida;
    }
    
}
