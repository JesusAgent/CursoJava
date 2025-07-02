/*
Crear un programa en Java que almacene N valores 
enteros aleatorios en un arreglo y luego los muestre 
en pantalla.

Acumular los números en una cadena (separados por 
coma) utilizando append() de la clase StringBuilder.

Adicionalmente, debe calcular y mostrar la suma de 
los números.

Recorrer el arreglo utilizando las tres estructuras 
repetitivas conocidas.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ztwen
 */
public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("ingrese la cantidad de valores para un arreglo");
        int n = leer.nextInt();
        
        int[] arreglo = new int[n];
        

        StringBuilder resultado = new StringBuilder();
        int suma = 0;
        


        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(101);
            suma += arreglo[i]; //acumular la suma
            resultado.append(arreglo[i]);
            

            if (i < n - 1) {
                resultado.append(", ");
            }
        }
        
        System.out.println("\nnumeros generados " + resultado);
        System.out.println("suma de los numeros es " + suma);
    
        
        System.out.println("recorrido con for");
        for (int i = 0; i < n; i++) { 
            System.out.println(arreglo[i]);
        }
        
        
        System.out.println("recorrido con while");
        int i = 0;
        while (i < n) {
            System.out.println(arreglo[i]);
            i++;
        }
        
        System.out.println("recorrido con do-while");
        i = 0;
        do {
            System.out.println(arreglo[i]);
            i++;
        } while (i < n);
        
    }
}
