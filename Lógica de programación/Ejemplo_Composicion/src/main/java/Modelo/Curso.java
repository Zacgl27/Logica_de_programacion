package Modelo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Curso {
    Scanner sc = new Scanner(System.in);

    private int idCurso;
    private String nombreCurso;
    private int duracion;
    private String programa;

    public Curso(){

    }

    public Curso(String programa) {
        this.programa = programa;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void crearCurso(){
        System.out.println("Ingresa el id del curso: ");
        idCurso = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre del curso: ");
        nombreCurso = sc.nextLine();
        System.out.println("Ingrese la duracion del curso: ");
        duracion = sc.nextInt();
        System.out.println("Ingrese el programa al que pertenece: ");
        programa = sc.nextLine();
    }

    public void verCurso(){

        System.out.println("Id curso: " + idCurso + "\n" +
                "Nombre curso: " + nombreCurso + "\n" +
                "Duracion del curso: " + duracion + "\n" +
                "Programa: " + programa + "\n");

    }

    public void vertoString(){
        toString();
    }

}
