package Recaudacion.modelos;

import AccesoDatos.ADApoderado;
import Entidades.Apoderado;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaApoderado extends AbstractTableModel {
    
    private List<Apoderado> apoderados;

    public List<Apoderado> getApoderados() {
        return apoderados;
    }

    public void setApoderados(List<Apoderado> apoderados) {
        this.apoderados = apoderados;
    }
    
    @Override
    public int getRowCount() {
        int cantCols;
        cantCols = 0;
        if (this.apoderados != null) {
            cantCols = this.apoderados.size();
        }
        return cantCols;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Apoderado objA = null;
        Object valor = "";
        if (this.apoderados != null) {
            objA = this.apoderados.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    valor = objA.getApellidos(); break;
                case 1:
                    valor = objA.getNombres();  break;
                case 2:
                    valor = objA.isVive(); break;
                case 3:
                    valor = objA.isViveConEstudiante(); break;
                case 4:
                    valor = objA.getCentroLaboral(); break;
                case 5:
                    valor = objA.getProfesion(); break;
                case 6:
                    valor = objA.getCargo(); break;
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
            nombre = "Vive";
        }
        if (column == 3) {
            nombre = "Vive con Estudiante";
        }
        if (column == 4) {
            nombre = "Centro Laboral";
        }
        if (column == 5) {
            nombre = "Profesión";
        }
        if (column == 6) {
            nombre = "Cargo";
        }
        return nombre;
    }

    public Apoderado getApoderado(int pos) {
        Apoderado objA = null;
        if (this.apoderados != null) {
            objA = this.apoderados.get(pos);
        }
        return objA;
    }
    
    
}
