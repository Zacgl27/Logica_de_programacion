/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 503
 */
public class whileLoop {
    
    public static void main(String[] args) {
        
        int points = 30;
        
        int seconds = 0;
        
        while( seconds < 30 ){
            
            points -- ;
            
            System.out.println("Tiene: " + points + " puntos");
            
            seconds ++ ;
            
            System.out.println("Han pasado " + seconds + " segundos");
            
        }
        
    }
    
}
