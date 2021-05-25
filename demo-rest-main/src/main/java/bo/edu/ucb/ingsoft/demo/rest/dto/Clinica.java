package bo.edu.ucb.ingsoft.demo.rest.dto;

public class Clinica {
    private Integer personaId;
    private String nombre;
    private String apellido;
    private String nroSS;

    public Clinica() {
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroSS() {
        return nroSS;
    }

    public void setNroSS(String nroSS) {
        this.nroSS = nroSS;
    }
}
