package AccesoDatos;

import Entidades.Banco;
import Entidades.CuentaBancaria;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raul
 */
public class ADCuentaBancaria {

    Conexion BD = new Conexion();
    Sql SQL = new Sql();
    private ResultSet resulset;
    public String modificar;
    public String delete;
    public Statement statement;
    String SentenciaSQL;

    public ADCuentaBancaria() {
    }

    public boolean RegistrarCuentaB(CuentaBancaria objCB) throws Exception {
        boolean ok = false;
        CallableStatement cs;
        try {
            SentenciaSQL = "insert into cuentabancaria(numero,fechaapertura,denominacion,montoinicial, codigointerbancario,codigobanco)"
                    + " values( '"
                    + objCB.getNumero() + "' , '"
                    + objCB.getFechaApertura() + "','"
                    + objCB.getDenominacion() + "', "
                    + objCB.getMontoInicial() + " , '"
                    + objCB.getCodigoInterbancario() + "',"
                    + objCB.getBanco().getCodigo() + " )";

            statement = BD.Conectar().createStatement();
            statement.executeUpdate(SentenciaSQL);
            /*cs = BD.Conectar().prepareCall("{ call fu_icuentabancaria(?,?,?,?,?,?) }");
            cs.setString(1, objCB.getNumero());
            cs.setDate(2, new java.sql.Date(objCB.getFechaApertura().getTime()));
            cs.setString(3, objCB.getDenominacion());
            cs.setDouble(4, objCB.getMontoInicial());
            cs.setString(5, objCB.getCodigoInterbancario());
            cs.setInt(6, Integer.parseInt(objCB.getBanco().getCodigo().toString()));
            cs.executeQuery();
            */
            ok = true;
        } catch (Exception e) {
            throw e;
        }

        return ok;
    }

    public void modificar(CuentaBancaria CB) throws Exception {
        
        try {
            SentenciaSQL = "UPDATE cuentabancaria SET numero='"
                    + CB.getNumero()
                    + "',fechaapertura='" + CB.getFechaApertura()
                    + "',denominacion='" + CB.getDenominacion()
                    + "',montoinicial=" + CB.getMontoInicial()
                    + ",codigointerbancario='" + CB.getCodigoInterbancario()
                    + "',codigobanco=" + CB.getBanco().getCodigo() + " WHERE codigo =" + CB.getCod() + ";";

            statement = BD.Conectar().createStatement();
            statement.executeUpdate(SentenciaSQL);

        } catch (Exception e) {
            throw e;
        }
    }

    public CuentaBancaria leer(CuentaBancaria actual) throws Exception {
        CuentaBancaria CB = null;
        resulset = null;

        try {
            SentenciaSQL = "select codigo,numero,fechaapertura,denominacion,montoinicial,codigointerbancario,codigobanco"
                    + " from cuentabancaria where codigo = '" + actual.getCod() + "'; ";

            statement = BD.Conectar().createStatement();
            resulset = statement.executeQuery(SentenciaSQL);

            if (resulset.next() == true) {
                CB = new CuentaBancaria();
                CB.setCodigo(actual.getCod());
                CB.setNumero(resulset.getString("numero"));
                CB.setFechaApertura(resulset.getDate("fechaapertura"));
                CB.setDenominacion(resulset.getString("denominacion"));
                CB.setMontoInicial(resulset.getDouble("montoinicial"));
                CB.setCodigoInterbancario(resulset.getString("codigointerbancario"));
                CB.setBanco(new Banco());
                CB.getBanco().setCodigo(resulset.getString("codigobanco"));

            }
        } catch (Exception e) {
            throw e;
        }
        return CB;
    }

   
    public List<CuentaBancaria> ListarTabla() throws Exception {
        List<CuentaBancaria> ListCB;
        CuentaBancaria CB;
        resulset = null;
        try {
            SentenciaSQL = "SELECT CB.codigo,CB.numero,CB.denominacion,CB.montoinicial, B.razonsocial"
                    + " FROM cuentabancaria CB INNER JOIN banco B ON CB.codigobanco = B.codigo;";

            statement = BD.Conectar().createStatement();
            resulset = statement.executeQuery(SentenciaSQL);

            ListCB = new ArrayList<>();
            while (resulset.next() == true) {
                CB = new CuentaBancaria();
                CB.setCodigo(resulset.getString("codigo"));
                CB.setNumero(resulset.getString("numero"));
                CB.setDenominacion(resulset.getString("denominacion"));
                CB.setMontoInicial(resulset.getDouble("montoinicial"));
                CB.setBanco(new Banco());
                CB.getBanco().setSiglas(resulset.getString("razonsocial"));
                ListCB.add(CB);
            }
        } catch (Exception e) {
            throw e;
        }
        return ListCB;
    }
}
