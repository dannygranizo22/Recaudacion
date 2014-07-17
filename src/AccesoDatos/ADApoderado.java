package AccesoDatos;

import Entidades.Apoderado;
import Entidades.Persona;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ADApoderado {

    Conexion conex = new Conexion();

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
