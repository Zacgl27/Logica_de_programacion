package usuarioscesde;

import java.util.Scanner;

public class Programa {

    Scanner sc = new Scanner(System.in);

    private int idPrograma;
    private String nombrePrograma;
    private int duracionPrograma;
    private String registroGov;
    private String escuela;

    public Programa(){

    }

    public Programa(int idPrograma, String nombrePrograma, int duracionPrograma, String registroGov, String escuela) {
        this.idPrograma = idPrograma;
        this.nombrePrograma = nombrePrograma;
        this.duracionPrograma = duracionPrograma;
        this.registroGov = registroGov;
        this.escuela = escuela;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public int getDuracionPrograma() {
        return duracionPrograma;
    }

    public void setDuracionPrograma(int duracionPrograma) {
        this.duracionPrograma = duracionPrograma;
    }

    public String getRegistroGov() {
        return registroGov;
    }

    public void setRegistroGov(String registroGov) {
        this.registroGov = registroGov;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    //Métodos

    public void crearPrograma(){
        System.out.println("Ingrese el ID del programa: " + idPrograma);
        idPrograma = sc.nextInt();
        System.out.println("Ingrese el nombre del programa: " + nombrePrograma);
        nombrePrograma = sc.next();
        System.out.println("Ingrese la duración del programa en semestres: " + duracionPrograma);
        duracionPrograma = sc.nextInt();
        System.out.println("Ingrese el registro de secretaria de educación" + registroGov);
        registroGov = sc.next();
        System.out.println("Ingrese el nombre de la escuela: " + escuela);
        escuela = sc.next();
    }

    public void imprimirPrograma(){
        System.out.println("Id: " + idPrograma + "\n" +
                "Nombre: " + nombrePrograma + "\n" +
                "Duración: " + duracionPrograma + "\n" +
                "Registro Educación: " + registroGov + "\n" +
                "Escuela: " + escuela + "\n");
    }

}
