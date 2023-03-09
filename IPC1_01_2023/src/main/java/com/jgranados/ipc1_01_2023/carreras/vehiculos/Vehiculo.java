package com.jgranados.ipc1_01_2023.carreras.vehiculos;

import com.jgranados.ipc1_01_2023.carreras.motores.Motor;
import com.jgranados.ipc1_01_2023.carreras.neumaticos.Neumatico;
import com.jgranados.ipc1_01_2023.carreras.stickers.Sticker;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Vehiculo {
    private Motor motor;
    private Neumatico neumatico;
    private Sticker[] stickers;
    private int avanceActual;
    
    public int avanzar() {
        Random random = new Random();
        int avance = random.nextInt(9) + 1;
        avance = avance + motor.calcularAvance();
        avanceActual += avance;
        return avance;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Neumatico getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(Neumatico neumatico) {
        this.neumatico = neumatico;
    }

    public Sticker[] getStickers() {
        return stickers;
    }

    public void setStickers(Sticker[] stickers) {
        this.stickers = stickers;
    }

    public int getAvanceActual() {
        return avanceActual;
    }
    
    
}
