package GUI;

import AccesoDatos.ADInstitucion;
import AccesoDatos.ADLocal;
import Entidades.Institucion;
import Entidades.Local;
import Recaudacion.modelos.ModeloComboInstitucion;
import Recaudacion.modelos.ModeloTablaLocal;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

public class JIFGestionarLocal extends javax.swing.JInternalFrame {

    private ModeloComboInstitucion mcI;
    private Local actual;
    private ModeloTablaLocal mtL;
    private String faltaLlenar;

    public JIFGestionarLocal() {
        mtL = new ModeloTablaLocal();
        this.listar();
        initComponents();
        this.incioComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        txtTelefono1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        chkVigencia = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cboInstitucion = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtTipoAsistencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocal = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setTitle("Gestionar Local");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Dirección");

        jLabel3.setText("Teléfono");

        chkVigencia.setSelected(true);
        chkVigencia.setText("Vigencia");

        jLabel4.setText("Institución");

        cboInstitucion.setModel(this.listarInstituciones());

        jLabel5.setText("Tipo de Asistencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkVigencia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(53, 53, 53))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion)
                            .addComponent(txtNombre)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtTipoAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tblLocal.setModel(this.mtL);
        jScrollPane1.setViewportView(tblLocal);

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

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/close.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/edit.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (camposCompletos() == true) {
            ADLocal LocAD = null;
            Local objL = null;
            Institucion instit;

            mcI = (ModeloComboInstitucion) this.cboInstitucion.getModel();

            try {
//            instit = mcI.getInstituciones().get(this.cboInstitucion.getSelectedIndex());            
//            objL = new Local(txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), chkVigencia.isSelected(), instit.getCodigo(), txtTipoAsistencia.getText());
                objL = new Local();
                objL.setNombre(this.txtNombre.getText());
                objL.setDireccion(this.txtDireccion.getText());
                objL.setTelefono(this.txtTelefono.getText());
                objL.setVigencia(this.chkVigencia.isSelected());
                objL.setTipoAsistencia(this.txtTipoAsistencia.getText());
                objL.setVigencia(this.chkVigencia.isSelected());
                objL.setInstitucion(mcI.getInstituciones().get(this.cboInstitucion.getSelectedIndex()));
                LocAD = new ADLocal();

                LocAD.agregar(objL);
                this.listar();
                JOptionPane.showMessageDialog(this, "Local registrada.");
                activarCampos(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, faltaLlenar);
            faltaLlenar = "";
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        incioComponentes();
        activarCampos(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (camposCompletos() == true) {
            ADLocal LocAD;
            Local objL;

            //Completndo campos del objeto Persona:
            objL = new Local();
            objL.setNombre(this.txtNombre.getText());
            objL.setDireccion(this.txtDireccion.getText());
            objL.setTelefono(this.txtTelefono.getText());
            objL.setVigencia(this.chkVigencia.isSelected());
            objL.setVigencia(this.chkVigencia.isSelected());
            objL.setInstitucion(mcI.getInstituciones().get(this.cboInstitucion.getSelectedIndex()));
            try {
                LocAD = new ADLocal();
//            if (camposCompletos() == true) {
                objL.setCodigo(this.actual.getCodigo());
                LocAD.modificar(objL);
                this.listar();
                incioComponentes();
                this.tblLocal.setEnabled(true);
                btnRegistrar.setEnabled(false);
//            }
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
        int pos = this.tblLocal.getSelectedRow();

        if (pos > -1) {
            this.activarCampos(true);
            btnRegistrar.setEnabled(false);
            btnGuardar.setEnabled(true);
            btnModificar.setEnabled(false);
            this.actual = this.mtL.getLocal(pos);
            this.presentarDatos();
            this.tblLocal.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una persona.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboInstitucion;
    private javax.swing.JCheckBox chkVigencia;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLocal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTipoAsistencia;
    // End of variables declaration//GEN-END:variables

    private void incioComponentes() {
        limpiarCampos();
        btnModificar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }

    private void activarCampos(boolean valor) {
        this.cboInstitucion.setEnabled(valor);
        this.txtNombre.setEnabled(valor);
        this.txtDireccion.setEnabled(valor);
        this.txtTelefono.setEnabled(valor);
        this.chkVigencia.setEnabled(valor);
    }

    private void limpiarCampos() {
        this.cboInstitucion.setSelectedIndex(-1);
        this.txtNombre.setText("");
        this.txtDireccion.setText("");
        this.txtTelefono.setText("");
        this.chkVigencia.setSelected(true);
        this.txtTipoAsistencia.setText("");
    }

    private ComboBoxModel listarInstituciones() {
        ADInstitucion ADI = new ADInstitucion();
        ModeloComboInstitucion mcI = new ModeloComboInstitucion();
        List<Institucion> instit;

        try {
            instit = ADI.listar();
            mcI.setInstituciones(instit);
            mcI.setSelectedItem(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADI = null;
        }
        return mcI;
    }

    private void listar() {
        ADLocal ADLoc = new ADLocal();
        List<Local> locales;

        try {
            locales = ADLoc.listar();
            this.mtL.setLocales(locales);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADLoc = null;
        }

    }

    private void presentarDatos() {
        ADLocal ADP = new ADLocal();
        ModeloComboInstitucion mcI;

        try {
            this.actual = ADP.leer(this.actual);
            if (this.actual != null) {
                mcI = (ModeloComboInstitucion) this.cboInstitucion.getModel();
                mcI.seleccionarInstitucion(this.actual.getInstitucion());
                this.txtNombre.setText(this.actual.getNombre());
                this.txtDireccion.setText(this.actual.getDireccion());
                this.txtTelefono.setText(this.actual.getTelefono());
                this.txtTipoAsistencia.setText(this.actual.getTipoAsistencia());
                this.chkVigencia.setSelected(this.actual.isVigencia());

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADP = null;
        }
    }

    public boolean camposCompletos() {
        boolean Completo = true;

        if (this.cboInstitucion.getSelectedIndex() < 0) {
            faltaLlenar += "ERROR : Campo INSTITUCIÓN está vacio.\n";
            Completo = false;
        }
        if (this.txtNombre.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo NOMBRE está vacio.\n";
            Completo = false;
        }
        if (this.txtDireccion.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo DIRECCIÓN está vacio.\n";
            Completo = false;
        }
        if (this.txtTelefono.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo TELÉFONO está vacio.\n";
            Completo = false;
        }
        if (this.txtTipoAsistencia.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo TIPO ASISTENCIA está vacio.\n";
            Completo = false;
        }
        return Completo;
    }
}
