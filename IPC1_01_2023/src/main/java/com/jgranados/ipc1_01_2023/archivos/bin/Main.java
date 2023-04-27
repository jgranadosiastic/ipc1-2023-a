/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jgranados.ipc1_01_2023.archivos.bin;

import com.jgranados.ipc1_01_2023.alumnos.Alumno;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pathArchivo = "miArchivoDeDatos.dat";
        String pathArchivoObj = "miArchivoDeObjeto.dat";
        File file = new File(pathArchivo);

        /*try (
            FileOutputStream outFile = new FileOutputStream(file);
            DataOutputStream outputStream = new DataOutputStream(outFile)) {
            outputStream.writeFloat(71.5f);
            outputStream.writeFloat(171.61f);
            outputStream.writeFloat(3071.85f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try (
                FileInputStream inFile = new FileInputStream(file);
                DataInputStream inputStream = new DataInputStream(inFile)) {
            float total = 0;
            float val = inputStream.readFloat();
            total = total + val;
            System.out.println("valor 1 "+ val);
            val = inputStream.readFloat();
            total = total + val;
            System.out.println("valor 2 "+ val);
            val = inputStream.readFloat();
            total = total + val;
            System.out.println("valor 3 "+ val);
            System.out.println("Total:" + total);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        
        /*try (
                FileOutputStream outFile = new FileOutputStream(file);
                DataOutputStream outputStream = new DataOutputStream(outFile)) {
            outputStream.writeUTF("Nombre Estudiante");
            outputStream.writeInt(25);
            outputStream.writeFloat(68.35f);
            outputStream.writeUTF("213546546");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                FileInputStream inFile = new FileInputStream(file);
                DataInputStream inputStream = new DataInputStream(inFile)) {
            String nombre = inputStream.readUTF();
            int cantCursos = inputStream.readInt();
            float promedio = inputStream.readFloat();
            String carnet = inputStream.readUTF();
            System.out.printf("Nombre: %s, cursos: %d, prom: %f, carnet: %s\n",
                    nombre,
                    cantCursos,
                    promedio,
                    carnet);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        
        
        // OBJETOS
        
        Alumno alumno = new Alumno("12345", "nombre", new double[] {51.5, 80.5, 70.0});
        File fileObj = new File(pathArchivoObj);
        
        try (
            FileOutputStream outFile = new FileOutputStream(fileObj);
                ObjectOutputStream outputStream = new ObjectOutputStream(outFile)) {
            outputStream.writeObject(alumno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try (
            FileInputStream inFile = new FileInputStream(fileObj);
                ObjectInputStream inputStream = new ObjectInputStream(inFile)) {
            Alumno alumnoGuardado = (Alumno) inputStream.readObject();
            alumnoGuardado.imprimirDatos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
