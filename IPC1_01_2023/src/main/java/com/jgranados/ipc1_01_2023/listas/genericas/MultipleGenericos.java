/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2023.listas.genericas;

/**
 *
 * @author jose
 */
public class MultipleGenericos<Tipo1, Tipo2, Tipo3> {
    private Tipo1 dato1;
    private Tipo2 dato2;
    private Tipo3 dato3;
    private int otraCosa;

    public MultipleGenericos(Tipo1 dato1, Tipo2 dato2, Tipo3 dato3) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
    }

    public Tipo1 getDato1() {
        return dato1;
    }

    public void setDato1(Tipo1 dato1) {
        this.dato1 = dato1;
    }

    public Tipo2 getDato2() {
        return dato2;
    }

    public void setDato2(Tipo2 dato2) {
        this.dato2 = dato2;
    }

    public Tipo3 getDato3() {
        return dato3;
    }

    public void setDato3(Tipo3 dato3) {
        this.dato3 = dato3;
    }

    public int getOtraCosa() {
        return otraCosa;
    }

    public void setOtraCosa(int otraCosa) {
        this.otraCosa = otraCosa;
    }
    
    
}
