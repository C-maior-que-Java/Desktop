/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.painel;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.cardapio.Cardapio;
import model.produto.Pizza;
import model.produto.Produto;
import visual.tela.TelaPrincipal;

public class PainelCardapio extends javax.swing.JPanel {

    private Cardapio cardapio;
    private TelaPrincipal telaPrincipal;
    private ArrayList<Pizza> pizzas;
    
    public PainelCardapio(Cardapio cardapio, TelaPrincipal telaPrincipal){
    	initComponents();
        this.cardapio = cardapio;
	this.telaPrincipal = telaPrincipal;
        this.pizzas = new ArrayList<>();
        
        for(Produto prod : cardapio.getProdutos()){
           if(prod instanceof Pizza){
               pizzas.add(((Pizza) prod));
           }
        }
    }
    
    public void refresh(Cardapio cardapio) {
        System.out.println("chamou uasdyagsuyagsd");
        
        for(Produto prod : cardapio.getProdutos()){
           if(prod instanceof Pizza){
               System.out.println(((Pizza) prod).getNome());               
               pizzas.add(((Pizza) prod));
           }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        panel_Cardapio = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pizza = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_bebida = new javax.swing.JTable();

        panel_Cardapio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        table_pizza.setBackground(new java.awt.Color(0, 255, 255));
        table_pizza.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        table_pizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Indredientes", "Preço Pequena", "Preço Média", "Preço Grande"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_pizza.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_pizza);
        if (table_pizza.getColumnModel().getColumnCount() > 0) {
            table_pizza.getColumnModel().getColumn(0).setPreferredWidth(20);
            table_pizza.getColumnModel().getColumn(1).setPreferredWidth(120);
            table_pizza.getColumnModel().getColumn(2).setPreferredWidth(220);
            table_pizza.getColumnModel().getColumn(3).setPreferredWidth(100);
            table_pizza.getColumnModel().getColumn(4).setPreferredWidth(80);
            table_pizza.getColumnModel().getColumn(5).setPreferredWidth(90);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_Cardapio.addTab("Pizza", jPanel1);

        table_bebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_bebida);
        if (table_bebida.getColumnModel().getColumnCount() > 0) {
            table_bebida.getColumnModel().getColumn(0).setPreferredWidth(10);
            table_bebida.getColumnModel().getColumn(1).setPreferredWidth(120);
            table_bebida.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Cardapio.addTab("Bebida", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Cardapio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Cardapio)
        );
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane panel_Cardapio;
    private javax.swing.JTable table_bebida;
    private javax.swing.JTable table_pizza;
    // End of variables declaration//GEN-END:variables
}
