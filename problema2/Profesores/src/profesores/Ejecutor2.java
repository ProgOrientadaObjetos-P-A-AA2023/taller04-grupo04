/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profesores;
import paquete2.Profesores;
/**
 *
 * @author ASUS
 */
public class Ejecutor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Profesores p1 = new Profesores();
      
        
        p1.calcularSueldoTotal();
        
        System.out.printf("%s\n", p1);
        
        Profesores p2 = new Profesores("Cristiano Ronaldo","1150617982",700);
        
        p2.calcularSueldoTotal();
        
        System.out.printf("%s\n", p2);
        
    }
    
    
}
