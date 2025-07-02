package Ejemplos;

import java.util.Arrays;

/**
Utilizamos Arrays.equals() que devuelve true o false.
 */

public class comparar {
    public static void main(String[] args) {

        char[] letras = { 'c', 'a', 'm', 'p', 'e', 'ó', 'n' };

        char[] letras2 = { 'c', 'a', 'm', 'p', 'e', 'o', 'n' };

        boolean iguales = Arrays.equals(letras, letras2);

        System.out.println(iguales? "son iguales": "son diferentes");
    }
}