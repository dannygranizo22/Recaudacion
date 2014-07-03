package Recaudacion.modelos;

import Entidades.Local;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaLocal extends AbstractTableModel{

    private List<Local> locales;

    public List<Local> getLocales() {
        return locales;
    }

    public void setLocales(List<Local> locales) {
        this.locales = locales;
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        int cantCols = 0;
        if (this.locales != null) {
            cantCols = this.locales.size();
        }
        return cantCols;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Local objL;
        Object valor = "";
        if (this.locales != null) {
            objL = this.locales.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    valor = objL.getNombre(); break;
                case 1:
                    valor = objL.getDireccion();  break;
                case 2:
                    valor = objL.getTelefono(); break;
                case 3:
                    valor = objL.getInstitucion().getNombre(); break;
                case 4:
                    if(objL.isVigencia()){
                        valor = "Si";
                    } else {
                        valor = "No";
                    }
                    break;
            }
        }
        return valor;
    }

    @Override
    public String getColumnName(int column) {
        String nombre = "";
        if (column == 0) {
            nombre = "Nombre";
        }
        if (column == 1) {
            nombre = "Dirección";
        }
        if (column == 2) {
            nombre = "Teléfono";
        }
        if (column == 3) {
            nombre = "Institucion";
        }
        if (column == 4) {
            nombre = "Vigente";
        }
        return nombre;
    }
    
    public Local getLocal(int pos){
        Local objL = null;
        if (this.locales != null) {
            objL = this.locales.get(pos);
        }
        return objL;
    }
    
}
