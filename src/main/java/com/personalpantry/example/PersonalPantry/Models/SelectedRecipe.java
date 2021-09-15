package com.personalpantry.example.PersonalPantry.Models;

public class SelectedRecipe {

    private Recipe recipe;
    private int desiredServings;

    public SelectedRecipe(Recipe recipe, int desiredServings) {
        this.recipe = recipe;
        this.desiredServings = desiredServings;
    }

    public SelectedRecipe(){}

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public int getDesiredServings() {
        return desiredServings;
    }

    public void setDesiredServings(int desiredServings) {
        this.desiredServings = desiredServings;
    }
}