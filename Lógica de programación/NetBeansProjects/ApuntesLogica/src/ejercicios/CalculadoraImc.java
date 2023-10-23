/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */

import java.util.Scanner;

public class CalculadoraImc {
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args){
        
        System.out.println("Ingrese su altura: ");
        float altura = sc.nextFloat();
        
        System.out.println("Ingrese su peso: ");
        float peso = sc.nextFloat();
        
        float result = peso/(altura*altura);
        
        if ( result == 18.5 ){
            System.out.println("Estás bajo de peso");
            
            } else if ( result >= 18.5 && result <= 24.9 ){
            System.out.println("Estás normal");
            
            } else if ( result >= 25 && result <= 29.9 ){
            System.out.println("Tienes sobre peso");
            
            } else if ( result == 30.0){
            System.out.println("Tienes obesidad");
            
            }
        
        
        
        
    }
    
}
