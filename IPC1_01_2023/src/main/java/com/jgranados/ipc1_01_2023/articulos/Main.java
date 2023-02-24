package com.jgranados.ipc1_01_2023.articulos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese costo base:");
        double costoBase = scanner.nextDouble();
        
        Articulo articulo = new Articulo();
        articulo.cambiarCostoBase(costoBase);
        
        
        double detalle = articulo.calcularPrecioDetalle();
        System.out.println("Precio al detalle");
        System.out.println(detalle);
        
        double mayor = articulo.calcularPrecioMayor();
        System.out.println("Precio al MAyor");
        System.out.println(mayor);
    }
}
