package com.booleanuk.helpers;

public class ExtensionBase {
    public String timerStatus(int remaining) {
        if(remaining<0){
            return "The timer finished ages ago!";
        } else if(remaining==0){
            return "The cake is ready!";
        }else {
            return "The cake is still baking!";
        }
    }

    public int estimatePrepTime(String[] ingredients, int times) {
        if(times ==0){
            return ingredients.length*2;
        }else{
            return ingredients.length*times;
        }

    }

    public int calculateGramsOfSugar(String[] ingredients, int layers) {
        for(int i=0;i<ingredients.length;i++){
            if(ingredients[i].equals("sugar")){
                return layers*100;
            }
        }
        return 0;
    }
}
