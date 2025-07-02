/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author ztwen
 */
class Boleta {
    // Atributos (Arreglos paralelos)
    private String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor"};
    private double[] precios = {3500.00, 50.00, 120.00, 800.00};
    private int[] cantidades = {1, 2, 1, 1};

    // Constante del IGV (18%)
    private static final double IGV_TASA = 0.18;

    // Método para generar la boleta en formato ASCII
    public void generarBoleta() {
        double totalSinIGV = 0;

        // StringBuilder para construir el reporte
        StringBuilder reporte = new StringBuilder();
        reporte.append("====================================\n");
        reporte.append("          BOLETA DE VENTA           \n");
        reporte.append("====================================\n");
        reporte.append(String.format("%-10s %-10s %-10s %-10s\n", "Producto", "Precio", "Cantidad", "Total"));
        reporte.append("------------------------------------\n");

        // Cálculo de montos por producto
        for (int i = 0; i < productos.length; i++) {
            double monto = precios[i] * cantidades[i];
            totalSinIGV += monto;
            reporte.append(String.format("%-10s S/.%-8.2f %-10d S/.%-8.2f\n",
                    productos[i], precios[i], cantidades[i], monto));
        }

        // Cálculo del IGV y total
        double igv = totalSinIGV * IGV_TASA;
        double totalConIGV = totalSinIGV + igv;

        // Agregar totales al reporte
        reporte.append("------------------------------------\n");
        reporte.append(String.format("Subtotal:        S/.%-8.2f\n", totalSinIGV));
        reporte.append(String.format("IGV (18%%):      S/.%-8.2f\n", igv));
        reporte.append(String.format("TOTAL A PAGAR:   S/.%-8.2f\n", totalConIGV));
        reporte.append("====================================\n");

        // Mostrar el reporte
        System.out.println(reporte.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        Boleta boleta = new Boleta();
        boleta.generarBoleta();
    }
}
