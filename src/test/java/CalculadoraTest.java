import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // SOMAR

    @Test
    public void testeSomarCT01() {
        //Config
        Calculadora c = new Calculadora();

        //Verificacao
        assertEquals(15.0, c.somar(10, 5));
    }

    @Test
    public void testeSomarCT02() {
        Calculadora c = new Calculadora();

        assertEquals(16.0, c.somar(10.5, 5.5));
    }

    @Test
    public void testeSomarCT03() {
        Calculadora c = new Calculadora();

        assertEquals(-15.0, c.somar(-10, -5));
    }

    @Test
    public void testeSomarCT04() {
        Calculadora c = new Calculadora();

        assertEquals(10.5, c.somar(10.5, 0));
    }

    // SUBTRAIR

    @Test
    public void testeSubtrairCT01() {
        Calculadora c = new Calculadora();

        assertEquals(5.0, c.subtrair(10, 5));
    }

    @Test
    public void testeSubtrairCT02() {
        Calculadora c = new Calculadora();

        assertEquals(-3.0, c.subtrair(54, 57));
    }

    @Test
    public void testeSubtrairCT03() {
        Calculadora c = new Calculadora();

        assertEquals(5.0, c.subtrair(-5, -10));
    }

    @Test
    public void testeSubtrairCT04() {
        Calculadora c = new Calculadora();

        assertEquals(12.0, c.subtrair(12, 0));
    }

    // MULTIPLICAR

    @Test
    public void testeMultiplicarCT01() {
        Calculadora c = new Calculadora();

        assertEquals(25.0, c.multiplicar(5, 5));
    }

    @Test
    public void testeMultiplicarCT02() {
        Calculadora c = new Calculadora();

        assertEquals(-8.0, c.multiplicar(4, -2));
    }

    @Test
    public void testeMultiplicarCT03() {
        Calculadora c = new Calculadora();

        assertEquals(36.0, c.multiplicar(-9, -4));
    }

    @Test
    public void testeMultiplicarCT04() {
        Calculadora c = new Calculadora();

        assertEquals(0.0, c.multiplicar(10, 0));
    }

    // DIVIDIR

    @Test
    public void testeDividirCT01() {
        Calculadora c = new Calculadora();

        assertEquals(20.0, c.dividir(40, 2));
    }

    @Test
    public void testeDividirCT02() {
        Calculadora c = new Calculadora();

        assertEquals(2.0, c.dividir(-12, -6));
    }

    @Test
    public void testeDividirCT03() {
        Calculadora c = new Calculadora();

        assertEquals(0.0, c.dividir(10, 0));
    }

    @Test
    public void testeDividirCT04() {
        Calculadora c = new Calculadora();

        assertEquals(0.0, c.dividir(0, 0));
    }
}
