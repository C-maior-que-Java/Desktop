package model;

import java.util.ArrayList;

public class Pedido {
    
    private final int numero;
    private final ArrayList<Produto> listaProdutos;
    private String nota;
    private Cliente cliente;
    
    public Pedido() {//Cliente cliente, Produto... produtos) {
        this.numero = GeradorNumPedido.getNumPedido();
        this.listaProdutos = new ArrayList<Produto>();
//        
//        for(Produto prod : produtos) {
//            this.listaProdutos.add(prod);
//        }
    }
    
    public int getNumPedido() {
        return numero;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public ArrayList<Produto> getProdutos() {
        return this.listaProdutos;
    }
    
    public float getValorPedido() {
    
        float valor = 0;
        
        
        if(listaProdutos.size() > 0) {
        
            for(Produto produto : listaProdutos) {
                valor += produto.getPreco();
            }
        }
        
        return valor;
    }
    
    //adiciona ao pedido a quantidade do produto especificado
    public void adicionarProduto(Produto produto) {
        
        this.listaProdutos.add(produto);

    }
    
    
    //adiciona alguma observacao ao pedido, como por Exemplo: "sem azeitona"
    public void adicionarNota(String nota) {
        this.nota = nota;
    }
    
    //remove o(s) produto(s) do pedido
    public void removerProduto(Produto produto) {
       
      
        this.listaProdutos.remove(produto);
        
    }
    
    public void finalizarPedido() {
        //enviar o pedido para algum arrayList
        //atendente deve ter acesso a esse arrayList
    }
    
}
