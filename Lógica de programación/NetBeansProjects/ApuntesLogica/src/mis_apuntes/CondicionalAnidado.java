/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */

import java.util.Scanner;

public class CondicionalAnidado {
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args){
        
        
        
        System.out.println("Ingrese la nota de estudiante: ");
        float score = sc.nextFloat();
        
        if(score < 2.0){
            System.out.println("Reprobado");
            
        } else if (score >= 2.0 && score <= 2.99) {
            System.out.println("Regular");
            
        } else if (score >= 3.0 && score <= 3.99){
            System.out.println("Basico");
            
        } else if(score >= 4.0 && score <= 4.99){
            System.out.println("Superior");
        
        } else if (score == 5.0){
            System.out.println("Excelente");
            
        } else {
            System.out.println("Ingrese un valor valido");
            
        }
        
        
    }
    
}
