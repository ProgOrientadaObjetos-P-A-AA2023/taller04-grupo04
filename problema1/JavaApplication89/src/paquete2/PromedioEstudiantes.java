/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ASUS
 */
public class PromedioEstudiantes {
    
    private String nomEstudiante;
    private double nota1, nota2,nota3;
    private double promedio;
    
    public PromedioEstudiantes(){
        
        nomEstudiante = "Jean Villavicencio";
        nota1 = 8;
        nota2 = 7;
        nota3 = 9;

    }
    public PromedioEstudiantes(String nom,double n1, double n2,double n3){
        nomEstudiante = nom;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        
    }
    public void establecernomEstudiantes(String c){
       nomEstudiante=c;
        
    }
    public void establecerNota1(double c){
        nota1 = c;
    }
        public void establecerNota2(double c){
        nota2 = c;
    }
            public void establecerNota3(double c){
        nota3 = c;
        
    }
      public void calcularPromedio(){
        
        promedio = (nota1 + nota2 + nota3) / 3; 
        
    }
    
    public String obtenerNombre(){
        return nomEstudiante;
    }            
    
    public double obtenerNota1(){
        return nota1;
    }
    public double obtenerNota2(){
        return nota2;
    }
    public double obtenerNota3(){
        return nota3;
    }

    public double obtenerPromedio(){
        
        return promedio;
        
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Estudiante:\n"
                + "Nombre: %s\n"
                + "Nota 1: %.2f\n"
                + "Nota 2: %.2f\n"
                + "Nota 3: %.2f\n"
                + "Promedio: %.2f\n",
                nomEstudiante,
                nota1,
                nota2,
                nota3,
                promedio);
        return cadena;
    }
    
}
