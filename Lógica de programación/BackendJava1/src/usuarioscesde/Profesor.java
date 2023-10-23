package usuarioscesde;

public class Profesor extends Academico {

    private String modulo;

    public Profesor(){

    }

    public Profesor(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, String escuela, String modulo) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono, escuela);
        this.modulo = modulo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Agregue la escuela: ");
        escuela = sc.next();
        System.out.println("Agregue el curso: ");
        modulo = sc.next();
    }

    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();
        System.out.println("Escuela: " + escuela + "\n" +
                "Curso: " + modulo + "\n");
    }
}
