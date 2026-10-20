package com.daktika;

import org.junit.jupiter.api.Test;

import com.daktika.mates.FigurasGeometricas;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigurasGeometricasTest {

    @Test
    public void area_circuloRadio2_retornaAreaCorrecta() {
        //Preparación (Arrange)
        FigurasGeometricas figuras = new FigurasGeometricas();
        
        //Ejecución (Act)
        double resultado = figuras.calcularAreaCirculo(2.0);
        
        //Verificación (Assert)
        double expResultado = Math.PI * 2.0 * 2.0;
        assertEquals(expResultado, resultado, 0.001);
    }

    @Test
    public void perimetro_circuloRadio2_retornaPerimetroCorrecto() {
        //Preparación (Arrange)
        FigurasGeometricas figuras = new FigurasGeometricas();
        
        //Ejecución (Act)
        double resultado = figuras.calcularPerimetroCirculo(2.0);
        
        //Verificación (Assert)
        double expResultado = 2 * Math.PI * 2.0;
        assertEquals(expResultado, resultado, 0.001);
    }

    @Test
    public void area_rectangularBase5Altura4_retorna20() {
        //Preparación (Arrange)
        FigurasGeometricas figuras = new FigurasGeometricas();
        
        //Ejecución (Act)
        double resultado = figuras.calcularAreaRectangular(5.0, 4.0); // Corregido aquí
        
        //Verificación (Assert)
        double expResultado = 20.0;
        assertEquals(expResultado, resultado, 0.001);
    }

    @Test
    public void perimetro_rectangularBase5Altura4_retorna18() {
        //Preparación (Arrange)
        FigurasGeometricas figuras = new FigurasGeometricas();
        
        //Ejecución (Act)
        double resultado = figuras.calcularPerimetroRectangular(5.0, 4.0); // Corregido aquí
        
        //Verificación (Assert)
        double expResultado = 18.0;
        assertEquals(expResultado, resultado, 0.001);
    }

    @Test
    public void area_trianguloBase10Altura5_retorna25() {
        //Preparación (Arrange)
        FigurasGeometricas figuras = new FigurasGeometricas();
        
        //Ejecución (Act)
        double resultado = figuras.calcularAreaTriangulo(10.0, 5.0);
        
        //Verificación (Assert)
        double expResultado = 25.0;
        assertEquals(expResultado, resultado, 0.001);
    }
    
    @Test
    public void perimetro_trianguloLados3_4_5_retorna12() {
        //Preparación (Arrange)
        FigurasGeometricas figuras = new FigurasGeometricas();
        
        //Ejecución (Act)
        double resultado = figuras.calcularPerimetroTriangulo(3.0, 4.0, 5.0);
        
        //Verificación (Assert)
        double expResultado = 12.0;
        assertEquals(expResultado, resultado, 0.001);
    }
}
