/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor4;
import paquete2.Cheques;
/**
 *
 * @author ASUS
 */
public class Ejecutor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    Cheques c1 = new Cheques();
      
        
        c1.calcularComision();
        
        System.out.printf("%s\n", c1);
        
        Cheques c2 = new Cheques("Anthony Conza","Banco de Loja",90000);
        
        c2.calcularComision();
        
        System.out.printf("%s\n", c2);
        
    }
    
}
