package Entidades;

import java.sql.Date;

public class CuentaBancaria {
    private String codigo;
    private String numero;
    private Date fechaApertura;
    private String denominacion;
    private double montoInicial;
    private String codigoInterbancario;
    private boolean vigencia;
    private Banco banco;
    
    public String getCod(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

     public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public String getCodigoInterbancario() {
        return codigoInterbancario;
    }

    public void setCodigoInterbancario(String codigoInterbancario) {
        this.codigoInterbancario = codigoInterbancario;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco codigoBanco) {
        this.banco = codigoBanco;
    }
    
}
