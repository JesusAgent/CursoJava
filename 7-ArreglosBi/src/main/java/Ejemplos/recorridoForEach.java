package Ejemplos;

/**
Con for-each recorremos primero todas las filas (bucle externo)
Luego, recorremos todos los valores de dicha fila (bucle interno)
 */

public class recorridoForEach {  
    public static void main(String[] args) {  
  
        int[][] matriz = {{ 18, 6, 29 },{ 64, 11, 7 },{ 30, 81, 37 }};  
  
        for (int[] fila : matriz) {  
            for(int valor : fila) {  
                System.out.printf("%2d ", valor);  
            }  
            System.out.println();  
        }  
    }  
}
