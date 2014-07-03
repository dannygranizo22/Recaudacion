package Recaudacion.modelos;

import Entidades.Institucion;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaInstitucion extends AbstractTableModel{
    
    private List<Institucion> instituciones;

    public List<Institucion> getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(List<Institucion> instituciones) {
        this.instituciones = instituciones;
        this.fireTableDataChanged();
    }
           
    @Override
    public int getRowCount() {
        int cantCols = 0;
        if (this.instituciones != null) {
            cantCols = this.instituciones.size();
        }
        return cantCols;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Institucion objI;
        Object valor = "";
        if (this.instituciones != null) {
            objI = this.instituciones.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    valor = objI.getNombre(); break;
                case 1:
                    valor = objI.getDirector();  break;
                case 2:
                    valor = objI.getTelefono(); break;
                case 3:
                    valor = objI.getMovil(); break;
                case 4:
                    valor = objI.getDireccion(); break;
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
            nombre = "Director";
        }
        if (column == 2) {
            nombre = "Telefono";
        }
        if (column == 3) {
            nombre = "Movil";
        }
        if (column == 4) {
            nombre = "Direccion";
        }
        return nombre;
    }
    
    public Institucion getInstitucion(int pos) {
        Institucion objP = null;
        if (this.instituciones != null) {
            objP = this.instituciones.get(pos);
        }
        return objP;
    }
    
}
