/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morelia.tecnm.tap_cinepolis;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import morelia.tecnm.tap_cinepolis.modelos.Asiento;
import morelia.tecnm.tap_cinepolis.modelos.Boleto;
import morelia.tecnm.tap_cinepolis.modelos.Funcion;
import morelia.tecnm.tap_cinepolis.modelos.ManejadorPHP;
import morelia.tecnm.tap_cinepolis.modelos.Usuario;

/**
 *
 * @author DELL
 */
public class ComprarAsientos extends javax.swing.JFrame {

    private Usuario usuario;
    private Funcion funcion;
    private Asiento asiento;
    private Boleto boleto;
    /**
     * Creates new form ComprarAsientosPelicula0
     */
    public ComprarAsientos() {
        initComponents();
    }
    
    public ComprarAsientos(Usuario usuario, Funcion funcion) {
        initComponents();
        setIcon();
        this.usuario = usuario;
        this.funcion = funcion;
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkAsientoA1 = new javax.swing.JCheckBox();
        checkAsientoA2 = new javax.swing.JCheckBox();
        checkAsientoA3 = new javax.swing.JCheckBox();
        btnComprar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        checkAsientoA4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkAsientoB1 = new javax.swing.JCheckBox();
        checkAsientoB2 = new javax.swing.JCheckBox();
        checkAsientoB3 = new javax.swing.JCheckBox();
        checkAsientoB4 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        checkAsientoC1 = new javax.swing.JCheckBox();
        checkAsientoC2 = new javax.swing.JCheckBox();
        checkAsientoC3 = new javax.swing.JCheckBox();
        checkAsientoC4 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        checkAsientoA1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoA1.setText("Asiento A1");

        checkAsientoA2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoA2.setText("Asiento A2");

        checkAsientoA3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoA3.setText("Asiento A3");

        btnComprar.setBackground(new java.awt.Color(20, 32, 106));
        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(20, 32, 106));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\logoCinepolis.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        checkAsientoA4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoA4.setText("Asiento A4");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        checkAsientoB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoB1.setText("Asiento B1");

        checkAsientoB2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoB2.setText("Asiento B2");

        checkAsientoB3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoB3.setText("Asiento B3");

        checkAsientoB4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoB4.setText("Asiento B4");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        checkAsientoC1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoC1.setText("Asiento C1");

        checkAsientoC2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoC2.setText("Asiento C2");

        checkAsientoC3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoC3.setText("Asiento C3");

