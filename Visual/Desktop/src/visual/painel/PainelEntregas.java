package visual.painel;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entrega.Entrega;
import visual.tela.TelaPrincipal;
import visual.tela.TelaPrincipal;

/**
 *
 * @author ra197569
 */
public class PainelEntregas extends javax.swing.JPanel {
    
    private TelaPrincipal telaPrincipal;
    private DefaultTableModel entregaTableModel;
    
    
    public PainelEntregas(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        
        listarEntregas();
    }
    
    public void listarEntregas() {
        for (Entrega entrega : telaPrincipal.getEntregas()) {
            telaPrincipal.adicionarEntregaNaLista(entrega);
        }
    }
    
    public void refresh() {
        DefaultTableModel modelEntrega = (DefaultTableModel) jTableEntregas.getModel();
        
        while(modelEntrega.getRowCount() > 0)
            modelEntrega.removeRow(0);
        
        for(Entrega entrega : telaPrincipal.getEntregas()) {
            if(entrega.getCliente() != null)
                modelEntrega.addRow(new Object[]{entrega.getPedido().getNumPedido(), entrega.getCliente().getNome(), entrega.getCliente().getEndereco(), "Enviado para entrega"});
            else
                modelEntrega.addRow(new Object[]{entrega.getPedido().getNumPedido(), "Não encontrado", "Não encontrado", "Enviado para entrega"});            
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEntregas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTableEntregas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Cliente", "Endereço", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableEntregas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Painel de Entregas", jPanel1);

        jButton1.setText("Limpar Item Selecionado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEntregas.getModel();
        int selectIndice = jTableEntregas.getSelectedRow();
        
        if(selectIndice < 0){
            if( model.getRowCount() > 0){
                JOptionPane.showMessageDialog(null, "Você não selecionou um item da lista !");
            }else{
                JOptionPane.showMessageDialog(null, "Não há itens na lista para remover !");
            }
        }else{
            model.removeRow(selectIndice);
            telaPrincipal.removerEntregaDaLista(selectIndice);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableEntregas;
    // End of variables declaration//GEN-END:variables
}
