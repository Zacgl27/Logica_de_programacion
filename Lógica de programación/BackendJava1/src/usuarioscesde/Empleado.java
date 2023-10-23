package usuarioscesde;

public class Empleado extends Usuario{

    private double salario;
    private String area;

    public Empleado(){

    }

    public Empleado(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, double salario, String area) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono);
        this.salario = salario;
        this.area = area;
    }

    //Getter and Setter

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area){

    }

    //Métodos


    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Ingrese el salario base: ");
        salario = sc.nextDouble();
        System.out.println("Ingrese el area: ");
        area = sc.next();
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


