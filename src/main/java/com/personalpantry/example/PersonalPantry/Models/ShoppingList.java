package com.personalpantry.example.PersonalPantry.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList {

    private ArrayList<SelectedRecipe> recipeList;
    private HashMap<String, Integer> ingredientList;

    public ShoppingList() {
        this.recipeList = new ArrayList<>();
        this.ingredientList = new HashMap<>();
    }

////    public ShoppingList(){};
//    public void addToRecipeList(SelectedRecipe selectedRecipe){
//        recipeList.add(selectedRecipe);
//    }
//
//    public void addToIngredientList(Ingredient ingredient) {
//        // if ingredientList keyset contains ingredient name
//    if (ingredientList.containsKey(ingredient.getName()){
//        //get value linked to ingredient name key
//             Integer amount =
//        // add new value to existing value
//
//        // if ingredient name does not exist in keyset yet,
//        // add key and value pair to ingredientList
//    } else { ingredientList.put(ingredient.getName(), ingredient.)}
//
//
//        ingredientList.put(ingredient.getName(), ingredient.getCategory());
//    }
//    //loop through hashMap keys
//    // If key doesn't exist - .put()
//    // If key exists add new value to existing value


    public ArrayList<SelectedRecipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(ArrayList<SelectedRecipe> recipeList) {
        this.recipeList = recipeList;
    }

//    public HashMap<Ingredient, Integer> getIngredientList() {
//        return ingredientList;
//    }
//
//    public void setIngredientList(HashMap<Ingredient, Integer> ingredientList) {
//        this.ingredientList = ingredientList;
//    }

    public void addRecipeToShoppingList(SelectedRecipe selectedRecipe){
        this.recipeList.add(selectedRecipe);
    }

//    public void createShoppingList(){
//
}
