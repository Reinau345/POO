/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class funciones extends clasePadre{

    // atributos de la clase 
    private double peso;
    private double estura;
    private byte edad;
    private String eps;
    private boolean enfermedad;
    private boolean prescripcionMedica;

    private int contadorCliente = 0;
    private double totalRecaudado = 0;
    private String nombre;

    public funciones(String nombre, String cedula, String profesion, String estadoCivil, String direccion,
            String telefono, double peso, double estura, byte edad, String eps, boolean enfermedad,
            boolean prescripcionMedica){
               super(nombre,cedula,profesion,estadoCivil,direccion,telefono);

        this.peso = peso;
        this.estura = estura;
        this.edad = edad;
        this.eps = eps;
        this.enfermedad = enfermedad;
        this.prescripcionMedica = prescripcionMedica;

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstura() {
        return estura;
    }

    public void setEstura(double estura) {
        this.estura = estura;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public boolean isEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(boolean enfermedad) {
        this.enfermedad = enfermedad;
    }

    public boolean isPrescripcionMedica() {
        return prescripcionMedica;
    }

    public void setPrescripcionMedica(boolean prescripcionMedica) {
        this.prescripcionMedica = prescripcionMedica;
    }

    public int getContadorCliente() {
        return contadorCliente;
    }

    public void setContadorCliente(int contadorCliente) {
        this.contadorCliente = contadorCliente;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public double Imc() {
        double imc = 0;
        return imc = peso / (estura * estura);

    }

    public String diagnostico() {
        String mensaje;

        if (Imc() > 0.0 && Imc() < 16.0) {
            mensaje = "Diagnostico: Delgadez Severa \n Su peso es demasiado bajo - Consulte su medico";
        } else if (Imc() > 16.0 && Imc() < 16.99) {
            mensaje = "Diagnostico: Delgadez Moderada \n Su peso es bajo - incluya calorias y carbohidratos en su dieta";
        } else if (Imc() > 17.0 && Imc() < 18.49) {
            mensaje = "Diagnostico: Delgadez Leve \n Su peso es ligeramente bajo - Mejore sus habitos alimenticios";
        } else if (Imc() > 18.50 && Imc() < 24.99) {
            mensaje = "Diagnostico: Normal \n Tiene un peso saludable";
        } else if (Imc() > 25.0 && Imc() < 29.99) {
            mensaje = "Diagnostico: Preobeso \n Su peso es levemente alto  - Procure hacer ejercicio";
        } else if (Imc() > 30.0 && Imc() < 34.99) {
            mensaje = "Diagnostico: Obesidad Leve \n Su peso es muy alto - Controle su dieta y realice ejercicio";
        } else if (Imc() > 35.0 && Imc() < 39.99) {
            mensaje = "Diagnostico: Obesidad Media \nSu peso es muy alto - Visite a su medico y controle su dieta";
        } else {
            mensaje = "Diagnostico: Obesidad Mórbida \n Su peso es excesivamente alto - Visite a su médico cuanto antes";
        }

        return mensaje;

    }

    public double mensualidad() {
        double valor = 0;
        if (Imc() <= 16.0) {
            return valor = 80000;
        } else if (Imc() > 16.0 && Imc() < 35) {
            return valor = 70000;
        } else {
            return valor = 90000;
        }
    }
    
    public String calcularFecha() {
        Date fecha = new Date();

        DateFormat formatoFechaHora = new SimpleDateFormat("HH:mm:ss - dd/MM/yyyy");

        return formatoFechaHora.format(fecha);
        
    }
    public void MensajeEdad(){
        if (edad<15){
            System.out.println("no puede ingresar");
        }else if(edad>60){
            System.out.println("asignar instructor especial");
        }
    }
    @Override
    public String toString() {
        return "funciones [peso=" + peso + ", estura=" + estura + ", edad=" + edad + ", eps=" + eps + ", enfermedad="
                + enfermedad + ", prescripcionMedica=" + prescripcionMedica + "]" + "\n"
                + "\n"
                + "Fecha : " + calcularFecha() + "\n"
                + "Nombre: " + nombre + "\n"
                + "DIANOSTICO: " + diagnostico() + "\n"
                + "La mensualidad: " + mensualidad() + "\n"
                + "Su indice de masa es: " + Imc();
    }
            
}
