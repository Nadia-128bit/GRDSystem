package grd_project;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public final class frmEgresos extends javax.swing.JFrame {
    
    private Modelo matriz;
    
    public frmEgresos(Modelo matriz) {
        initComponents();
        
        this.matriz = matriz;
        rellenarTablaPacientes();
    }

    private frmEgresos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Egresos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_NSS = new javax.swing.JTextField();
        btn_Restablecer = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btn_Alta = new javax.swing.JButton();
        btn_Buscar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Egresos");
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("EGRESOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel8)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        table_Egresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NSS", "Nombre", "Medico", "Enfermedad", "Procedimiento", "No. Cama", "Genero", "Fecha nacimiento", "Fecha ingreso", "URL Foto"
            }
        ));
        table_Egresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_EgresosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Egresos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 940, 110));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Fecha egreso:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txt_NSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NSSActionPerformed(evt);
            }
        });
        getContentPane().add(txt_NSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 190, -1));

        btn_Restablecer.setText("Restablecer");
        btn_Restablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestablecerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Restablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 110, 30));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("NSS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        btn_Alta.setText("Dar alta");
        getContentPane().add(btn_Alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 80, 30));

        btn_Buscar1.setText("Buscar");
        btn_Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_EgresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_EgresosMouseClicked
       int indice = this.table_Egresos.rowAtPoint(evt.getPoint());
       
       this.txt_NSS.setText(String.valueOf(this.table_Egresos.getValueAt(indice, 0)));
    }//GEN-LAST:event_table_EgresosMouseClicked

    private void btn_RestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestablecerActionPerformed
        rellenarTablaPacientes();
    }//GEN-LAST:event_btn_RestablecerActionPerformed

    private void txt_NSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NSSActionPerformed
        
    }//GEN-LAST:event_txt_NSSActionPerformed

    private void btn_Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar1ActionPerformed
//        filtarPacientes();
        busquedaPaciente();
    }//GEN-LAST:event_btn_Buscar1ActionPerformed

    public void rellenarTablaPacientes() {
        DefaultTableModel modelo = (DefaultTableModel) this.table_Egresos.getModel();
        modelo.setRowCount(0);
        
        ArrayList<String[]> datos = matriz.getDatosIngresos();
        
        int numFilas = datos.size();
        
        for (int i = 0; i < numFilas; i++) {
            String[] fila = datos.get(i);
            modelo.addRow(fila);
        }
        
        table_Egresos.setModel(modelo);
        table_Egresos.setBackground(new Color(189, 236, 182));
    }
    
    private void filtarPacientes(int indicePaciente) {
        DefaultTableModel modelo = (DefaultTableModel) this.table_Egresos.getModel();
        modelo.setRowCount(0);
        
        ArrayList<String[]> datos = matriz.getDatosIngresos();
        
        
        String[] fila = datos.get(indicePaciente);
        modelo.addRow(fila);
        
        
        table_Egresos.setModel(modelo);
    }
    
    private void busquedaPaciente() {
        int indicePaciente = matriz.buscarPorNSS(this.txt_NSS.getText());
        
        if (indicePaciente != -1) {
            filtarPacientes(indicePaciente);
        } 
        else {
            System.out.println("El paciente no fue encontrado.");
        }
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEgresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEgresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEgresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEgresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEgresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alta;
    private javax.swing.JButton btn_Buscar1;
    private javax.swing.JButton btn_Restablecer;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Egresos;
    private javax.swing.JTextField txt_NSS;
    // End of variables declaration//GEN-END:variables
}
