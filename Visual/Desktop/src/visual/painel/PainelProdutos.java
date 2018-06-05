/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package visual.painel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.produto.Bebida;
import model.produto.GeradorIDProduto;
import model.produto.Pizza;
import model.produto.Pizza.Tamanho;
import model.produto.PizzaDoisSabores;
import visual.tela.TelaPrincipal;

/**
 *
 * @author pedro
 */
public class PainelProdutos extends javax.swing.JPanel {
    
    private TelaPrincipal telaPrincipal; //Referencia da tela principal para a classe de Painel Produtos
    
    public PainelProdutos(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        
        String[] saboresDisponiveis = {"Selecione...", "Calabresa", "Mussarela", "Três Queijos", "Margherita"};
        this.cbSabores.setModel(new DefaultComboBoxModel(saboresDisponiveis));
        this.cbSaboresDuplo1.setModel(new DefaultComboBoxModel(saboresDisponiveis));
        this.cbSaboresDuplo2.setModel(new DefaultComboBoxModel(saboresDisponiveis));
        
        String[] bebidasDisponiveis = {"Selecione...", "Refrigerante", "Cerveja", "Vinho"};
        cbBebidas.setModel(new DefaultComboBoxModel(bebidasDisponiveis));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        rdBtnPizza = new javax.swing.JRadioButton();
        rdBtnBebida = new javax.swing.JRadioButton();
        rdBtnSaborUnico = new javax.swing.JRadioButton();
        rdBtnSaborDuplo = new javax.swing.JRadioButton();
        cbSabores = new javax.swing.JComboBox<>();
        cbSaboresDuplo1 = new javax.swing.JComboBox<>();
        cbSaboresDuplo2 = new javax.swing.JComboBox<>();
        cbBebidas = new javax.swing.JComboBox<>();

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        btnRemover.setText("Remover Produto");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar Produto");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Produto");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço");

        btnAlterar.setText("Alterar Produto");

