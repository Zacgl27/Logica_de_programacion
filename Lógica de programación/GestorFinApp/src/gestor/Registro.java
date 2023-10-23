package gestor;

import java.util.Scanner;

public class Registro {

    Usuario usuario = new Usuario();

    Scanner sc = new Scanner(System.in);

    double salary;
    double incomings;
    double bills;
    double saves;

    Usuario perfil;

    public void registerData(){

        System.out.println("Ingrese su nombre: ");
        perfil.name = sc.next();

        System.out.println("Ingrese su apellido: ");
        perfil.lastName = sc.next();

        System.out.println("Ingrese su correo: ");
        perfil.email = sc.next();

        System.out.println("Ingrese su salario: ");
        salary = sc.nextDouble();

        System.out.println("Ingrese sus rentas: ");
        incomings = sc.nextDouble();

        System.out.println("Ingrese sus gastos: ");
        bills = sc.nextDouble();

        System.out.println("Ingrese sus ahorros: ");
        saves = sc.nextDouble();

        System.out.println(salary);
        System.out.println(incomings);
        System.out.println(bills);
        System.out.println(saves);

    }

}
