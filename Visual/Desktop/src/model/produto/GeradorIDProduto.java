/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.produto;

/**
 *
 * @author ra204481
 */
public class GeradorIDProduto {
     
    private static int id = 0;
    
    public static int getIDProduto() {
        id += 1;
        return id;
    }

}
