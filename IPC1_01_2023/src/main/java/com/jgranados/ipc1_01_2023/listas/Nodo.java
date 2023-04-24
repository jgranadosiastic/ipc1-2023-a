package com.jgranados.ipc1_01_2023.listas;

/**
 *
 * @author jose
 */
public class Nodo {
    
    private int contenido;
    private Nodo siguiente;

    public Nodo(int contenido) {
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
