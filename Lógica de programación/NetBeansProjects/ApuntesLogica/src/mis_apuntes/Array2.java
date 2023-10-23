
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 507
 */
public class Array2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String flores [] = {"Crisantemos", "Loto", "Girasoles", "Margarita", "Orquidea" };
        
        System.out.println("El tamaño del array es: " + flores.length);
        
        //Podemos accedera la posición indicando la misma
        
        System.out.println("La flor en la posicion 0 es: " + flores[0]);
        
        //Podemos definir un array y agregar elementos en las diferentes posiciones
        
        int tallas []; //Esto es definir un array
        
        tallas = new int [7]; //Esto es declarar el array
        
        int n;
        
        System.out.println("El numero de talla de hombre es: ");
        
        n = sc.nextInt();
        
        int tallasHombre [] = new int [n]; //define y se declara el array
        
        System.out.println("La longitud del array es: " + tallasHombre.length);
        
        tallasHombre [0] = sc.nextInt();
        tallasHombre [1] = sc.nextInt();
        tallasHombre [2] = sc.nextInt();
        tallasHombre [3] = sc.nextInt();
        tallasHombre [4] = sc.nextInt();
        
        for (int i=0; i < tallasHombre.length; i++){
            
            System.out.println("La talla " + i + " es: " + tallasHombre[i]);
            
        }
        
        
        
    }
    
}
