/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class Comparación {
    
    public static void main (String [] args){
    
        int num1 = 5;
        int num2 = 7;
        
        boolean result = num1 >= num2;
        
        System.out.println(result);
        
        String name1 = "Maria";
        String name2 = "Maria";
        
        boolean samename = name1 == name2;
        
        System.out.println("Es igual el nombre? " + samename);
        
        double salary1 = 1160000;
        double salary2 = 1200000;
        
        boolean comparesalaries = salary1 != salary2;
        boolean comparesalaries2 = salary1 == salary2;
        
        System.out.println("Los salarios son diferentes " + comparesalaries);
        System.out.println("Los salarios son diferentes " + comparesalaries2);
        
        //Vamos a incluir validación
        
        int age = 25;
        
        if(age <= 10){
            
            System.out.println("El niño puede ingresar");
        }
        
        
        if(age <= 12){
            System.out.println("Elniño/a puede ingresar");
        }else{
            System.out.println("El niño es mayor de 12 años y no puede enrtar");
        }
        
        
        // Si Pepito tiene menos de 2800 en la cívica
        // Si Juan sacó 2.9 en el examen de lógica
        // Si Andrés es 3cm más alto que Juan
        // Si tengo el fin de semana libre
        // Si invitan a una fiesta
        // Si quiero helado o quiero pizza 
        
        // Y = &&
        // O = ||
        
    }
}
