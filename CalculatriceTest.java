package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

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
        assertEquals(5, calculatrice.add(1.0, 4.0));
        assertEquals(10, calculatrice.add(5.0, 5.0));
    }

    @Test
    void TestMultiplication(){
        assertEquals(64, calculatrice.add(8.0, 8.0));
    }

    void TestDivision(){
        assertEquals(2.0, calculatrice.div)
    }

    void TestDivisionParZéro{
        ArithmeticException exception = assertThrows(ArithmeticException.class,
                ()-> calculatrice.div(5.0, 0.0));
        assertEquals("Division par zéro", exception.getMessage());

    }
}
