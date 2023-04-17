package grd_project;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public final class frmDoctores extends javax.swing.JFrame {
    
    private Modelo matriz;
    private int indiceTabla;

    public frmDoctores(Modelo matriz) {
        initComponents();
        
        this.matriz = matriz;
        
        rellenarTablaDoctores();
    }

    private frmDoctores() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Especialidad = new javax.swing.JTextField();
        txt_IDDoctor = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_URL = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        cmb_Area = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btn_Agregar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_CambiarFoto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Doctores = new javax.swing.JTable();
        lbl_fotoDoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctores");
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID Doctor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre(s):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 125, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Teléfono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Area:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Especialidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 30));
        getContentPane().add(txt_Especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, -1));
        getContentPane().add(txt_IDDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, -1));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 125, 170, -1));
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 170, -1));
        getContentPane().add(txt_URL, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 170, -1));
        getContentPane().add(txt_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, -1));

        cmb_Area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccionar area ---", "Anestesiología", "Cardiología", "Cirugía general", "Cuidados intensivos", "Dermatología", "Hematología", "Medicina interna", "Neumología", "Oncología", "Pediatría", "Rehabilitación", "Urgencias" }));
        getContentPane().add(cmb_Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, -1));

        jPanel1.setBackground(java.awt.Color.lightGray);

        btn_Agregar.setIcon(new javax.swing.ImageIcon("C:\\FotosGRD\\Añadir.png")); // NOI18N
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Editar.setIcon(new javax.swing.ImageIcon("C:\\FotosGRD\\Editar.png")); // NOI18N
        btn_Editar.setText("Editar");
        btn_Editar.setMaximumSize(new java.awt.Dimension(75, 25));
        btn_Editar.setMinimumSize(new java.awt.Dimension(75, 25));
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Eliminar.setIcon(new javax.swing.ImageIcon("C:\\FotosGRD\\Eliminar.png")); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Limpiar.setIcon(new javax.swing.ImageIcon("C:\\FotosGRD\\Limpiar.png")); // NOI18N
        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 570, 90));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("REGISTRO DE DOCTORES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel8)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 660, 60));

        btn_CambiarFoto.setIcon(new javax.swing.ImageIcon("C:\\FotosGRD\\Foto.png")); // NOI18N
        btn_CambiarFoto.setText("Cambiar foto");
        btn_CambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CambiarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CambiarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 130, 30));

        table_Doctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Especialidad", "Area", "Correo", "Telefono", "URL Foto"
            }
        ));
        table_Doctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DoctoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Doctores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 580, -1));
        getContentPane().add(lbl_fotoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 110, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_DoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DoctoresMouseClicked
        int indice = this.table_Doctores.rowAtPoint(evt.getPoint());
        
        this.txt_IDDoctor.setText(String.valueOf(this.table_Doctores.getValueAt(indice, 0)));
        this.txt_Nombre.setText(String.valueOf(this.table_Doctores.getValueAt(indice, 1)));
        this.txt_Especialidad.setText(String.valueOf(this.table_Doctores.getValueAt(indice, 2)));
        int indiceArea = buscarArea(String.valueOf(this.table_Doctores.getValueAt(indice, 3)));
        this.cmb_Area.setSelectedIndex(indiceArea);
        this.txt_Correo.setText(String.valueOf(this.table_Doctores.getValueAt(indice, 4)));
        this.txt_Telefono.setText(String.valueOf(this.table_Doctores.getValueAt(indice, 5)));
        this.txt_URL.setText(String.valueOf(this.table_Doctores.getValueAt(indice, 6)));
        
        this.indiceTabla = indice;
    }//GEN-LAST:event_table_DoctoresMouseClicked

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String[] datos = capturarDatos();
        
        matriz.getDatosDoctores().add(datos);
        rellenarTablaDoctores();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        txt_IDDoctor.setText("");
        txt_Nombre.setText("");
        txt_Especialidad.setText("");
        cmb_Area.setSelectedIndex(0);
        txt_Correo.setText("");
        txt_Telefono.setText("");
        txt_URL.setText("");
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        String[] datos = capturarDatos();
        
        matriz.modificarDatos(indiceTabla, datos, matriz.getDatosDoctores());
        rellenarTablaDoctores();
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        matriz.eliminarDatos(indiceTabla, matriz.getDatosDoctores());
        rellenarTablaDoctores();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_CambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CambiarFotoActionPerformed
        String ruta;
        JFileChooser nfoto = new JFileChooser("\\NadiaG/fotosGRD/imgdefecto.png");
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG,PNG & GIF","jpg,","png","gif");
        nfoto.setFileFilter(filtrado);

        int respuesta= nfoto.showOpenDialog(this);

        if (respuesta== nfoto.APPROVE_OPTION)
        {
            ruta = nfoto.getSelectedFile().getPath();

            ImageIcon img = new ImageIcon(ruta);
            Icon micono = new ImageIcon(img.getImage().getScaledInstance(this.lbl_fotoDoc.getWidth(),this.lbl_fotoDoc.getHeight(),Image.SCALE_DEFAULT));
            this.lbl_fotoDoc.setIcon(micono);
            this.txt_URL.setText(ruta);
        }
    }//GEN-LAST:event_btn_CambiarFotoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String urlImagen = "//NadiaG/fotosGRD/defecto.png";
        ImageIcon img = new ImageIcon(urlImagen);
        Icon micono = new ImageIcon(img.getImage().getScaledInstance(this.lbl_fotoDoc.getWidth(),this.lbl_fotoDoc.getHeight(),Image.SCALE_DEFAULT));
        this.lbl_fotoDoc.setIcon(micono);
        this.txt_URL.setText("//NadiaG/fotosGRD/defecto.png");
    }//GEN-LAST:event_formWindowOpened
    
    private String[] capturarDatos() {
        String[] datos = new String[7];
        
        datos[0] = this.txt_IDDoctor.getText();
        datos[1] = this.txt_Nombre.getText();
        datos[2] = this.txt_Especialidad.getText();
        datos[3] = this.cmb_Area.getSelectedItem().toString();
        datos[4] = this.txt_Correo.getText();
        datos[5] = this.txt_Telefono.getText();
        datos[6] = this.txt_URL.getText();
        
        return datos;
    }
    
    public void rellenarTablaDoctores() {
        DefaultTableModel modelo = (DefaultTableModel) this.table_Doctores.getModel();
        modelo.setRowCount(0);
        
        ArrayList<String[]> datos = matriz.getDatosDoctores();
        
        int numFilas = datos.size();
        
        for (int i = 0; i < numFilas; i++) {
            String[] fila = datos.get(i);
            modelo.addRow(fila);
        }
        
        table_Doctores.setModel(modelo);       
    }
    
    public int buscarArea(String nombreArea) {
        int cantidad = this.cmb_Area.getItemCount();
        
        for(int indice = 0; indice < cantidad; indice++) {
            if(nombreArea.equals(this.cmb_Area.getItemAt(indice)))
                return indice;
        }
        
        return -1;
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
            java.util.logging.Logger.getLogger(frmDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDoctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_CambiarFoto;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JComboBox<String> cmb_Area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fotoDoc;
    private javax.swing.JTable table_Doctores;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Especialidad;
    private javax.swing.JTextField txt_IDDoctor;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_URL;
    // End of variables declaration//GEN-END:variables
}