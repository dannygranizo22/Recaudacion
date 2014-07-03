package Entidades;

public class Local {
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private boolean vigencia;    
    private Institucion institucion;
    private String tipoAsistencia;

    public Local(String nombre, String direccion, String telefono, boolean vigencia, Institucion institucion, String tipoAsistencia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vigencia = vigencia;
        this.institucion = institucion;
        this.tipoAsistencia = tipoAsistencia;
    }
    
    public Local(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(String tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }
    
}
