/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacioPOO;

import java.util.Scanner;
import poo.POO;

/**
 *
 * @author Sena
 */
public class clasePrincipal {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer dato: ");
        int valor1 = entrada.nextInt();

        System.out.println("Ingrese el segundo valor :");
        int valor2 = entrada.nextInt();
//

       sumaConPOO valores = new sumaConPOO(valor1, valor2);
        valores.imprimir();
        entrada.close();
    }
}
