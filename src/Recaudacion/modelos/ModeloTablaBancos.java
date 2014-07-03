
package Recaudacion.Modelos;

import Entidades.Banco;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModeloTablaBancos extends AbstractTableModel{
    
    private List<Banco> ListB;
    public List<Banco> getBanco(){
        return ListB;
    }
    
     public void setCuentaB(List<Banco> listbanco) {
        this.ListB = listbanco;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        int cantidad = 0;

        if (this.ListB != null) {
            cantidad = this.ListB.size();
        }

        return cantidad;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Banco B;
        Object valor = "";

        if (this.ListB != null) {
            B = this.ListB.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    valor = B.getRazonSocial();
                    break;
                case 1:
                    valor = B.getSiglas();
                    break;
               
            }
        }
        return valor;
    }
    
    
    @Override
     public String getColumnName(int column) {
        String nombre = "";

        switch (column) {
            case 0:
                nombre = "NOMBRE DEL BANCO";
                break;
            case 1:
                nombre = "SIGLAS";
                break;            
        }
        return nombre;
    }
    
     public Banco getBanco(int pos) {
        Banco B = null;

        if (this.ListB != null) {
            B = this.ListB.get(pos);
        }
        return B;
    }
}
