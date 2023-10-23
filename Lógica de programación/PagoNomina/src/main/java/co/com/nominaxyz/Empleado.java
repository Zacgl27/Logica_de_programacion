package co.com.nominaxyz;

public class Empleado extends Usuario{

    String area;
    String cargo_nombre;

    public Empleado(){

    }

    public Empleado(int idUsuario, String nombre, String apellido, String correo, String area, String cargo_nombre) {
        super(idUsuario, nombre, apellido, correo);
        this.area = area;
        this.cargo_nombre = cargo_nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo_nombre() {
        return cargo_nombre;
    }

    public void setCargo_nombre(String cargo_nombre) {
        this.cargo_nombre = cargo_nombre;
    }
}
