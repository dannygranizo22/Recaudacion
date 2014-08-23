package Recaudacion.modelos;

import Entidades.Personal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaPersonal extends AbstractTableModel{

    private List<Personal> personales;

    public List<Personal> getPersonales() {
        return personales;
    }

    public void setPersonales(List<Personal> personal) {
        this.personales = personal;
    }
        
    @Override
    public int getRowCount() {
        int cantCols = 0;
        if (this.personales != null) {
            cantCols = this.personales.size();
        }
        return cantCols;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Personal objPsnal = null;
        Object valor = "";
        if (this.personales != null) {
            objPsnal = this.personales.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    valor = objPsnal.getApellidos(); break;
                case 1:
                    valor = objPsnal.getNombres();  break;
                case 2:
                    valor = objPsnal.getMovil(); break;
                case 3:
                    valor = objPsnal.getCorreo(); break;
                case 4:
                    valor = objPsnal.getCargo(); break;
                case 5:
                    valor = objPsnal.isVigencia(); break;
            }
        }
        return valor;
    }

    @Override
    public String getColumnName(int column) {
        String nombre = "";
        if (column == 0) {
            nombre = "Apellidos";
        }
        if (column == 1) {
            nombre = "Nombres";
        }
        if (column == 2) {
            nombre = "Movil";
        }
        if (column == 3) {
            nombre = "Correo";
        }
        if (column == 4) {
            nombre = "Cargo";
        }
        if (column == 5) {
            nombre = "Vigencia";
        }
        return nombre;
    }
    
    public Personal getPersonal(int pos) {
        Personal objA = null;
        if (this.personales != null) {
            objA = this.personales.get(pos);
        }
        return objA;
    }
}
