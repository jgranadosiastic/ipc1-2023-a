/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2023.busquedayordenacion;

/**
 *
 * @author jose
 */
public class BusquedaBinaria {

    public static void main(String[] args) {
        int[] arreglo = new int[]{1, 5, 31, 40, 60, 80, 100, 101, 105};

        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        busquedaBinaria.busquedaBinaria(arreglo, 0);
    }

    public void busquedaBinaria(int[] arreglo, int buscado) {

        int ini;
        int fin;
        int medio;

        ini = 0;
        fin = arreglo.length - 1;

        while (ini <= fin) {
            medio = ini + (fin - ini) / 2;
            if (arreglo[medio] == buscado) {
                System.out.println("se encontro el elemendo en el indice " + medio);
                break;
            } else if (buscado > arreglo[medio]) {
                ini = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        System.out.println("No se encontro el elemento ");
    }
}
