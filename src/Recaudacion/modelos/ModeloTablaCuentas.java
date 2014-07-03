package Recaudacion.Modelos;

import Entidades.CuentaBancaria;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaCuentas  extends AbstractTableModel{

    private List<CuentaBancaria> CuentaB;

    public List<CuentaBancaria> getCuentaB() {
        return CuentaB;
    }

    public void setCuentaB(List<CuentaBancaria> ListCB) {
        this.CuentaB = ListCB;
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        int cantidad = 0;

        if (this.CuentaB != null) {
            cantidad = this.CuentaB.size();
        }

        return cantidad;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CuentaBancaria CB;
        Object valor = "";

        if (this.CuentaB != null) {
            CB = this.CuentaB.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    valor = CB.getNumero();
                    break;
                case 1:
                    valor = CB.getDenominacion();
                    break;
                case 2:
                    valor = CB.getMontoInicial();
                    break;
                case 3:
                    valor = CB.getBanco().getSiglas();
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
                nombre = "NUMERO DE CUENTA";
                break;
            case 1:
                nombre = "DENOMINACION";
                break;
            case 2:
                nombre = "MONTO INICIAL";
                break;
            case 3:
                nombre = "BANCO";
                break;
        }
        return nombre;
    }

    public CuentaBancaria getCuentaB(int pos) {
        CuentaBancaria CB = null;

        if (this.CuentaB != null) {
            CB = this.CuentaB.get(pos);
        }
        return CB;
    }
  
    
}
