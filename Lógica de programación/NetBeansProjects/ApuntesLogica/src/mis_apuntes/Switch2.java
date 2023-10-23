package mis_apuntes;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 505
 */



public class Switch2 {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        int menu;
        
        
        //Queremos crear un menu para seleccionar platos en un restaurante
        //cree una opción para desayunos, almuerzos
        //cenas, bebidas; snacks y comidas rápidas
        
        System.out.println("Para abrir el menú de desayunos ingrese el número 1");
        System.out.println("Para abrir el menú de almuerzos ingrese el número 2");
        System.out.println("Para abrir el menú de cenas ingrese el número 3");
        System.out.println("Para abrir el menú de bebidas ingrese el número 4");
        System.out.println("Para abrir el menú de snacks ingrese el número 5");
        System.out.println("Para abrir el menú de comidas rápidas ingrese el número 6");
        
        System.out.println("Ingrese la opción que desea: ");
        menu = sc.nextInt();
                
        switch(menu){
            case 1:
                System.out.println("Aquí está el menú de desayunos: \n"
                        + "Huevos revueltos con jamón y queso \n"
                        + "Tostadas de aguacate y huevo pochado \n"
                        + "Avena cocida con frutas y nueces \n"
                        + "Panqueques con sirope de arce \n"
                        + "Smoothie de plátano, espinaca y leche de almendras \n");
                break;
                
            case 2:
                System.out.println("Aquí está el menú de almuerzos: \n"
                        + "Ensalada de pollo a la parrilla con aderezo de mostaza y miel \n"
                        + "Sándwich de pavo, aguacate y queso suizo \n"
                        + "Pizza de verduras con masa integral \n"
                        + "Sopa de lentejas con zanahoria y apio \n"
                        + "Burrito de frijoles negros y arroz integral \n");
                break;
                
            case 3:
                System.out.println("Aquí está el menú de cenas: \n"
                        + "Salmón a la parrilla con espárragos al limón \n"
                        + "Pollo al curry con arroz basmati \n"
                        + "Espaguetis de calabacín con albóndigas de pavo \n"
                        + "Tacos de pescado con repollo rallado y crema de cilantro \n"
                        + "Berenjenas rellenas de quinoa y champiñones \n");
                break;
                
            case 4:
                System.out.println("Aquí está el menú de bebidas: \n"
                        + "Agua fresca de sandía \n"
                        + "Limonada casera con menta \n"
                        + "Smoothie de fresa y plátano \n"
                        + "Té helado de durazno \n"
                        + "Café latte con leche de almendras \n");
                break;
                
            case 5:
                System.out.println("Aqui está el menú de snacks: \n"
                        + "Palitos de zanahoria con hummus \n"
                        + "Chips de kale al horno \n"
                        + "Rodajas de pepino con yogurt griego y eneldo \n"
                        + "Barritas de avena y frutos secos \n"
                        + "Edamame sazonado \n");
                break;
                
            case 6:
                System.out.println("Aquí está el menú de comidas rápidas: \n"
                        + "Hamburguesa de ternera con queso y papas fritas \n"
                        + "Hot dog con cebolla caramelizada y jalapeños \n"
                        + "Tacos de carne asada con guacamole \n"
                        + "Wrap de pollo y aguacate \n"
                        + "Pizza margarita \n");
                break;
            
        }
        
    }    
    
}
