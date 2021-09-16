package com.personalpantry.example.PersonalPantry.Models;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingList {

    private ArrayList<SelectedRecipe> recipeList;
    private HashMap<Ingredient, Integer> ingredientList;

    public ShoppingList() {
        this.recipeList = new ArrayList<>();
        this.ingredientList = new HashMap<>();
    }

//    public ShoppingList(){};

    public ArrayList<SelectedRecipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(ArrayList<SelectedRecipe> recipeList) {
        this.recipeList = recipeList;
    }

    public HashMap<Ingredient, Integer> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(HashMap<Ingredient, Integer> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public void addRecipeToShoppingList(SelectedRecipe selectedRecipe){
        this.recipeList.add(selectedRecipe);
    }

//    public void createShoppingList(){}
}
