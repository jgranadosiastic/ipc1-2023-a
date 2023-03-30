/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2023.busquedayordenacion;


/**
 *
 * @author jose
 */
public class BusquedaSecuencial {
    
    public static void main(String[] args) {
        int buscado = 300;
        int[] arreglo = new int[]{10, 20, 5, 7, 100, 101, 30, 25};
        BusquedaSecuencial busqueda = new BusquedaSecuencial();
        busqueda.buscarSecuencial(arreglo, buscado);

    }
    
    public void buscarSecuencial(int[] arr, int buscado) {
        for (int i = 0; i < arr.length; i++) {
            int numero = arr[i];
            if (numero == buscado) {
                System.out.printf("Se encontro el valor %d en la posicion %d\n", buscado, i);
                return;
            }
        }
        System.out.println("No se encontro el valor");
    }
}
