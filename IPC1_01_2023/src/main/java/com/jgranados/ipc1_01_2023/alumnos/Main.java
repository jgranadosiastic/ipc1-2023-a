/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_01_2023.alumnos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
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
        alumno.imprimirDatos();*/
        RecolectorDatos recolector = new RecolectorDatos();
        recolector.solicitarCantidadEstudiantes();
        recolector.solicitarEstudiantes();
    }
    
}
