package Entidades;

public class Banco {
    private String codigo;
    private String razonSocial;
    private String siglas;
    private boolean vigencia;

    public Banco(String razonSocial, String siglas, boolean vigencia) {
        this.razonSocial = razonSocial;
        this.siglas = siglas;
        this.vigencia = vigencia;
    }
    
    public Banco(){}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    
}
