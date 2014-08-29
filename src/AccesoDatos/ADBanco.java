
package AccesoDatos;

import Entidades.Banco;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Raul
 */
public class ADBanco {
    
    Conexion BD = new Conexion();
 
    private ResultSet resulset;
    public String modificar;
    public String delete;
    public Statement statement;
    String SentenciaSQL;
    
    public ADBanco(){}
    
    public boolean registrar(Banco objBanco) throws Exception{
        boolean ok = false;
        resulset = null;
        CallableStatement cs;
        try {

            cs = BD.Conectar().prepareCall("{ call fu_ibanco(?,?)}");
            cs.setString(1, objBanco.getRazonSocial());
            cs.setString(2, objBanco.getSiglas());
            cs.executeUpdate();
            ok = true;

        } catch (Exception e) {
            throw e;
        }

        return ok;
   }
  
    
   public Banco leer(Banco actual) throws Exception {
        Banco b = null;
        resulset = null;
        CallableStatement cs;
        
        try {
            cs = BD.Conectar().prepareCall("select * from fu_leerbanco(?) as (rz varchar,s varchar)");    
            cs.setInt(1, Integer.parseInt(actual.getCodigo()));
            resulset = cs.executeQuery();

            if (resulset.next() == true) {
                b = new Banco();
                b.setCodigo(actual.getCodigo());
                b.setRazonSocial(resulset.getString("rz"));
                b.setSiglas(resulset.getString("s"));

            }
        } catch (Exception e) {
            throw e;
        }
        return b;
    }
    
    public void modificar(Banco B) throws Exception {
        
        try {
            SentenciaSQL = "UPDATE banco SET razonsocial='"
                    + B.getRazonSocial()
                    + "',siglas='" + B.getSiglas()
                    + "' WHERE codigo =" + B.getCodigo()+ ";";

            statement = BD.Conectar().createStatement();
            statement.executeUpdate(SentenciaSQL);

        } catch (Exception e) {
            throw e;
        }
    }
        
    //****************LISTAR PARA MOSTRAR EN JTABLE***************
    public List<Banco> ListarTabla() throws Exception {
    List<Banco> ListB;
    Banco b;   
    resulset = null;
    try {
      SentenciaSQL = "Select codigo,razonsocial,siglas from banco order by razonsocial";
        
      statement = BD.Conectar().createStatement();
      resulset = statement.executeQuery(SentenciaSQL);
      
      ListB = new ArrayList<>();
      while (resulset.next() == true) {
        b = new Banco();
        b.setCodigo(resulset.getString("codigo"));
        b.setRazonSocial(resulset.getString("razonsocial"));
        b.setSiglas(resulset.getString("siglas"));
        ListB.add(b);
      }
    } catch (Exception e) {
      throw e;
    }
    return ListB;
  }
//************LISTAR PARA MOSTRAR EN COMBO**************
    public List<Banco> listar() throws Exception {
    List<Banco> tipos = null;
    Banco b;
    resulset = null;
    
    
    try {
       SentenciaSQL = "SELECT B.codigo, B.siglas FROM banco B ORDER BY B.siglas";
        
      statement = BD.Conectar().createStatement();
      resulset = statement.executeQuery(SentenciaSQL);
        
      tipos = new ArrayList<Banco>();
      
      while (resulset.next() == true) {
        b = new Banco();
        b.setCodigo(resulset.getString("codigo"));        
        b.setSiglas(resulset.getString("siglas"));
        tipos.add(b);
      }
    } catch (Exception e) {
      throw e;
    }
    return tipos;
  }
    
}
