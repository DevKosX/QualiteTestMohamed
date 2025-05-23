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
        assertEquals(10, calculatrice.add(5.0, 5.0))
    }
}
