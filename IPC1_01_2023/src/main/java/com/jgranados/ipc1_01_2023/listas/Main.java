package com.jgranados.ipc1_01_2023.listas;

import com.jgranados.ipc1_01_2023.listas.genericas.ListaGenerica;
import com.jgranados.ipc1_01_2023.exceptions.ListaException;
import javax.swing.JButton;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        /*try {

            Lista miLista = new Lista();
            //System.out.println("0. " + miLista.obtenerValor(1));
            miLista.agregarDato(5);
            miLista.agregarDato(100);
            miLista.agregarDato(26);

            System.out.println("0. " + miLista.obtenerValor(0));
            System.out.println("1. " + miLista.obtenerValor(1));
            System.out.println("2. " + miLista.obtenerValor(2));
        } catch (ListaException ex) {
            System.out.println(ex.getMessage());
        }*/

        try {
            Lista miLista = new Lista();
            miLista.agregarDato(5);
            miLista.agregarDato(100);
            miLista.agregarDato(26);
            miLista.agregarDato(6);
            miLista.agregarDato(400);
            for (int i = 0; i < miLista.obtenerSize(); i++) {
                System.out.printf("%d. %d\n", i, miLista.obtenerValor(i));
            }

            miLista.eliminarUltimo();
            System.out.println("ultimo eliminado");

            for (int i = 0; i < miLista.obtenerSize(); i++) {
                System.out.printf("%d. %d\n", i, miLista.obtenerValor(i));
            }
            miLista.eliminarUltimo();
            System.out.println("ultimo eliminado");

            for (int i = 0; i < miLista.obtenerSize(); i++) {
                System.out.printf("%d. %d\n", i, miLista.obtenerValor(i));
            }

            miLista.eliminarUltimo();
            System.out.println("ultimo eliminado");

            for (int i = 0; i < miLista.obtenerSize(); i++) {
                System.out.printf("%d. %d\n", i, miLista.obtenerValor(i));
            }

            miLista.eliminarUltimo();
            System.out.println("ultimo eliminado");

            for (int i = 0; i < miLista.obtenerSize(); i++) {
                System.out.printf("%d. %d\n", i, miLista.obtenerValor(i));
            }
            miLista.eliminarUltimo();
            System.out.println("ultimo eliminado");

            for (int i = 0; i < miLista.obtenerSize(); i++) {
                System.out.printf("%d. %d\n", i, miLista.obtenerValor(i));
            }
            System.out.println("lista vacia? " + miLista.estaVacia());

            miLista.agregarDato(5);
            miLista.agregarDato(100);
            miLista.agregarDato(26);

            try {
                miLista.eliminar(0);
                miLista.eliminar(1);
                //miLista.eliminar(2);

                for (int i = 0; i < miLista.obtenerSize(); i++) {
                    System.out.println(miLista.obtenerValor(i));

                }
            } catch (ListaException ex) {
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        /*try {
            String algo = "l";
            JButton[] arr = new JButton[5];
            arr[1] = algo;
            
            ListaObject listaButtons = new ListaObject();
            listaButtons.agregarDato("un dato");
            listaButtons.agregarDato(new JButton("1"));
            listaButtons.agregarDato(new JButton("2"));
            
            JButton boton1 = (JButton) listaButtons.obtenerValor(0);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        ListaGenerica<String> miListaString = new ListaGenerica<>();
        miListaString.agregarDato("v1");
        miListaString.agregarDato("v2");
        ListaGenerica<Integer> miListaInt = new ListaGenerica<>();
        miListaInt.agregarDato(25);
    }
}
