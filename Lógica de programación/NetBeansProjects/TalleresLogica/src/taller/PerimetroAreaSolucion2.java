/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class PerimetroAreaSolucion2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese la base del rectangulo: ");
        double d1 = sc.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo: ");
        double d2 = sc.nextDouble();
        
        System.out.println("El area del rectangulo es: " + d1 * d2);
        
        System.out.println("El perimetro del rectangulo es: " + ((d1+ d2)*2));
        
    }
    
}
