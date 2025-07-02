/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author ztwen
 */
public class arreglos {
    public static void main(String[] args) {

        //declaracion y creacion de un arreglo//
        
        byte[] notas = new byte[5]; 

        notas[0] = 18;
        notas[1] = 12;
        notas[2] = 16;

        int prom = (notas[0] + notas[2])/2;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("notas["+i+"] --> " + notas[i]);
        }

        System.out.println("el promedio de las notas es " + prom);

        
        
        String[] vocales = {"a","e","i","o","u"}; //inicializar un arreglo//

        //determinacion de la longitud de un arreglo//

        int longitud = vocales.length;

        System.out.println(vocales[0]);

        System.out.println("la longitud es --> " + longitud);

        
        //imprimir el arreglo//

        for (int i = 0; i < 5; i++) {
            System.out.println("vocales["+i+"] --> " + vocales[i]);

        }
    }
}