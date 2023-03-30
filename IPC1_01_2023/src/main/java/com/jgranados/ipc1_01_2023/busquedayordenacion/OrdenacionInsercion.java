/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2023.busquedayordenacion;

/**
 *
 * @author jose
 */
public class OrdenacionInsercion {
    
    public static void main(String[] args) {
        OrdenacionInsercion ordenacionInsercion = new OrdenacionInsercion();
        int[] arreglo = new int[] {15,100,3,25,80,1,35,5};
        ordenacionInsercion.ordenar(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            int j = arreglo[i];
            System.out.println(j);
        }
    }
/* implementar!
    public void ordenarInsertando(Integer[] arreglo, int elemento) {
        if (arreglo[0] == null) {
            arreglo[0] = elemento;
        } else {
            // u = buscar el primer indice null
            // arreglo[u] = elemetno
            int elemento = arreglo[u];
            for (int j = u - 1; j >= 0; j--) {
                int izquierda = arreglo[j];
                if (izquierda > elemento) {
                    arreglo[j + 1] = izquierda;
                    arreglo[j] = elemento;
                } else {
                    break;
                }
            }
        }
    }*/
    
    public void ordenar(int[] arreglo) {
        for (int i = 1; i <= arreglo.length - 1; i++) {
            int elemento = arreglo[i];
            for (int j = i - 1; j >= 0; j--) {
                int izquierda = arreglo[j];
                if (izquierda > elemento) {
                    arreglo[j + 1] = izquierda;
                    arreglo[j] = elemento;
                } else {
                    break;
                }
            }
            
        }
    }
}
