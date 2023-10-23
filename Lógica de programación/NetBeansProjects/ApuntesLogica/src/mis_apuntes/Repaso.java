/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class Repaso {
    
    public static void main (String [] arg) {
        
        //Variables
        //Datos primitivos
        //byte
        //Short
        //int
        //long
        //float
        //double
        //Char
        //boolean
                
        //Delclaracion de una variable e inicialización
        //int age; //Declaración
            //age = 24; //Inicializar        
        
    byte num1 = 127;
    short num2 = 32767;
    int num3 = 2147483647;
    long num4 = 9223372036854775807l; //La l significa long
    long num5 = 2147483647;
    float num6 = 4.556842f; //La f significa float. 
    double num7 = 5.86538280875985453745278;
    char caracter = 64;
    boolean isON; //Cuándo declaramos una variable booleana esta por defecto es false
        isON = true;
        
    /**** Operadores Aritmeticos***/

    // +, -, /, *, %
    int a;
    int b;
    int c;

    int d, e;

 a = 500; 
 b = 400; 
 c = 390; 
 d = 510; 
 e = 300;
 
 // Suma
 
 int puntosTotales = a + b + c + d + e; //El igual(=) es un operador de asignación
    System.out.println("El total de puntos obtenidos por Pepito es: " + puntosTotales);
 
// Variable tipo String

String name = "Pepito";
String name2 = "Pepito";

//c.

boolean compare = name.equals(name2);
    System.out.println("Es igual????: " + compare);

    
    
        
    }
    
}
