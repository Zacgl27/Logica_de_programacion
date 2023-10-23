/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class GradosCelsius {
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        int opc = 0;
        
        do{
            System.out.println("Los grados son: " + calcularGrados() + " °C");
            //opc++;
            System.out.println("Veces calculadas: " + opc++ );
        }while(opc != 3);
        
    }
    
    public static int calcularGrados(){
        
        System.out.println(" \n Ingrese los grados que desea calcular cómo Celsius: ");
        int grado = sc.nextInt();
        
        int result = (grado - 32) * 5/9;
        
        return result;
        
    }
    
}
