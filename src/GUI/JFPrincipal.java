package GUI;

import AccesoDatos.ADRecaudacion;
import Entidades.Recaudacion;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class JFPrincipal extends javax.swing.JFrame {
    ADRecaudacion adRecaudacion = new ADRecaudacion();
    
    private String mensaje = "La ventana ya esta abierta.";
    JIFGestionarPersona pers;
    JIFGestionarInstitucion inst;
    JIFGestionarLocal loc;
    JIFGestionarApoderado apod;
    JIFGestionarPersonal psnal;
    JIFGestionarCaja caja;
    gestBanco banc;
    gestCuentaBancaria cuentaBan;

    
    
    public JFPrincipal() {
        initComponents();
       // lblcodRecaudacion.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoSexo = new javax.swing.ButtonGroup();
        panelEscritorio = new javax.swing.JDesktopPane();
        lblcodRecaudacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnu_GPersona = new javax.swing.JMenuItem();
        mnu_GApoderado = new javax.swing.JMenuItem();
        mnu_GPersonal = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnu_GInstitucion = new javax.swing.JMenuItem();
        mnu_GLocal = new javax.swing.JMenuItem();
        mnu_GCaja = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnu_GBanco = new javax.swing.JMenuItem();
        mnu_GCuentaBancaria = new javax.swing.JMenuItem();
        mnu = new javax.swing.JMenu();
        mnu_CerrarSesion = new javax.swing.JMenuItem();
        mnu_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblcodRecaudacion.setForeground(new java.awt.Color(51, 51, 51));
        lblcodRecaudacion.setText("codRecaudacion");
        lblcodRecaudacion.setToolTipText("");
        lblcodRecaudacion.setBounds(1114, 624, 80, 30);
        panelEscritorio.add(lblcodRecaudacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("jLabel1");

        jMenu1.setText("Gestionar");

        mnu_GPersona.setText("Personas");
        mnu_GPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_GPersonaActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_GPersona);

        mnu_GApoderado.setText("Apoderado");
        mnu_GApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_GApoderadoActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_GApoderado);

        mnu_GPersonal.setText("Personal");
        mnu_GPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_GPersonalActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_GPersonal);
        jMenu1.add(jSeparator1);

        mnu_GInstitucion.setText("Institución");
        mnu_GInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_GInstitucionActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_GInstitucion);

        mnu_GLocal.setText("Local");
        mnu_GLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_GLocalActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_GLocal);

        mnu_GCaja.setText("Caja");
        mnu_GCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_GCajaActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_GCaja);
        jMenu1.add(jSeparator2);

        mnu_GBanco.setText("Banco");
        mnu_GBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_GBancoActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_GBanco);

        mnu_GCuentaBancaria.setText("Cuenta Bancaria");
        mnu_GCuentaBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_GCuentaBancariaActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_GCuentaBancaria);

        jMenuBar1.add(jMenu1);

        mnu.setText("Sistema");

        mnu_CerrarSesion.setText("Cerrar Sesión");
        mnu_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_CerrarSesionActionPerformed(evt);
            }
        });
        mnu.add(mnu_CerrarSesion);

        mnu_Salir.setText(" Salir");
        mnu.add(mnu_Salir);

        jMenuBar1.add(mnu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_GLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_GLocalActionPerformed
        // TODO add your handling code here:
        if (estaCerrado(loc) == true) {
            loc = new JIFGestionarLocal();
            panelEscritorio.add(loc);
            loc.show();
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_mnu_GLocalActionPerformed

    private void mnu_GPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_GPersonaActionPerformed
        // TODO add your handling code here:
        if (estaCerrado(pers) == true) {
            pers = new JIFGestionarPersona();
            panelEscritorio.add(pers);
            pers.show();
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_mnu_GPersonaActionPerformed

    private void mnu_GInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_GInstitucionActionPerformed
        // TODO add your handling code here:
        if (estaCerrado(inst) == true) {
            inst = new JIFGestionarInstitucion();
            panelEscritorio.add(inst);
            inst.show();
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_mnu_GInstitucionActionPerformed

    private void mnu_GBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_GBancoActionPerformed
        // TODO add your handling code here:
        if (estaCerrado(banc) == true) {
            banc = new gestBanco();
            panelEscritorio.add(banc);
            banc.show();
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_mnu_GBancoActionPerformed

    private void mnu_GCuentaBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_GCuentaBancariaActionPerformed
        // TODO add your handling code here:
        if (estaCerrado(cuentaBan) == true) {
            cuentaBan = new gestCuentaBancaria();
            panelEscritorio.add(cuentaBan);
            cuentaBan.show();
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_mnu_GCuentaBancariaActionPerformed

    private void mnu_GApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_GApoderadoActionPerformed
        // TODO add your handling code here:
        if (estaCerrado(apod) == true) {
            apod = new JIFGestionarApoderado();
            panelEscritorio.add(apod);
            apod.show();
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_mnu_GApoderadoActionPerformed

    private void mnu_GPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_GPersonalActionPerformed
        // TODO add your handling code here:
        if (estaCerrado(psnal) == true) {
            psnal = new JIFGestionarPersonal();
            panelEscritorio.add(psnal);
            psnal.show();
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_mnu_GPersonalActionPerformed

    private void mnu_GCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_GCajaActionPerformed
        // TODO add your handling code here:
        if (estaCerrado(caja) == true) {
            caja = new JIFGestionarCaja();
            panelEscritorio.add(caja);
            caja.show();
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_mnu_GCajaActionPerformed

    private void mnu_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_CerrarSesionActionPerformed
        Recaudacion objRec;
        objRec = new Recaudacion();
        objRec.setCodigo(Integer.parseInt(lblcodRecaudacion.getText()));
        
        adRecaudacion = new ADRecaudacion();
             try {
                  if (adRecaudacion.modificar(objRec)) {
                    JOptionPane.showMessageDialog(this, "Recaudacion Finalizada");
                    JFLogin from = new JFLogin();
                    from.setVisible(true);
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(this, "Error al fializar recaudacion");
                }
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(this, e.getMessage());
             }
    }//GEN-LAST:event_mnu_CerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JLabel lblcodRecaudacion;
    private javax.swing.JMenu mnu;
    private javax.swing.JMenuItem mnu_CerrarSesion;
    private javax.swing.JMenuItem mnu_GApoderado;
    private javax.swing.JMenuItem mnu_GBanco;
    private javax.swing.JMenuItem mnu_GCaja;
    private javax.swing.JMenuItem mnu_GCuentaBancaria;
    private javax.swing.JMenuItem mnu_GInstitucion;
    private javax.swing.JMenuItem mnu_GLocal;
    private javax.swing.JMenuItem mnu_GPersona;
    private javax.swing.JMenuItem mnu_GPersonal;
    private javax.swing.JMenuItem mnu_Salir;
    private javax.swing.JDesktopPane panelEscritorio;
    private javax.swing.ButtonGroup rdoSexo;
    // End of variables declaration//GEN-END:variables

    private boolean estaCerrado(Object obj) {
        JInternalFrame[] activos = panelEscritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
            }
            i++;
        }
        return cerrado;
    }
}
