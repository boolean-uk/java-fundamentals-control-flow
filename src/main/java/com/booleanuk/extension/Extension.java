package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import java.util.Arrays;

public class Extension extends ExtensionBase {
    /*  1.
        We're going to improve our cake baking capabilities!

        Create a public method named timerStatus that accepts one parameter:
        - the number of minutes left on the timer

        The method must return "The cake is ready!" if the remaining minutes is 0,
        "The cake is still baking!" if there are any remaining minutes left,
        and "The timer finished ages ago!" if the remaining minutes is a negative number
     */

    public String timerStatus(int timeLeft) {
        if (timeLeft == 0) {
            return "The cake is ready!";
        } else if (timeLeft > 0) {
            return "The cake is still baking!";
        } else {
            return "The timer finished ages ago!";
        }
    }


    /*  2.
        Create a method named estimatePrepTime that accepts two parameters:
        - an array of ingredients, e.g. ["sugar", "milk", "flour", "eggs"]
        - the prep time per ingredient in minutes

        The method must return the total prep time required based on the number of ingredients
        provided and the prep time per ingredient.
        If a prep time of 0 is provided, the method should assume each ingredient takes 2 minutes to prepare.
     */

    public int estimatePrepTime(String[] ingredients, int prepTime) {
        int totalTime = 0;
        for (int i = 0; i < ingredients.length; i++) {
            if (prepTime == 0)
                totalTime += 2;
            else
                totalTime += prepTime;
        }

        return totalTime;
    }


    /*  3.
        Create a method named calculateGramsOfSugar that accepts two parameters:
        - an array of ingredients that will always contain 3 ingredients
        - the number of layers the cake has

        The cake will need 100g of sugar per layer, if that ingredient is present in the provided list of ingredients
        and 0g if that ingredient is missing.
        The method should return the number of grams of sugar needed to make the cake.

        You may need to use programming techniques we have yet to cover in the course to solve this task.
     */


    public int calculateGramsOfSugar(String[] ingredients, int layers) {
        int grams = 0;

        for (String ingredient : ingredients) {
            if (ingredient.equals("sugar")) {
                grams = layers * 100;
            }
        }

        return grams;
    }
}
