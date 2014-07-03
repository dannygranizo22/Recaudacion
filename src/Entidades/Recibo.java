package Entidades;

public class Recibo {
    private int numero;
    private String registro; //fecha y hora || postgres: TIMESTAMP
    private String fecha; //fecha y hora || postgres: TIMESTAMP
    private boolean vigencia;
    private int codigoMedioDePago;
    private int codigoPersona;
    private int codigoRecaudacion;

    public Recibo(int numero, String registro, String fecha, boolean vigencia, int codigoMedioDePago, int codigoPersona, int codigoRecaudacion) {
        this.numero = numero;
        this.registro = registro;
        this.fecha = fecha;
        this.vigencia = vigencia;
        this.codigoMedioDePago = codigoMedioDePago;
        this.codigoPersona = codigoPersona;
        this.codigoRecaudacion = codigoRecaudacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
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

    public int getCodigoMedioDePago() {
        return codigoMedioDePago;
    }

    public void setCodigoMedioDePago(int codigoMedioDePago) {
        this.codigoMedioDePago = codigoMedioDePago;
    }

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public int getCodigoRecaudacion() {
        return codigoRecaudacion;
    }

    public void setCodigoRecaudacion(int codigoRecaudacion) {
        this.codigoRecaudacion = codigoRecaudacion;
    }
    
}
