/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class ExerciseArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String names [] = new String [4];
        
        System.out.println("Ingrese solamente 4 nombres de su preferencia: ");
        
        names [0] = sc.nextLine();
        names [1] = sc.nextLine();
        names [2] = sc.nextLine();
        names [3] = sc.nextLine();
        
        System.out.println("--------------------");
        
        for (int i = 0; i < names.length; i++){
            
            System.out.println("Posicion " + i + " " + names[i]);
            
        }
        
        
    }
    
}
