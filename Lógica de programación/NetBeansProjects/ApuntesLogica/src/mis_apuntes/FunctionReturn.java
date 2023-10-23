/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 503
 */
public class FunctionReturn {
    
    public static void main (String [] args){
        
        calcularArea ();
        
        System.out.println("El area es: " + calcularArea());
        
    }
    
    public static double calcularArea (){
        
        double ladoA = 30;
        double ladoB = 30;
        
        double areaTotal = ladoA * ladoB;
        
        return areaTotal;
        
        
        
    }
    
}
