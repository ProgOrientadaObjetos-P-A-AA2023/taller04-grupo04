/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ASUS
 */
public class Autos {
    
    // cédula del dueño, marca de vehículo, año de fabricación, valor de vehículo y valor de la matricula. 
    // El valor de la matricula es igual al 0.002% del valor de vehículo por el número de años de antiguedad del vehiculo.
   
    private String marca,cedulaD;
    private int anioFabricacion;
    private double valorAuto,matricula;
    
    public Autos(){
        
        marca = "Ferrari";
        cedulaD = "1150042974";
        anioFabricacion = 2017;
        valorAuto = 400000;

    }

    public Autos(String m,String cd, int af, double va){
        marca = m;
        cedulaD = cd;
        anioFabricacion = af;
        valorAuto=va;
        
    }
    public void establecerMarca(String c){
       marca=c;
        
    }
    public void establecerCedulaD(String c){
        cedulaD = c;
    }
        public void establecerAnioFabricacion(int c){
        anioFabricacion = c;
    }
        public void establecerValorAuto(double c){
            valorAuto = c;
        }

      public void calcularMatricula(){
         
        matricula = ((2023 - anioFabricacion)* valorAuto) * 0.0002; 
        
    }
    
    public String obtenerMarca(){
        return marca;
    }            
    
    public String obtenerCedulaD(){
        return cedulaD;
    }
    public double obtenerAnioFabricacion(){
        return anioFabricacion;
    }
    public double obtenerValorAuto(){
        return valorAuto;
    }

    public double obtenerMatricula(){
        return matricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Profesor:\n"
                + "Marca: %s\n"
                + "Cedula del Duenio: %s\n"
                + "Anio de Fabricacion: %d\n"
                + "Valor del auto: %.2f\n" 
                + "Valor matricula: %.2f\n",
                marca,
                cedulaD,
                anioFabricacion,
                valorAuto,
                matricula);

        return cadena;
    }
}
