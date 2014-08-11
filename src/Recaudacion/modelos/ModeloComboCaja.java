/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recaudacion.modelos;

import Entidades.Caja;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Raul
 */
public class ModeloComboCaja extends AbstractListModel
                                implements ComboBoxModel {

    private List<Caja> tipos;
    private Caja seleccionada;

    public List<Caja> getTipos() {
        return tipos;
    }

    public void setTipos(List<Caja> tipos) {
        this.tipos = tipos;
    }

    
    @Override
    public int getSize() {
        int cantidad = 0;
        if (this.tipos != null) {
            cantidad = this.tipos.size();
        }
        return cantidad;
    }

    @Override
    public Object getElementAt(int index) {
        Object valor = "";
        if (this.tipos != null) {
            valor = this.tipos.get(index).getNombre();
        }
        return valor;
    }

    @Override
    public void setSelectedItem(Object anItem) {
         this.seleccionada = null;
        if (this.tipos != null && anItem != null) {
            for (Caja tipo : tipos) {
                if (tipo.getNombre().equals(anItem.toString()) == true) {
                    this.seleccionada = tipo;
                    return;
                }
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        Object valor = "";
        if (this.seleccionada != null) {
            valor = this.seleccionada.getNombre();
        }
        return valor;
    }
    
     public void seleccionarBanco(Caja tipo) {
        this.seleccionada = null;
        if (this.tipos != null) {
            for (Caja tip : tipos) {
                if (tipo.getCodigo().equals(tip.getCodigo())) {
                    this.seleccionada = tip;
                    return;
                }
            }
        }
    }
    
    
}
