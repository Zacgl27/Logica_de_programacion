package co.com.tienda_epica.DAO;

import co.com.tienda_epica.Conexion.Conexion;
import co.com.tienda_epica.Model.Producto;

import java.sql.*;

public class ProductoDAO {

    public static void crearProductoDB(Producto registro){

        try(Connection conexion = Conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                String query = "INSER INTO producto(Nombre, Descripcion, Precio, Costo, Cantidad)VALUES(?,?,?,?,?)";

                ps = conexion.prepareStatement(query);

                ps.setString(1, registro.getNombre());
                ps.setString(2, registro.getDescripcionProducto());
                ps.setDouble(3, registro.getPrecio());
                ps.setDouble(4, registro.getCosto());
                ps.setDouble(5, registro.getCantidad());

                ps.executeUpdate();

                System.out.println("Registro de producto exitoso!");

            }catch(SQLException e){
                System.out.println(e);
            }

        }catch(SQLException e){
            System.out.println(e);
        }finally{
            Conexion.close_connection();
        }

    }

    public static void listarProductoDB(){

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = Conexion.get_connection()){

            String query = "SELECT * FROM producto ";

            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()){

                System.out.println("Id del producto: " + rs.getInt("Id"));
                System.out.println("Nombre del producto: " + rs.getString("Nombre"));
                System.out.println("Descripcion del producto: " + rs.getString("Descripcion"));
                System.out.println("Precio del producto: " + rs.getDouble("Precio"));
                System.out.println("Costo del producto: " + rs.getDouble("Costo"));
                System.out.println("Cantidad el producto: " + rs.getDouble("Cantidad"));

            }

        }catch(SQLException e){

            System.out.println("No se recuperaron registros");

            System.out.println(e);

        }

    }

    public static void modificarProductoDB(Producto update){

        try(Connection connect = Conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                int opc = update.getOpc();
                System.out.println(opc);

                if(opc == 1){
                    String query = "UPDATE producto SET Nombre = ? WHERE ID = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, update.getNombre());
                    ps.setInt(2, update.getIdProducto());
                    ps.executeUpdate();
                    System.out.println("Actualizacion exitosa");
                }else if(opc == 2){
                    String query = "UPDATE producto SET Descripcion = ? WHERE ID = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, update.getDescripcionProducto());
                    ps.setInt(2, update.getIdProducto());
                    ps.executeUpdate();
                    System.out.println("Actualizacion exitosa");
                }else if(opc == 3){
                    String query = "UPDATE producto SET Precio = ? WHERE ID = ?";
                    ps = connect.prepareStatement(query);
                    ps.setDouble(1, update.getPrecio());
                    ps.setInt(2, update.getIdProducto());
                    ps.executeUpdate();
                    System.out.println("Actualizacion exitosa");
                }else if(opc == 4){
                    String query = "UPDATE producto SET Costo = ? WHERE ID = ?";
                    ps = connect.prepareStatement(query);
                    ps.setDouble(1, update.getCosto());
                    ps.setInt(2, update.getIdProducto());
                    ps.executeUpdate();
                    System.out.println("Actualizacion exitosa");
                }else if(opc == 5){
                    String query = "UPDATE producto SET Cantidad = ? WHERE ID = ?";
                    ps = connect.prepareStatement(query);
                    ps.setDouble(1, update.getCantidad());
                    ps.setInt(2, update.getIdProducto());
                    ps.executeUpdate();
                    System.out.println("Actualizacion exitosa");
                }

                String query = "UPDATE producto SET Nombre = ? WHERE ID = ?";
               ps = connect.prepareStatement(query);
               ps.setString(1, update.getNombre());
               ps.setInt(2, update.getIdProducto());
               ps.executeUpdate();
                System.out.println("Actualizacion exitosa");
            }catch(SQLException e){
                System.out.println("No fue posible actualizar el registro");
                System.out.println(e);
            }

        }catch(SQLException e){
            System.out.println(e);
        }

    }

    public static void eliminarProductoDB(int IdProducto){

        try(Connection connect = Conexion.get_connection()){

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM producto where producto.ID = ?";

                ps = connect.prepareStatement(query);

                ps.setInt(1,IdProducto);

                ps.executeUpdate();

                System.out.println("El registro a sido eliminado correctamente");

            }catch(SQLException e){

                System.out.println("No se eliminó el producto");

                System.out.println(e);

            }

        }catch(SQLException e){

            System.out.println(e);

        }

    }


}
