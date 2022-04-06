/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JLabel;

/**
 *
 * @author Paolo_Veliz
 */
public class Monitor {
    public int[] regionCritica = new int[3];
    public int posicion = 0;
    
    public Monitor(){
         regionCritica[0] = 0;
         regionCritica[1] = 0;
         regionCritica[2] = 0;
    }
    
    public synchronized void Mon(JLabel mietiqueta, JLabel Rcritica){
            
          // Operaciones pre región crítica
            int numeroAGenerar = (int)(Math.random()* 9 + 1);
            mietiqueta.setText(String.valueOf(numeroAGenerar));
            // Región crítica
          
            regionCritica[posicion] = numeroAGenerar;
            String contenidoRC = "[" + String.valueOf(regionCritica[0]) + "]";
            contenidoRC += "[" + String.valueOf(regionCritica[1]) + "]";
            contenidoRC += "[" + String.valueOf(regionCritica[2]) + "]";
            
            Rcritica.setText(contenidoRC);
            posicion++;
            // Operaciones post región crítica
            System.out.println("Proceso finalizado con status: 0");
    }

    
}
