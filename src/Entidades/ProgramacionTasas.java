package Entidades;

public class ProgramacionTasas {
    private String nombre;
    private double monto;
    private String vencimiento;
    private char aplica;
    private int codigoTasaEducativa;
    private int codigoAnioEscolar;
    private int codigoNivelEstudio;

    public ProgramacionTasas(String nombre, double monto, String vencimiento, char aplica, int codigoTasaEducativa, int codigoAnioEscolar, int codigoNivelEstudio) {
        this.nombre = nombre;
        this.monto = monto;
        this.vencimiento = vencimiento;
        this.aplica = aplica;
        this.codigoTasaEducativa = codigoTasaEducativa;
        this.codigoAnioEscolar = codigoAnioEscolar;
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

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public char getAplica() {
        return aplica;
    }

    public void setAplica(char aplica) {
        this.aplica = aplica;
    }

    public int getCodigoTasaEducativa() {
        return codigoTasaEducativa;
    }

    public void setCodigoTasaEducativa(int codigoTasaEducativa) {
        this.codigoTasaEducativa = codigoTasaEducativa;
    }

    public int getCodigoAnioEscolar() {
        return codigoAnioEscolar;
    }

    public void setCodigoAnioEscolar(int codigoAnioEscolar) {
        this.codigoAnioEscolar = codigoAnioEscolar;
    }

    public int getCodigoNivelEstudio() {
        return codigoNivelEstudio;
    }

    public void setCodigoNivelEstudio(int codigoNivelEstudio) {
        this.codigoNivelEstudio = codigoNivelEstudio;
    }
    
}
