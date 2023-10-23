package ApuntesJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListaDeListas {

    public static void main(String[] args) {

        List<List<String>> usuarios = new ArrayList<>();

        ArrayList<String> usuario1 = new ArrayList<>();

        ArrayList<String> usuario2 = new ArrayList<>();

        usuario1.add("Maria");
        usuario1.add("12");
        usuario1.add("maria@mail.com");

        usuario2.add("Pepito");
        usuario2.add("15");
        usuario2.add("pepito@mail.com");

        for(int i = 0; i < usuario1.size(); i++){
            System.out.println(usuario1.get(i));
        }

        for(int i = 0; i < usuario2.size(); i++){
            System.out.println(usuario2.get(i));
        }

        //Podemos hacer busquedas dentro de los Arrays

        System.out.println(usuario1.indexOf("12"));

        int resp = usuario1.lastIndexOf("maria@mail.com");
        if(resp!=-1){
            System.out.println("Usuario encontrado");
            System.out.println("La opción es " + usuario1.indexOf("maria@mail.com"));
        }else{
            System.out.println("Usuario no encontrado");
        }

        //Vamos a adicionar los arrayList a la listas de listas

        usuarios.add(usuario1);
        usuarios.add(usuario2);

        int positionList = usuarios.indexOf(usuario2);
        System.out.println(positionList);

        for (List<String> usuario: usuarios){
            for (String dato: usuario){
                System.out.println("Dato: " + dato);
            }
            System.out.println("\n");
        }

        Scanner sc = new Scanner(System.in);
        ArrayList usuario3 = new ArrayList<>();

        System.out.println("Desea agregar un nuevo usuario (s/n) : ");
        String answer = sc.next();

        for(int i = 0; i < 3; i++){
            System.out.println("Ingrese el dato: ");
            String dato2 = sc.next();
            usuario3.add(dato2);
        }

        usuarios.add(usuario3);

    }

}
