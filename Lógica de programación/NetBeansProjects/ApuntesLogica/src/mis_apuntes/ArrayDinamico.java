/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 507
 */
public class ArrayDinamico {
    
    public static void main(String[] args) {
        
        ArrayList <String> names = new ArrayList<String>();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese nombre 1: " );
        String name1 = sc.nextLine();
        names.add(name1);
        
        System.out.println("Ingrese nombre 2: " );
        String name2 = sc.nextLine();
        names.add(name2);
        
        System.out.println("Ingrese nombre 3: " );
        String name3 = sc.nextLine();
        names.add(name3);
        
        System.out.println("Nombre" + names.toString());
        
        for(int i=0; i<names.size(); i++){
            System.out.println("Nombre " + names.get(i));
        }
        
        
        
    }
    
}
