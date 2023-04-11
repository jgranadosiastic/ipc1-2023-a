package com.jgranados.ipc1_01_2023.bicicletas;

/**
 *
 * @author jose
 */
public class Bicicleta {
    private int velocidad;
    private int revoluciones;
    
    
    public void frenar() {
        System.out.println("Frenando");
    }
    
    public final void incrementarVelocidad() {
        velocidad++;
        System.out.println("incrementando velocidad");
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
