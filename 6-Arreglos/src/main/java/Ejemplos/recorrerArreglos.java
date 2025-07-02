package Ejemplos;

/**
Haciendo uso de cualquier estructura repetitiva. 
La estructura repetitiva más utilizada en arreglos es for.
 */

public class recorrerArreglos {
    public static void main(String[] args) {
        
        int[] notas = { 11, 23, 16, 5, 88, 5, 8, 30, 73, 10 };
        
        for (int indice = 0; indice < 10; indice++) {
            System.out.println(notas[indice]);
        }   
    }
}
