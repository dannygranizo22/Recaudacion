package Entidades;

public class Apoderado
        extends Persona {

    private boolean vive;
    private boolean viveConEstudiante;
    private String centroLaboral;
    private String profesion;
    private String cargo;

    public Apoderado(boolean vive, boolean viveConEstudiante, String centroLaboral, String profesion, String cargo) {
        this.vive = vive;
        this.viveConEstudiante = viveConEstudiante;
        this.centroLaboral = centroLaboral;
        this.profesion = profesion;
        this.cargo = cargo;
    }

    public Apoderado() {
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isViveConEstudiante() {
        return viveConEstudiante;
    }

    public void setViveConEstudiante(boolean viveConEstudiante) {
        this.viveConEstudiante = viveConEstudiante;
    }

    public String getCentroLaboral() {
        return centroLaboral;
    }

    public void setCentroLaboral(String centroLaboral) {
        this.centroLaboral = centroLaboral;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
