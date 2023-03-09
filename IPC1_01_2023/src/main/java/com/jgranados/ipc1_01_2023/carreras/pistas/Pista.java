package com.jgranados.ipc1_01_2023.carreras.pistas;

import com.jgranados.ipc1_01_2023.carreras.motores.MotorSuperCharger;
import com.jgranados.ipc1_01_2023.carreras.motores.MotorTurbado;
import com.jgranados.ipc1_01_2023.carreras.vehiculos.Vehiculo;

/**
 *
 * @author jose
 */
public class Pista {
    private int cantidadVehiculos;
    private int tamaño;
    private Vehiculo[] competidores;

    public Pista(int cantidadVehiculos, int tamaño, Vehiculo jugador) {
        this.cantidadVehiculos = cantidadVehiculos;
        this.tamaño = tamaño;
        competidores = new Vehiculo[cantidadVehiculos];
        competidores[0] = jugador;
        competidores[1] = construirUno();
        competidores[2] = construirDos();
    }
    
    private Vehiculo construirUno() {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMotor(new MotorTurbado());
        return vehiculo;
    }
    
    private Vehiculo construirDos() {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMotor(new MotorSuperCharger());
        return vehiculo;
    }
    
    public void moverVehiculos() {
        for (Vehiculo competidor : competidores) {
            if (competidor != null) {
                competidor.avanzar();
            }
        }
    }

    public Vehiculo[] getCompetidores() {
        return competidores;
    }

    public int getTamaño() {
        return tamaño;
    }
    
    
    
    
}
