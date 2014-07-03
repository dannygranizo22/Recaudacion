package AccesoDatos;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Sql {

    Conexion BD = new Conexion();
    private String Sql;
    private ResultSet Resultado;
    public String modificar;
    public String delete;
    public Statement stament;
    String SentenciaSQL;

    public Sql() {
    }

    public String[] getDatosUsuarios(String User) {
        String instruccion_sql = "select numerodocumento,correo,movil"
                + " from persona where numerodocumento = '" + User + "'; ";
        //*Columnas de la tabla en que se realiza la consulta
        String[] colName = {"numerodocumento", "correo", "movil"};
        //
        String[] data = GetRegistro(colName, instruccion_sql);
        return data;
    }

    /**
     * *********************************************************************************************************************
     *
     * /*****Metodo para determinar si un registro dado la tabla, columna y el
     * valor de busqueda, existe****
     */
    public boolean Agregar_Registro(String[] datos, String instruccion_sql) {
        boolean ok = false;
        try {
            PreparedStatement pstm = BD.Conectar().prepareStatement(instruccion_sql);
            for (int i = 0; i < datos.length; i++) {
                pstm.setString(i + 1, datos[i]);
            }
            pstm.execute();
            pstm.close();
            ok = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ok;
    }

    public void Eliminar_Registro(String SentenciaSQL) {
        this.SentenciaSQL = SentenciaSQL;

        try {
            BD.Conectar();
            stament = BD.Conectar().createStatement();
            stament.executeUpdate(this.SentenciaSQL);
            JOptionPane.showMessageDialog(null, "EL REGISTRO SE ELIMINO CON EXITO");
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR REGISTRO \n ERROR : " + SQLE.getMessage());
        }
    }

    public boolean existe(String tabla, String columna, String valor) {
        boolean si_existe = false;
        int data = 0;
        try {
            String instruccion = "select count(*) as total from " + tabla + " WHERE " + columna + "='" + valor + "';";
            PreparedStatement pstm = BD.Conectar().prepareStatement(instruccion);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                data = res.getInt("total");
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        if (data > 0) {
            si_existe = true;
        }
        return si_existe;
    }

    private String[] GetRegistro(String colName[], String sql) {
        String[] data = new String[colName.length];
        try {
            PreparedStatement pstm = BD.Conectar().prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                for (int j = 0; j <= colName.length - 1; j++) {
                    data[j] = res.getString(colName[j]);
                }
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public String[] GetColumna(String tabla, String colName, String sql) {
        int registros = 0;
        //obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = BD.Conectar().prepareStatement("SELECT count(*) as total FROM " + tabla);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        String[] data = new String[registros];
        try {
            PreparedStatement pstm = BD.Conectar().prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i] = res.getString(colName);
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public void CerrarConexion() {
        BD.Desconectar();
    }
}