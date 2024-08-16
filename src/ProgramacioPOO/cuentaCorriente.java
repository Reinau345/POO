/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacioPOO;

import java.util.Random;

/**
 *
 * @author Sena
 */
public class cuentaCorriente {
    public double saldo;
    private String NombreTitular;
    long numeroCuenta ;
    
    public cuentaCorriente(String NombreTitular, double saldo){
        this.saldo=saldo;
        this.NombreTitular=NombreTitular;
        Random rnd=new Random();
        numeroCuenta=Math.abs(rnd.nextLong());
        
        
    }
    //metodo setter para realizar reintegros 
    public void setIngreso(double ingreso){
        if(ingreso<0)
            System.out.println("No se permite ingresos nativos");
        else saldo = saldo + ingreso;  //  saldo+= ingreso
    }
     //método setter realizar 
    public void setReingreso(double reingreso){
        saldo-=reingreso;
    }
    public String getsaldo(){
        return("el saldo de la cuenta es:"+saldo);
    }
    public static void Transferencia(cuentaCorriente titul1, cuentaCorriente titul2 , double cantidad){
        titul1.saldo-=cantidad;
        titul2.saldo+=cantidad;
    }
    public String getDatosCuenta(){
        return "Titular :"+NombreTitular+"\n"+
                "# cuenta"+numeroCuenta+"\n"+"saldo:"+saldo;
    }
    
}    

