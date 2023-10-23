/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 507
 */
public class LoginConArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<String> usuario = new ArrayList<String>();
        Scanner sc = new Scanner (System.in);
        
        //Crear un registro:
        
        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine();
        usuario.add(name);
        
        System.out.println("Ingrese su correo: ");
        String email = sc.next();
        usuario.add(email);
        
        System.out.println("Ingrese su contraseña: ");
        String password = sc.next();
        usuario.add(password);
        
        System.out.println("Iniciar sesion: ");
        
        System.out.println("Ingrese el correo registrado: ");
        String emailUser = sc.next();
        
        System.out.println("Ingresela contraseña registrada: ");
        String passwordUser = sc.next();
        
        if(usuario.get(1).equals(emailUser) && usuario.get(2).equals(passwordUser)){
            System.out.println("Bienvenido " + usuario.get(0));
        }else{
            System.out.println("Valide sus credenciales");
        }
        
    }
    
}
