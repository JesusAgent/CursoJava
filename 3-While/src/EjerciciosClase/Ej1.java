/*
Escribir un programa que muestre los números pares menores a 20. 
contar cuántos números se mostraron y calcular la suma de todos ellos.
 */

package EjerciciosClase;

public class Ej1 {  
    public static void main(String[] args) {  
         
        int i = 0;  
        int conteo = 0;  
        int suma = 0;  
          
        System.out.println("numeros pares menores a 20");  
          
        while (i < 20) {  
            if (i % 2 == 0) {  
                conteo = conteo + 1;  
                suma = suma + i;  
                System.out.println(i + ", ");  
            }  
            i = i + 1;  
        }  
          
        System.out.println("conteo: " + conteo);  
        System.out.println("suma: " + suma);  
    }  
}
