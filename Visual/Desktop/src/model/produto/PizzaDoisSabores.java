package model.produto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ra204481
 */
public class PizzaDoisSabores extends Pizza {
    
    private Sabor segundoSabor;
    
    public PizzaDoisSabores(String nome, float preco, int ID, Tamanho t, Sabor sabor1, Sabor sabor2) {
        super(nome, preco, ID, t, sabor1);
        this.segundoSabor = sabor2;
    }
    
    @Override
    public String verIngredientes() {
        String saida = "";
        
        for(int i = 0; i < sabor.getIngredientes().length; i++) {
            
            saida = saida + sabor.getIngredientes()[i];
            if(i != sabor.getIngredientes().length -1) {
                saida = saida + ", ";
            }
        }
        
        for(int i = 0; i < segundoSabor.getIngredientes().length; i++) {
            saida = saida + segundoSabor.getIngredientes()[i];
            if(i != segundoSabor.getIngredientes().length -1) {
                saida = saida + ", ";
            }
        }
        
        return saida;
    }
    
    public Sabor getSegundoSabor() {
        return this.segundoSabor;
    }
    
    public void setSegundoSabor(Sabor segundoSabor) {
        this.segundoSabor = segundoSabor;
    }
}
