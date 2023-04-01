package com.jgranados.ipc1_01_2023.interfaces.animales;

import com.jgranados.ipc1_01_2023.interfaces.InterfaceVolar;

/**
 *
 * @author jose
 */
public class Aguila extends Animal implements InterfaceVolar {

    @Override
    public void despegar() {
        System.out.println("DEspegando desde aguila");
    }

    @Override
    public void atterizar() {
        System.out.println("Aterrizando desde aguila");
    }

}
