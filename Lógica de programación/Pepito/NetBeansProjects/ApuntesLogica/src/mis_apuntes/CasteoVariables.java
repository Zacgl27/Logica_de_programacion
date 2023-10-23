/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class CasteoVariables {
    
    public static void main (String [] arg ){

        int a, b, suma, resta, multi, div;
        a = 4;
        b = 10;
        suma = a + b;
        resta = a - b;
        multi = a * b;
        div = b / a;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multi);
        System.out.println("El resultado de la división es: " + div);
        
        //para evitar que se pierda información en la división b/a de tipo int
        //realizo un casting de variables
        
        float divFloat = (float) b / a;
        System.out.println("El valor exacto de la división es: " + divFloat);
        
        
        
    }
}
