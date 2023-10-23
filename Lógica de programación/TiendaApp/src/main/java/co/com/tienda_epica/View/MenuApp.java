package co.com.tienda_epica.View;

import co.com.tienda_epica.Service.ProductoService;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    public void menuProducto(){
        System.out.println("Precione 1 para iniciar: ");
        int init = sc.nextInt();

        while(init!=0){
            System.out.println("1. Registrar producto \n" +
                    "2. Listar productos \n" +
                    "3. Modificar Producto \n" +
                    "4. Eliminar producto \n" +
                    "5. Salir");
            int opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Registra tu producto: ");
                    ProductoService.crearProducto();
                    break;

                case 2:
                    System.out.println("Lista tus productos: ");
                    ProductoService.listarProducto();
                    break;

                case 3:
                    System.out.println("Modifica tus productos: ");
                    ProductoService.modificarProducto();
                    break;

                case 4:
                    System.out.println("Elimina tus productos: ");
                    ProductoService.eliminarProducto();
                    break;

                case 5:
                    System.out.println("Salir");
                    init = 0;

                default:
                    System.out.println("Ingresa una opcion valida");

            }
        }
    }

}
