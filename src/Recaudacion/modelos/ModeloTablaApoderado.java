package Recaudacion.modelos;

import Entidades.Apoderado;
import Entidades.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaApoderado extends AbstractTableModel{
    
    private List<Apoderado> apoderados;
    //private List<Persona> personas;

    public List<Apoderado> getApoderados() {
        return apoderados;
    }

    public void setApoderados(List<Apoderado> apoderados) {
        this.apoderados = apoderados;
    }
    
    @Override
    public int getRowCount() {
        int cantCols = 0;
        if (this.apoderados != null) {
            cantCols = this.apoderados.size();
        }
        return cantCols;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Apoderado objA;
        Persona objP;
        Object valor = "";
        if (this.apoderados != null) {
            objA = this.apoderados.get(rowIndex);
            
//            switch (columnIndex) {
//                case 0:
//                    valor = objP.getApellidos(); break;
//                case 1:
//                    valor = objP.getNombres();  break;
//                case 2:
//                    valor = objA.isViveConEstudiante(); break;
//                case 3:
//                    valor = objA.getCentroLaboral(); break;
//                case 4:
//                    valor = objA.isVive(); break;
//            }
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
            nombre = "Vive con Estudiante";
        }
        if (column == 3) {
            nombre = "Centro Laboral";
        }
        if (column == 4) {
            nombre = "Vive";
        }
        return nombre;
    }
    
    
}
