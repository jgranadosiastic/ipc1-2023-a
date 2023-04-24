package com.jgranados.ipc1_01_2023.listas;

/**
 *
 * @author jose
 */
public class NodoObject {
    
    private Object contenido;
    private NodoObject siguiente;

    public NodoObject(Object contenido) {
        this.contenido = contenido;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    public NodoObject getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoObject siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
