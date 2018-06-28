package model.funcionario;

public class Atendente extends Funcionario {
    
    //metodo construtor
    public Atendente(int ID, String nome) {
        super(ID, nome);
    }
    
    
    /*realiza o pedido para o cliente
    * deve-se poder adicionar, remover, vizualizar o pedido aqui
    */
    public void fazerPedidoPCliente() {
        //TODO
    }
    
    
    /*Deve modificar um pedido ja finalizado por um cliente
    *
    */
    public boolean alterarPedido(int ID) {
        return true;
    }
    
    /*Deve cancelar o pedido
    *
    */
    public boolean cancelarPedido(int ID) {
        return true;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
