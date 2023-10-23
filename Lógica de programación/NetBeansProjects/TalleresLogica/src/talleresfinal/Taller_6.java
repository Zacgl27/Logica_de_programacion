/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleresfinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Taller_6 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        
        do {
            
            System.out.print("Ingrese un número (quedan " + (7 - contador) + " números por agregar): ");
            int numero = sc.nextInt();
            numeros.add(numero);
            contador++;
            
        } while (contador<7);
        
        System.out.println("Números agregados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }    
        
    }
    
}
