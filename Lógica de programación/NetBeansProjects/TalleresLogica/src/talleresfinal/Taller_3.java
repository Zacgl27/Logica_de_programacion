/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleresfinal;

/**
 *
 * @author 503
 */
public class Taller_3 {
    
    public static void main(String[] args) {
        
        String[][] jugadores = {
            {"Jugador 1", "Juan", "15 años", "delantero"},
            {"Jugador 2", "Pedro", "16 años", "defensa"},
            {"Jugador 3", "Luis", "17 años", "arquero"}
        };
        
        // Imprimir la información de los jugadores
        for (String[] jugador : jugadores) {
            System.out.println("Nombre: " + jugador[1]);
            System.out.println("Edad: " + jugador[2]);
            System.out.println("Posición: " + jugador[3]);
            System.out.println();
        }
        
        String posicionArquero = jugadores[2][3];
        
        System.out.println("El: " + posicionArquero + " está en la posicion [2][3]");
        
        String edad = jugadores[1][2];
        
        System.out.println("La edad de " + edad + " es de Pedro");
        
    }
    
}
