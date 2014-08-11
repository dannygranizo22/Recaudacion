package Entidades;

public class Caja {
    private String codigo;
    private int serie;
    private String nombre;
    private boolean vigencia;
    private Local local;

    public Caja(int serie, String nombre, boolean vigencia, Local local) {
       
        this.serie = serie;
        this.nombre = nombre;
        this.vigencia = vigencia;
        this.local = local;
    }
    
    public Caja () {}
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
}
