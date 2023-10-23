package Modelo;

import java.util.Scanner;

public class Asignacion {
    Scanner sc = new Scanner(System.in);

    private int idAsignacion;
    private String fechaInicio;
    private String fechaFin;

    Curso curso;
    Profesor profesor;
    public Asignacion(){

    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void CrearAsignacion(){
        System.out.println("Ingrese el id de la asignacion: ");
        idAsignacion = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese la fecha de inicio: ");
        fechaInicio = sc.nextLine();
        System.out.println("Ingrese la fecha final");
        fechaFin = sc.nextLine();
    }

    public void verAsignacion(){
        System.out.println("Id asignacion: " + idAsignacion + "\n" +
                "Fecha de inicio: " + fechaInicio + "\n" +
                "Fecha fin: " + fechaFin + "\n" +
                "Nombre del curso: " + curso.getNombreCurso() + "\n" +
                "Nombre del profesor: " + profesor.getNombre() + "\n" +
                "Apellido del profesor" + profesor.getApellido() + "\n");
    }

}
