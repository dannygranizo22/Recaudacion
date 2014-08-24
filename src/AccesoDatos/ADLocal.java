package AccesoDatos;

import Entidades.Institucion;
import Entidades.Local;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADLocal {

    Conexion conex = new Conexion();

    public void agregar(Local objL) throws Exception {

        String sql = null;
        Statement st = null;
        try {
            sql = "INSERT INTO local( nombre, direccion, telefono, vigencia, codigoinstitucion, tipoasistencia) "
                    + " VALUES ( '"
                    + objL.getNombre() + "', '"
                    + objL.getDireccion() + "', '"
                    + objL.getTelefono() + "' , "
                    + objL.isVigencia() + ", "
                    + objL.getInstitucion().getCodigo() + ", '"
                    + objL.getTipoAsistencia() + "' )";
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
    }

    public void modificar(Local objL) throws Exception {
        String sql = null;
        Statement st = null;
        try {
            sql = "UPDATE local SET "
                    + " nombre = '" + objL.getNombre() + "', '"
                    + " direccion = '" + objL.getDireccion() + "', '"
                    + " telefono = '" + objL.getTelefono() + "' , "
                    + " vigencia = " + objL.isVigencia() + ", "
                    + " codigoinstitucion = " + objL.getInstitucion().getCodigo() + ", '"
                    + " tipoasistencia = '" + objL.getTipoAsistencia() + "' ";
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
    }

    public List<Local> listar() throws Exception {
        List<Local> locales = null;
        Local objL;
        Statement st = null;
        ResultSet rs = null;
        String sql = null;
        try {
            sql = "SELECT L.codigo, L.nombre, L.direccion, L.telefono, I.codigo AS codInst, I.nombre AS nombInstit, L.vigencia FROM local L JOIN institucion I ON L.codigoinstitucion = I.codigo";
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            locales = new ArrayList<Local>();
            while (rs.next() == true) {
                objL = new Local();
                objL.setCodigo(rs.getInt("codigo"));
                objL.setNombre(rs.getString("nombre"));
                objL.setDireccion(rs.getString("direccion"));
                objL.setTelefono(rs.getString("telefono"));
                objL.setInstitucion(new Institucion());
                objL.getInstitucion().setCodigo(rs.getInt("codInst"));
                objL.getInstitucion().setNombre(rs.getString("nombInstit"));
                objL.setVigencia(rs.getBoolean("vigencia"));
                locales.add(objL);

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
        return locales;
    }

    public Local leer(Local actual) throws Exception {
        Local objL = null;
        Statement st = null;
        ResultSet rs = null;
        String sql;
        try {
            sql = "SELECT L.nombre, L.direccion, L.telefono, I.codigo, I.nombre AS nombInstit, L.tipoasistencia, L.vigencia FROM local L JOIN institucion I ON L.codigoinstitucion = I.codigo"
                    + " WHERE L.codigo = " + actual.getCodigo();
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                objL = new Local();
                objL.setCodigo(actual.getCodigo());
                objL.setNombre(rs.getString("nombre"));
                objL.setDireccion(rs.getString("direccion"));
                objL.setTelefono(rs.getString("telefono"));
                objL.setInstitucion(new Institucion());
                objL.getInstitucion().setCodigo(rs.getInt("codigo"));
                objL.getInstitucion().setNombre(rs.getString("nombInstit"));
                objL.setTipoAsistencia(rs.getString("tipoasistencia"));
                objL.setVigencia(rs.getBoolean("vigencia"));
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
        return objL;
    }
}
