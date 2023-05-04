/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioEstudiantes;
import paquete2.PromedioEstudiantes;
/**
 *
 * @author ASUS
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PromedioEstudiantes pe = new PromedioEstudiantes();
      
        
        pe.calcularPromedio();
        
        System.out.printf("%s\n", pe);
        
        PromedioEstudiantes pe2 = new PromedioEstudiantes("Jhordy Agila",8.50,9.50,7);
        
        pe2.calcularPromedio();
        
        System.out.printf("%s\n", pe2);
        
    }
    
    
}
