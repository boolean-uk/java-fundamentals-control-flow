package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExtensionTest {
    Extension extension;

    public ExtensionTest() {
        this.extension = new Extension();
    }

    @Test
    @Order(1)
    public void one() {
        Assertions.assertEquals("The cake is ready!", this.extension.timerStatus(0));
        Assertions.assertEquals("The cake is still baking!", this.extension.timerStatus(1));
        Assertions.assertEquals("The cake is still baking!", this.extension.timerStatus(23));
        Assertions.assertEquals("The timer finished ages ago!", this.extension.timerStatus(-1));
        Assertions.assertEquals("The timer finished ages ago!", this.extension.timerStatus(-25));
    }

    @Test
    @Order(2)
    public void two() {
        Assertions.assertEquals(5, this.extension.estimatePrepTime(new String[]{"milk", "sugar", "eggs", "flour", "chocolate"}, 1));
        Assertions.assertEquals(10, this.extension.estimatePrepTime(new String[]{"milk", "sugar", "eggs", "flour", "chocolate"}, 2));
        Assertions.assertEquals(10, this.extension.estimatePrepTime(new String[]{"milk", "sugar", "eggs", "flour", "chocolate"}, 0));
        Assertions.assertEquals(20, this.extension.estimatePrepTime(new String[]{"milk", "sugar"}, 10));
    }

    @Test
    @Order(3)
    public void three() {
        Assertions.assertEquals(0, this.extension.calculateGramsOfSugar(new String[]{"milk", "flour", "eggs"}, 3));
        Assertions.assertEquals(100, this.extension.calculateGramsOfSugar(new String[]{"milk", "flour", "sugar"}, 1));
        Assertions.assertEquals(200, this.extension.calculateGramsOfSugar(new String[]{"milk", "sugar", "eggs"}, 2));
        Assertions.assertEquals(300, this.extension.calculateGramsOfSugar(new String[]{"sugar", "flour", "eggs"}, 3));
        Assertions.assertEquals(400, this.extension.calculateGramsOfSugar(new String[]{"sugar", "milk", "eggs"}, 4));
    }
}
