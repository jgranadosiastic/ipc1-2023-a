package com.jgranados.ipc1_01_2023.busquedas;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class BusquedaSecuencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorBuscado;
        int[] arreglo = new int[]{5, 10, 9, 51, 35, 14, 100, 8, 11};
        
        System.out.println("cual numero quiere buscar?");
        valorBuscado = Integer.valueOf(scanner.nextLine());
        busqueda(valorBuscado, arreglo);
        
    }
    
    private static void busqueda(int valorBuscado, int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int valorActual = arreglo[i];
            if (valorActual == valorBuscado) {
                System.out.printf("Valor %d encontrado en indice %d\n", valorBuscado, i);
                break;
            }
        }
        System.out.printf("el Valor %d no se encuentra en el arreglo\n", valorBuscado);
    }
}
