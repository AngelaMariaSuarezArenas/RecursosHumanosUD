/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author USUARIO
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBTipoDocumento = new javax.swing.JComboBox<>();
        jTFDoc = new javax.swing.JLabel();
        jTFNom = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFDocumento = new javax.swing.JTextField();
        jLbApe = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLbSex = new javax.swing.JLabel();
        jCBSexo = new javax.swing.JComboBox<>();
        jLbTel = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLbFechaNa = new javax.swing.JLabel();
        jDChFecaNacimiento = new com.toedter.calendar.JDateChooser();
        jLbDir = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jBnNuevo = new javax.swing.JButton();
        jBnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFuncionarios = new javax.swing.JTable();
        jBnEditar = new javax.swing.JButton();
        jBnEliminar = new javax.swing.JButton();
        jBnrefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("TipoID:");

        jLabel2.setText("GESTION FUNCIONARIOS");

        jCBTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno...", "Cédula de ciudadania", "Tarjeta de Identidad", " " }));
        jCBTipoDocumento.setName("Desplegar"); // NOI18N
        jCBTipoDocumento.setVerifyInputWhenFocusTarget(false);
        jCBTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoDocumentoActionPerformed(evt);
            }
        });

        jTFDoc.setText("Documento:");
        jTFDoc.setName("Documento"); // NOI18N

        jTFNom.setText("Nombre:");
        jTFNom.setName("Nombre"); // NOI18N

        jTFNombre.setName("Nombre"); // NOI18N

        jTFDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDocumentoActionPerformed(evt);
            }
        });

        jLbApe.setText("Apellido:");

        jTFApellido.setName("Apellido"); // NOI18N

        jLbSex.setText("Sexo:");

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M", " " }));
        jCBSexo.setName("Sexo"); // NOI18N
        jCBSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSexoActionPerformed(evt);
            }
        });

        jLbTel.setText("Teléfono:");

        jTFTelefono.setName("Teléfono"); // NOI18N
        jTFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefonoActionPerformed(evt);
            }
        });

        jLbFechaNa.setText("Fecha Nacimiento:");

        jDChFecaNacimiento.setName("FechaNaciemiento"); // NOI18N

        jLbDir.setText("Dirección");

        jTFDireccion.setName("Direccion"); // NOI18N

        jLabel3.setText("Estado civil:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno...", "Casado", "Soltero", "Viudo" }));

        jBnNuevo.setText("Nuevo");
        jBnNuevo.setName("Nuevo"); // NOI18N

        jBnGuardar.setText("Guardar");
        jBnGuardar.setName("Guardar"); // NOI18N
        jBnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnGuardarActionPerformed(evt);
            }
        });

        jTFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTFuncionarios);

        jBnEditar.setText("Editar");
        jBnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnEditarActionPerformed(evt);
            }
        });

        jBnEliminar.setText("Eliminar");
        jBnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnEliminarActionPerformed(evt);
            }
        });

        jBnrefrescar.setText("Refrescar");
        jBnrefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnrefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTFPanelLayout = new javax.swing.GroupLayout(jTFPanel);
        jTFPanel.setLayout(jTFPanelLayout);
        jTFPanelLayout.setHorizontalGroup(
            jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTFPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTFPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jTFPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jTFPanelLayout.createSequentialGroup()
                        .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jTFPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jTFPanelLayout.createSequentialGroup()
                                .addComponent(jLbFechaNa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDChFecaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jTFPanelLayout.createSequentialGroup()
                                .addComponent(jLbApe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFApellido))
                            .addGroup(jTFPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jTFDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTFPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jTFPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jTFPanelLayout.createSequentialGroup()
                                        .addComponent(jTFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(34, 34, 34)
                                .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jTFPanelLayout.createSequentialGroup()
                                        .addComponent(jTFNom, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jTFPanelLayout.createSequentialGroup()
                                        .addComponent(jLbTel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jTFPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLbSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jTFPanelLayout.createSequentialGroup()
                                        .addComponent(jLbDir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFDireccion)))))
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTFPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBnrefrescar)
                        .addGap(18, 18, 18)
                        .addComponent(jBnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBnEditar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTFPanelLayout.createSequentialGroup()
                        .addComponent(jBnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBnGuardar)
                        .addContainerGap())))
        );
        jTFPanelLayout.setVerticalGroup(
            jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTFPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLbDir)
                        .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTFPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jCBTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFDoc)
                            .addComponent(jTFNom)
                            .addComponent(jTFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbApe)
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbSex)
                            .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbTel)
                            .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbFechaNa)
                            .addComponent(jDChFecaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTFPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jBnGuardar))
                    .addGroup(jTFPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBnNuevo)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jTFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnEditar)
                    .addComponent(jBnEliminar)
                    .addComponent(jBnrefrescar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTipoDocumentoActionPerformed

    private void jTFDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDocumentoActionPerformed

    private void jCBSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSexoActionPerformed

    private void jTFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefonoActionPerformed

    private void jBnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnGuardarActionPerformed

    private void jBnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnEditarActionPerformed

    private void jBnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnEliminarActionPerformed

    private void jBnrefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnrefrescarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnrefrescarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnEditar;
    private javax.swing.JButton jBnEliminar;
    private javax.swing.JButton jBnGuardar;
    private javax.swing.JButton jBnNuevo;
    private javax.swing.JButton jBnrefrescar;
    private javax.swing.JComboBox<String> jCBSexo;
    private javax.swing.JComboBox<String> jCBTipoDocumento;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDChFecaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbApe;
    private javax.swing.JLabel jLbDir;
    private javax.swing.JLabel jLbFechaNa;
    private javax.swing.JLabel jLbSex;
    private javax.swing.JLabel jLbTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JLabel jTFDoc;
    private javax.swing.JTextField jTFDocumento;
    private javax.swing.JLabel jTFNom;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JPanel jTFPanel;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTable jTFuncionarios;
    // End of variables declaration//GEN-END:variables
}
