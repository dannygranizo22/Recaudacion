
package Recaudacion.Modelos;

import Entidades.Banco;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Raul
 */
public class ModeloComboBanco extends AbstractListModel
                                implements ComboBoxModel {

    
    private List<Banco> tipos;
    private Banco seleccionado;

    public List<Banco> getBanco() {
        return tipos;
    }

    public void setTipos(List<Banco> tipos) {
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
            valor = this.tipos.get(index).getSiglas();
        }
        return valor;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = null;
        if (this.tipos != null && anItem != null) {
            for (Banco tipo : tipos) {
                if (tipo.getSiglas().equals(anItem.toString()) == true) {
                    this.seleccionado = tipo;
                    return;
                }
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        Object valor = "";
        if (this.seleccionado != null) {
            valor = this.seleccionado.getSiglas();
        }
        return valor;
    }

    public void seleccionarBanco(Banco tipo) {
        this.seleccionado = null;
        if (this.tipos != null) {
            for (Banco tip : tipos) {
                if (tipo.getCodigo().equals(tip.getCodigo())) {
                    this.seleccionado = tip;
                    return;
                }
            }
        }
    }
    
    
}
