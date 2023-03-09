package com.jgranados.ipc1_01_2023.carreras.motores;

import com.jgranados.ipc1_01_2023.carreras.pistas.Pista;
import com.jgranados.ipc1_01_2023.carreras.vehiculos.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class ControladorCarrera {

    private boolean hayGanador;

    private void mostrarAvance(Pista pista) {
        for (int i = 0; i < pista.getCompetidores().length; i++) {
            Vehiculo vehiculo = pista.getCompetidores()[i];
            if (vehiculo != null && i == 0) {
                System.out.println("Distancia vehiculo jugador: " + vehiculo.getAvanceActual());
            } else if (vehiculo != null) {
                System.out.printf("Distancia competidor %d: %d\n", (i + 1), vehiculo.getAvanceActual());
            }
        }
    }

    private void mostrarGanador(Pista pista) {
        for (int i = 0; i < pista.getCompetidores().length; i++) {
            Vehiculo vehiculo = pista.getCompetidores()[i];
            if (vehiculo != null && vehiculo.getAvanceActual() >= pista.getTamaño()) {
                hayGanador = true;
                System.out.println("El ganador es:");
                if (i == 0) {
                    System.out.printf("El vehiculo jugador con avance de %d metros\n", vehiculo.getAvanceActual());
                } else {
                    System.out.printf("El competidor %d con avance de %d metros\n", (i + 1), vehiculo.getAvanceActual());
                }
                break;
            }
        }
    }

    public void ejecutarCarrera(Pista pista) {
        Scanner scanner = new Scanner(System.in);
        hayGanador = false;
        System.out.println("La carrera ha iniciado");
        System.out.println("Presione enter para continuar");
        scanner.nextLine();
        while (!hayGanador) {
            pista.moverVehiculos();
            mostrarAvance(pista);
            System.out.println("Presione enter para continuar");
            scanner.nextLine();
            mostrarGanador(pista);
        }
    }
}
