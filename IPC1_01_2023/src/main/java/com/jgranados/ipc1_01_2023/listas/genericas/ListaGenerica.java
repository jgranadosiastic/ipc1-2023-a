package com.jgranados.ipc1_01_2023.listas.genericas;

import com.jgranados.ipc1_01_2023.exceptions.ListaException;

/**
 *
 * @author jose
 */
public class ListaGenerica<T> {
    private NodoGenerico<T> inicio;
    private NodoGenerico<T> ultimo;
    private int size = 0;
    
    public void agregarDato(T valor) {
        NodoGenerico<T> nuevo = new NodoGenerico<>(valor);
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
            NodoGenerico<T> penultimo = obtenerNodo(penultimoIndice);
            penultimo.setSiguiente(null);
            ultimo = penultimo;
            size--;
        }
    }
    
    public T obtenerValor(int indice) throws ListaException {
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
            NodoGenerico nodoAnterior = obtenerNodo(indice - 1);
            NodoGenerico nodoAEliminar = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
            size--;
        }
    }
    
    private NodoGenerico<T> obtenerNodo(int indice) throws ListaException {
        if (estaVacia()) {
            throw new ListaException("La lista está vacía");
        }
        
        if (indice < 0 || indice >= size) {
            throw new ListaException("Indice fuera de rango");
        }
        
        NodoGenerico<T> nodoActual = inicio;
        for (int i = 0; i < indice; i++) {
            NodoGenerico siguiente = nodoActual.getSiguiente();
            nodoActual = siguiente;
        }
        
        return nodoActual;
    }
}
