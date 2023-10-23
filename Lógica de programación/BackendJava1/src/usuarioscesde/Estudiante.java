package usuarioscesde;

public class Estudiante extends Academico{

    //Atributos
    private String programa;

    //Constructores
    public Estudiante(){

    }

    public Estudiante(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, String escuela, String programa) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono, escuela);
        this.programa = programa;
    }

    //Getter and Setter

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    //métodos


    @Override
    public void registrarUsuario() {

        System.out.println("Soy el de estudiante");
        System.out.println("Soy el de usuario");

        System.out.println("Ingrese su ID: ");
        this.id = sc.nextInt();
        //This es un operador que hace referenciaa un atributo de la clase
        sc.skip("\n");

        System.out.println("Ingrese su nombre: ");
        this.nombre = sc.next();

        System.out.println("Ingrese su apellido: ");
        this.apellido = sc.next();

        System.out.println("Ingrese su correo: ");
        this.correo = sc.next();

        System.out.println("Ingrese su contraseña: ");
        this.contraseña = sc.next();

        System.out.println("Ingrese su dirección: ");
        this.direccion = sc.next();

        System.out.println("Ingrese su telefono: ");
        this.telefono = sc.next();

        System.out.println("Indique el programa de su interés");
        this.programa = sc.next();
    }

    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
    }
}
