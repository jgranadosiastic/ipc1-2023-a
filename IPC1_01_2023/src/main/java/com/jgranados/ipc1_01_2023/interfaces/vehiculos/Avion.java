package com.jgranados.ipc1_01_2023.interfaces.vehiculos;

import com.jgranados.ipc1_01_2023.interfaces.InterfaceVolar;

/**
 *
 * @author jose
 */
public class Avion extends Vehiculo implements InterfaceVolar {

    @Override
    public void avanzar() {
        System.out.println("Avanzando desde avion");
    }

    @Override
    public void despegar() {
        System.out.println("Despegando desde avion");
    }

    @Override
    public void atterizar() {
        System.out.println("Aterrizando dsde avion");
    }

}
