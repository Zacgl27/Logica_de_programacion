/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author zacgl
 */
public class PepitoInforme {
    public static void main (String [] arg){
    
        double Salario_pepito = 1600000;
        double Descuento_préstamo = 160000;
        
        double Salario_pepito_2 = Salario_pepito - Descuento_préstamo;
        
        double Descuento_EPS = Salario_pepito_2 * 0.04;
        
        double Salario_pepito_3 = Salario_pepito_2 - Descuento_EPS;
        
        double Descuento_pensión = Salario_pepito_3 * 0.04;
        
        double Salario_pepito_4 = Salario_pepito_3 - Descuento_pensión;
        
        double Pago_transporte = 146000;
        
        double Salario_final = Salario_pepito_4 + Pago_transporte;
        
        System.out.println("El salario inicial de Pepito es: " + Salario_pepito + "$");
        System.out.println("El descuento de prestamo es: " + Descuento_préstamo + "$");
        System.out.println("El descuento de la EPS es: " + Descuento_EPS + "$");
        System.out.println("El descuento de la pension es: " + Descuento_pensión + "$");
        System.out.println("El pago del transporte es: " + Pago_transporte + "$");
        System.out.println("El salario final es: " + Salario_final + "$");
        
    }
}
