/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class RaizCuadradaCalculator {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el numero al cual desea sacarle la raiz cuadrada: ");
        int num = leer.nextInt();
        
        int raizC = raiz(num);
        if (raizC == -1){
            System.out.println("Raiz no encontrada o no existe en los numero reales");
        }else{
            System.out.println("La raiz cuadrada de " + num + " es: " + raizC + " o " + (-1 * raizC));
        }
        
        
    }
    
    //función para sacar la raiz cuadrada exacta de un número
    public static int raiz (int num){
        
        int contador = 1;
        int resultado = 0;
        int raiz = 0;
        boolean salida = false;
        
        while (contador < num && salida == false){
            
            resultado = (int)(num/contador);
            
            //Validamos si encontramos raiz
            if (resultado == contador){
                raiz = resultado;
                salida = true;
            }else{
                contador++;
                raiz = -1;
                salida = false;
            }
            
        }
        
        if(raiz != -1 && num > 0){
         return raiz;   
        }else{
            return -1;
        }
        
    }
    
}
