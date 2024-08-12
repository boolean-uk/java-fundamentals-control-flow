package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import java.util.Objects;

public class Extension extends ExtensionBase {
    /*  1.
        We're going to improve our cake baking capabilities!

        Create a public method named timerStatus that accepts one parameter:
        - the number of minutes left on the timer

        The method must return "The cake is ready!" if the remaining minutes is 0,
        "The cake is still baking!" if there are any remaining minutes left,
        and "The timer finished ages ago!" if the remaining minutes is a negative number
     */
    public String timerStatus(int timer){
        if(timer == 0) return "The cake is ready!";
        if(timer < 0) return "The timer finished ages ago!";
        return "The cake is still baking!";
    }



    /*  2.
        Create a method named estimatePrepTime that accepts two parameters:
        - an array of ingredients, e.g. ["sugar", "milk", "flour", "eggs"]
        - the prep time per ingredient in minutes

        The method must return the total prep time required based on the number of ingredients
        provided and the prep time per ingredient.
        If a prep time of 0 is provided, the method should assume each ingredient takes 2 minutes to prepare.
     */
    public int estimatePrepTime(String[] ingredients, int prep_per_ingredient){
        int things_to_prep = ingredients.length;
        if(prep_per_ingredient == 0) return things_to_prep * 2;
        return things_to_prep * prep_per_ingredient;
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

    public int calculateGramsOfSugar(String[] ingredients, int layers){
        int sugarNeeded = 0;
        for(String ingredient: ingredients){
            if (Objects.equals(ingredient, "sugar")){
                return 100 * layers;
            }
        }
        return 0;
    }
    // ??



}
