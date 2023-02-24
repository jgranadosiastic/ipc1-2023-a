package com.jgranados.ipc1_01_2023.alumnos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class RecolectorDatos {
    private int cantidadEstudiantes;
    
    public void solicitarCantidadEstudiantes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad estudiantes");
        cantidadEstudiantes = Integer.valueOf(scanner.nextLine());
    }
    
    public void solicitarEstudiantes() {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            solicitarEstudiante();
        }
    }
    
    private void solicitarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        String cui;
        String nombre;
        System.out.println("Ingrese CUI");
        cui = scanner.nextLine();
        System.out.println("Ingrese Nombre");
        nombre = scanner.nextLine();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota:");
            String nota = scanner.nextLine();
            notas[i] = Double.valueOf(nota);
        }
        
        Alumno alumno = new Alumno(cui, nombre, notas);
        alumno.imprimirDatos();
    }
}
