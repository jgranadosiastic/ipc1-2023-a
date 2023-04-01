package com.jgranados.ipc1_01_2023.interfaces.vehiculos;

import com.jgranados.ipc1_01_2023.interfaces.InterfaceBocinar;

/**
 *
 * @author jose
 */
public class Camion extends Vehiculo implements InterfaceBocinar {

    @Override
    public void avanzar() {
        System.out.println("avanzando desde camion");
    }

    @Override
    public void bocinar() {
        System.out.println("bocinando desde camion");
    }

}
