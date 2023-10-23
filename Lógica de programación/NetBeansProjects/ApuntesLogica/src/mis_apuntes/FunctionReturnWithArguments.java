/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class FunctionReturnWithArguments {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        double a = 30;
        double b = 30;
        
        System.out.println("Ingrese el lado A: ");
        
        double c = sc.nextDouble();
        
        System.out.println("Ingrese el lado B: ");
        
        double d = sc.nextDouble();
        
        System.out.println("Pasando parametros: " + calcularArea(c, d));
        
        System.out.println("Pasando parametros " + calcularArea(a, b));
        
        System.out.println("El valor de area es:" + calcularArea(25, 10));
        
    }
    
    public static double calcularArea (double ladoA, double ladoB){
        
        double areaTotal = ladoA * ladoB;
        
        return areaTotal;
        
    }
    
}
