package co.com.tienda_epica.Service;

import co.com.tienda_epica.DAO.ProductoDAO;
import co.com.tienda_epica.Model.Producto;

import java.util.Scanner;

public class ProductoService {
    static Scanner sc = new Scanner(System.in);

    public static void crearProducto(){

        System.out.println("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la descripción del producto: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el costo del producto: ");
        double costo = sc.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        double cantidad = sc.nextDouble();

        Producto registro = new Producto();

        registro.setNombre(nombre);
        registro.setDescripcionProducto(descripcion);
        registro.setPrecio(precio);
        registro.setCosto(costo);
        registro.setCantidad(cantidad);

        ProductoDAO.crearProductoDB(registro);

    }

    public static void listarProducto(){

        ProductoDAO.listarProductoDB();

    }

    public static void modificarProducto(){

        System.out.println("Indique para modificar 1: Nombre 2: Descripcion 3: Precio 4:Costo 5: Cantidad");

        int opc = sc.nextInt();

        sc.skip("\n");

        int id;

        Producto update = new Producto();

        switch(opc){

            case 1:
                System.out.println("Modificar nombre: ");

                System.out.println("Ingrese el nuevo valor: ");
                String nombre = sc.next();
                System.out.println("Indique el Id del producto a actualizar");
                id = sc.nextInt();

                opc = 1;

                update.setOpc(opc);

                update.setNombre(nombre);
                update.setIdProducto(id);

                ProductoDAO.modificarProductoDB(update);

                break;

            case 2:
                System.out.println("Modificar descripcion: ");

                System.out.println("Ingrese el nuevo valor: ");
                String descripcion = sc.next();
                System.out.println("Indique el Id del producto a actualizar");
                id = sc.nextInt();

                opc = 2;
                update.setOpc(opc);

                update.setDescripcionProducto(descripcion);
                update.setIdProducto(id);

                ProductoDAO.modificarProductoDB(update);

                break;

            case 3:
                System.out.println("Modificar precio: ");

                System.out.println("Ingrese el nuevo valor: ");
                double precio = sc.nextDouble();
                System.out.println("Indique el Id del producto a actualizar");
                id = sc.nextInt();

                opc = 3;

                update.setOpc(opc);

                update.setPrecio(precio);
                update.setIdProducto(id);

                ProductoDAO.modificarProductoDB(update);

                break;

            case 4:
                System.out.println("Modificar costo: ");

                System.out.println("Ingrese el nuevo valor: ");
                double costo = sc.nextDouble();
                System.out.println("Indique el Id del producto a actualizar");
                id = sc.nextInt();

                opc = 4;

                update.setOpc(opc);

                update.setCosto(costo);
                update.setIdProducto(id);

                ProductoDAO.modificarProductoDB(update);

                break;

            case 5:
                System.out.println("Modificar cantidad: ");

                System.out.println("Ingrese el nuevo valor: ");
                double cantidad = sc.nextDouble();
                System.out.println("Indique el Id del producto a actualizar");
                id = sc.nextInt();

                opc = 5;

                update.setOpc(opc);

                update.setCantidad(cantidad);
                update.setIdProducto(id);

                ProductoDAO.modificarProductoDB(update);

                break;

            default:
                System.out.println("Selecciona una opcion correcta");

        }

    }

    public static void eliminarProducto(){

        System.out.println("Indique el Id del producto a borrar");
        int IdProducto = sc.nextInt();
        ProductoDAO.eliminarProductoDB(IdProducto);

    }

}
