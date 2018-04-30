public class Entrega {

    // atributos
    private String endereco;
    private Pedido pedido;
    private Cliente cliente;
    private int status;

    // construtor
    public Entrega(String endereco, Pedido pedido, Cliente cliente, int status) {

        this.endereco = endereco;
        this.pedido = pedido;
        this.cliente = cliente;
        this.status = status;
    }

    // getters
    public String getEndereco() {
        return this.endereco;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public int getStatus() {
        return this.status;
    }

    // setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}