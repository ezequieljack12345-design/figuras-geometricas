package com.daktika.mates;

public class FigurasGeometricas {

     public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
     }

    public double calcularAreaRectangular(double base, double altura) {
        return base * altura;
    }
    public double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio ;
    }

    public double calcularPerimetroRectangular(double base, double altura) {
        return 2 * (base + altura);
    }
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
      }
    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;


    }
  }