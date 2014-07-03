package Entidades;

public class Recaudacion {
    private String fechaIncio;
    private String fechaFinal;
    private int codigoPersona;
    private int codigoCaja;

    public Recaudacion(String fechaIncio, String fechaFinal, int codigoPersona, int codigoCaja) {
        this.fechaIncio = fechaIncio;
        this.fechaFinal = fechaFinal;
        this.codigoPersona = codigoPersona;
        this.codigoCaja = codigoCaja;
    }

    public String getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(String fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public int getCodigoCaja() {
        return codigoCaja;
    }

    public void setCodigoCaja(int codigoCaja) {
        this.codigoCaja = codigoCaja;
    }
    
}
