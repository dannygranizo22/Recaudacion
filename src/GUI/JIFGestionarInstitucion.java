package GUI;

import AccesoDatos.ADInstitucion;
import Entidades.Institucion;
import Recaudacion.modelos.ModeloTablaInstitucion;
import java.util.List;
import javax.swing.JOptionPane;

public class JIFGestionarInstitucion extends javax.swing.JInternalFrame {

    private ModeloTablaInstitucion mtI;
    private Institucion actual;
    private String faltaLlenar = "";

    public JIFGestionarInstitucion() {
        mtI = new ModeloTablaInstitucion();
        this.listar();
        initComponents();
        iniciarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtResolucion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMovil = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();
        txtDniDirector = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPromotor = new javax.swing.JTextField();
        txtDniPromotor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInstitucion = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestionar Institución");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Resolución");

        jLabel3.setText("Fecha Creación");

        jLabel4.setText("Dirección");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel5.setText("Teléfono");

        jLabel6.setText("Móvil");

        jLabel7.setText("Correo");

        jLabel8.setText("Capacidad");

        jLabel9.setText("DNI Director");

        jLabel10.setText("Director");

        jLabel11.setText("DNI Promotor");

        jLabel12.setText("Promotor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtResolucion)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPromotor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txtDirector, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDniPromotor)
                            .addComponent(txtDniDirector)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMovil, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtDniDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPromotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDniPromotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblInstitucion.setModel(this.mtI);
        jScrollPane1.setViewportView(tblInstitucion);

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

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/edit.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.activarCampos(true);
        this.limpiarCampos();
        this.iniciarComponentes();
        this.tblInstitucion.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (camposCompletos() == true) {
            ADInstitucion InstAD = null;
            Institucion objI = null;
            java.sql.Date fechaCreacion = new java.sql.Date(jdcFechaCreacion.getDate().getTime());

            try {
                objI = new Institucion(this.txtNombre.getText(), this.txtResolucion.getText(), fechaCreacion, this.txtDireccion.getText(), this.txtTelefono.getText(), this.txtMovil.getText(), this.txtCorreo.getText(), this.txtDniPromotor.getText(), this.txtDniDirector.getText(), this.txtPromotor.getText(), this.txtDirector.getText(), Integer.parseInt(this.txtCapacidad.getText()));
                InstAD = new ADInstitucion();

                InstAD.agregar(objI);
                listar();
                JOptionPane.showMessageDialog(this, "Institución registrada.");
                activarCampos(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, faltaLlenar);
            faltaLlenar = "";
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int pos = this.tblInstitucion.getSelectedRow();

        if (pos > -1) {
            this.activarCampos(true);
            btnRegistrar.setEnabled(false);
            btnGuardar.setEnabled(true);
            btnModificar.setEnabled(false);
            this.actual = this.mtI.getInstitucion(pos);
            this.presentarDatos();
            this.tblInstitucion.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una institución.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (camposCompletos() == true) {
            ADInstitucion InstAD;
            Institucion objI;
            java.sql.Date fechaCreacion = new java.sql.Date(jdcFechaCreacion.getDate().getTime());
            //Completando campos del objeto Persona:
            objI = new Institucion();
            objI.setNombre(this.txtNombre.getText());
            objI.setResolucion(this.txtResolucion.getText());
            objI.setFechaDeCreacion(fechaCreacion);
            objI.setDireccion(this.txtDireccion.getText());
            objI.setDirector(this.txtDirector.getText());
            objI.setDniDirector(this.txtDniDirector.getText());
            objI.setPromotor(this.txtPromotor.getText());
            objI.setDniPromotor(this.txtDniPromotor.getText());
            objI.setTelefono(this.txtTelefono.getText());
            objI.setMovil(this.txtMovil.getText());
            objI.setCorreo(this.txtCorreo.getText());
            objI.setCapacidad(Integer.parseInt(this.txtCapacidad.getText()));
            try {
                InstAD = new ADInstitucion();
//            if (camposCompletos() == true) {
                objI.setCodigo(this.actual.getCodigo());
                InstAD.modificar(objI);
                listar();
                iniciarComponentes();
                this.tblInstitucion.setEnabled(true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JTable tblInstitucion;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtDniDirector;
    private javax.swing.JTextField txtDniPromotor;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPromotor;
    private javax.swing.JTextField txtResolucion;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void iniciarComponentes() {
        this.limpiarCampos();
        btnModificar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }

    private void limpiarCampos() {
        this.txtNombre.setText("");
        this.txtResolucion.setText("");
        this.jdcFechaCreacion.setDate(null);
        this.txtDireccion.setText("");
        this.txtTelefono.setText("");
        this.txtMovil.setText("");
        this.txtCorreo.setText("");
        this.txtDniPromotor.setText("");
        this.txtDniDirector.setText("");
        this.txtPromotor.setText("");
        this.txtDirector.setText("");
        this.txtCapacidad.setText("");
    }

    private void listar() {
        ADInstitucion ADIns = new ADInstitucion();
        List<Institucion> instituciones;

        try {
            instituciones = ADIns.listar();
            this.mtI.setInstituciones(instituciones);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ADIns = null;
        }
    }

    private void activarCampos(Boolean valor) {
        this.btnRegistrar.setEnabled(valor);
        this.txtNombre.setEnabled(valor);
        this.txtResolucion.setEnabled(valor);
        this.jdcFechaCreacion.setEnabled(valor);
        this.txtDireccion.setEnabled(valor);
        this.txtTelefono.setEnabled(valor);
        this.txtMovil.setEnabled(valor);
        this.txtCorreo.setEnabled(valor);
        this.txtDniPromotor.setEnabled(valor);
        this.txtDniDirector.setEnabled(valor);
        this.txtPromotor.setEnabled(valor);
        this.txtDirector.setEnabled(valor);
        this.txtCapacidad.setEnabled(valor);
    }

    private void presentarDatos() {
        ADInstitucion ADP = new ADInstitucion();

        try {
            this.actual = ADP.leer(this.actual);
            if (this.actual != null) {
                this.txtNombre.setText(this.actual.getNombre());
                this.txtResolucion.setText(this.actual.getResolucion());
                this.jdcFechaCreacion.setDate(this.actual.getFechaDeCreacion());
                this.txtDireccion.setText(this.actual.getDireccion());
                this.txtDirector.setText(this.actual.getDirector());
                this.txtDniDirector.setText(this.actual.getDniDirector());
                this.txtPromotor.setText(this.actual.getPromotor());
                this.txtDniPromotor.setText(this.actual.getDniPromotor());
                this.txtTelefono.setText(this.actual.getTelefono());
                this.txtMovil.setText(this.actual.getMovil());
                this.txtCorreo.setText(this.actual.getCorreo());
                this.txtCapacidad.setText(Integer.toString(this.actual.getCapacidad()));
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

        if (this.txtNombre.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo NOMBRE está vacio.\n";
            Completo = false;
        }
        if (this.txtResolucion.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo RESOLUCIÓN está vacio.\n";
            Completo = false;
        }
        if (this.jdcFechaCreacion.getDateFormatString().isEmpty()) {
            faltaLlenar += "ERROR : Campo FECHA DE CREACIÓN está vacio.\n";
            Completo = false;
        }
        if (this.txtDireccion.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo DIRECCIÓN está vacio.\n";
            Completo = false;
        }
        if (this.txtDirector.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo DIRECTOR está vacio.\n";
            Completo = false;
        }
        if (this.txtDniDirector.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo DNI DE DIRECTOR está vacio.\n";
            Completo = false;
        }
        if (this.txtPromotor.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo PROMOTOR está vacio.\n";
            Completo = false;
        }
        if (this.txtDniPromotor.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo DNI DE PROMOTOR está vacio.\n";
            Completo = false;
        }
        if (this.txtTelefono.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo TELÉFONO está vacio.\n";
            Completo = false;
        }
        if (this.txtCorreo.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo CORREO está vacio.\n";
            Completo = false;
        }
        if (this.txtMovil.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo MOVIL está vacio.\n";
            Completo = false;
        }
        if (this.txtCapacidad.getText().isEmpty()) {
            faltaLlenar += "ERROR : Campo CAPACIDAD está vacio.\n";
            Completo = false;
        }
        return Completo;
    }
}
