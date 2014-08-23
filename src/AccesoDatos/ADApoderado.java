package AccesoDatos;

import Entidades.Apoderado;
import Entidades.Persona;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ADApoderado {

    Conexion conex = new Conexion();
    
    public void agregar(Apoderado objA) throws Exception {
        Statement st = null;
        String sql = null;
        try {
            sql = "INSERT INTO apoderado VALUES (  " 
                    + objA.getCodigo() + " , "
                    + objA.isVive() + " , "
                    + objA.isViveConEstudiante() + " , '"
                    + objA.getCentroLaboral() + "' , '"
                    + objA.getProfesion() + "' , '"
                    + objA.getCargo() + "' )";
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
    }

    public void modifcar(Apoderado objA) throws Exception {
        Statement st;
        String sql;
        try {
            sql = "UPDATE apoderado SET " 
                    + "  centrolaboral = '" + objA.getCentroLaboral()
                    + "' , profesion = '" + objA.getProfesion()
                    + "' , cargo = '" + objA.getCargo()
                    + "' , vive = " + objA.isVive()
                    + " , viveconestudiante = " + objA.isViveConEstudiante()
                    + " WHERE codigo = " + objA.getCodigo();
            st= conex.Conectar().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            conex.Desconectar();
            conex = null;
        }
    }

    public Apoderado leer(Apoderado actual) throws Exception {
        Apoderado objAp = null;
        Statement st;
        ResultSet rs;
        String sql;
        
        try {
            sql = "SELECT P.apellidos, P.nombres, P.telefono, P.movil, P.correo, P.fechanacimiento, " + 
                    "     P.sexo, P.tipodocumento, P.numerodocumento, P.estadocivil, A.centrolaboral, A.profesion, A.cargo, " + 
                    "     A.vive, A.viveconestudiante " + 
                    " FROM persona P INNER JOIN apoderado A ON P.codigo = " + actual.getCodigo() + " AND P.codigo = A.codigo";
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            
            if(rs.next() == true){
                objAp = new Apoderado();
                //Datos de Persona:
                objAp.setCodigo(actual.getCodigo());
                objAp.setApellidos(rs.getString("apellidos"));
                objAp.setNombres(rs.getString("nombres"));
                objAp.setFechaNacimiento(rs.getDate("fechanacimiento"));
                objAp.setSexo(rs.getString("sexo").charAt(0));
                objAp.setTipoDocumento(rs.getString("tipodocumento"));
                objAp.setNumeroDocumento(rs.getString("numerodocumento"));
                objAp.setEstadoCivil(rs.getString("estadocivil"));
                objAp.setTelefono(rs.getString("telefono"));
                objAp.setMovil(rs.getString("movil"));
                objAp.setCorreo(rs.getString("correo"));
                //Datos de Apoderado:
                objAp.setCentroLaboral(rs.getString("centrolaboral"));
                objAp.setProfesion(rs.getString("profesion"));
                objAp.setCargo(rs.getString("cargo"));
                objAp.setVive(rs.getBoolean("vive"));
                objAp.setViveConEstudiante(rs.getBoolean("viveconestudiante"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();;
            conex = null;
        }
        
        return objAp;
    }
    
    public ArrayList<Apoderado> listar() throws Exception {
        Apoderado apod;
        Statement st = null;
        ResultSet rs = null;
        String sql = null;
        ArrayList<Apoderado> apoderados = null;
        
        try {
            sql = "SELECT P.codigo, P.nombres, P.apellidos, A.vive, A.viveconestudiante, A.centrolaboral, A.profesion, A.cargo "
                    + " FROM persona P INNER JOIN apoderado A ON P.codigo = A.codigo "
                    + " ORDER BY P.apellidos, P.nombres";
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            apoderados = new ArrayList<> ();
            
            while (rs.next() == true) {
                apod = new Apoderado();
                
                apod.setCodigo(rs.getInt("codigo"));
                apod.setNombres(rs.getString("nombres"));
                apod.setApellidos(rs.getString("apellidos"));
                apod.setVive(rs.getBoolean("vive"));
                apod.setViveConEstudiante(rs.getBoolean("viveconestudiante"));
                apod.setCentroLaboral(rs.getString("centrolaboral"));
                apod.setProfesion(rs.getString("profesion"));
                apod.setCargo(rs.getString("cargo"));
                apoderados.add(apod);
            }
        } catch (Exception e) {
            throw e;
        } finally {
//            if (rs != null && rs.isClosed() == false) {
//                rs.close();
//            }
//            rs = null;
//            st = null;
//            if (conex != null && conex.Conectar().isClosed() == false) {
//                conex.Desconectar();
//            }
//            conex = null;
            conex.Desconectar();
            conex = null;
        }
        
        return apoderados;
    }

   
}
