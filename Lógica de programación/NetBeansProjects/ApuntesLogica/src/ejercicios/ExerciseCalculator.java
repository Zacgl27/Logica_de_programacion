/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author zacgl
 */

import java.util.Scanner;

public class ExerciseCalculator {
    
    public static void main (String [] args){
        
        char ope;
        double number1, number2, result;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an operator: +, -, *, or /");
        ope = sc.next().charAt(0);

        System.out.println("Enter first number");
        number1 = sc.nextDouble();

        System.out.println("Enter second number");
        number2 = sc.nextDouble();

        switch (ope) {

          case '+':
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
            break;

          case '-':
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
            break;

          case '*':
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
            break;

          case '/':
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
            break;

          default:
            System.out.println("Invalid operator!");
            break;
        }

    }   
    
}
