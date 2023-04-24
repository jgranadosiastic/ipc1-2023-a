package com.jgranados.ipc1_01_2023.listas;

/**
 *
 * @author jose
 */
public class NodoDoble {
    
    private int contenido;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(int contenido) {
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    
}
