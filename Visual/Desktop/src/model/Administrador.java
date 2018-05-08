package model;

import java.util.Scanner;

public class Administrador extends Funcionario {
    
    private static final int numIngredientes = 20;
    private final Cardapio cardapio;
    private Scanner s;
    
    public Administrador(int ID, String nome, Cardapio cardapio) {
        super(ID, nome);
        this.cardapio = cardapio;
        
    }
    
    //deve adicionar um novo produto ao cardapio
    public Cardapio adicionarAoCardapio(Cardapio cardapio) {
        s = new Scanner(System.in);
        String[] ingredientes;
        ingredientes = new String[numIngredientes];
        Produto p = new Produto(numIngredientes, 1);
        
        System.out.println("Digite 1 para adicionar pizza, 2 para bebida");
        
        switch(s.nextInt()) {
            case 1:
                
                for(int i = 0; i < 20; i++) {
                    ingredientes[i] = s.nextLine();
                }
                
                //p = new Pizza(s.nextLine(), s.nextFloat(), ingredientes, s.nextInt(), s.nextInt(), s.nextLine());
                cardapio.adicionarAoCardapio(p);
                
                break;
            case 2:
                
                //p = new Bebida(s.nextLine(), s.nextFloat(), s.nextInt(), s.nextLine());
                cardapio.adicionarAoCardapio(p);
                
                break;
        }
        s = null;
        return cardapio;
    }
    
    public Cardapio removerDoCardapio(Cardapio cardapio) {
        //if(produto nao existe no cardapio)
        
        //else
        //cardapio.remove(produto);
        
        return cardapio;
    }
}
