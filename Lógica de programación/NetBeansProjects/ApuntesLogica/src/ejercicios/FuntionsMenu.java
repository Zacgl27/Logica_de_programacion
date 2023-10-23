  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */

import java.util.Scanner;

public class FuntionsMenu {
    
    static Scanner sc = new Scanner(System.in);
    static int opc;
    
    public static void main (String [] args){
        
        menu();
        
    }
    
    public static void menu (){
        
        System.out.println("Para abrir el menu de desayunos ingrese el numero 1 \n"
                + "Para abrir el menu de almuerzos ingrese el numero 2 \n"
                + "Para abrir el menu de cenas ingrese el numero 3 \n"
                + "Para abrir el menu de bebidas ingrese el numero 4 \n"
                + "Para abrir el menu de snacks ingrese el numero 5 \n"
                + "Para abrir e menu de comidas rapidas ingese el numero 6 \n");
        
        System.out.println("Ingrese la opcion que desea ver en pantalla: ");
        
        opc = sc.nextInt();
        
        switch(opc){
            
            case 1:
                System.out.println("Usted ha seleccionado exitosamente el menu desayunos \n");
                menuDesayuno();
                menuPorciones();
                break;
                
            case 2:
                System.out.println("Usted ha seleccionado exitosamente el menu almuerzos \n");
                menuAlmuerzo();
                menuPorciones();
                break;
                
            case 3:
                System.out.println("Usted ha seleccionado exitosamente el menu cenas \n");
                menuCena();
                menuPorciones();
                break;
                
            case 4:
                System.out.println("Usted ha seleccionado exitosamente el menu bebidas \n");
                menuBebidas();
                menuVasos();
                break;
                
            case 5:
                System.out.println("Usted ha seleccionado exitosamente el menu snacks \n");
                menuSnacks();
                menuPorciones();
                break;
                
            case 6:
                System.out.println("Usted ha seleccionado exitosamente el menu comida rapida \n");
                menuComidaRapida();
                menuPorciones();
                break;
                
            default:
                System.out.println("Ingrese una opcion valida \n");
            
        }
       
            
        }
        
