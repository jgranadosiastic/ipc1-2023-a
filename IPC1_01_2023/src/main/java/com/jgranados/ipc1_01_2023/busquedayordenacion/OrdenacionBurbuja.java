/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2023.busquedayordenacion;

/**
 *
 * @author jose
 */
public class OrdenacionBurbuja {
    
    public static void main(String[] args) {
        OrdenacionBurbuja ordenacionBurbuja = new OrdenacionBurbuja();
        int[] arreglo = new int[] {15,100,3,25,80,1,35,5};
        ordenacionBurbuja.ordenar(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            int j = arreglo[i];
            System.out.println(j);
        }
    }

    public void ordenar(int[] arreglo) {
        boolean hayCambios = true;
        while (hayCambios) {
            hayCambios = false;
            for (int i = 0; i < arreglo.length - 1; i++) {
                int elemento1 = arreglo[i];
                int elemento2 = arreglo[i + 1];
                if (elemento1 > elemento2) {
                    arreglo[i] = elemento2;
                    arreglo[i + 1] = elemento1;
                    hayCambios = true;
                }
            }
        }
    }
}
