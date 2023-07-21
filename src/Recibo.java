
import config.Conexion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Recibo extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
    public static DefaultTableModel modelo2 ;
    public static DefaultTableModel modelo4 ;
    /**
     * Creates new form Recibo
     */
   public Recibo(){
       initComponents();
       this.setLocationRelativeTo(null);
       listar();
       listarRecibo();
       listarTotal();
       
       /**
     modelo2 = new DefaultTableModel();
        
            modelo2.addColumn("Nombre");
            modelo2.addColumn("Apellido");
            modelo2.addColumn("DNI");
            tClienteRecibo.setModel(modelo2);
            
            modelo4 = new DefaultTableModel();
        
            modelo4.addColumn("Cantidad");
            modelo4.addColumn("Nombre");
            modelo4.addColumn("Precio");
            jtabla.setModel(modelo4);
     */
            
           
   }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jtotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tClienteRecibo = new javax.swing.JTable();
        cbxMetodo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jbtnProcesar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRecibo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtotal.setBackground(new java.awt.Color(255, 255, 255));
        jtotal.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jtotal.setForeground(new java.awt.Color(255, 255, 255));
        jtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total a pagar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, 60));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 50, 30));

        tClienteRecibo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tClienteRecibo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI"
            }
        ));
        jScrollPane2.setViewportView(tClienteRecibo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 340, 60));

        cbxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de débito", "Tarjeta de crédito", "Yape" }));
        cbxMetodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Método de pago"));
        cbxMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMetodoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 190, 70));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pedidos");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jbtnProcesar.setText("Procesar pago ");
        jbtnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProcesarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 40));

        jbtnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelar.setText("Cancelar compra");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 130, 40));

        tablaRecibo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "cantidad", "Importe"
            }
        ));
        tablaRecibo.setToolTipText("");
        jScrollPane1.setViewportView(tablaRecibo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 340, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cap2.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        String sql="delete from registro_venta";
   String sql2="delete from cliente";
        try {
            cn=con.getConnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
                st.executeUpdate(sql2);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se borro");
        }
        JOptionPane.showMessageDialog(null,"Su compra a sido cancelada");
        
        INICIO inicio= new INICIO();
        inicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProcesarActionPerformed
       if(cbxMetodo.getSelectedItem().toString().equals("Yape")){
           YapePago pago= new YapePago();
            pago.setVisible(true);
            this.dispose();
       }else if(cbxMetodo.getSelectedItem().toString().equals("Tarjeta de débito")){
           RESUMEN pago= new RESUMEN();
           pago.setVisible(true); 
           this.dispose();
       }else{
           RESUMEN pago= new RESUMEN();
           pago.setVisible(true); 
           this.dispose();
       }

    }//GEN-LAST:event_jbtnProcesarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Categorias cat= new Categorias();
        cat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMetodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMetodoActionPerformed

     void listar(){
        String sql="select * from cliente";
        try {
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[] persona = new Object[3];
            modelo=(DefaultTableModel)tClienteRecibo.getModel();
            while(rs.next()){
                persona[0]=rs.getString("Nombre");
                persona[1]=rs.getString("Apellido");
                persona[2]=rs.getString("DNI");
                modelo.addRow(persona);
            }
            tClienteRecibo.setModel(modelo);
        } catch (Exception e) {
        }
    }
     
     void listarRecibo(){
        String sql="select * from registro_venta";
        try {
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[] persona = new Object[3];
            modelo=(DefaultTableModel)tablaRecibo.getModel();
            while(rs.next()){
                persona[0]=rs.getString("Nombre");
                persona[1]=rs.getString("cantidad");
                persona[2]=rs.getString("importe");
                modelo.addRow(persona);
            }
            tablaRecibo.setModel(modelo);
        } catch (Exception e) {
        }
    }
    
    void listarTotal(){
        String sql="select sum(importe) from registro_venta";
        try {
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                double  total= rs.getDouble(1);
                
                jtotal.setText(aMoneda(total));
                }
            } catch (Exception e) {
            }
    }
    
    
    public String aMoneda(double precio){
        return "S/. "+ (precio*100.00)/100.00;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxMetodo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnProcesar;
    private javax.swing.JLabel jtotal;
    private javax.swing.JTable tClienteRecibo;
    private javax.swing.JTable tablaRecibo;
    // End of variables declaration//GEN-END:variables
}
