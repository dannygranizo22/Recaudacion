/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;


import Entidades.Recaudacion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Raul
 */
public class ADRecaudacion {
    
     Conexion conex = new Conexion();
     
     public boolean registrar(Recaudacion objRec) throws Exception{
        Boolean ok = false;
        String sql = null;
        Statement st;        
        try {

            sql = "INSERT INTO recaudacion(fechainicio,fechafinal,codigopersonal,codigocaja)"
                    + " VALUES (CURRENT_TIMESTAMP,CURRENT_TIMESTAMP," + objRec.getCodigoPersona() + "," + objRec.getCaja().getCodigo() + ")";
            
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
            ok = true;
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }

        return ok;
   }
     
        public Recaudacion leer(Recaudacion actual) throws Exception {
        Recaudacion objR = null;
        Statement st = null;
        ResultSet rs = null;
        String sql;
        try {
            sql = "SELECT codigo,fechainicio,fechafinal,codigopersonal,codigocaja FROM recaudacion"
                    + " WHERE codigopersonal = 82 ORDER BY codigo DESC LIMIT 1";
                        
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            
            if (rs.next() == true) {
                objR = new Recaudacion();
                objR.setCodigo(rs.getInt("codigo"));          
              
            }
        } catch (Exception e) {
            throw e;
        } finally {

            conex.Desconectar();
            conex = null;
        }
        return objR;
    }
     
     
      public boolean modificar(Recaudacion objRec) throws Exception {
        Boolean ok = false;
        Statement st = null;
        String sql = null;
        try {
            sql = "UPDATE recaudacion SET "
                    + " fechafinal = CURRENT_TIMESTAMP "
                    + "     WHERE codigo = " + objRec.getCodigo();
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
            ok = true;
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
        
        return ok;
    }
}
