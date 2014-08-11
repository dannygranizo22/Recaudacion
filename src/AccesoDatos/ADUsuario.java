/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Persona;
import Entidades.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;


public class ADUsuario {
    Conexion conex = new Conexion();
    
    
    public Usuario identificar(Usuario user) throws Exception{
        Usuario us = null;
        Statement st = null;
        ResultSet rs = null;
        String sql;
        
        sql = "SELECT U.codigo, P.apellidos, P.nombres FROM Usuario U JOIN Persona P"
               + " ON P.codigo = U.codigopersona"
               + " WHERE U.vigencia = TRUE"
               + " AND U.nombre = '" + user.getNombre()
               + "' AND U.clave = '" + user.getClave() + "'";
        
        try {
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                us = new Usuario();
                us.setCodigo(rs.getInt("codigo"));
                us.setPersona(new Persona());
                us.getPersona().setApellidos(rs.getString("apellidos"));
                us.getPersona().setNombres(rs.getString("nombres"));
              
            }
        } catch (Exception e) {
             throw e;
        }finally{
            conex.Desconectar();
            conex = null;
        }
        
        return us;
       
    }
}
