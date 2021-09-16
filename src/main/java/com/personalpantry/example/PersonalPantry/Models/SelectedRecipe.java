package com.personalpantry.example.PersonalPantry.Models;

import java.util.ArrayList;

public class SelectedRecipe {

    private Recipe recipe;
    private int desiredServings;

    public SelectedRecipe(Recipe recipe, int desiredServings) {
        this.desiredServings = desiredServings;
        this.recipe = updatedRecipe(recipe);
    }

    public SelectedRecipe(){}

    public Recipe updatedRecipe(Recipe recipe){
        ArrayList<RecipeIngredient> ingredientsList = recipe.getIngredients();
        for (RecipeIngredient ingredient : ingredientsList){
            double newMeasure = ingredient.getMeasure() * desiredServings;
            ingredient.setMeasure(newMeasure);
        }
        return recipe;
        // get back ArrayList <RI>
        // for each RI
        //getMeasure()
        //measure * desiredServing
        // RI.setMeasure(newMeasure)
    }


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