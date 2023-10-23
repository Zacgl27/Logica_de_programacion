/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class OperadorAlimento {
    
    public static void main (String [ ] arg) {
           

        int Monday, Tuesday, Wednesday, Thursday, Friday;
        
        Monday = 500; 
        Tuesday = 400; 
        Wednesday = 390; 
        Thursday = 510; 
        Friday = 300;
        
        int sumaDepuntos = Monday + Tuesday + Wednesday + Thursday + Friday;
        
        int promedioDePuntos = (Monday + Tuesday + Wednesday + Thursday + Friday)/5;
        
        int sanción = 50; 
        
        Tuesday += -sanción;
        Wednesday += -sanción;
        
        int bono = 10000;
        int bono2 = 15000;
        
        int dineroMonday = (Monday/50)*bono;
        int dineroTuesday = (Tuesday/50)*bono;
        int dineroWednesday = (Wednesday/50)*bono;
        int dineroThursday = (Thursday/50)*bono2;
        int dineroFriday = (Friday/50)*bono2;
        
        int sumaDeDinero = dineroMonday + dineroTuesday + dineroWednesday + dineroThursday + dineroFriday;
        int dineroPerdidoSanción = (sanción*2)*bono/50;
        
        System.out.println("Promedio de puntos: " + promedioDePuntos);
        System.out.println();
        System.out.println("Cantidad de dinero ganada en total: " + sumaDeDinero);
        System.out.println("Suma de dinero perdido en total: " + dineroPerdidoSanción);
        System.out.println();
        System.out.println("Dinero ganado el Lunes: " + dineroMonday);
        System.out.println("Dinero ganado el Martes: " + dineroTuesday);
        System.out.println("Dinero ganado el Miercoles: " + dineroWednesday);
        System.out.println("Dinero ganado el Jueves: " + dineroThursday);
        System.out.println("Dinero ganado el viernes: " + dineroFriday);
        
    }
}

//a. sacar el promedio de puntos.
//b. Por sanción perdió 50 puntos los días Tuesday y Wednesday. 
//c. Le van a pagar por cada 50 puntos una bonificación de 10000 los días Monday, Tuesday y Wednesday y de 15.000 los Thursday y Friday.
//d. Cuanto dinero recibe por bonificación en total y cuanto dejo de ganar por la sanción.
//e. Deberá imprimir un informe.
