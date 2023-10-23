package trabajos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngresoEgreso {

    static Scanner sc = new Scanner (System.in);
    static ArrayList<String> usuario = new ArrayList<>();
    static int total = 0;
    static int total2 = 0;

    static List<List<Integer>> ingreso = new ArrayList<>();




    public static void main(String[] args) {

    menu();

    }

    //metodo para menu
    public static void menu(){
        ingreso.add(new ArrayList<Integer>());
        boolean exit = true;
        System.out.println("----------- BIENVENIDO -----------");

        System.out.println("Seleccione opciones: ");
        System.out.println("ingreso");

        String answer = sc.next();

        while(exit){
            switch (answer){
                case "ingreso":
                    program(ingreso.get(0), total);
                    String respu = "";

                    do{
                        System.out.println("¿Desea seguir ingresando? ");
                        respu = sc.next();
                        if(respu.equalsIgnoreCase("s")){

                            System.out.println("Desea seguir registrando ingresos en la lista anteriormente modificada o " +
                                    "desea crear una nueva? Ingrese 'n' para una lista nueva o ingrese 'c' para " +
                                    "continuar con la lista anterior: ");
                            String ask = sc.next();
                            if (ask.equals("c")){
                                program(ingreso.get(0), total);
                            } else if (ask.equals("n")) {
                                ingreso.add(new ArrayList<Integer>());
                                program(ingreso.get(1), total2);
                            }else{
                                System.out.println("Ingrese una opcion valida");
                            }

                        } else{
                            System.out.println("Fin de ingresos");
                        }
                    }while (respu.equalsIgnoreCase("s"));

                    exit = true;
                    break;






                case "salir":
                    System.out.println("------------ ADIOS ------------");
                    exit = false;
            }
        }
    }

    public static void program(List lista, int total){


        System.out.println("Si desea seguir sumando ingrese 'true'");
        boolean continuar1 = sc.nextBoolean();

        while (continuar1){


            Scanner sc2 = new Scanner (System.in);



            int contador = 1;


            do{
                System.out.println("Digite el ingreso: ");
                int thing = sc2.nextInt();
                total += thing;
                lista.add(thing);

                System.out.println("Total actual " + total);
                System.out.println("¿Desea continuar sumando? (s/n): ");
                String continuar = sc2.next();

                if (!continuar.equalsIgnoreCase("s")){
                    continuar1 = false;
                    break;
                }

            }while(true);



            System.out.println(" \n Listado de ingresos: ");

            for (int i = 0; i < ingreso.size(); i++) {
                System.out.println("Ingreso " + (i + 1) + ": " + ingreso.get(i));
            }



        }

    }

}
