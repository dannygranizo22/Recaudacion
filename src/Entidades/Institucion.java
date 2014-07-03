package Entidades;

import java.sql.Date;

public class Institucion {
    private int Codigo;
    private String nombre;
    private String resolucion;
    private Date fechaDeCreacion;
    private String direccion;
    private String telefono;
    private String movil;
    private String correo;
    private String dniPromotor;
    private String dniDirector;
    private String promotor;
    private String director;
    private int capacidad;
    
    public Institucion(){
        
    }
    
    public Institucion(String nombre, String resolucion, Date fechaDeCreacion, String direccion, String telefono, String movil, String correo, String dniPromotor, String dniDirector, String promotor, String director, int capacidad) {
        this.nombre = nombre;
        this.resolucion = resolucion;
        this.fechaDeCreacion = fechaDeCreacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.movil = movil;
        this.correo = correo;
        this.dniPromotor = dniPromotor;
        this.dniDirector = dniDirector;
        this.promotor = promotor;
        this.director = director;
        this.capacidad = capacidad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
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

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDniPromotor() {
        return dniPromotor;
    }

    public void setDniPromotor(String dniPromotor) {
        this.dniPromotor = dniPromotor;
    }

    public String getDniDirector() {
        return dniDirector;
    }

    public void setDniDirector(String dniDirector) {
        this.dniDirector = dniDirector;
    }

    public String getPromotor() {
        return promotor;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
