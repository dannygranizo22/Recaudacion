package Recaudacion.modelos;

import Entidades.Caja;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaCaja extends AbstractTableModel{
    
    private List<Caja> cajas;

    public List<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(List<Caja> cajas) {
        this.cajas = cajas;
        this.fireTableDataChanged();
    }
        
    @Override
    public int getRowCount() {
        int cantCols = 0;
        if (this.cajas != null) {
            cantCols = this.cajas.size();
        }
        return cantCols;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Caja objC;
        Object valor = "";
        if (this.cajas != null) {
            objC = this.cajas.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    valor = objC.getNombre(); break;
                case 1:
                    if(objC.isVigencia()){
                        valor = "Si";
                    } else {
                        valor = "No";
                    }
                    break;
                case 2:
                    valor = objC.getLocal().getNombre();  break;
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
            nombre = "Vigente";
        }
        if (column == 2) {
            nombre = "Local";
        }
        return nombre;
    }
    
    public Caja getCaja(int pos){
        Caja objC = null;
        if (this.cajas != null) {
            objC = this.cajas.get(pos);
        }
        return objC;
    }
}
