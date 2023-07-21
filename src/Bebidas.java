
import config.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Bebidas extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    String productos[]= {"Bebida 1","Bebida 2 ", "Bebida 3"};
    double precios[]={13.9,14.9,16.9};
    double precio=0;
    int cantidad=0;
    double ab=0;
 
    public Bebidas() {
        initComponents();
        this.setLocationRelativeTo(null);
        calcularPrecio();
        Image logo=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/carrito.png"));
        btnCarrito.setIcon(new ImageIcon(logo.getScaledInstance(
                btnCarrito.getWidth(), 
                btnCarrito.getHeight(),
                Image.SCALE_SMOOTH)));
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        lbimporte = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jbtnRegisbebidas = new javax.swing.JButton();
        cbxBebidas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton5.setText("S");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 50, 30));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("S/. 16.9");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 70, 30));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("S/. 14.9");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 70, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("S/. 13.9");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 70, 30));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 21, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        jPanel1.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 90, 60));

        lbimporte.setBackground(new java.awt.Color(255, 255, 51));
        lbimporte.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lbimporte.setForeground(new java.awt.Color(255, 255, 255));
        lbimporte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Importe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(lbimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, 60));

        btnCarrito.setBackground(new java.awt.Color(204, 255, 255));
        btnCarrito.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCarrito.setText("Carrito");
        btnCarrito.setActionCommand("Finalizar\ncompra");
        btnCarrito.setBorder(null);
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 60, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageB/frozen.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 150, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageB/limon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageB/refre.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 160, 90));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BEBIDAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton4.setText("C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jbtnRegisbebidas.setBackground(new java.awt.Color(204, 204, 204));
        jbtnRegisbebidas.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jbtnRegisbebidas.setText("REGISTRAR");
        jbtnRegisbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisbebidasActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegisbebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 160, 30));

        cbxBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebida 1", "Bebida 2", "Bebida 3" }));
        cbxBebidas.setBorder(javax.swing.BorderFactory.createTitledBorder("Bebidas"));
        cbxBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(cbxBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 130, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cap2.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Categorias registros = new Categorias();
        this.setVisible(false);
        registros.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbtnRegisbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisbebidasActionPerformed

        try {
            Agregar();
            JOptionPane.showMessageDialog(null,"SE REGISTRÓ");
        } catch (Exception e) {
            
        }
       
    }//GEN-LAST:event_jbtnRegisbebidasActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Parrillas siguiente = new Parrillas();
         siguiente.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbxBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBebidasActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_cbxBebidasActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
       calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed

        Recibo close = new Recibo();
        close.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCarritoActionPerformed

    void calcularPrecio(){
        precio = precios[cbxBebidas.getSelectedIndex()];
        cantidad= Integer.parseInt(spnCantidad.getValue().toString());
        ab=precio*cantidad;
        lbimporte.setText(aMoneda(ab));
        
    }
    
    public String aMoneda(double precio){
        return "S/."+ (precio*100.00)/100.00;
    }

    void Agregar(){
        String bebidas=cbxBebidas.getSelectedItem().toString();
        int cantidad=Integer.parseInt(spnCantidad.getValue().toString());
        double importe= ab;
            String sql="INSERT INTO registro_venta VALUES ('"+bebidas+"' , "+cantidad+" ,"+importe+")";
            
            try {
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
            } catch (Exception e) {
            
        }
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
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrito;
    private javax.swing.JComboBox<String> cbxBebidas;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnRegisbebidas;
    private javax.swing.JLabel lbimporte;
    private javax.swing.JSpinner spnCantidad;
    // End of variables declaration//GEN-END:variables
}
