/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2023.swing;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author jose
 */
public class MiCasilla extends JLabel {

    public MiCasilla(String text) {
        super(text);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accion(evt);
            }
        });
    }
 
    private void accion(java.awt.event.MouseEvent evt) {
        System.out.println("cambiar");
        this.setBackground(Color.red);
        this.setForeground(Color.red);
        this.repaint();
    }
}
