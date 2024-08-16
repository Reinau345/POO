/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavadora_uno;
import libreria.Funciones;
import javax.swing.JOptionPane;


public class Lavadora_uno {
    public static void main(String[] args){
        
        
        int TipoDeRopa = Integer.parseInt(JOptionPane.showInputDialog("TIPO DE ROPA \n ROPA BLANCA 1 \n ROPA COLOR 2"));
        int Kilos = Integer.parseInt(JOptionPane.showInputDialog("¿CUANTOS KILOS"));
        
        
        Funciones mensajero = new Funciones(Kilos,TipoDeRopa);
        
        mensajero.CicloFinalizado();
        
       
    }
}
