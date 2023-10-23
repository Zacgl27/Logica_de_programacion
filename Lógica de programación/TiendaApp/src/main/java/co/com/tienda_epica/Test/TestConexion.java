package co.com.tienda_epica.Test;

import co.com.tienda_epica.Conexion.Conexion;

import java.sql.Connection;

public class TestConexion {

    public static void main(String[] args) {

        try(Connection connect = Conexion.get_connection()){

        }catch(Exception e){
            System.out.println(e);
        }finally{
            Conexion.close_connection();
        }

    }

}
