/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 507
 */
public class TeacherCalculator {
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args){
        
        menuCalculadora();
        
    }
    
    public static void menuCalculadora (){
        
        int isOn;
        
        System.out.println("Oprima 1 para encender la calculadora");
        
        isOn = sc.nextInt();
        
        while (isOn != 0){
            
            System.out.println("--------------------");
            
            System.out.println("Calculadora personal");
            
            System.out.println("--------------------");
            
            System.out.println(" 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4.Dividir \n 5. Modulo \n 6. Salir");
            
            System.out.println("--------------------");
            
            System.out.println("Ingrese una opcion: ");
            int opc = sc.nextInt();
            
            switch (opc){
                
                case 1:
                    
                    System.out.println("1. Suma");
                    
                    double num1 = capturarDatos ("Ingrese el numero 1: ");
                    double num2 = capturarDatos ("Ingrese el numero 2: ");
                    
                    System.out.println("El resultado de la suma es: " + Sumar(num1, num2));
                    
                    break;
                    
                case 2:
                    
                    System.out.println("2. Resta");
                    
                    double num3 = capturarDatos ("Ingrese el numero 1: ");
                    double num4 = capturarDatos ("Ingrese el numero 2: ");
                    
                    System.out.println("El resultado de la resta es: " + Restar(num3, num4));
                    
                    break;
                    
                case 3:
                    
                    System.out.println("3. Multiplicacion");
                    
                    double num5 = capturarDatos ("Ingrese el numero 1: ");
                    double num6 = capturarDatos ("Ingrese el numero 2: ");
                    
                    System.out.println("El resultado de la multiplicacion es: " + Multiplicar(num5, num6));
                    
                    break;
                    
                case 4:
                    
                    System.out.println("4. Division");
                    
                    double num7 = capturarDatos ("Ingrese el numero 1: ");
                    double num8 = capturarDatos ("Ingrese el numero 2: ");
                    
                    System.out.println("El resultado de la division es: " + Division(num7, num8));
                    
                    break;
                    
                case 5:
                    
                    System.out.println("5. Modulo");
                    
                    double num9 = capturarDatos ("Ingrese el numero 1: ");
                    double num10 = capturarDatos ("Ingrese el numero 2: ");
                    
                    System.out.println("El resultado del modulo es: " + Modulo(num9, num10));
                    
                    break;
                    
                case 6:
                    
                    System.out.println("Salir");
                    isOn = 0;
                    
                default:
                    
                    System.out.println("Ingrese una opcion valida: ");
                
            }
            
        }
        
    }
    
    public static double capturarDatos(String cadena){
        
        System.out.println(cadena);
            double num = sc.nextDouble();
            
            return num;
        
    }
    
    public static double Sumar (double num1, double num2){
        
        double suma = num1 + num2;
        
        return suma;
        
    }
    
    public static double Restar (double num3, double num4){
        
        double resta = num3 - num4;
        
        return resta;
        
    }
    
    public static double Multiplicar (double num5, double num6){
        
        double multiplicacion = num5 * num6;
        
        return multiplicacion;
        
    }
    
    public static double Division (double num7, double num8){
        
        double division = num7 / num8;
        
        return division;
        
    }
    
    public static double Modulo (double num9, double num10){
        
        double modulo = num9 % num10;
        
        return modulo;
        
    }
    
}
