package AccesoDatos;

import Entidades.Personal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADPersonal {

    Conexion conex = new Conexion();

    public void agregar(Personal objPsnal) throws Exception {
        Statement st = null;
        String sql = null;
        try {
            sql = "INSERT INTO apoderado VALUES (  "
                    + objPsnal.getCodigo() + " , "
                    + objPsnal.isVigencia() + " , '"
                    + objPsnal.getCargo() + "' )";
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
    }

    public void modifcar(Personal objPsnal) throws Exception {
        Statement st;
        String sql;
        try {
            sql = "UPDATE personal SET "
                    + "   cargo = '" + objPsnal.getCargo()
                    + "' , vigencia = " + objPsnal.isVigencia()
                    + " WHERE codigo = " + objPsnal.getCodigo();
            st = conex.Conectar().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }
    }

    public Personal leer(Personal actual) throws Exception {
        Personal objPsnal = null;
        Statement st;
        ResultSet rs;
        String sql;

        try {
            sql = "SELECT P.apellidos, P.nombres, P.telefono, P.movil, P.correo, P.fechanacimiento, P.sexo, P.tipodocumento, P.numerodocumento, P.estadocivil, "
                    + " Psnal.cargo, Psnal.vigencia "
                    + " FROM persona P INNER JOIN personal Psnal ON P.codigo = " + actual.getCodigo() + " AND P.codigo = Psnal.codigo";
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);

            if (rs.next() == true) {
                objPsnal = new Personal();
                //Datos de Persona:
                objPsnal.setCodigo(actual.getCodigo());
                objPsnal.setApellidos(rs.getString("apellidos"));
                objPsnal.setNombres(rs.getString("nombres"));
                objPsnal.setFechaNacimiento(rs.getDate("fechanacimiento"));
                objPsnal.setSexo(rs.getString("sexo").charAt(0));
                objPsnal.setTipoDocumento(rs.getString("tipodocumento"));
                objPsnal.setNumeroDocumento(rs.getString("numerodocumento"));
                objPsnal.setEstadoCivil(rs.getString("estadocivil"));
                objPsnal.setTelefono(rs.getString("telefono"));
                objPsnal.setMovil(rs.getString("movil"));
                objPsnal.setCorreo(rs.getString("correo"));
                //Datos de Apoderado:
                objPsnal.setCargo(rs.getString("cargo"));
                objPsnal.setVigencia(rs.getBoolean("vigencia"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();;
            conex = null;
        }
        return objPsnal;
    }

    public List<Personal> listar() throws Exception {
        Personal psnal;
        Statement st = null;
        ResultSet rs = null;
        String sql = null;
        ArrayList<Personal> personal = null;

        try {
            sql = "SELECT P.codigo, P.nombres, P.apellidos, P.movil, P.correo, Psnal.cargo, Psnal.vigencia "
                    + " FROM persona P INNER JOIN personal Psnal ON P.codigo = Psnal.codigo "
                    + " ORDER BY P.apellidos, P.nombres";
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            personal = new ArrayList<>();

            while (rs.next() == true) {
                psnal = new Personal();

                psnal.setCodigo(rs.getInt("codigo"));
                psnal.setNombres(rs.getString("nombres"));
                psnal.setApellidos(rs.getString("apellidos"));
                psnal.setMovil(rs.getString("movil"));
                psnal.setCorreo(rs.getString("correo"));
                psnal.setCargo(rs.getString("cargo"));
                psnal.setVigencia(rs.getBoolean("vigencia"));
                personal.add(psnal);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            conex.Desconectar();
            conex = null;
        }

        return personal;
    }
}
