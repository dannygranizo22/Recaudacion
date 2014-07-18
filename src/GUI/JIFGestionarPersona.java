package GUI;

import AccesoDatos.ADPersona;
import Entidades.Persona;
import Recaudacion.modelos.ModeloTablaPersona;
import java.util.List;
import javax.swing.JOptionPane;

public class JIFGestionarPersona extends javax.swing.JInternalFrame {

//    private static JIFGestionarPersona myInstance;
    //ADPersona sqlPers = new ADPersona();
    private String faltaLlenar = "";
    private ModeloTablaPersona mtP;
    private Persona actual;

    public JIFGestionarPersona() {
        mtP = new ModeloTablaPersona();
        this.listar();
        initComponents();
        iniciarComponentes();
    }
////    SINGLETON: getInstance()
//    public static JIFGestionarPersona getInstance() {
//        if (myInstance == null)
//            myInstance = new JIFGestionarPersona();
//        return myInstance;
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoSexo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cboEstadoCivil = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        opcFemenino = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        opcMasculino = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtMovil = new javax.swing.JTextField();
        txtNumDocumento = new javax.swing.JTextField();
        cboTipoDoc = new javax.swing.JComboBox();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestionar Personas");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel21.setText("Nombres");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        jLabel22.setText("Fecha de Nacimiento");

        jLabel23.setText("Tipo de Documento");

        jLabel24.setText("Estado Civil");

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Seleccionar -", "Casado", "Divorciado", "Soltero", "Viudo", "Otro" }));

        jLabel25.setText("Sexo");

        rdoSexo.add(opcFemenino);
        opcFemenino.setText("Femenino");

        jLabel26.setText("N° Documento");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        rdoSexo.add(opcMasculino);
        opcMasculino.setText("Masculino");
        opcMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcMasculinoActionPerformed(evt);
            }
        });

        jLabel27.setText("Correo");

        jLabel28.setText("Teléfono");

        jLabel29.setText("Apellidos");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel30.setText("Móvil");

        txtNumDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumDocumentoActionPerformed(evt);
            }
        });

        cboTipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Seleccionar -", "DNI", "Otro" }));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/new.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/check.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel25))
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(opcMasculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(opcFemenino))
                                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(txtNombres)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txtMovil)
                                    .addComponent(txtCorreo)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombres))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcFemenino)
                    .addComponent(opcMasculino)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cboTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/close.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblPersonas.setModel(this.mtP);
        tblPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPersonas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblPersonas);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/edit.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModificar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtNumDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDocumentoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        activarCampos(true);
