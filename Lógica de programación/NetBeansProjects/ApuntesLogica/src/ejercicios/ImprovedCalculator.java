/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class ImprovedCalculator {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione la operacion que desea realizar: ");
        char opc = sc.next().charAt(0);
        
        switch (opc){
            
            case '+':
                System.out.println("Suma");
                
                System.out.println("Ingresa el primer digito: ");
                double num1 = sc.nextDouble();
                
                System.out.println("Ingresa el segundo digito: ");
                double num2 = sc.nextDouble();
                
                System.out.println("El resultado de la suma es: " + calcularSuma(num1, num2));
                calcularSuma(num1, num2);
                
                break;
                
            case '-':
                System.out.println("Resta");
                
                System.out.println("Ingrese el primer digito: ");
                double num3 = sc.nextDouble();
                
                System.out.println("Ingrese el segundo digito: ");
                double num4 = sc.nextDouble();
                
                System.out.println("El resultado de la resta es: " + calcularResta(num3, num4));
                calcularResta(num3, num4);
                
                break;
                
            case '*':
                System.out.println("Multiplicacion");
                
                System.out.println("Ingrese el primer digito: ");
                double num5 = sc.nextDouble();
                
                System.out.println("Ingrese el segundo digito: ");
                double num6 = sc.nextDouble();
                
                System.out.println("El resultado de la multiplicacion es: " + calcularMultiplicacion(num5, num6));
                
                break;
                
            case '/':
                System.out.println("Division");
                
                System.out.println("Ingrese el primer digito: ");
                double num7 = sc.nextDouble();
                
                System.out.println("Ingrese el segundo digito: ");
                double num8 = sc.nextDouble();
                
                System.out.println("El resultado de la division es: " + calcularDivision(num7, num8));
                
                break;
            
        }
        
        
        
    }
    
    public static double calcularSuma (double num1, double num2){
        
        double resultadoSuma = num1 + num2;
        
        return resultadoSuma;
        
    }
    
    public static double calcularResta (double num3, double num4){
        
        double resultadoResta = num3 - num4;
        
        return resultadoResta;
        
    }
    
    public static double calcularMultiplicacion(double num5, double num6){
        
        double resultadoMultiplicacion = num5 * num6;
        
        return resultadoMultiplicacion;
        
    }
    
    public static double calcularDivision (double num7, double num8){
        
        double resultadoDivision = num7 / num8;
        
        return resultadoDivision;
        
    }
    
}
