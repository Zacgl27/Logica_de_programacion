package principiospoo;

import java.util.Scanner;

public class Padre {

    Scanner sc = new Scanner(System.in);

    int idPadre;
    private String nombrePadre;
    int edadPadre;

    //Getter and Setter

    public void setNombrePadre(String nombrePadreQueRecibeDato){
        this.nombrePadre = nombrePadreQueRecibeDato;
    }

    public String getNombrePadre (){
        return this.nombrePadre;
    }

    //Método

    public void crearPadre(){

        System.out.println("Dé un nombre al padre: ");
        nombrePadre = sc.next();

    }

}
