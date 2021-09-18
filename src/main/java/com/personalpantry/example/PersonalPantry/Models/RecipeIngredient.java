package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "recipe_ingredients")
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double measure; //establish measure variable as an integer

    @Column(name = "picked_up")
    private boolean pickedUp; //establish pickedUp variable as a boolean

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient; //establish ingredient as ingredient

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    //establish RecipeIngredient constructor which takes the properties required for new recipe ingredient
    public RecipeIngredient(Ingredient ingredient, double measure, Recipe recipe) {
        this.ingredient = ingredient; //ingredient given when ingredient is created and saved as an ingredient
        this.measure = measure; //measure given when measure is created is saved as measure
        this.pickedUp = false; //pickedUp starts as false when a recipeIngredient is created
        this.recipe = recipe;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
