package usuarioscesde;

public class Academico extends Usuario{

    protected String escuela;

    public Academico(){

    }

    public Academico(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, String escuela) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }



}
