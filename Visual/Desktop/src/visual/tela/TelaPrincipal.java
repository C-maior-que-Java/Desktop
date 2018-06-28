package visual.tela;

import java.text.DecimalFormat;
import visual.painel.PainelCliente;
import visual.painel.PainelProdutos;
import visual.painel.PainelPedidos;
import visual.painel.PainelCardapio;
import visual.painel.PainelEntregas;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.cliente.Cliente;
import model.entrega.Entrega;
import model.funcionario.Funcionario;
import model.pedido.Pedido;
import model.produto.Produto;
import model.cardapio.Cardapio;

public class TelaPrincipal extends javax.swing.JFrame {
    
    public static final DecimalFormat df = new DecimalFormat("R$ #,##0.00");

    private Funcionario funcionarioSessaoAtual;

    private ArrayList<Produto> produtos;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Entrega> entregas;
    private ArrayList<Cliente> clientes;
    private Cardapio cardapio;

    private JComponent painelCardapio;
    private JComponent painelPedidos;
    private JComponent painelProdutos;
    private JComponent painelEntregas;
    private JComponent painelClientes;

    /**
     * Creates new form TelaAdministrador
     */
    public TelaPrincipal(Funcionario funcionario) {

        initComponents();
        this.setLocationRelativeTo(null);
        
        pedidos  = new ArrayList<>();
        entregas = new ArrayList<>();
        clientes = new ArrayList<>();
        cardapio = new Cardapio();
        produtos = cardapio.getProdutos();

        funcionarioSessaoAtual = funcionario;        

        painelCardapio = new PainelCardapio(cardapio, this);
        painelPedidos = new PainelPedidos(this);
        painelProdutos = new PainelProdutos(this);
        painelEntregas = new PainelEntregas(this);
        painelClientes = new PainelCliente(this);
       
        this.tabbedPane.addTab("Produtos", painelProdutos);
        this.tabbedPane.addTab("Cardapio", painelCardapio);
        this.tabbedPane.addTab("Pedidos", painelPedidos);        
        this.tabbedPane.addTab("Entregas", painelEntregas);
        this.tabbedPane.addTab("Clientes", painelClientes);
        
        this.tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                JTabbedPane mytabbedPane = (JTabbedPane) e.getSource();
                switch(mytabbedPane.getSelectedIndex()) {
                    case 0: break;
                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                }
            }
        });
    }

    /*
    Metodos abaixo para serem chamados pelos paines para atualizar
    registros gerais para todas as abas poderem conversar entre si
    */

    public void adicionarProdutoNaLista(Produto produto) {
        produtos.add(produto);
        ((PainelCardapio)painelCardapio).refresh();
    }

    public void adicionarPedidoNaLista(Pedido pedido) {
        System.out.println("ADICIONOU -> " + pedido.getNumPedido());
        pedidos.add(pedido);
        if(pedido.isRealizarEntrega()) {
            if(pedido.getCliente() != null)
                this.entregas.add(new Entrega(pedido.getCliente().getEndereco(), pedido, pedido.getCliente(), 1)); // bastante informacao redundante na classe Entrega -> melhorar isso
            else
                this.entregas.add(new Entrega("Nao encontrado", pedido, null, 1)); // bastante informacao redundante na classe Entrega -> melhorar isso
        }
        ((PainelEntregas)painelEntregas).refresh(); // fazer a mesma coisa que o painel de produto faz para 
        ((PainelPedidos)painelPedidos).refresh(); // atualizar com os pedidos ja feitos
    }

    public void adicionarEntregaNaLista(Entrega entrega) {
        entregas.add(entrega);
    }

    public void adicionarClienteNaLista(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerProdutoDaLista(int indice) {
        produtos.remove(indice);
        ((PainelCardapio)painelCardapio).refresh();
    }

    public void removerPedidoDaLista(int indice) {
        pedidos.remove(indice);
    }

    public void removerEntregaDaLista(int indice) {
        entregas.remove(indice);
    }

    public void removerClienteDaLista(int indice) {
        clientes.remove(indice);
    }
    
    public Cardapio getCardapio() {
        return cardapio;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
//
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
//
    public ArrayList<Entrega> getEntregas() {
       return entregas;
    }
    
    public Cliente buscarCliente(String nome) {
        for(Cliente c : this.clientes)
            if(c.getNome().equals(nome))
                return c;
        return null;
    }
    
    public Cliente buscarCliente(int mesa) {
        for(Cliente c : this.clientes)
            if(c.getMesa() == mesa)
                return c;
        return null;
    }

// ver se eh possivel modificar o telefone para exemplificar esse tipo de polimorfismo
//    public Cliente buscarCliente(String telefone) {
//    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
