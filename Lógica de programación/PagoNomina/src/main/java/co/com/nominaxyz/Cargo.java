package co.com.nominaxyz;

public class Cargo extends Empleado{

    int idCargo;
    String nombre_cargo;
    double salario;

    public Cargo(){

    }

    public Cargo(int idUsuario, String nombre, String apellido, String correo, String area, String cargo_nombre, int idCargo, String nombre_cargo, double salario) {
        super(idUsuario, nombre, apellido, correo, area, cargo_nombre);
        this.idCargo = idCargo;
        this.nombre_cargo = nombre_cargo;
        this.salario = salario;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
