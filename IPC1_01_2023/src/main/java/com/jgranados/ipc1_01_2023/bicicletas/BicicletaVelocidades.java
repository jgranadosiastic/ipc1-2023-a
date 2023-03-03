package com.jgranados.ipc1_01_2023.bicicletas;

/**
 *
 * @author jose
 */
public class BicicletaVelocidades extends Bicicleta {
    private int velocidadCadena;
    
    public void xxxx() {
        setVelocidad(5);
    }
    
    public void cambiarVelocidaCadenar(int nueva) {
        velocidadCadena = nueva;
        System.out.println("cambiando velocidad cadena");
    }
    
    public int obtenerVelocidadCadena() {
        return velocidadCadena;
    }
}
