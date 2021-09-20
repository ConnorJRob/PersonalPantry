package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column
    private String imageUrl;

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
    public Recipe(String name, int readyInMinutes, int caloriesPerServing, String description, String imageUrl) {
        this.name = name; //name given when Recipe is created is saved as name
        this.readyInMinutes = readyInMinutes; //readyInMinutes given when Recipe is created is saved as readyInMinutes
        this.caloriesPerServing = caloriesPerServing; //caloriesPerServing given when Recipe is created is saved as caloriesPerServing
        this.description = description; //description given when Recipe is created is saved as description
        this.imageUrl = imageUrl;
        this.instructions = new ArrayList<>(); // instructions is saved as an empty arrayList
        this.recipeIngredients = new ArrayList<>();
    }

    public Recipe(){};

    public void addRecipeIngredientToRecipe(RecipeIngredient recipeIngredient){
        recipeIngredients.add(recipeIngredient);
    }

    public void addRecipeInstruction(String instructionStep){
        instructions.add(instructionStep);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
