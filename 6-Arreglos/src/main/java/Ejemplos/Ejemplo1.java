package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author ztwen
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        byte[] notas;

        System.out.println("ingrese la catidad de alumnos --> ");
        int cantidad = leer.nextInt();

        notas = new byte[cantidad];

        //generar notas


        int nmax = 0, nmin = 50;
        int suma = 0;

        for (int i = 0; i < cantidad; i++) {
            notas[i] = (byte) (Math.random() * 21);
            suma+= notas[i];

            //algoritmo para la nota minima

            if(notas[i] < nmin) {
                nmin = notas[i];
            }

            //algoritmo para la nota maxima

            if(notas [i] > nmax) {
                nmax = notas[i];
            }
        }

        //imprimir las notas generadas

        for (int i = 0; i < cantidad; i++) {
            System.out.println("alumno "+(i+1)+" --> " + notas[i]);
        }

        double prom = suma * 1.0/cantidad;

        System.out.println("el promedio es: " + prom);
        System.out.println("la nota minima es: " + nmin);
        System.out.println("la nota maxima es: " + nmax);

    }

}