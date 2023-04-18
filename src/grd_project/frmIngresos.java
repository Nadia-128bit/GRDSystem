package grd_project;

import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public final class frmIngresos extends javax.swing.JFrame {
    
    private Modelo matriz;
    private int indiceTabla;
    
    public frmIngresos(Modelo matriz) {
        initComponents();
        
        this.matriz = matriz;
        
        obtenerDatos();
        rellenarTablaIngresos();
        indiceTabla = -1;
    }

    private frmIngresos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Enfermedad = new javax.swing.JTextField();
        txt_NSS = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Cama = new javax.swing.JTextField();
        txt_URL = new javax.swing.JTextField();
        cmb_Medico = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_CambiarFoto = new javax.swing.JButton();
        cmb_Procedimiento = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cbx_Masculino = new javax.swing.JCheckBox();
        cbx_Femenino = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jdc_Ingreso = new com.toedter.calendar.JDateChooser();
        jdc_Nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Ingresos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_Agregar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        lbl_fotoIngreso = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresos");
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NSS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre(s):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Médico a cargo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Enfermedad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));
        getContentPane().add(txt_Enfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 170, -1));

        txt_NSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NSSActionPerformed(evt);
            }
        });
        getContentPane().add(txt_NSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, -1));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 170, -1));
        getContentPane().add(txt_Cama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 170, -1));
        getContentPane().add(txt_URL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 170, -1));

        cmb_Medico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccionar médico ---" }));
        getContentPane().add(cmb_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 170, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("REGISTRO DE INGRESO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel8)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 960, 60));

        btn_CambiarFoto.setText("Cambiar foto");
        btn_CambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CambiarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CambiarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 130, 30));

        cmb_Procedimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccionar procedimiento ---", "Transplante", "Diagnóstico", "Transfusión", "Defusión" }));
        getContentPane().add(cmb_Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genero:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cbx_Masculino.setText("Masculino");
        cbx_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_MasculinoActionPerformed(evt);
            }
        });

        cbx_Femenino.setText("Femenino");
        cbx_Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_FemeninoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(cbx_Masculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_Femenino)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_Femenino)
                    .addComponent(cbx_Masculino))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 300, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fechas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jdc_Ingreso.setDateFormatString("dd/MM/yyyy");

        jdc_Nacimiento.setDateFormatString("dd/MM/yyyy");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha ingreso:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Fecha nacimiento:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jdc_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jdc_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdc_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdc_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 540, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fotografía:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        table_Ingresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NSS", "Nombre", "Medico", "Enfermedad", "Procedimiento", "No. Cama", "Genero", "Fecha nacimiento", "Fecha ingreso", "URL Foto"
            }
        ));
        table_Ingresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_IngresosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Ingresos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 940, 110));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Editar.setText("Editar");
        btn_Editar.setMaximumSize(new java.awt.Dimension(75, 25));
        btn_Editar.setMinimumSize(new java.awt.Dimension(75, 25));
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

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
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 180, 480));
        getContentPane().add(lbl_fotoIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 140, 140));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("No. Cama:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        if(capturarDatos() != null) {
            String[] datos = capturarDatos();
            
            matriz.getDatosIngresos().add(datos);
            rellenarTablaIngresos();
        }        
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        txt_NSS.setText("");
        txt_Nombre.setText("");
        cmb_Medico.setSelectedIndex(0);
        txt_Enfermedad.setText("");
        cmb_Procedimiento.setSelectedIndex(0);
        txt_Cama.setText("");
        cbx_Masculino.setSelected(false);
        cbx_Femenino.setSelected(false);
        jdc_Ingreso.setDate(null);
        jdc_Nacimiento.setDate(null);
        txt_URL.setText("");
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void cbx_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_MasculinoActionPerformed
        if(cbx_Masculino.isSelected() == true)
             cbx_Femenino.setSelected(false);
    }//GEN-LAST:event_cbx_MasculinoActionPerformed

    private void cbx_FemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_FemeninoActionPerformed
         if(cbx_Femenino.isSelected() == true)
            cbx_Masculino.setSelected(false);
    }//GEN-LAST:event_cbx_FemeninoActionPerformed

    private void txt_NSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NSSActionPerformed
      
    }//GEN-LAST:event_txt_NSSActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
       if(capturarDatos() != null) {
           String[] datos = capturarDatos();

           matriz.modificarDatos(indiceTabla, datos, matriz.getDatosIngresos());
           rellenarTablaIngresos();
       } 
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void table_IngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_IngresosMouseClicked
        int indice = this.table_Ingresos.rowAtPoint(evt.getPoint());
        
        this.txt_NSS.setText(String.valueOf(this.table_Ingresos.getValueAt(indice, 0)));
        this.txt_Nombre.setText(String.valueOf(this.table_Ingresos.getValueAt(indice, 1)));
        int indiceCMB = buscarIndiceCMB(String.valueOf(this.table_Ingresos.getValueAt(indice, 2)), this.cmb_Medico);
        this.cmb_Medico.setSelectedIndex(indiceCMB);
        this.txt_Enfermedad.setText(String.valueOf(this.table_Ingresos.getValueAt(indice, 3)));
        indiceCMB = buscarIndiceCMB(String.valueOf(this.table_Ingresos.getValueAt(indice, 4)), this.cmb_Procedimiento);
        this.cmb_Procedimiento.setSelectedIndex(indiceCMB);
        this.txt_Cama.setText(String.valueOf(this.table_Ingresos.getValueAt(indice, 5)));
        
        if("Masculino".equals(String.valueOf(this.table_Ingresos.getValueAt(indice, 6)))) {
            cbx_Masculino.setSelected(true);
            cbx_Femenino.setSelected(false);
        }
        else if("Femenino".equals(String.valueOf(this.table_Ingresos.getValueAt(indice, 6)))) {
            cbx_Femenino.setSelected(true);
            cbx_Masculino.setSelected(false);
        }
        
        try {
            this.jdc_Ingreso.setDate(setFecha(String.valueOf(this.table_Ingresos.getValueAt(indice, 7))));
            this.jdc_Nacimiento.setDate(setFecha(String.valueOf(this.table_Ingresos.getValueAt(indice, 8))));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        
        this.txt_URL.setText(String.valueOf(this.table_Ingresos.getValueAt(indice, 9)));
        
        this.indiceTabla = indice;
    }//GEN-LAST:event_table_IngresosMouseClicked

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        
        if(indiceTabla >= 0) {
            matriz.eliminarDatos(indiceTabla, matriz.getDatosIngresos());
            rellenarTablaIngresos();
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un paciente", "Error", 1);
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_CambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CambiarFotoActionPerformed
        String ruta;
        JFileChooser nfoto = new JFileChooser("\\NadiaG/FotosGRD/Pacinetes/emple1.jpeg");
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG,PNG & GIF","jpg,","png","gif");
        nfoto.setFileFilter(filtrado);

        int respuesta= nfoto.showOpenDialog(this);

        if (respuesta== nfoto.APPROVE_OPTION)
        {
            ruta = nfoto.getSelectedFile().getPath();

            ImageIcon img = new ImageIcon(ruta);
            Icon micono = new ImageIcon(img.getImage().getScaledInstance(this.lbl_fotoIngreso.getWidth(),this.lbl_fotoIngreso.getHeight(),Image.SCALE_DEFAULT));
            this.lbl_fotoIngreso.setIcon(micono);
            
        }
    }//GEN-LAST:event_btn_CambiarFotoActionPerformed

    private void obtenerDatos() {
        ArrayList<String[]> datos = matriz.getDatosDoctores();
                
        for (String[] fila : datos) {
            cmb_Medico.addItem(fila[1]);
        }
    }
    
    private String[] capturarDatos() {
        String[] datos = new String[10];

        if("".equals(txt_NSS.getText()) || "".equals(txt_Nombre.getText()) ||
            "".equals(txt_NSS.getText()) || "".equals(txt_Enfermedad.getText()) || "".equals(txt_Cama.getText()) ||
               cmb_Medico.getSelectedIndex() == 0 || cmb_Procedimiento.getSelectedIndex() == 0 || 
               (cbx_Masculino.isSelected() == false && cbx_Femenino.isSelected() == false) ||
                jdc_Ingreso.getDate() == null || jdc_Nacimiento.getDate() == null){

           JOptionPane.showMessageDialog(rootPane, "Hay campos vacios", "Error", 1);
        }
        else {
           datos[0] = this.txt_NSS.getText();
           datos[1] = this.txt_Nombre.getText();
           datos[2] = this.cmb_Medico.getSelectedItem().toString();
           datos[3] = this.txt_Enfermedad.getText();
           datos[4] = this.cmb_Procedimiento.getSelectedItem().toString();
           datos[5] = this.txt_Cama.getText();

           if(cbx_Masculino.isSelected() == true)
               datos[6] = "Masculino";
           else if(cbx_Femenino.isSelected() == true)
               datos[6] = "Femenino";
           
           datos[7] = getFecha(this.jdc_Ingreso.getDate());
           datos[8] = getFecha(this.jdc_Nacimiento.getDate());
           
           datos[9] = this.txt_URL.getText();

           return datos;
        }    
        return null;
    }
    
    public void rellenarTablaIngresos() {
        DefaultTableModel modelo = (DefaultTableModel) this.table_Ingresos.getModel();
        modelo.setRowCount(0);
        
        ArrayList<String[]> datos = matriz.getDatosIngresos();
        
        int numFilas = datos.size();
        
        for (int i = 0; i < numFilas; i++) {
            String[] fila = datos.get(i);
            modelo.addRow(fila);
        }
        
        table_Ingresos.setModel(modelo);
        table_Ingresos.setBackground(new Color(189, 236, 182));
    }
    
    public int buscarIndiceCMB(String nombre, JComboBox combo) {
        int cantidad = combo.getItemCount();
        
        for(int indice = 0; indice < cantidad; indice++) {
            if(nombre.equals(combo.getItemAt(indice)))
                return indice;
        }
        
        return -1;
    }
    
    private String getFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(fecha);
        
        return fechaFormateada;
    }
    
    private Date setFecha(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date fechaEstablecer = sdf.parse(fecha);
        
        return fechaEstablecer;
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
            java.util.logging.Logger.getLogger(frmIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_CambiarFoto;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JCheckBox cbx_Femenino;
    private javax.swing.JCheckBox cbx_Masculino;
    private javax.swing.JComboBox<String> cmb_Medico;
    private javax.swing.JComboBox<String> cmb_Procedimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_Ingreso;
    private com.toedter.calendar.JDateChooser jdc_Nacimiento;
    private javax.swing.JLabel lbl_fotoIngreso;
    private javax.swing.JTable table_Ingresos;
    private javax.swing.JTextField txt_Cama;
    private javax.swing.JTextField txt_Enfermedad;
    private javax.swing.JTextField txt_NSS;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_URL;
    // End of variables declaration//GEN-END:variables
}