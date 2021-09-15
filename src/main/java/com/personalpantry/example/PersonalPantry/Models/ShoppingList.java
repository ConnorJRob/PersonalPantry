package com.personalpantry.example.PersonalPantry.Models;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingList {

    private ArrayList<Recipe> recipeList;
    private HashMap<String, Integer> ingredientList;

    public ShoppingList() {
        this.recipeList = new ArrayList<>();
        this.ingredientList = new HashMap<>();
    }

//    public ShoppingList(){};

    public ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(ArrayList<Recipe> recipeList) {
        recipeList = recipeList;
    }

    public HashMap<String, Integer> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(HashMap<String, Integer> ingredientList) {
        this.ingredientList = ingredientList;
    }
}
