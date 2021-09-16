package com.personalpantry.example.PersonalPantry.Models;

public class RecipeIngredient {

    private Ingredient ingredient; //establish ingredient as ingredient
    private double measure; //establish measure variable as an integer
    private boolean pickedUp; //establish pickedUp variable as a boolean

    //establish RecipeIngredient constructor which takes the properties required for new recipe ingredient
    public RecipeIngredient(Ingredient ingredient, double measure) {
        this.ingredient = ingredient; //ingredient given when ingredient is created and saved as an ingredient
        this.measure = measure; //measure given when measure is created is saved as measure
        this.pickedUp = false; //pickedUp starts as false when a recipeIngredient is created
    }

    public RecipeIngredient(){};

    public Ingredient getIngredient() { // getter function for ingredient
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) { // setter function for ingredient
        this.ingredient = ingredient;
    }

    public double getMeasure() { // getter function for measure
        return measure;
    }

    public void setMeasure(double measure) { // setter function for measure
        this.measure = measure;
    }

    public boolean isPickedUp() { // getter function for isPickedUp
        return pickedUp;
    }

    public void setPickedUp(boolean pickedUp) { // setter function for ingredient
        this.pickedUp = pickedUp;
    }
}
