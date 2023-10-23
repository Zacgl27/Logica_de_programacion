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
public class CajeroAutomatico {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 300000.0;
        
        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("Saldo inicial: " + saldo);
        
        while (saldo > 0) {
            System.out.print("Ingrese el monto a retirar (máximo 50000): ");
            double montoRetiro = scanner.nextDouble();
            
            if (montoRetiro <= 0 || montoRetiro > 50000) {
                System.out.println("Monto inválido. Debe ser mayor a 0 y máximo 50000.");
                continue;
            }
            
            if (montoRetiro > saldo) {
                System.out.println("Saldo insuficiente.");
                continue;
            }
            
            saldo -= montoRetiro;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
            
            if (saldo > 0) {
                System.out.print("¿Desea hacer otro retiro? (Sí/No): ");
                String continuar = scanner.next();
                if (continuar.equalsIgnoreCase("No")) {
                    break;
                }
            } else {
                System.out.println("Saldo agotado.");
                break;
            }
        }
        
        System.out.println("Gracias por usar el Cajero Automático.");
    }
}
    
