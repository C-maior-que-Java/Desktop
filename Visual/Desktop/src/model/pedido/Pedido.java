package model.pedido;

import gerador.Geravel;
import model.produto.Produto;
import java.util.ArrayList;
import model.cliente.Cliente;

public class Pedido implements Geravel{
    
    private static int num = 0;
    
    private final int numero;
    private final ArrayList<Produto> listaProdutos;    
    private String nota;
    private Cliente cliente;
    private boolean realizarEntrega;
    
    public Pedido() {
        //this.numero = GeradorNumPedido.getNumPedido();
        this.numero = gerarId();
        this.listaProdutos = new ArrayList<Produto>();
        this.realizarEntrega = false;
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
    
    public boolean isRealizarEntrega() {
        return realizarEntrega;
    }
    
    public void setRealizarEntrega(boolean realizarEntrega) {
        this.realizarEntrega = realizarEntrega;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    @Override
    public int gerarId() {
        num += 1;
        return num;
    }
}
