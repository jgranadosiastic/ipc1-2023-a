package com.jgranados.ipc1_01_2023.carreras.motores;

import java.util.Random;

/**
 *
 * @author jose
 */
public class MotorSuperCharger extends Motor {
    @Override
    public int calcularAvance() {
        Random random = new Random();
        return random.nextInt(2) + 3 ;
    }
}
