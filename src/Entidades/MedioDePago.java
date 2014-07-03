package Entidades;

public class MedioDePago {
    private String tipo;
    private String fechaCobranza;
    private String numero;
    private String monto;
    private int codigoCuentaBancaria;

    public MedioDePago(String tipo, String fechaCobranza, String numero, String monto, int codigoCuentaBancaria) {
        this.tipo = tipo;
        this.fechaCobranza = fechaCobranza;
        this.numero = numero;
        this.monto = monto;
        this.codigoCuentaBancaria = codigoCuentaBancaria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaCobranza() {
        return fechaCobranza;
    }

    public void setFechaCobranza(String fechaCobranza) {
        this.fechaCobranza = fechaCobranza;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public int getCodigoCuentaBancaria() {
        return codigoCuentaBancaria;
    }

    public void setCodigoCuentaBancaria(int codigoCuentaBancaria) {
        this.codigoCuentaBancaria = codigoCuentaBancaria;
    }
    
}
