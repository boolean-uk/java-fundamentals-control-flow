package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*  1.
        We're going to improve our cake baking capabilities!

        Create a public method named timerStatus that accepts one parameter:
        - the number of minutes left on the timer

        The method must return "The cake is ready!" if the remaining minutes is 0,
        "The cake is still baking!" if there are any remaining minutes left,
        and "The timer finished ages ago!" if the remaining minutes is a negative number
     */
    public String timerStatus(int num) {
        if (num < 0) {
            return "The timer finished ages ago!";
        } else if (num == 0) {
            return "The cake is ready!";
        } else {
            return "The cake is still baking!";
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

        if (prepTime == 0) {
            return ingredients.length * 2;
        } else {
            return ingredients.length * prepTime;
        }
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

    public int calculateGramsOfSugar (String[] ingredients, int layers) {
        int gramsOfSugar = 0;
        for (String ingredient: ingredients) {
            if ("sugar".equalsIgnoreCase(ingredient)) {
                gramsOfSugar = 100;
                break;
            }
        }
        return gramsOfSugar * layers;
    }




}
