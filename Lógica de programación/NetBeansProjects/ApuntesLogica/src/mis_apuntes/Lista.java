/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author desarrollo
 */
public class Lista {
    
    public static void main(String[] args) {
        
        String [] names ={"Maria", "Juan", "Andres", "Luisa"};
        
        System.out.println("El elemento en la posición 0 es: " + names[0]);
        
        System.out.println("El elemento en la posición 1 es: " + names[1]);
        
        System.out.println("El elemento en la posición 2 es: " + names[2]);
        
        System.out.println("El elemento en la posición 3 es: " + names[3]); 
        
        int sizes = names.length;
        
        for (int i = 0 ; i < names.length; i++){
            
            System.out.println("El elemento en la posicion " + i + " es " + names[i]);
            
        }
        
        int [] ages = {15,19,17,21,25};
        
        System.out.println("\n \n");
        
        String [] frutas = {"Pera", "Piña", "Sandia", "Fresa", "Kiwi"};
        
        for (int i = 0; i < frutas.length; i++){
            
            System.out.println("La fruta en la posicion " + i + " es " + frutas[i]);
            
        }
        
        System.out.println("\n \n");
        
        String [] redesSociales = {"Twitter", "Instagram", "Pinterest", "Facebook", "Tiktok"};
        
        for (int i = 0; i < redesSociales.length; i++){
            
            System.out.println("La red social en la posicion " + i + " es " + redesSociales[i]);
            
        }
        
        System.out.println("\n \n");
        
        float [] notas = {4.8f, 3.5f, 2.0f, 1.9f, 5.0f};
        
        for (int i = 0; i < notas.length; i++){
            
            System.out.println("Las notas en la posicion " + i + " es " + notas[i]);
            
        }
        
        System.out.println("\n \n");
        
        double [] añosSalarioMinimo = {1160000, 1000000, 908526, 877803, 828116, 781242};
        
        for (int i = 0; i < añosSalarioMinimo.length; i++){
            
            System.out.println("El salario minimo en la posicion " + i + " es " + añosSalarioMinimo[i]);
            
        }
        
        System.out.println("\n \n");
        
        int [] equiposRtoPiso = {22, 35, 31, 25, 30, 28};
        
        for (int i = 0; i < equiposRtoPiso.length; i++){
            
            System.out.println("El numero de equipos en la posicion " + i + " es " + equiposRtoPiso[i]);
            
        }
           
    }
    
}
