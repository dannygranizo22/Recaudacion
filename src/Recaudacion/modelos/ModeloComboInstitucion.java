package Recaudacion.modelos;

import Entidades.Institucion;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ModeloComboInstitucion extends AbstractListModel implements ComboBoxModel {

    private List<Institucion> instituciones;
    private Institucion seleccionado;

    public List<Institucion> getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(List<Institucion> instituciones) {
        this.instituciones = instituciones;
    }

    @Override
    public int getSize() {
        int cantidad = 0;
        if (this.instituciones != null) {
            cantidad = this.instituciones.size();
        }
        return cantidad;
    }

    @Override
    public Object getElementAt(int index) {
        Object valor = "";
        if (this.instituciones != null) {
            valor = this.instituciones.get(index).getNombre();
        }

        return valor;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = null;
        if (this.instituciones != null && anItem != null) {
            for (Institucion inst : instituciones) {
                if (inst.getNombre().equals(anItem.toString()) == true) {
                    this.seleccionado = inst;
                    return;
                }
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        Object valor = "";
        if (this.seleccionado != null) {
            valor = this.seleccionado.getNombre();
        }
        return valor;
    }

//    public Institucion seleccionarInstitucion(int pos) {
//        Institucion inst = null;
//
//        if (this.instituciones != null) {
//            inst = this.instituciones.get(pos);
//        }
//        return inst;
//    }
    public void seleccionarInstitucion(Institucion objInst) {
        this.seleccionado = null;
        if (this.instituciones != null) {
            for (Institucion instituc : instituciones) {
                if (objInst.getCodigo() == instituc.getCodigo()) {
                    this.seleccionado = instituc;
                    return;
                }
            }
        }
    }
}
