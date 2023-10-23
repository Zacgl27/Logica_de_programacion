package usuarioscesde;

import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);

    //Primero creamos los atributos encapsulados con private

    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contraseña;
    protected String direccion;
    protected String telefono;

    //Vamos a crear nuestro método constructor vacio

    public Usuario(){

    }

    public Usuario(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Construimos los Getter and Setter para permitir el acceso desde los métodos a las variables privadas

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    //Métodos

    public void registrarUsuario(){

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

    }

    public void imprimirUsuario() {
        System.out.println(
                "sc=" + sc + '\n' +
                        ", id=" + id + '\n' +
                        ", nombre='" + nombre + '\n' +
                        ", apellido='" + apellido + '\n' +
                        ", correo='" + correo + '\n' +
                        ", contraseña='" + contraseña + '\n' +
                        ", direccion='" + direccion + '\n' +
                        ", telefono='" + telefono + '\n' +
                        '}');
    }


    public void iniciarSesion(){
        System.out.println("Ingrese el correo registrado: ");
        String correoRegistrado = sc.next();

        System.out.println("Ingrese la contraseña registrada: ");
        String contraseñaRegistrada = sc.next();

        if(contraseña.equals(contraseñaRegistrada)&&correo.equals(correoRegistrado)){
            System.out.println("Bienvenido " + nombre);
        }else{
            System.out.println("Correo o contraseña invalidos, ingrese los datos registrados");
        }

    }
}
