package Entidades;

public class Personal 
        extends Persona{
    
    private String cargo;
    private boolean vigencia;

    public Personal(String cargo, boolean vigencia) {
        this.cargo = cargo;
        this.vigencia = vigencia;
    }
    
    public Personal(){}
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    
}
