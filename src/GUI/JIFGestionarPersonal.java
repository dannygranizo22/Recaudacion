package GUI;

import AccesoDatos.ADPersona;
import AccesoDatos.ADPersonal;
import Entidades.Persona;
import Entidades.Personal;
import Recaudacion.modelos.ModeloTablaPersonal;
import java.util.List;
import javax.swing.JOptionPane;

public class JIFGestionarPersonal extends javax.swing.JInternalFrame {
    
    private String faltaLlenar = "";
    private ModeloTablaPersonal mtP;
    private Personal actual;
    
    public JIFGestionarPersonal() {
        mtP = new ModeloTablaPersonal();
        this.listar();
        initComponents();
        this.iniciarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        opcMasculino = new javax.swing.JRadioButton();
        opcFemenino = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        cboTipoDoc = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        txtNumDocumento = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cboEstadoCivil = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtMovil = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        chkVigencia = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Gestionar Personal");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel21.setText("Nombres");

        jLabel29.setText("Apellidos");

        jLabel22.setText("Fecha de Nacimiento");

        jLabel25.setText("Sexo");

        opcMasculino.setText("Masculino");

        opcFemenino.setText("Femenino");

        jLabel23.setText("Tipo de Documento");

        cboTipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Seleccionar -", "DNI", "Otro" }));

        jLabel26.setText("N° Documento");

        jLabel24.setText("Estado Civil");

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Seleccionar -", "Casado", "Divorciado", "Soltero", "Viudo", "Otro" }));

        jLabel28.setText("Teléfono Fijo");

        jLabel30.setText("Móvil");

        jLabel27.setText("Correo Electrónico");

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

        jLabel6.setText("Cargo");

        chkVigencia.setSelected(true);
        chkVigencia.setText("Vigencia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel25))
                            .addComponent(jLabel22)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombres)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(opcMasculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(opcFemenino)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkVigencia)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMovil, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(txtCargo)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombres))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcFemenino)
                    .addComponent(opcMasculino)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cboTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)))
                .addGap(18, 18, 18)
                .addComponent(chkVigencia)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione Persona"));

        tblPersonal.setModel(this.mtP);
        tblPersonal.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblPersonal);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/edit.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModificar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/close.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        activarCampos(true);
        iniciarComponentes();
        this.tblPersonal.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (this.camposCompletos() == true) {
            ADPersona ADP;
            ADPersonal ADPsnal;
            Persona objP;
            Personal objPsnal;
            int codigoPersona;
            java.sql.Date fechaNacimiento = new java.sql.Date(jdcFechaNacimiento.getDate().getTime());

            objP = new Persona(txtApellidos.getText(), txtNombres.getText(), fechaNacimiento, this.getSexo(), this.getTipoDoc(), txtNumDocumento.getText(), this.getEstadoCivil(), txtTelefono.getText(), txtMovil.getText(), txtCorreo.getText());
            objPsnal = new Personal(txtCargo.getText(), this.getVigencia());
            try {
                ADP = new ADPersona();
                ADPsnal = new ADPersonal();

                ADP.agregar(objP);
                codigoPersona = this.buscarPorDNI(this.txtNumDocumento.getText());
                if (codigoPersona != -1){
                    objPsnal.setCodigo(codigoPersona);
                    ADPsnal.agregar(objPsnal);
                    listar();
                    activarCampos(false);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage().toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, faltaLlenar);
            faltaLlenar = "";
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (camposCompletos() == true) {
            ADPersona ADP;
            Persona objP;
            Personal objPsnal;
            ADPersonal ADPsnal;
            java.sql.Date fechaNacimiento = new java.sql.Date(jdcFechaNacimiento.getDate().getTime());
            //Completndo campos del objeto Persona:
            //            objP.setApellidos(this.txtApellidos.getText());
            //            objP.setNombres(this.txtNombres.getText());
            //            objP.setFechaNacimiento(fechaNacimiento);
            //            objP.setSexo(this.getSexo());
            //            objP.setEstadoCivil(this.getEstadoCivil());
            //            objP.setTipoDocumento(this.getTipoDoc());
            //            objP.setNumeroDocumento(this.txtNumDocumento.getText());
            //            objP.setTelefono(this.txtTelefono.getText());
            //            objP.setMovil(this.txtMovil.getText());
            //            objP.setCorreo(this.txtCorreo.getText());
            objP = new Persona(txtApellidos.getText(), txtNombres.getText(), fechaNacimiento, this.getSexo(), this.getTipoDoc(), txtNumDocumento.getText(), this.getEstadoCivil(), txtTelefono.getText(), txtMovil.getText(), txtCorreo.getText());

            //Completndo campos del objeto Persona:
            objPsnal = new Personal(txtCargo.getText(), this.getVigencia());

            try {
                ADP = new ADPersona();
                ADPsnal = new ADPersonal();

                if (camposCompletos() == true) {
                    objP.setCodigo(this.actual.getCodigo());
                    objPsnal.setCodigo(this.actual.getCodigo());
                    ADP.modificar(objP);
                    ADPsnal.modifcar(objPsnal);
                    listar();
                    activarCampos(false);
                    btnGuardar.setEnabled(false);
                    tblPersonal.setEnabled(true);
                    btnModificar.setEnabled(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage().toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, faltaLlenar);
            faltaLlenar = "";
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int pos = this.tblPersonal.getSelectedRow();

        if (pos > -1) {
            this.activarCampos(true);
            btnRegistrar.setEnabled(false);
            btnGuardar.setEnabled(true);
            btnModificar.setEnabled(false);
            this.actual = this.mtP.getPersonal(pos);
            this.presentarDatos();
            this.tblPersonal.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una persona.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JComboBox cboTipoDoc;
    private javax.swing.JCheckBox chkVigencia;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JRadioButton opcFemenino;
    private javax.swing.JRadioButton opcMasculino;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumDocumento;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    
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
        chkVigencia.setEnabled(valor);
        txtCargo.setEnabled(valor);
        //tblPersonas.setEnabled(valor);
    }
    
    private int buscarPorDNI(String Dni) {
        int codigoPersona;
        ADPersona ADP;
        try {
            ADP = new ADPersona();
            codigoPersona = ADP.buscaPorDNI(Dni);
            if (codigoPersona != -1){
                return codigoPersona;
            }
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADP = null;
        }
        return -1;
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
        if (this.txtCargo.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo CARGO está vacio.\n";
            Completo = false;
        }
        return Completo;
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

    private char getSexo() {
        char sexo;
        if (opcMasculino.isSelected()) {
            sexo = 'M';
        } else {
            sexo = 'F';
        }

        return sexo;
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

    private boolean getVigencia() {
        boolean vive;
        if (this.chkVigencia.isSelected()) {
            vive = true;
        } else {
            vive = false;
        }
        return vive;
    }

    private void iniciarComponentes() {
//        jdcFechaNacimiento.setDate(Calendar.getInstance().getTime());
        this.limpiarCampos();
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnGuardar.setEnabled(false);
        cboTipoDoc.setSelectedIndex(0);
        cboEstadoCivil.setSelectedIndex(0);
    }

    private void limpiarCampos() {
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
        txtCargo.setText("");
        chkVigencia.setSelected(true);
    }

    private void listar() {
        ADPersonal ADPsnal = new ADPersonal();
        List<Personal> personales;

        try {
            personales = ADPsnal.listar();
            this.mtP.setPersonales(personales);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADPsnal = null;
        }
    }

    private void presentarDatos() {
        ADPersonal ADPsnal = new ADPersonal();

        try {
            this.actual = ADPsnal.leer(this.actual);
            
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
                
                this.txtCargo.setText(this.actual.getCargo());
                this.chkVigencia.setSelected(this.actual.isVigencia());
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADPsnal = null;
        }
    }
}

    
