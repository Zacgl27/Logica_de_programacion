/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleresfinal;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Taller_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String names [] = new String [6];
        
        System.out.println("Ingrese 6 nombres: ");
        names[0] = sc.nextLine();
        names[1] = sc.nextLine();
        names[2] = sc.nextLine();
        names[3] = sc.nextLine();
        names[4] = sc.nextLine();
        names[5] = sc.nextLine();
        
        for(int i = 0; i < names.length; i++){
            
            System.out.println("Posicion " + i + ": " + names[i]);
            
        }
        
    }
    
}
