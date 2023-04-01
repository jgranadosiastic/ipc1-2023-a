package com.jgranados.ipc1_01_2023.articulos;

import java.util.Scanner;

/**
 *
 * @author jose
 * MODIFICADORES DE VISIBILIDAD
 * public: acceso desde cualquier parte del codigo (mundo exterior)
 * private: acceso solo desde la misma clase
 * protected: acceso desde la misma clase, clases hijas, y clases del mismo paquete
 * DEFECTO (AUSENCIA DE MODIFICADOR): acceso desde la misma clase y clases del mismo paquete
 */
public class Articulo {
    public static final double INCREMENTO_DETALLE = 0.30;
    public static final double INCREMENTO_MAYOR = 0.15;
    
    private final double costoBase;
    
    public Articulo(double costoBase) {
        this.costoBase = costoBase;
    }
    
    public double calcularPrecioDetalle() {
        /**
         * var incremento
         * var total
         * incremento = costoBase * 0.30
         * total = costoBase + incremento
         */
        double incremento = costoBase * INCREMENTO_DETALLE;
        return costoBase + incremento;
    }
    
    public double calcularPrecioMayor() {
        /**
         * var incremento
         * var total
         * incremento = costoBase * 0.15
         * total = costoBase + incremento
         */
        double incremento = costoBase * INCREMENTO_MAYOR;
        return costoBase + incremento;
    }
    
    /*public void cambiarCostoBase(double costoBaseNuevo) {
        costoBase = costoBaseNuevo;
    }*/
}