        buttonGroup1.add(rdBtnPizza);
        rdBtnPizza.setText("Pizza");
        rdBtnPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnPizzaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdBtnBebida);
        rdBtnBebida.setText("Bebida");
        rdBtnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnBebidaActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdBtnSaborUnico);
        rdBtnSaborUnico.setText("Sabor Único");
        rdBtnSaborUnico.setEnabled(false);
        rdBtnSaborUnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnSaborUnicoActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdBtnSaborDuplo);
        rdBtnSaborDuplo.setText("Sabor Duplo");
        rdBtnSaborDuplo.setEnabled(false);
        rdBtnSaborDuplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnSaborDuploActionPerformed(evt);
            }
        });

        cbSabores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSabores.setEnabled(false);
        cbSabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaboresActionPerformed(evt);
            }
        });

        cbSaboresDuplo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSaboresDuplo1.setEnabled(false);
        cbSaboresDuplo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaboresDuplo1ActionPerformed(evt);
            }
        });

        cbSaboresDuplo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSaboresDuplo2.setEnabled(false);
        cbSaboresDuplo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaboresDuplo2ActionPerformed(evt);
            }
        });

        cbBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBebidas.setEnabled(false);
        cbBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnRemover))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 168, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(rdBtnPizza)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdBtnSaborDuplo)
                                .addGap(18, 18, 18)
                                .addComponent(cbSaboresDuplo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdBtnSaborUnico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbSabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rdBtnBebida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbSaboresDuplo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdicionar))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterar)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemover)
                    .addComponent(rdBtnPizza)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdBtnSaborUnico))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdBtnBebida)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdBtnSaborDuplo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSaboresDuplo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSaboresDuplo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        float preco = Float.valueOf(txtPreco.getText());
        int id = GeradorIDProduto.getIDProduto();
        boolean bebida = this.rdBtnBebida.isSelected();
        boolean pizza = this.rdBtnPizza.isSelected();
        boolean sabor_unico = this.rdBtnSaborUnico.isSelected();
        boolean sabor_duplo = this.rdBtnSaborDuplo.isSelected();
        
        if(bebida) {       
            
            Bebida novo_produto = new Bebida(nome, preco, id, cbBebidas.getItemAt(cbBebidas.getSelectedIndex()));
            telaPrincipal.adicionarProdutoNaLista(novo_produto);
            
        } else if(pizza) {
            
            Pizza novo_produto = null;
            
            if (sabor_unico) {                
                novo_produto = new Pizza(nome,preco,GeradorIDProduto.getIDProduto(),Tamanho.MEDIO);
                String ingredientes[] = {"Molho","Quejo"};
                novo_produto.setSabor(novo_produto.new Sabor(cbSabores.getItemAt(cbSabores.getSelectedIndex()),ingredientes));
            }
            else if (sabor_duplo) {                
                novo_produto = new PizzaDoisSabores(nome,preco,GeradorIDProduto.getIDProduto(),Pizza.Tamanho.MEDIO);
                String ingredientes[] = {"Molho","Quejo"};
                novo_produto.setSabor(novo_produto.new Sabor(cbSaboresDuplo1.getItemAt(cbSaboresDuplo1.getSelectedIndex()),ingredientes));
                ((PizzaDoisSabores)novo_produto).setSegundoSabor(novo_produto.new Sabor(cbSaboresDuplo2.getItemAt(cbSaboresDuplo2.getSelectedIndex()), ingredientes));
            }
            
            telaPrincipal.adicionarProdutoNaLista(novo_produto);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Selecione um tipo de produto!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        if(pizza)
            model.addRow(new Object[]{id,nome,preco,"Pizza"});
        else
            model.addRow(new Object[]{id,nome,preco,"Bebida"});
        
        this.limparCampos();
    }//GEN-LAST:event_btnAdicionarActionPerformed
    
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        int selectIndice = jTableProdutos.getSelectedRow();
        if(selectIndice < 0) {
            if( model.getRowCount() > 0) {
                JOptionPane.showMessageDialog(null, "Você não selecionou um item da lista !");
            }else{
                JOptionPane.showMessageDialog(null, "Não há itens na lista para remover !");
            }
        } else {
            model.removeRow(selectIndice);
            telaPrincipal.removerProdutoDaLista(selectIndice);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed
    
    private void rdBtnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnBebidaActionPerformed
        rdBtnSaborUnico.setEnabled(false);
        rdBtnSaborDuplo.setEnabled(false);
        cbSabores.setEnabled(false);
        cbSaboresDuplo1.setEnabled(false);
        cbSaboresDuplo2.setEnabled(false);
        cbBebidas.setEnabled(true);
    }//GEN-LAST:event_rdBtnBebidaActionPerformed
    
    private void rdBtnPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnPizzaActionPerformed
        rdBtnSaborUnico.setEnabled(true);
        rdBtnSaborDuplo.setEnabled(true);
        cbSabores.setEnabled(false);
        cbSaboresDuplo1.setEnabled(false);
        cbSaboresDuplo2.setEnabled(false);
        cbBebidas.setEnabled(false);
    }//GEN-LAST:event_rdBtnPizzaActionPerformed
    
    private void cbSaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaboresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSaboresActionPerformed

    private void cbSaboresDuplo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaboresDuplo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSaboresDuplo1ActionPerformed

    private void rdBtnSaborUnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnSaborUnicoActionPerformed
        cbSabores.setEnabled(true);
        cbSaboresDuplo1.setEnabled(false);
        cbSaboresDuplo2.setEnabled(false);
    }//GEN-LAST:event_rdBtnSaborUnicoActionPerformed

    private void rdBtnSaborDuploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnSaborDuploActionPerformed
        cbSabores.setEnabled(false);
        cbSaboresDuplo1.setEnabled(true);
        cbSaboresDuplo2.setEnabled(true);
    }//GEN-LAST:event_rdBtnSaborDuploActionPerformed

    private void cbSaboresDuplo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaboresDuplo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSaboresDuplo2ActionPerformed

    private void cbBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBebidasActionPerformed
    
    private void limparCampos() {
        this.txtNome.setText("");
        this.txtPreco.setText("");
        
        rdBtnSaborUnico.setEnabled(false);
        rdBtnSaborDuplo.setEnabled(false);
        cbSabores.setEnabled(false);
        cbSaboresDuplo1.setEnabled(false);
        cbSaboresDuplo2.setEnabled(false);
        
        cbSabores.setSelectedIndex(0);
        cbSaboresDuplo1.setSelectedIndex(0);
        cbSaboresDuplo2.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnRemover;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbBebidas;
    private javax.swing.JComboBox<String> cbSabores;
    private javax.swing.JComboBox<String> cbSaboresDuplo1;
    private javax.swing.JComboBox<String> cbSaboresDuplo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JRadioButton rdBtnBebida;
    private javax.swing.JRadioButton rdBtnPizza;
    private javax.swing.JRadioButton rdBtnSaborDuplo;
    private javax.swing.JRadioButton rdBtnSaborUnico;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}