    public static void menuDesayuno (){
    
        System.out.println("Desayunos \n");
        
        System.out.println("1. Huevos revueltos con jamon y queso \n"
                + "2. Tostadas de aguacate y huevo pochado \n"
                + "3. Avena cocida con frutas y nueces \n"
                + "4. Panqueques con sirope de arce \n"
                + "5. Smoothie de platano, espinaca y leche de almendras \n");
        
        System.out.println("Ingrese la opcion que desea ordenar: ");
        
        opc = sc.nextInt();
        
        switch (opc){
            
            case 1:
                System.out.println("Huevos revueltos con jamon y queso \n");
                break;
                
            case 2:
                System.out.println("Tostadas de aguacate y huevo pochado \n");
                break;
                
            case 3:
                System.out.println("Avena cocida con frutas y nueces \n");
                break;
                
            case 4:
                System.out.println("Panqueques con sirope de arce \n");
                break;
                
            case 5:
                System.out.println("Smoothie de platano, espinaca y leche de almendras \n");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
        
    }
    
    public static void menuAlmuerzo(){
        
        System.out.println("Almuerzos \n");
        
        System.out.println("1. Ensalada de pollo a la parrilla con aderezo de mostaza y miel \n"
                + "2. Sandwich de pavo, aguacate y queso suizo \n"
                + "3. Pizza de verduras con masa integral \n"
                + "4. Sopa de lentejas con zanahoria y apio \n"
                + "5. Burrito de frijoles negros y arroz integral \n");
        
        System.out.println("Ingrese la opcion que desea ordenar: ");
        
        opc = sc.nextInt();
        
        switch(opc){
            
            case 1:
                System.out.println("Ensalada de pollo a la parrilla con aderezo de mostaza y miel \n");
                break;
                
            case 2:
                System.out.println("Sandwich de pavo, aguacate y queso suizo \n");
                break;
                
            case 3:
                System.out.println("Pizza de verduras con masa integral \n");
                break;
                
            case 4:
                System.out.println("Sopa de lentejas con zanahoria y apio \n");
                break;
                
            case 5:
                System.out.println("Burrito de frijoles negros y arroz integral \n");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
        
    }
    
    public static void menuCena (){
        
        System.out.println("Cenas \n");
        
        System.out.println("1. Salmon a la parrilla con esparragos al limón \n"
                + "2. Pollo al curry con arroz basmati \n"
                + "3. Espaguetis de calabacin con albondigas de pavo \n"
                + "4. Tacos de pescado con repollo rallado y crema de cilantro \n"
                + "5. Berenjenas rellenas de quinoa y champiñones \n");
        
        System.out.println("Ingrese la opcion que desea ordenar: ");
        
        opc = sc.nextInt();
        
        switch (opc){
            
            case 1:
                System.out.println("Salmon a la parrilla con esparragos al limón \n");
                break;
                
            case 2:
                System.out.println("Pollo al curry con arroz basmati \n");
                break;
                
            case 3:
                System.out.println("Espaguetis de calabacin con albondigas de pavo \n");
                break;
                
            case 4:
                System.out.println("Tacos de pescado con repollo rallado y crema de cilantro \n");
                break;
               
            case 5:
                System.out.println("Berenjenas rellenas de quinoa y champiñones \n");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
        
    }
    
    public static void menuBebidas (){
        
        System.out.println("Bebidas \n");
        
        System.out.println("1. Agua fresca de sandia \n"
                + "2. Limonada casera con menta \n"
                + "3. Smoothie de fresa y platano \n"
                + "4. Te helado de durazno \n"
                + "5. Cafe latte con leche de almendras \n");
        
        System.out.println("Ingrese la opcion que desea ordenar: ");
        
        opc = sc.nextInt();
        
        switch (opc){
            
            case 1:
                System.out.println("Agua fresca de sandia \n");
                break;
                
            case 2:
                System.out.println("Limonada casera con menta \n");
                break;
                
            case 3:
                System.out.println("Smoothie de fresa y platano \n");
                break;
                
            case 4:
                System.out.println("Te helado de durazno \n");
                break;
                
            case 5:
                System.out.println("Cafe latte con leche de almendras \n");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
        
    }
    
    public static void menuSnacks (){
        
        System.out.println("Snacks \n");
        
        System.out.println("1. Palitos de zanahoria con hummus \n"
                + "2. Chips de kale al horno \n"
                + "3. Rodajas de pepino con yogurt griego y eneldo \n"
                + "4. Barritas de avena y frutos secos \n"
                + "5. Edamame sazonado \n");
        
        System.out.println("Ingrese la opcion que desea ordenar: ");
        
        opc = sc.nextInt();
        
        switch (opc){
            
            case 1:
                System.out.println("Palitos de zanahoria con hummus \n");
                break;
                
            case 2:
                System.out.println("Chips de kale al horno \n");
                break;
                
            case 3:
                System.out.println("Rodajas de pepino con yogurt griego y eneldo \n");
                break;
                
            case 4:
                System.out.println("Barritas de avena y frutos secos \n");
                break;
                
            case 5:
                System.out.println("Edamame sazonado \n");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
    }
    
    public static void menuComidaRapida (){
        
        System.out.println("Comidas rapidas \n");
        
        System.out.println("1. Hamburguesa de ternera con queso y papas fritas \n"
                + "2. Hot dog con cebolla caramelizada y jalapeños \n"
                + "3. Tacos de carne asada con guacamole \n"
                + "4. Wrap de pollo y aguacate \n"
                + "5. Pizza margarita \n");
        
        System.out.println("Ingrese la opcion que desea ordenar: ");
        
        opc = sc.nextInt();
        
        switch (opc){
            
            case 1:
                System.out.println("Hamburguesa de ternera con queso y papas fritas \n");
                break;
                
            case 2:
                System.out.println("Hot dog con cebolla caramelizada y jalapeños \n");
                break;
                
            case 3:
                System.out.println("Tacos de carne asada con guacamole \n");
                break;
                
            case 4:
                System.out.println("Wrap de pollo y aguacate \n");
                break;
                
            case 5:
                System.out.println("Pizza margarita \n");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
        
    }
    
    public static void menuPorciones (){
        
        System.out.println("Porciones: \n");
        
        System.out.println("1. porcion \n"
                + "2. porciones \n"
                + "3. porciones \n"
                + "4. porciones \n"
                + "5. porciones \n"
                + "6. porciones \n"
                + "7. porciones \n"
                + "8. porciones \n"
                + "9. porciones \n"
                + "10. porciones \n");
        
        System.out.println("Ingrese la cantidad de porciones que desea: \n");
        
        opc = sc.nextInt();
        
        switch (opc){
            
            case 1:
                System.out.println("1 porcion");
                break;
                
            case 2:
                System.out.println("2 porciones");
                break;
                
            case 3:
                System.out.println("3 porciones");
                break;
                
            case 4:
                System.out.println("4 porciones");
                break;
                
            case 5:
                System.out.println("5 porciones");
                break;
                
            case 6:
                System.out.println("6 porciones");
                break;
                
            case 7:
                System.out.println("7 porciones");
                break;
                
            case 8:
                System.out.println("8 porciones");
                break;
                
            case 9:
                System.out.println("9 porciones");
                break;
                
            case 10:
                System.out.println("10 porciones");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
        
    }
    
    public static void menuVasos (){
        
        System.out.println("Vasos");
        
        System.out.println("1. Vaso \n"
                + "2. Vasos \n"
                + "3. Vasos \n"
                + "4. Vasos \n"
                + "5. Vasos \n");
        
        System.out.println("Ingrese la cantidad de Vasos que desea: \n");
        
        opc = sc.nextInt();
        
        switch (opc){
            
            case 1:
                System.out.println("1 Vaso");
                break;
                
            case 2:
                System.out.println("2 Vasos");
                break;
                
            case 3:
                System.out.println("3 Vasos");
                break;
                
            case 4:
                System.out.println("4 Vasos");
                break;
                
            case 5:
                System.out.println("5 Vasos");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
        
        
    }
    
}
