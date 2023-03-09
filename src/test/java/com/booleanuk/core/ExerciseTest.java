package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    @Order(1)
    public void answerOne() {
        Assertions.assertEquals("Good day!", this.exercise.one());
    }

    @Test
    @Order(2)
    public void answerTwo() {
        Assertions.assertEquals("Good morning!", this.exercise.two());
    }

    @Test
    @Order(3)
    public void answerThree() {
        Assertions.assertEquals("Good morning!", this.exercise.three());
    }

    @Test
    @Order(4)
    public void answerFour() {
        Assertions.assertEquals("Good morning!", this.exercise.four());
    }

    @Test
    @Order(5)
    public void answerFive() {
        Assertions.assertEquals("Good day!", this.exercise.five());
    }

    @Test
    @Order(6)
    public void answerSix() {
        Assertions.assertEquals("Correct!", this.exercise.six(8));
        Assertions.assertEquals("Wrong!", this.exercise.six(6));
        Assertions.assertEquals("Wrong!", this.exercise.six(7));
    }

    @Test
    @Order(7)
    public void answerSeven() {
        Assertions.assertEquals("Correct!", this.exercise.seven(false));
        Assertions.assertEquals("Wrong!", this.exercise.seven(true));
    }

    @Test
    @Order(8)
    public void answerEight() {
        Assertions.assertEquals("Correct!", this.exercise.eight(8, 8));
        Assertions.assertEquals("Correct!", this.exercise.eight(10, 8));
        Assertions.assertEquals("Wrong!", this.exercise.eight(8, 6));
    }

    @Test
    @Order(9)
    public void answerNine() {
        Assertions.assertTrue(this.exercise.nine(new int[]{3, 6, 7}));
        Assertions.assertFalse(this.exercise.nine(new int[0]));
    }

    @Test
    @Order(10)
    public void answerTen() {
        Assertions.assertTrue(this.exercise.ten("I need to buy milk and coffee"));
        Assertions.assertFalse(this.exercise.ten("I need to buy tea and coffee"));
    }

    @Test
    @Order(11)
    public void answerEleven() {
        Assertions.assertEquals(3, this.exercise.eleven("I need to buy milk"));
        Assertions.assertEquals(6, this.exercise.eleven("I need to buy coffee"));
        Assertions.assertEquals(9, this.exercise.eleven("I need to buy milk and coffee"));
        Assertions.assertEquals(0, this.exercise.eleven("I need to buy a video game"));
    }

    @Test
    @Order(12)
    public void answerTwelve() {
        Assertions.assertTrue(this.exercise.twelve(5, 5, 5));
        Assertions.assertTrue(this.exercise.twelve(5, 3, 7));
        Assertions.assertTrue(this.exercise.twelve(5, 5, 7));
        Assertions.assertTrue(this.exercise.twelve(5, 3, 5));
        Assertions.assertFalse(this.exercise.twelve(5, 6, 5));
        Assertions.assertFalse(this.exercise.twelve(5, 3, 4));
    }

    @Test
    @Order(13)
    public void answerThirteen() {
        Assertions.assertEquals("Baby", this.exercise.thirteen(0));
        Assertions.assertEquals("Toddler", this.exercise.thirteen(1));
        Assertions.assertEquals("Toddler", this.exercise.thirteen(2));
        Assertions.assertEquals("Toddler", this.exercise.thirteen(3));
        Assertions.assertEquals("Toddler", this.exercise.thirteen(4));
        Assertions.assertEquals("Child", this.exercise.thirteen(5));
        Assertions.assertEquals("Child", this.exercise.thirteen(8));
        Assertions.assertEquals("Child", this.exercise.thirteen(12));
        Assertions.assertEquals("Teenager", this.exercise.thirteen(13));
        Assertions.assertEquals("Teenager", this.exercise.thirteen(15));
        Assertions.assertEquals("Teenager", this.exercise.thirteen(19));
        Assertions.assertEquals("Adult", this.exercise.thirteen(20));
        Assertions.assertEquals("Adult", this.exercise.thirteen(32));
        Assertions.assertEquals("Adult", this.exercise.thirteen(1928));
    }
}
