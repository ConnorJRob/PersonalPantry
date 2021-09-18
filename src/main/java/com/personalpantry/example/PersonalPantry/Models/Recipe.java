package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name; //establish name variable as a String

    @Column(name = "ready_in_minutes")
    private int readyInMinutes; //establish readyInMinutes variable as Integer

    @Column(name = "calories_per_serving")
    private int caloriesPerServing; //establish caloriesPerServing variable as Integer

    @Column
    private String description; //establish description variable as String

    @ElementCollection
    @Column(columnDefinition = "LONGTEXT")
    private List<String> instructions; //establish an ArrayList variable which only takes Strings

    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "recipe", fetch = FetchType.LAZY)
    private List<RecipeIngredient> recipeIngredients; //establish an ArrayList variable which only takes RecipeIngredients

    @JsonIgnore
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "recipe", fetch = FetchType.LAZY)
    private List<SelectedRecipe> selectedRecipes;

    //establish Recipe constructor which takes the properties required for new recipe
    public Recipe(String name, int readyInMinutes, int caloriesPerServing, String description) {
        this.name = name; //name given when Recipe is created is saved as name
        this.readyInMinutes = readyInMinutes; //readyInMinutes given when Recipe is created is saved as readyInMinutes
        this.caloriesPerServing = caloriesPerServing; //caloriesPerServing given when Recipe is created is saved as caloriesPerServing
        this.description = description; //description given when Recipe is created is saved as description
        this.instructions = new ArrayList<>(); // instructions is saved as an empty arrayList
    }

    public Recipe(){};

    public void addIngredientToRecipe(RecipeIngredient recipeIngredient){
        recipeIngredients.add(recipeIngredient);
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

    public List<RecipeIngredient> getIngredients() { // getter function for ingredients
        return recipeIngredients;
    }

    public void setIngredients(ArrayList<RecipeIngredient> ingredients) { //setter function for ingredients
        this.recipeIngredients = ingredients;
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

    public List<String> getInstructions() {// getter function for instructions
        return instructions;
    }

    public void setInstructions(List<String> instructions) { //setter function for instructions
        this.instructions = instructions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(ArrayList<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public List<SelectedRecipe> getSelectedRecipes() {
        return selectedRecipes;
    }

    public void setSelectedRecipes(List<SelectedRecipe> selectedRecipes) {
        this.selectedRecipes = selectedRecipes;
    }
}
