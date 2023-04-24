package com.jgranados.ipc1_01_2023.listas.genericas;

/**
 *
 * @author jose
 */
public class NodoGenerico<T> {
    
    private T contenido;
    private NodoGenerico siguiente;

    public NodoGenerico(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public NodoGenerico getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGenerico siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