//        limpiarCampos();
        iniciarComponentes();
        this.tblPersonas.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (camposCompletos() == true) {
            Persona objP;
            ADPersona PerAD = new ADPersona();
            String estCivil = this.getEstadoCivil();
            char sexo = this.getSexo();
            String tipoDoc = this.getTipoDoc();

            java.sql.Date fechaNacimiento = new java.sql.Date(jdcFechaNacimiento.getDate().getTime());

            objP = new Persona(txtApellidos.getText(), txtNombres.getText(), fechaNacimiento, sexo, tipoDoc, txtNumDocumento.getText(), estCivil, txtTelefono.getText(), txtMovil.getText(), txtCorreo.getText());
            try {
                if (PerAD.agregar(objP)) {
                    JOptionPane.showMessageDialog(this, "Persona registrada.");
                    listar();
                    activarCampos(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar datos.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, faltaLlenar);
            faltaLlenar = "";
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private char getSexo() {
        char sexo;
        if (opcMasculino.isSelected()) {
            sexo = 'M';
        } else {
            sexo = 'F';
        }

        return sexo;
    }

    private String getEstadoCivil() {
        int index = cboEstadoCivil.getSelectedIndex();
        String estCivil = null;
        if (index == 1) {
            estCivil = "C";
        }
        if (index == 2) {
            estCivil = "D";
        }
        if (index == 3) {
            estCivil = "S";
        }
        if (index == 4) {
            estCivil = "V";
        }
        if (index == 5) {
            estCivil = "O";
        }

        return estCivil;
    }

    private String getTipoDoc() {
        String tipoDoc = null;
        int index = this.cboTipoDoc.getSelectedIndex();
        if (index == 1) {
            tipoDoc = "DNI";
        }
        if (index == 2) {
            tipoDoc = "OTR";
        }

        return tipoDoc;
    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int pos = this.tblPersonas.getSelectedRow();

        if (pos > -1) {
            this.activarCampos(true);
            btnRegistrar.setEnabled(false);
            btnGuardar.setEnabled(true);
            btnModificar.setEnabled(false);
            this.actual = this.mtP.getPersona(pos);
            this.presentarDatos();
            this.tblPersonas.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una persona.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (camposCompletos() == true) {
            ADPersona ADP;
            Persona objP;
            java.sql.Date fechaNacimiento = new java.sql.Date(jdcFechaNacimiento.getDate().getTime());
            //Completndo campos del objeto Persona:
            objP = new Persona();
            objP.setApellidos(this.txtApellidos.getText());
            objP.setNombres(this.txtNombres.getText());
            objP.setFechaNacimiento(fechaNacimiento);
            objP.setSexo(this.getSexo());
            objP.setEstadoCivil(this.getEstadoCivil());
            objP.setTipoDocumento(this.getTipoDoc());
            objP.setNumeroDocumento(this.txtNumDocumento.getText());
            objP.setTelefono(this.txtTelefono.getText());
            objP.setMovil(this.txtMovil.getText());
            objP.setCorreo(this.txtCorreo.getText());
            try {
                ADP = new ADPersona();
                if (camposCompletos() == true) {
                    objP.setCodigo(this.actual.getCodigo());
                    ADP.modificar(objP);
                    listar();
                    iniciarComponentes();
                    this.tblPersonas.setEnabled(true);
                    btnRegistrar.setEnabled(false);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage().toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, faltaLlenar);
            faltaLlenar = "";
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void opcMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcMasculinoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JComboBox cboTipoDoc;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JRadioButton opcFemenino;
    private javax.swing.JRadioButton opcMasculino;
    private javax.swing.ButtonGroup rdoSexo;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumDocumento;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void iniciarComponentes() {
//        jdcFechaNacimiento.setDate(Calendar.getInstance().getTime());
        limpiarCampos();
//        btnModificar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnGuardar.setEnabled(false);
        cboTipoDoc.setSelectedIndex(0);
        cboEstadoCivil.setSelectedIndex(0);
    }

    public void activarCampos(Boolean valor) {
        txtNombres.setEnabled(valor);
        txtApellidos.setEnabled(valor);
        jdcFechaNacimiento.setEnabled(valor);
        opcMasculino.setEnabled(valor);
        opcFemenino.setEnabled(valor);
        cboTipoDoc.setEnabled(valor);
        cboEstadoCivil.setEnabled(valor);
        txtNumDocumento.setEnabled(valor);
        txtTelefono.setEnabled(valor);
        txtMovil.setEnabled(valor);
        txtCorreo.setEnabled(valor);
        //tblPersonas.setEnabled(valor);
    }

    public void limpiarCampos() {
        txtNombres.setText("");
        txtApellidos.setText("");
        jdcFechaNacimiento.setDate(null);
        opcMasculino.setSelected(false);
        opcFemenino.setSelected(false);
        cboTipoDoc.setSelectedIndex(0);
        cboEstadoCivil.setSelectedIndex(0);
        txtNumDocumento.setText("");
        txtTelefono.setText("");
        txtMovil.setText("");
        txtCorreo.setText("");
    }

    private void listar() {
        ADPersona ADPer = new ADPersona();
        List<Persona> personas;

        try {
            personas = ADPer.listar();
            this.mtP.setPersonas(personas);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADPer = null;
        }

    }

    public boolean camposCompletos() {
        boolean Completo = true;

        if (this.txtNombres.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo NOMBRES está vacio.\n";
            Completo = false;
        }
        if (this.txtApellidos.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo APELLIDO está vacio.\n";
            Completo = false;
        }
        if (this.jdcFechaNacimiento.getDateFormatString().isEmpty()) {
            faltaLlenar += "ERROR : Campo FECHA DE NACIMIENTO está vacio.\n";
            Completo = false;
        }
        if (this.opcFemenino.isSelected() == false && this.opcMasculino.isSelected() == false) {
            faltaLlenar += "ERROR : Campo SEXO está vacio.\n";
            Completo = false;
        }
        if (this.cboTipoDoc.getSelectedIndex() < 0) {
            faltaLlenar += "ERROR : Campo TIPO DE DOCUMENTO está vacio.\n";
            Completo = false;
        }
        if (this.txtNumDocumento.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo NÚMERO DE DOCUMENTO está vacio.\n";
            Completo = false;
        }
        if (this.cboEstadoCivil.getSelectedIndex() < 0) {
            faltaLlenar += "ERROR : Campo ESTADO CIVIL está vacio.\n";
            Completo = false;
        }
        if (this.txtTelefono.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo TELEFONO está vacio.\n";
            Completo = false;
        }
        if (this.txtMovil.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo MÓVIL está vacio.\n";
            Completo = false;
        }
        if (this.txtCorreo.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo CORREO está vacio.\n";
            Completo = false;
        }
        return Completo;
    }

    private void presentarDatos() {
        ADPersona ADP = new ADPersona();

        try {
            this.actual = ADP.leer(this.actual);
            if (this.actual != null) {
                this.txtNombres.setText(this.actual.getNombres());
                this.txtApellidos.setText(this.actual.getApellidos());
                this.jdcFechaNacimiento.setDate(this.actual.getFechaNacimiento());

                if ("DNI".equals(this.actual.getTipoDocumento())) {
                    this.cboTipoDoc.setSelectedIndex(1);
                }
                if ("OTR".equals(this.actual.getTipoDocumento())) {
                    this.cboTipoDoc.setSelectedIndex(2);
                }


                if (this.actual.getSexo() == 'M') {
                    this.opcMasculino.setSelected(true);
                }

                if (this.actual.getSexo() == 'F') {
                    this.opcFemenino.setSelected(true);
                }


                this.cboTipoDoc.setSelectedIndex(1);

                if ("C".equals(this.actual.getEstadoCivil())) {
                    this.cboEstadoCivil.setSelectedIndex(1);
                }
                if ("D".equals(this.actual.getEstadoCivil())) {
                    this.cboEstadoCivil.setSelectedIndex(2);
                }
                if ("S".equals(this.actual.getEstadoCivil())) {
                    this.cboEstadoCivil.setSelectedIndex(3);
                }
                if ("V".equals(this.actual.getEstadoCivil())) {
                    this.cboEstadoCivil.setSelectedIndex(4);
                }
                if ("O".equals(this.actual.getEstadoCivil())) {
                    this.cboEstadoCivil.setSelectedIndex(5);
                }


                this.txtNumDocumento.setText(this.actual.getNumeroDocumento());
                this.txtTelefono.setText(this.actual.getTelefono());
                this.txtMovil.setText(this.actual.getMovil());
                this.txtCorreo.setText(this.actual.getCorreo());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADP = null;
        }
    }
}
