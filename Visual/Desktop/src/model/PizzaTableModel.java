/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matheus
 * 
 * Essa classe tem por objetivo fornecer um modelo para a tabela do painel,
 * Possibilitando uma melhor atualização ao adicionar, remover, editar itens
 */

public class PizzaTableModel extends AbstractTableModel{
    
    private final ArrayList<Pizza> pizzas;
    private final String[] colunas;
    private Cardapio cardapio;
    
    public PizzaTableModel(Cardapio cardapio){
        this.cardapio = cardapio;
        pizzas = new ArrayList<>();
        colunas = new String[]{"ID", "Nome", "Ingredientes", "Preço Pequena", "Preço Média", "Preço Grande"};
    }
    
    public PizzaTableModel(ArrayList<Pizza> pizzas, Cardapio cardapio){
       this.cardapio = cardapio; 
       this.pizzas = new ArrayList<>();
       colunas = new String[]{"ID", "Nome", "Ingredientes", "Preço Pequena", "Preço Média", "Preço Grande"};
       addLista(this.pizzas);
    }
    
    
    //adicionas as pizzas à tabela e a atualiza
    public void addLista(ArrayList<Pizza> pizzas){
        int oldSize = getRowCount();
        
        for(Pizza p: pizzas){
            this.pizzas.add(p);
            cardapio.adicionarAoCardapio(p);
        }
        fireTableRowsInserted(oldSize, getRowCount()-1);
    }
    
    //adiciona a pizza à tabela e a atualiza
    public void addPizza(Pizza x){
        pizzas.add(x);
        cardapio.adicionarAoCardapio(x);
        int lastIndex = getRowCount() - 1;
        fireTableRowsInserted(lastIndex, lastIndex);
    }
    
    public void removePizza(int i){
        pizzas.remove(i);
        fireTableRowsDeleted(i, i);
    }
    
    @Override
    public Object getValueAt(int row, int column){
        Pizza p = pizzas.get(row);
        
        switch (column){
            case 1:
                return p.getID();

            case 2:
                return p.getNome();
                
            case 3:
                return p.getIngredientes();
                
            case 4:
                //depois alternar implementacao para incluir precos diferentes p/ tamanhos diferentes
                return p.getPreco();
            case 5:
                return p.getPreco();
            case 6:
                return p.getPreco();
            default:
                return null;
        }
    }
    
    @Override
    public void setValueAt(Object value, int row, int column){
        Pizza p = pizzas.get(row);
        
        switch (column){
            case 1:
                p.setID(Integer.parseInt(value.toString()));

            case 2:
                p.setNome(value.toString());
                
            case 3:
                p.setIngredientes(((String) value).split(" "));
                
            case 4:
                p.setPreco(Float.parseFloat(value.toString()));
                
            case 5:
                p.setPreco(Float.parseFloat(value.toString()));
            case 6:
                p.setPreco(Float.parseFloat(value.toString()));
        }
        
        fireTableCellUpdated(row, column);
    }
    
    //atualiza linha atual com nova pizza
    public void setValueAt(Pizza pNew, int row){
        Pizza pOld = pizzas.get(row);
        
        pOld.setID(pNew.getID());
        pOld.setNome(pNew.getNome());
        pOld.setIngredientes(pNew.getIngredientes());
        pOld.setPreco(pNew.getPreco());
        
        for(int i=0; i < 6; i++){
            fireTableCellUpdated(row, i);
        }
    }

    @Override
    public int getRowCount() {
        return pizzas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    
}
