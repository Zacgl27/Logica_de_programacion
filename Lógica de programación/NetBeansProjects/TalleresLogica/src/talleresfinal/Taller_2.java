/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleresfinal;

/**
 *
 * @author 503
 */
public class Taller_2 {
    
    public static void main(String[] args) {
        
        int [][] ages = {{16, 17, 18}, {27, 28, 29}, {41, 42, 43}};
        
        for(int i = 0; i < ages.length; i++){
            for(int j = 0; j < ages[i].length; j++){
                System.out.print( ages[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
    
}
