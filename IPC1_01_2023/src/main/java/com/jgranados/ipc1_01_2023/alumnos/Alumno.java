package com.jgranados.ipc1_01_2023.alumnos;

import java.io.Serializable;

/**
 *
 * @author jose
 */
public class Alumno implements Serializable {
    private String cui;
    private String nombre;
    private double[] notas;
    
    public Alumno(String cuiParam,
            String nombreParam,
            double[] notasParam) {
        cui = cuiParam;
        nombre = nombreParam;
        notas = notasParam;
    }
    
    public Alumno(String cuiParam,
            double[] notasParam) {
        cui = cuiParam;
        notas = notasParam;
    }
    
    private double calcularNotaPromedio() {
        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            double nota = notas[i];
            total += nota;
        }
        return total / 3;
    }
    
    private boolean indicarAprobacion() {
        double notaPromedio = calcularNotaPromedio();
        /*if (notaPromedio >= 61) {
            return true;
        } else {
            return false;
        }*/
        return notaPromedio >= 61;
    }
    
    public void imprimirDatos() {
        double promedio = calcularNotaPromedio();
        System.out.println("CUI: " + cui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        if (indicarAprobacion()) {
            System.out.println("Si Aprobo");
        } else {
            System.out.println("No Aprobo");
        }
    }
}
