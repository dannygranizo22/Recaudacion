package AccesoDatos;

import Entidades.Caja;
import Entidades.Local;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADCaja {
    Conexion conex = new Conexion();

    public List<Caja> listar() throws Exception {
        List<Caja> cajas = null;
        Caja objC;
        Statement st = null;
        ResultSet rs = null;
        String sql = null;
        try {
            sql = "SELECT C.codigo, C.nombre, C.vigencia, L.nombre AS nombLocal FROM caja C INNER JOIN local L ON L.codigo = C.codigolocal ORDER BY nombre";
            st = conex.Conectar().createStatement();
            rs = st.executeQuery(sql);
            cajas = new ArrayList<Caja>();
            while (rs.next() == true) {
                objC = new Caja();
                objC.setCodigo(rs.getString("codigo"));
                objC.setNombre(rs.getString("nombre"));
                objC.setVigencia(rs.getBoolean("vigencia"));
                objC.setLocal(new Local());
                objC.getLocal().setNombre(rs.getString("nombLocal"));
                cajas.add(objC);
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
        return cajas;
    }
}
