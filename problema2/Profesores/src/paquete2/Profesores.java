/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ASUS
 */
public class Profesores {
    
     private String nombre,cedula;
    private double sueldoBasico, sueldoTotal;
    
    
    public Profesores(){
        
        nombre = "Lionel Messi";
        cedula = "1150042974";
        sueldoBasico = 500;
        

    }

    public Profesores(String nom,String ce, double sb){
        nombre = nom;
        cedula = ce;
        sueldoBasico = sb;
        
        
    }
    public void establecerNombre(String c){
       nombre=c;
        
    }
    public void establecerCedula(String c){
        cedula = c;
    }
        public void establecerSueldoBasico(double c){
        sueldoBasico = c;
    }

      public void calcularSueldoTotal(){
        
        sueldoTotal = (sueldoBasico * 0.20) + sueldoBasico; 
        
    }
    
    public String obtenerNombre(){
        return nombre;
    }            
    
    public String obtenerCedula(){
        return cedula;
    }
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }


    
    @Override
    public String toString() {
        String cadena = String.format("Profesor:\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n",                
                nombre,
                cedula,
                sueldoBasico,
                sueldoTotal);

        return cadena;
    }
    
}
