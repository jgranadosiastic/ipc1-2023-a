package com.jgranados.ipc1_01_2023.carreras;

import com.jgranados.ipc1_01_2023.carreras.motores.ControladorCarrera;
import com.jgranados.ipc1_01_2023.carreras.motores.Motor;
import com.jgranados.ipc1_01_2023.carreras.motores.MotorSuperCharger;
import com.jgranados.ipc1_01_2023.carreras.motores.MotorTurbado;
import com.jgranados.ipc1_01_2023.carreras.pistas.Pista;
import com.jgranados.ipc1_01_2023.carreras.vehiculos.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MainCarreras {

    public static void main(String[] args) {
        MainCarreras mainCarreras = new MainCarreras();
        mainCarreras.ejecutar();
    }

    private void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        ControladorCarrera controladorCarrera = new ControladorCarrera();

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1. Carrera facil");
            System.out.println("2. Carrera normal");
            System.out.println("3. salir");
            opcion = Integer.valueOf(scanner.nextLine());

            switch (opcion) {
                case 1: {
                    Vehiculo vehiculoJugador = new Vehiculo();
                    iniciarCarreraFacil(controladorCarrera, vehiculoJugador);
                }
                break;
                case 2: {
                    Vehiculo vehiculoJugador = new Vehiculo();
                    iniciarCarreraNormal(controladorCarrera, vehiculoJugador);
                }
                break;
            }
        }
    }

    private void agregarMotorParaFacil(Vehiculo vehiculoJugador) {
        Motor motorJugador = new MotorSuperCharger();
        vehiculoJugador.setMotor(motorJugador);
    }

    private void agregarMotorParaNormal(Vehiculo vehiculoJugador) {
        Motor motorJugador = new MotorTurbado();
        vehiculoJugador.setMotor(motorJugador);
    }

    private void iniciarCarreraFacil(ControladorCarrera controladorCarrera, Vehiculo vehiculoJugador) {
        agregarMotorParaFacil(vehiculoJugador);
        Pista pista = new Pista(3, 100, vehiculoJugador);
        controladorCarrera.ejecutarCarrera(pista);
    }

    private void iniciarCarreraNormal(ControladorCarrera controladorCarrera, Vehiculo vehiculoJugador) {
        agregarMotorParaNormal(vehiculoJugador);
        Pista pista = new Pista(3, 100, vehiculoJugador);
        controladorCarrera.ejecutarCarrera(pista);
    }
}
