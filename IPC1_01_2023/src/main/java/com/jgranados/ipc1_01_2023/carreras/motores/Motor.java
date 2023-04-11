package com.jgranados.ipc1_01_2023.carreras.motores;

/**
 *
 * @author jose
 */
public abstract class Motor {
    private String numeroSerie;
    
    public abstract int calcularAvance();
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    
}
