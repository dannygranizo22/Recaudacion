package Entidades;

public class NivelEstudio {
    private String nombre;
    private String codigoModular;
    private String modalidad;
    private String resolucion;
    private String fecha;
    private boolean vigencia;

    public NivelEstudio(String nombre, String codigoModular, String modalidad, String resolucion, String fecha, boolean vigencia) {
        this.nombre = nombre;
        this.codigoModular = codigoModular;
        this.modalidad = modalidad;
        this.resolucion = resolucion;
        this.fecha = fecha;
        this.vigencia = vigencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoModular() {
        return codigoModular;
    }

    public void setCodigoModular(String codigoModular) {
        this.codigoModular = codigoModular;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    
}
