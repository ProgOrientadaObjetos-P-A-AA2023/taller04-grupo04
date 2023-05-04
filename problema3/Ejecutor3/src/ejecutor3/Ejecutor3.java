/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor3;
import paquete2.Autos;
/**
 *
 * @author ASUS
 */
public class Ejecutor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Autos a1 = new Autos();
      
        
        a1.calcularMatricula();
        
        System.out.printf("%s\n", a1);
        
        Autos a2 = new Autos("Lamborghini","1102977910",2020,90000);
        
        a2.calcularMatricula();
        
        System.out.printf("%s\n", a2);
        
    }
    
    
}
