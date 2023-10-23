package co.com.tienda_epica.Test;

import co.com.tienda_epica.Service.ProductoService;

public class TestUpdate {

    public static void main(String[] args) {

        ProductoService ps = new ProductoService();

        ProductoService.listarProducto();
        ProductoService.modificarProducto();

    }

}