        checkAsientoC4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAsientoC4.setText("Asiento C4");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\asiento.PNG")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAsientoA1)
                    .addComponent(checkAsientoB1)
                    .addComponent(checkAsientoC1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))))
                .addGap(363, 363, 363)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAsientoA2)
                    .addComponent(checkAsientoB2)
                    .addComponent(checkAsientoC2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))))
                .addGap(377, 377, 377)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAsientoA3)
                    .addComponent(checkAsientoB3)
                    .addComponent(checkAsientoC3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAsientoA4)
                    .addComponent(checkAsientoB4)
                    .addComponent(checkAsientoC4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))))
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(799, 799, 799))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAsientoA1)
                    .addComponent(checkAsientoA2)
                    .addComponent(checkAsientoA3)
                    .addComponent(checkAsientoA4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAsientoB1)
                    .addComponent(checkAsientoB2)
                    .addComponent(checkAsientoB3)
                    .addComponent(checkAsientoB4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jLabel9))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAsientoC1)
                    .addComponent(checkAsientoC2)
                    .addComponent(checkAsientoC3)
                    .addComponent(checkAsientoC4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnComprar)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Aqui poner si esta activo o inactivo el asiento haciendo la consulta al ManejadorPHP.
        encuentraAsiento("" + funcion.getIdSala(), "A1");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoA1.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "A2");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoA2.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "A3");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoA3.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "A4");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoA4.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "B1");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoB1.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "B2");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoB2.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "B3");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoB3.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "B4");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoB4.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "C1");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoC1.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "C2");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoC2.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "C3");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoC3.setEnabled(false);
        }
        
        encuentraAsiento("" + funcion.getIdSala(), "C4");
        if(asiento.getEstatus().equals("activo")){
            checkAsientoC4.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        double totalBoleto = 0;  
        String msgAsientos="";  
        if(checkAsientoA1.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos = "Asiento A1\n";
            encuentraAsiento("" + funcion.getIdSala(), "A1");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
            
        }  
        if(checkAsientoA2.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos+= "Asiento A2\n";
            encuentraAsiento("" + funcion.getIdSala(), "A2");
            compraDeAsiento(asiento.getNombre(), asiento.getEstatus(), "" + asiento.getSala_id());
        }  
        if(checkAsientoA3.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento A3\n";
            encuentraAsiento("" + funcion.getIdSala(), "A3");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoA4.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento A4\n";
            encuentraAsiento("" + funcion.getIdSala(), "A4");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoB1.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento B1\n";
            encuentraAsiento("" + funcion.getIdSala(), "B1");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoB2.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento B2\n";
            encuentraAsiento("" + funcion.getIdSala(), "B2");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoB3.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento B3\n";
            encuentraAsiento("" + funcion.getIdSala(), "B3");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoB4.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento B4\n";
            encuentraAsiento("" + funcion.getIdSala(), "B4");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoC1.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento C1\n";
            encuentraAsiento("" + funcion.getIdSala(), "C1");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoC2.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento C2\n";
            encuentraAsiento("" + funcion.getIdSala(), "C2");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoC3.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento C3\n";
            encuentraAsiento("" + funcion.getIdSala(), "C3");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        if(checkAsientoC4.isSelected()){  
            totalBoleto+= 59.99;  
            msgAsientos += "Asiento C4\n";
            encuentraAsiento("" + funcion.getIdSala(), "C4");
            compraDeAsiento(asiento.getNombre(), "activo", "" + asiento.getSala_id());
        }
        msgAsientos+= "-----------------\n";  
        JOptionPane.showMessageDialog(this, msgAsientos + "Total: " + totalBoleto);
        boletoNuevo("" + totalBoleto, "" + usuario.getIdUsuario(), "" + funcion.getIdFuncion());
        
    }//GEN-LAST:event_btnComprarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComprarAsientosPelicula0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarAsientosPelicula0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarAsientosPelicula0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarAsientosPelicula0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarAsientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JCheckBox checkAsientoA1;
    private javax.swing.JCheckBox checkAsientoA2;
    private javax.swing.JCheckBox checkAsientoA3;
    private javax.swing.JCheckBox checkAsientoA4;
    private javax.swing.JCheckBox checkAsientoB1;
    private javax.swing.JCheckBox checkAsientoB2;
    private javax.swing.JCheckBox checkAsientoB3;
    private javax.swing.JCheckBox checkAsientoB4;
    private javax.swing.JCheckBox checkAsientoC1;
    private javax.swing.JCheckBox checkAsientoC2;
    private javax.swing.JCheckBox checkAsientoC3;
    private javax.swing.JCheckBox checkAsientoC4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void boletoNuevo(String totalBoleto, String usuario_idBoleto, String funcion_idBoleto) {
        try {
            ManejadorPHP m = new ManejadorPHP();
            boleto = m.boletoNuevo(totalBoleto, usuario_idBoleto, funcion_idBoleto);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la conexión. Intente más tarde");
        }
    }
    
    private void encuentraAsiento(String idSala, String nombreAsiento) {
        try {
            ManejadorPHP m = new ManejadorPHP();
            asiento = m.encuentraAsiento(idSala, nombreAsiento);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la conexión. Intente más tarde");
        }
    }
    
    private void compraDeAsiento(String nombreAsiento, String estatusAsiento, String sala_idAsiento) {
        try {
            ManejadorPHP m = new ManejadorPHP();
            asiento = m.compraDeAsiento(nombreAsiento, estatusAsiento, sala_idAsiento);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la conexión. Intente más tarde");
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Downloads\\faviconCinepolis.png"));
    }
}