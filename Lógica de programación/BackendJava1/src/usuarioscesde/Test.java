package usuarioscesde;

public class Test {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        //Hemos creado una instancia de Usuario
        Usuario usuarioPepito = new Usuario();
        Usuario nicolas = new Usuario();
/*
        String nombre = "Nicolás";
        nicolas.setNombre(nombre);

        String correo = "pirata@mail.com";
        nicolas.setCorreo(correo);

        System.out.println(nicolas.getNombre());*/

        /*nicolas.registrarUsuario();
        System.out.println(nicolas.toString());
        nicolas.iniciarSesion();

        Estudiante estudiante = new Estudiante();

        System.out.println(estudiante.getNombre());

        Empleado empleado = new Empleado();

        empleado.setNombre("Maria");

        System.out.println(empleado.getNombre());

        Usuario estSoftware = new Estudiante();
        Usuario empProfesor = new Empleado();

        estudiante.registrarUsuario();

        estudiante.registrarUsuario();
        estudiante.toString();
        estudiante.iniciarSesion();*/

        //Estamos creando un objeto
        Profesor profePepito = new Profesor();
        profePepito.registrarUsuario();
        profePepito.imprimirUsuario();
        profePepito.iniciarSesion();


    }

}
