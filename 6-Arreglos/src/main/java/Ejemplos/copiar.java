package Ejemplos;

/*
La clase System incluye el método arraycopy() para copiar el contenido de un arreglo en otro
 */


public class copiar {
    public static void main(String[] args) {

        int[] datos = {10,20,30,40,50,60,70,80};

        int[] datosCop = new int[12];

        System.arraycopy(datos, 0, datosCop,0, datos.length);


        for (int d: datosCop) {
            System.out.println("---> " + d);
        }
    }
}