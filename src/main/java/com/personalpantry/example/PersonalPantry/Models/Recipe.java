package com.personalpantry.example.PersonalPantry.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.ArrayList;

@Entity
@Table(name = "recipes")
public class Recipe {

    private String name; //establish name variable as a String
    private int readyInMinutes; //establish readyInMinutes variable as Integer
    private int caloriesPerServing; //establish caloriesPerServing variable as Integer
    private String description; //establish description variable as String
    private ArrayList<RecipeIngredient> ingredients; //establish an ArrayList variable which only takes RecipeIngredients
    private ArrayList<String> instructions; //establish an ArrayList variable which only takes Strings

    //establish Recipe constructor which takes the properties required for new recipe
    public Recipe(String name, int readyInMinutes, int caloriesPerServing, String description) {
        this.name = name; //name given when Recipe is created is saved as name
        this.readyInMinutes = readyInMinutes; //readyInMinutes given when Recipe is created is saved as readyInMinutes
        this.caloriesPerServing = caloriesPerServing; //caloriesPerServing given when Recipe is created is saved as caloriesPerServing
        this.description = description; //description given when Recipe is created is saved as description
        this.ingredients = new ArrayList<>(); // the ingredients is saved as an empty arrayList
        this.instructions = new ArrayList<>(); // instructions is saved as an empty arrayList
    }

    public Recipe(){};

    public void addIngredientToRecipe(RecipeIngredient recipeIngredient){
        ingredients.add(recipeIngredient);
    }

    public void addRecipeInstruction(String instructionStep){
        instructions.add(instructionStep);
    }

    public String getName() { // getter function for name
        return name;
    }

    public void setName(String name) { //setter function for name
        this.name = name;
    }

    public ArrayList<RecipeIngredient> getIngredients() { // getter function for ingredients
        return ingredients;
    }

    public void setIngredients(ArrayList<RecipeIngredient> ingredients) { //setter function for ingredients
        this.ingredients = ingredients;
    }

    public int getReadyInMinutes() { // getter function for readyInMinutes
        return readyInMinutes;
    }

    public void setReadyInMinutes(int readyInMinutes) { //setter function for readyInMinutes
        this.readyInMinutes = readyInMinutes;
    }

    public int getCaloriesPerServing() { // getter function for caloriesPerServing
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(int caloriesPerServing) { //setter function for caloriesPerServing
        this.caloriesPerServing = caloriesPerServing;
    }

    public String getDescription() { // getter function for description
        return description;
    }

    public void setDescription(String description) { //setter function for description
        this.description = description;
    }

    public ArrayList<String> getInstructions() {// getter function for instructions
        return instructions;
    }

    public void setInstructions(ArrayList<String> instructions) { //setter function for instructions
        this.instructions = instructions;
    }
}
