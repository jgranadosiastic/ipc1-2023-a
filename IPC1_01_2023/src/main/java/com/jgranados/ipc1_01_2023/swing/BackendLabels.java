/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2023.swing;

import com.jgranados.ipc1_01_2023.exceptions.TableroExcepcion;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class BackendLabels {

    public MiCasilla[] generarCasillas(String cantidad) throws TableroExcepcion {
        try {
            Integer valorInt = Integer.valueOf(cantidad);
            
            return generarCasillas(valorInt);
        } catch (NumberFormatException e) {
            throw new TableroExcepcion("El valor ingresado no es numero valido");
        }
    }

    public MiCasilla[] generarCasillas(int cantidad) {

        MiCasilla[] casillasCreadas = new MiCasilla[cantidad];
        for (int i = 0; i < cantidad; i++) {
            MiCasilla unaLabel = new MiCasilla("etiqueta No. " + (i + 1));
            unaLabel.setSize(50, 50);
            unaLabel.setLocation(0, (i * 50) + 100);
            casillasCreadas[i] = unaLabel;
        }

        return casillasCreadas;
    }
}
