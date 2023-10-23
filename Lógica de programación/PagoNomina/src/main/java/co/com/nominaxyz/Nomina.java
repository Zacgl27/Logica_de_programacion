package co.com.nominaxyz;

public class Nomina extends Empleado{

    double cargo_salario;

    public Nomina(){

    }

    public Nomina(int idUsuario, String nombre, String apellido, String correo, String area, String cargo_nombre, double cargo_salario) {
        super(idUsuario, nombre, apellido, correo, area, cargo_nombre);
        this.cargo_salario = cargo_salario;
    }

    public double getCargo_salario() {
        return cargo_salario;
    }

    public void setCargo_salario(double cargo_salario) {
        this.cargo_salario = cargo_salario;
    }
}
