package Recaudacion.modelos;

import Entidades.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaPersona extends AbstractTableModel {

    private List<Persona> personas;

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        int cantCols = 0;
        if (this.personas != null) {
            cantCols = this.personas.size();
        }
        return cantCols;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona objP;
        Object valor = "";
        if (this.personas != null) {
            objP = this.personas.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    valor = objP.getApellidos(); break;
                case 1:
                    valor = objP.getNombres();  break;
                case 2:
                    valor = objP.getTelefono(); break;
                case 3:
                    valor = objP.getMovil(); break;
                case 4:
                    valor = objP.getCorreo(); break;
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
            nombre = "Telefono";
        }
        if (column == 3) {
            nombre = "Movil";
        }
        if (column == 4) {
            nombre = "Correo";
        }
        return nombre;
    }

    public Persona getPersona(int pos) {
        Persona objP = null;
        if (this.personas != null) {
            objP = this.personas.get(pos);
        }
        return objP;
    }
}
