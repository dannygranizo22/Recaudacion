package AccesoDatos;

import Entidades.Institucion;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADInstitucion {

    Conexion conex = new Conexion();

    public List<Institucion> listar() throws Exception {
        List<Institucion> instituciones = null;
        Institucion objI;
        Statement st = null;
        ResultSet rs = null;
        String sql = null;
        try {
            sql = "SELECT codigo, nombre, direccion, telefono, movil, correo, director FROM institucion ORDER BY nombre";
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            instituciones = new ArrayList<Institucion>();
            while (rs.next() == true) {
                objI = new Institucion();
                objI.setCodigo(rs.getInt("codigo"));
                objI.setNombre(rs.getString("nombre"));
                objI.setDireccion(rs.getString("direccion"));
                objI.setTelefono(rs.getString("telefono"));
                objI.setMovil(rs.getString("movil"));
                objI.setCorreo(rs.getString("correo"));
                objI.setDirector(rs.getString("director"));
                instituciones.add(objI);
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
        return instituciones;
    }

    public void agregar(Institucion objI) throws Exception {
        String sql = null;
        Statement st;
        try {
            sql = "INSERT INTO institucion( nombre, resolucion, fechacreacion, direccion, telefono, "
                    + " movil, correo, dnipromotor, dnidirector, promotor, director, capacidad) VALUES ( '"
                    + objI.getNombre() + "' , '"
                    + objI.getResolucion() + "', '"
                    + objI.getFechaDeCreacion() + "', '"
                    + objI.getDireccion() + "', '"
                    + objI.getTelefono() + "', '"
                    + objI.getMovil() + "', '"
                    + objI.getCorreo() + "', '"
                    + objI.getDniPromotor() + "', '"
                    + objI.getDniDirector() + "', '"
                    + objI.getPromotor() + "', '"
                    + objI.getDirector() + "', '"
                    + objI.getCapacidad() + "')";
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
    }

    public Institucion leer(Institucion actual) throws Exception {
        Institucion objI = null;
        Statement st = null;
        ResultSet rs = null;
        String sql;
        try {
            sql = "SELECT nombre, resolucion, fechacreacion, direccion, director, dnidirector, promotor, dnipromotor, telefono, movil, correo, capacidad  FROM institucion "
                    + "WHERE codigo= " + actual.getCodigo();
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                objI = new Institucion();
                objI.setCodigo(actual.getCodigo());
                objI.setNombre(rs.getString("nombre"));
                objI.setResolucion(rs.getString("resolucion"));
                objI.setFechaDeCreacion(rs.getDate("fechacreacion"));
                objI.setDireccion(rs.getString("direccion"));
                objI.setDirector(rs.getString("director"));
                objI.setDniDirector(rs.getString("dnidirector"));
                objI.setPromotor(rs.getString("promotor"));
                objI.setDniPromotor(rs.getString("dnipromotor"));
                objI.setTelefono(rs.getString("telefono"));
                objI.setMovil(rs.getString("movil"));
                objI.setCorreo(rs.getString("correo"));
                objI.setCapacidad(rs.getInt("capacidad"));
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
        return objI;
    }

    public void modificar(Institucion objI) throws Exception {
        Statement st = null;
        String sql = null;

        try {
            sql = "UPDATE institucion SET "
                    + " nombre = '" + objI.getNombre() + "', "
                    + " resolucion = '" + objI.getResolucion() + "', "
                    + " fechacreacion = '" + objI.getFechaDeCreacion()+ "', "
                    + " direccion = '" + objI.getDireccion()+ "', "
                    + " telefono = '" + objI.getTelefono()+ "', "
                    + " movil = '" + objI.getMovil()+ "', "
                    + " correo = '" + objI.getCorreo()+ "', "
                    + " dnipromotor = '" + objI.getDniPromotor()+ "', "
                    + " dnidirector = '" + objI.getDniDirector()+ "', "
                    + " promotor = '" + objI.getPromotor()+ "', "
                    + " director = '" + objI.getDirector()+ "', "
                    + " capacidad = " + objI.getCapacidad()+ " " 
                    + "     WHERE codigo = " + objI.getCodigo();
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
