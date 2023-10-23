package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuario = new ArrayList<>();

        String id = "1";
        usuario.add(id); //Sirve para agregar datos a la lista
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        usuario.add(nombre);
        String correo = "pepita@mail.com";
        usuario.add(correo);
        String password = "1234";
        usuario.add(password);

        // Para medir el tamaño del el Arraylist size()

        System.out.println("El tamaño de la lista es:" + usuario.size());

        // Para obtener un elemento de la lista usamos el metodo get ()

        System.out.println("nombre:" +usuario.get(1)) ;

        //Actualizar un elemento de la lista

        usuario.set(3, "xyz123");

        // quitar un elemento de la lsita

        usuario.remove(2);

        //podemos buscar elemento en la lista

        int index = usuario.indexOf("Pepita");

        System.out.println(index);

        // Imprimir

        for(int i = 0; i< usuario.size(); i++){
            System.out.println("El dato " + i + " es: " + usuario.get(i));
        }



    }

}
