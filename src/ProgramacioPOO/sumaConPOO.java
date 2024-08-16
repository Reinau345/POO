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

public class sumaConPOO {
   private int valor1, valor2, resultado, promedio, resta;
   // llamar un constructor 
   public sumaConPOO(int valor1, int valor2){
       this.valor1=valor1;
       this.valor2=valor2;  
   }
   
   //metodo para sumar los valores 
   public void OperacionSuma(){
       resultado= valor1+valor2;
   }
     public void OperacionResta(){
    resta=valor1-valor2;
}   
     public void OperacionPromedio(){
         promedio= resultado/2;
     }
     public void imprimir(){
         OperacionSuma();
         OperacionResta();
         OperacionPromedio();
         //mostrar los datos 
         System.out.println("la suma es: "+resultado);
         System.out.println("la esta es : "+ resta);
         System.out.println("el promedio es: "+promedio);
     }
}
