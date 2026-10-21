package com.daktika.mates;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos el objeto de nuestras figuras
        FigurasGeometricas figuras = new FigurasGeometricas();

        // 2. Hacemos los cálculos y los mostramos por pantalla
        System.out.println("--- PRUEBAS DE FIGURAS GEOMÉTRICAS ---");
        
        System.out.println("Área del círculo (radio 2): " + figuras.calcularAreaCirculo(2.0));
        System.out.println("Perímetro del círculo (radio 2): " + figuras.calcularPerimetroCirculo(2.0));
        
        System.out.println("Área del rectángulo (5x4): " + figuras.calcularAreaRectangular(5.0, 4.0));
        System.out.println("Perímetro del rectángulo (5x4): " + figuras.calcularPerimetroRectangular(5.0, 4.0));
        
        System.out.println("Área del triángulo (base 10, altura 5): " + figuras.calcularAreaTriangulo(10.0, 5.0));
        System.out.println("Perímetro del triángulo (3, 4, 5): " + figuras.calcularPerimetroTriangulo(3.0, 4.0, 5.0));
    }
}