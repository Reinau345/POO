/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.TryNode; 

public class Funciones {
 public int Kilos = 0, LlenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0, ValorCliente = 0, ValorPropietario = 0;
   
    
    public Funciones(int Kilos, int TipoDeRopa) {
        this.Kilos = Kilos;
        this.TipoDeRopa = TipoDeRopa;
        
    }
    
    private void Llenado() {
        Clip Audio;
    try{
        
        Audio= AudioSystem.getClip();
        Audio.open(AudioSystem.getAudioInputStream(new File("musica.wav")));
        Audio.start();
     
    }catch(Exception ex){
         System.out.println("Error"+toString());
    
    }
        if (Kilos > 5 && Kilos <= 30) {
            LlenadoCompleto = 1;
            
            
            System.out.println("LLENANDO...");

            try {
                Thread.sleep(32000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\n");
            System.out.println("¡LLENADO COMPLETO!");
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (Kilos < 5) {
            System.out.println("NO SE PUEDEN MENOS DE 5 KILOS ");
        } else if (Kilos > 30) {
            System.out.println("NO SE PUEDEN MÁS DE 30 KILOS ");
        }
        

    }

    private void Lavado() {
        
        
        System.out.println("\n");
        Llenado();
        
        if (LlenadoCompleto == 1) {
            if (TipoDeRopa == 1) {
                System.out.println("\n");
                System.out.println("ROPA BLANCA\n LAVAR CON BLANQUEADOR");
               try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println("LAVANDO...");
                try {
                    Thread.sleep(49000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("\n");
                System.out.println("VOTANDO AGUA...");
                try {
                    Thread.sleep(49000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                LavadoCompleto = 1;

            } else if (TipoDeRopa == 2) {
                System.out.println("\n");
                System.out.println("ROPA COLOR\n NO UTILIZAR BLANQUEADOR");
                  
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("\n");
                System.out.println("LAVANDO...");
                 try {
                    Thread.sleep(41000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                 System.out.println("\n");
                 System.out.println("VOTANDO AGUA...");
                 try {
                    Thread.sleep(49000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                LavadoCompleto = 1;
            } else {
                System.out.println("\n");
                System.out.println("TIPO DE ROPA NO DISPONIBLE ");
                System.out.println("SE LAVARA COMO ROPA DE COLOR");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("\n");
                System.out.println("LAVANDO...");
                 try {
                    Thread.sleep(41000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                 System.out.println("\n");
                 System.out.println("VOTANDO AGUA...");
                 try {
                    Thread.sleep(49000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               
                LavadoCompleto = 1;
            }
        }

    }

    private void Secado() {
        Lavado();
        if (LavadoCompleto == 1) {

            System.out.println("\n");
            System.out.println("SECANDO...");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            SecadoCompleto = 1;
        }

    }

    public void CicloFinalizado() {
        Secado();
        if (SecadoCompleto == 1) {
            System.out.println("\n");
            System.out.println("¡LAVADO DE ROPA TERMINADO!");
            ValorCliente = Kilos * 4000;
            ValorPropietario = Kilos * 1200;
            System.out.println("Valor cliente:  " + ValorCliente);
            System.out.println("Valor propietario: " + ValorPropietario);
           

        }
    }

    public void Cobro() {
        //CicloFinalizado();
        CicloFinalizado();
        ValorCliente = Kilos * 4000;
        ValorPropietario = Kilos * 1200;
       // System.out.println("Valor cliente: " + ValorCliente);
       // System.out.println("Valor propietario" + ValorPropietario);

    }
    //public class Sonido {
	//public static void main(String[] agrs) throws UnsupportedAudioFileException, IOException, LineUnavailableExeption{
            
}

