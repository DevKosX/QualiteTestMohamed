package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {
    private Calculatrice calculatrice;

    @BeforeEach
    void init(){
        calculatrice = new Calculatrice();
    }
/** Aide de https://junit.org/junit5/docs/current/user-guide/*/
    @Test
    void TestAddition(){
        assertEquals(5f, calculatrice.add(1.0f, 4.0f));
        assertEquals(10f, calculatrice.add(5.0f, 5.0f));
    }

    @Test
    void TestMultiplication(){
        assertEquals(64f, calculatrice.mult(8.0f, 8.0f));
        assertEquals(28f, calculatrice.mult(14.0f, 2.0f));
    }

    @Test
    void TestDivision(){
        assertEquals(2.0f, calculatrice.div(8.0f, 4.0f));
        assertEquals(4.0f, calculatrice.div(8.0f, 2.0f));
    }

    /** Aide https://howtodoinjava.com/junit5/expected-exception-example pour le AssertThrows*/

    @Test
    void TestDivisionParZéro(){
        ArithmeticException exception = assertThrows(ArithmeticException.class,
                ()-> calculatrice.div(5.0f, 0.0f));
        assertEquals("Division par zéro", exception.getMessage());

    }

    @Test
    void testSoustraction() {
        assertEquals(2.0f, calculatrice.minus(5.0f, 3.0f));
        assertEquals(-1.0f, calculatrice.minus(2.0f, 3.0f));
    }

}
