/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacioPOO;

/**
 *
 * @author Sena
 */
public class CuentaMain {
    public static void main(String[]  args){
        
        //Llamamos el constructor y creamos un objeto que reciba los datos
        cuentaCorriente cuenta1= new cuentaCorriente("Juan Gomez", 1500);
        cuentaCorriente cuenta2= new cuentaCorriente("Maria Lopez", 2500);
       
        cuentaCorriente.Transferencia(cuenta1, cuenta2, 2000);
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(cuenta2.getDatosCuenta());
    }
        
    
}
