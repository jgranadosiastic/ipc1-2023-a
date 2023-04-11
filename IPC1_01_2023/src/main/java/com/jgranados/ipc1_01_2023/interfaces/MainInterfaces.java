/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_01_2023.interfaces;

import com.jgranados.ipc1_01_2023.interfaces.vehiculos.Vehiculo;
import com.jgranados.ipc1_01_2023.interfaces.animales.Aguila;
import com.jgranados.ipc1_01_2023.interfaces.vehiculos.Avion;

/**
 *
 * @author jose
 */
public class MainInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceVolar voladores[] = new InterfaceVolar[3];
        Avion avion1 = new Avion();
        Aguila aguila1 = new Aguila();
        Aguila aguila2 = new Aguila();
        
        voladores[0] = avion1;
        voladores[1] = aguila1;
        voladores[2] = aguila2;
        
        for (InterfaceVolar volador : voladores) {
            volador.despegar();
            if (volador instanceof Vehiculo) {
                Vehiculo vehiculo = (Vehiculo) volador;
                vehiculo.avanzar();
            }
        }
    }
    
}
