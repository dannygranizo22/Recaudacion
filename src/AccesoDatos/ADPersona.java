package AccesoDatos;

import Entidades.Persona;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADPersona {

    Conexion conex = new Conexion();
//    String SentenciaSQL;

    public boolean agregar(Persona objP) throws Exception {
        Boolean ok = false;
        String sql = null;
        CallableStatement cs = null;
        Statement st;
        try {
            sql = "INSERT INTO persona( apellidos, nombres, fechanacimiento, sexo, tipodocumento, "
                    + " numerodocumento, estadocivil, telefono, movil, correo) VALUES(  '"
                    + objP.getApellidos() + "' , '"
                    + objP.getNombres() + "' , '"
                    + objP.getFechaNacimiento() + "' , '"
                    + objP.getSexo() + "' , '"
                    + objP.getTipoDocumento() + "' , '"
                    + objP.getNumeroDocumento() + "' , '"
                    + objP.getEstadoCivil() + "' , '"
                    + objP.getTelefono() + "' , '"
                    + objP.getMovil() + "' , '"
                    + objP.getCorreo() + "' )";
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);

//            cs = conex.Conectar().prepareCall("{ call fu_iPersona (?,?,?,?,?,?,?,?,?,?) }");
//            cs.setString(1, objP.getApellidos());
//            cs.setString(2, objP.getNombres());
//            cs.setDate(3, objP.getFechaNacimiento());
//            //cs.setCharacterStream(4, objP.getSexo());
//            cs.setString(5, objP.getTipoDocumento());
//            cs.setString(6, objP.getNumeroDocumento());
//            //cs.setsetChar(7, objP.getEstadoCivil());
//            cs.setString(8, objP.getTelefono());
//            cs.setString(9, objP.getMovil());
//            cs.setString(10, objP.getCorreo());
//            
//            cs.executeUpdate();
            ok = true;
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
        return ok;
    }

    public List<Persona> listar() throws Exception {
        List<Persona> personas = null;
        Persona objP;
        Statement st = null;
        ResultSet rs = null;
        String sql = null;
        try {
            sql = "SELECT codigo, apellidos, nombres, telefono, movil, correo FROM persona ORDER BY apellidos, nombres";
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            personas = new ArrayList<Persona>();
            while (rs.next() == true) {
                objP = new Persona();
                objP.setCodigo(rs.getInt("codigo"));
                objP.setApellidos(rs.getString("apellidos"));
                objP.setNombres(rs.getString("nombres"));
                objP.setTelefono(rs.getString("telefono"));
                objP.setMovil(rs.getString("movil"));
                objP.setCorreo(rs.getString("correo"));
                personas.add(objP);

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
        return personas;
    }

    public Persona leer(Persona actual) throws Exception {
        Persona objP = null;
        Statement st = null;
        ResultSet rs = null;
        String sql;
        try {
            sql = "SELECT apellidos, nombres, telefono, movil, correo, fechanacimiento, sexo, tipodocumento, numerodocumento, estadocivil  FROM persona "
                    + "WHERE codigo= " + actual.getCodigo();
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                objP = new Persona();
                objP.setCodigo(actual.getCodigo());
                objP.setApellidos(rs.getString("apellidos"));
                objP.setNombres(rs.getString("nombres"));
                objP.setFechaNacimiento(rs.getDate("fechanacimiento"));
                //objP.setSexo(rs.getCharacterStream("sexo"));
                objP.setTipoDocumento(rs.getString("tipodocumento"));
                objP.setNumeroDocumento(rs.getString("numerodocumento"));
                //objP.setEstadoCivil(rs.getCharacterStream("estadocivil"));
                objP.setTelefono(rs.getString("telefono"));
                objP.setMovil(rs.getString("movil"));
                objP.setCorreo(rs.getString("correo"));
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
        return objP;
    }

    public void modificar(Persona objP) throws Exception {
        Statement st = null;
        String sql = null;

        try {
            sql = "UPDATE persona SET "
                    + " apellidos = '" + objP.getApellidos() + "', "
                    + " nombres = '" + objP.getNombres()+ "', "
                    + " fechanacimiento = '" + objP.getFechaNacimiento()+ "', "
                    + " sexo = '" + objP.getSexo()+ "', "
                    + " tipodocumento = '" + objP.getTipoDocumento()+ "', "
                    + " numerodocumento = '" + objP.getNumeroDocumento()+ "', "
                    + " estadocivil = '" + objP.getEstadoCivil()+ "', "
                    + " telefono = '" + objP.getTelefono()+ "', "
                    + " movil = '" + objP.getMovil()+ "', "
                    + " correo = '" + objP.getCorreo()+ "' " 
                    + "     WHERE codigo = " + objP.getCodigo();
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
    }
}
