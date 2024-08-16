/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import funciones.funciones;
import static java.lang.Byte.parseByte;
import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {

      
        String nombre=JOptionPane.showInputDialog("digite su nombre: ");
        String cedula=JOptionPane.showInputDialog("digite su cedula: ");

        String profesion=JOptionPane.showInputDialog("digite su profesion: ");
        String estadoCivil = JOptionPane.showInputDialog("digite su estado civil: ");
        String direccion =JOptionPane.showInputDialog("digite su direccion: ");
        String telefono = "";

        double  peso=Float.parseFloat(JOptionPane.showInputDialog("peso"));
        double estura =Float.parseFloat(JOptionPane.showInputDialog("estatura"));
         Byte edad=Byte.parseByte(JOptionPane.showInputDialog("edad"));
        String eps =JOptionPane.showInputDialog("digite su eps: ");

        boolean enfermedad = true;
        boolean prescripcionMedica = true;

        
        funciones  hijo = new funciones(nombre, cedula, profesion, estadoCivil, direccion, telefono, peso, estura, edad, eps, enfermedad, prescripcionMedica);
           
      
        JOptionPane.showMessageDialog(null, hijo.toString());
        System.out.println(hijo.toString());

    }

}



