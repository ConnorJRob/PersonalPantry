package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipe_ingredients")
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"ingredient"})
    @ManyToOne
    @JoinColumn(name = "recipe_ingredient_id", nullable = false)
    private Ingredient ingredient; //establish ingredient as ingredient

    @Column
    private double measure; //establish measure variable as an integer

    @Column(name = "picked_up")
    private boolean pickedUp; //establish pickedUp variable as a boolean

    @JsonIgnoreProperties({"recipe"})
    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
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
}
