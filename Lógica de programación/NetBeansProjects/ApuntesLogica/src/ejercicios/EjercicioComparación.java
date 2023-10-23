/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class EjercicioComparación {

    public static void main(String[] args) {

        // Si Pepito tiene menos de 2800 en la cívica
        double pasaje = 2900;

        if (pasaje < 2800) {
            System.out.println("Saldo insuficiente");
        } else {
            double saldo = pasaje - 2800;

            System.out.println("Descuento " + saldo);
        }

        // Si Juan sacó 2.9 en el examen de lógica
        double nota = 2.9;

        if (nota < 3.0) {
            System.out.println("Juan perdió el examen");
        } else {
            System.out.println("Juan ganó el examen");
        }

        // Si Andrés es 3cm más alto que Juan
        int alto = 3;

        if (alto > 2) {
            System.out.println("Andrés es " + alto + "cm más alto que Juan");
        } else {
            System.out.println("Andrés no es más alto que Juan");
        }

        // Si tengo el fin de semana libre
        boolean finSemana = true;
        boolean libre = true;

        if (finSemana && true && libre) {
            System.out.println("Voy a salir a jugar");
        } else {
            System.out.println("No voy a salir a jugar");
        }

        // Si me invitan a una fiesta
        
        boolean invitacion = true; 
                 
        if(invitacion == true){
            System.out.println("Iré a la fiesta");
        } else {
            System.out.println("No iré a la fiesta");
        }
        
        // Si quiero helado o quiero pizza 
        
        boolean helado = true;
        boolean pizza = false;
                
        if (helado==true){
        System.out.println("Voy a comer helado");
                    
        } else {
        System.out.println("No voy a comer helado");
        }
        
    }

}
