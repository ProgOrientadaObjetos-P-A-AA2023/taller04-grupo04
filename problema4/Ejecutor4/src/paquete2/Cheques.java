/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ASUS
 */
public class Cheques {
    
    // nombre del cliente, nombre del banco, valor del cheque y comisión que cobra el banco.
    // La comisión del banco es igual al valor del cheque por el 0.003%.
        private String cliente,banco;
    private double vCheque,comision;
    
    public Cheques(){
        
        cliente = "Enner Valencia";
        banco = "Pichincha";
        vCheque = 20000;
        

    }

    public Cheques(String c,String b, int vc){
        cliente = c;
        banco = b;
        vCheque = vc;
        
    }
    public void establecerCliente(String c){
       cliente=c;
        
    }
    public void establecerBanco(String c){
        banco = c;
    }
        public void establecerValorCheque(int c){
        vCheque = c;
    }


      public void calcularComision(){
         
        comision = vCheque * 0.003; 
        
    }
    
    public String obtenerCliente(){
        return cliente;
    }            
    
    public String obtenerBanco(){
        return banco;
    }
    public double obtenerValorCheque(){
        return vCheque;
    }

    @Override
    public String toString() {
        String cadena = String.format("Profesor:\n"
                + "Cliente: %s\n"
                + "Banco: %s\n"
                + "Valor del cheque: %f\n"
                + "Comision: %.2f\n", 

                cliente,
                banco,
                vCheque,
                comision);

        return cadena;
    }
}
