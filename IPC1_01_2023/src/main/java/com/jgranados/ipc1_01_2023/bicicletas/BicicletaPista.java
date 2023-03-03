package com.jgranados.ipc1_01_2023.bicicletas;

/**
 *
 * @author jose
 */
public class BicicletaPista extends BicicletaVelocidades {
    private int aerodinamica;
    
    public int obtenerAerodinamica() {
        return aerodinamica;
    }
    
    public void frenar() {
        System.out.println("Frenando desde bicicleta pista");
    }
}
