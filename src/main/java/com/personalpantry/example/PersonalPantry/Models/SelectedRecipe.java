package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "selected_recipes")
public class SelectedRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int desiredServings;

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "shopping_list_id", nullable = false)
    private ShoppingList shopping_list;

    public SelectedRecipe(Recipe recipe, int desiredServings, ShoppingList shoppingList) {
        this.desiredServings = desiredServings;
//        this.recipe = updatedRecipe(recipe);
        this.recipe = recipe;
        this.shopping_list = shoppingList;
    }

    public SelectedRecipe(){}

//    public Recipe updatedRecipe(Recipe recipe){
//        List<RecipeIngredient> ingredientsList = recipe.getIngredients();
//        for (RecipeIngredient ingredient : ingredientsList){
//            double newMeasure = ingredient.getMeasure() * desiredServings;
//            ingredient.setMeasure(newMeasure);
//        }
//        return recipe;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShoppingList getShopping_list() {
        return shopping_list;
    }

    public void setShopping_list(ShoppingList shopping_list) {
        this.shopping_list = shopping_list;
    }
}