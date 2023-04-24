package com.jgranados.ipc1_01_2023.listas;

import com.jgranados.ipc1_01_2023.exceptions.ListaException;

/**
 *
 * @author jose
 */
public class ListaObject {
    private NodoObject inicio;
    private NodoObject ultimo;
    private int size = 0;
    
    public void agregarDato(Object valor) {
        NodoObject nuevo = new NodoObject(valor);
        if (estaVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        size++;
    }
    
    public void eliminarUltimo() throws ListaException {
        if (estaVacia()) {
            throw new ListaException("La lista está vacía");
        }
        if (size == 1) {
            inicio = null;
            ultimo = null;
            size = 0;
        } else {
            int penultimoIndice = size - 2;
            NodoObject penultimo = obtenerNodo(penultimoIndice);
            penultimo.setSiguiente(null);
            ultimo = penultimo;
            size--;
        }
    }
    
    public Object obtenerValor(int indice) throws ListaException {
        /*if (estaVacia()) {
            throw new ListaException("La lista está vacía");
        }
        
        if (indice < 0 || indice >= size) {
            throw new ListaException("Indice fuera de rango");
        }
        Nodo nodoActual = inicio;
        for (int i = 0; i < indice; i++) {
            Nodo siguiente = nodoActual.getSiguiente();
            nodoActual = siguiente;
        }
        
        return nodoActual.getContenido();*/
        return obtenerNodo(indice).getContenido();
    }
    
    public boolean estaVacia() {
        return inicio == null;
    }
    
    public int obtenerSize() {
        return size;
    }

    public void eliminar(int indice) throws ListaException {
        if (indice < 0 || indice >= size) {
            throw new ListaException("Indice fuera de rango");
        }
        if (size == 1 || indice == size - 1) {
            eliminarUltimo();
        } else if (indice == 0) {
            inicio = inicio.getSiguiente();
            size--;
        } else {
            NodoObject nodoAnterior = obtenerNodo(indice - 1);
            NodoObject nodoAEliminar = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
            size--;
        }
    }
    
    private NodoObject obtenerNodo(int indice) throws ListaException {
        if (estaVacia()) {
            throw new ListaException("La lista está vacía");
        }
        
        if (indice < 0 || indice >= size) {
            throw new ListaException("Indice fuera de rango");
        }
        
        NodoObject nodoActual = inicio;
        for (int i = 0; i < indice; i++) {
            NodoObject siguiente = nodoActual.getSiguiente();
            nodoActual = siguiente;
        }
        
        return nodoActual;
    }
}
