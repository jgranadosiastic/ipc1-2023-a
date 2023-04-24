/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jgranados.ipc1_01_2023.listas.genericas;

import com.jgranados.ipc1_01_2023.interfaces.vehiculos.Camion;
import com.jgranados.ipc1_01_2023.interfaces.vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultipleGenericos<Integer, String, Vehiculo> multi = 
                new MultipleGenericos<>(5, "algo", new Camion());
        
        Integer valor = multi.getDato1();
        String valor2 = multi.getDato2();
        
        List<String> linked = new LinkedList<>();
        List<String> miList = new ArrayList<>();
        miList.add("asdasd");
    }
    
}
