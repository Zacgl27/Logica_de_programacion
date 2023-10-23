package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Favorite {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        question();

    }

    public static void question(){

        System.out.println("Desea iniciar el programa? (s/n): ");
        String answerUser = sc.nextLine();

        switch(answerUser){

            case "s":
                System.out.println("Perfecto, empecemos");
                program();
                break;

            case "n":
                System.out.println("Hasta luego!");
                question();
                break;

            default:
                System.out.println("Ingrese una opcion vallida");

        }

    }

    public static void program(){

        ArrayList<String> things = new ArrayList<>();
        Scanner sc2 = new Scanner (System.in);

        boolean continuar = true;
        int contador = 1;

        while(continuar){

            System.out.print(" \n Ingrese una cosa favorita: ");
            String thing = sc2.nextLine();
            things.add(thing);

            System.out.print(" \n ¿Desea agregar otra cosa favorita? (s/n): ");
            String answer = sc2.nextLine();

            if (answer.equalsIgnoreCase("n")) {
                continuar = false;
            }

            contador++;

        }

        System.out.println(" \n Listado de cosas: ");

        for (int i = 0; i < things.size(); i++) {
            System.out.println("Nombre " + (i + 1) + ": " + things.get(i));
        }

        System.out.println(" \n Desea salir del programa? (s/n): ");
        String exit = sc2.nextLine();

        switch(exit){
            case "s":
                System.out.println(" \n Hasta luego!");
                question();
                break;

            case "n":
                program();
                break;

            default:
                System.out.println(" \n Ingresa una opcion valida");
        }

    }

}
