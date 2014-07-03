package Entidades;

public class TasaEducativa {
    private String nombre;
    private double monto;
    private boolean vigencia;
    private int codigoNivelEstudio;

    public TasaEducativa(String nombre, double monto, boolean vigencia, int codigoNivelEstudio) {
        this.nombre = nombre;
        this.monto = monto;
        this.vigencia = vigencia;
        this.codigoNivelEstudio = codigoNivelEstudio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public int getCodigoNivelEstudio() {
        return codigoNivelEstudio;
    }

    public void setCodigoNivelEstudio(int codigoNivelEstudio) {
        this.codigoNivelEstudio = codigoNivelEstudio;
    }
    
}
