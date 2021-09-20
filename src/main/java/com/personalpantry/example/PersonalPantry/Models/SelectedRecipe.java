package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "selected_recipes")
public class SelectedRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int desiredServings;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "shopping_list_id", nullable = false)
    private ShoppingList shopping_list;

    @ElementCollection
    @CollectionTable(name = "updated_measures", joinColumns = {@JoinColumn(name = "selected_recipe_id", referencedColumnName = "id")})
    @MapKeyColumn(name="updated_measures_key")
    @Column(name = "updated_measures_value")
    private Map<String, Double> updatedMeasuresMap;

    public SelectedRecipe(Recipe recipe, int desiredServings, ShoppingList shoppingList) {
//        this.recipe = updatedRecipe(recipe);
        this.desiredServings = desiredServings;
        this.recipe = recipe;
        this.shopping_list = shoppingList;
//        this.updatedMeasuresMap = new HashMap<>();
        this.updatedMeasuresMap = updatedRecipe(recipe);
    }

    public SelectedRecipe(){}

    public HashMap<String, Double> updatedRecipe(Recipe recipe){
        HashMap<String, Double> instanceMap = new HashMap<>();

        List<RecipeIngredient> ingredientsList = recipe.getRecipeIngredients();

        for (RecipeIngredient recipeIngredient : ingredientsList){

            double newMeasure = recipeIngredient.getMeasure() * desiredServings;
            instanceMap.put(recipeIngredient.getIngredient().getName(), newMeasure);

        }
        return instanceMap;
    }

//    public void updatedRecipe(Recipe recipe){
//        List<RecipeIngredient> ingredientsList = recipe.getRecipeIngredients();
//        for (RecipeIngredient recipeIngredient : ingredientsList){
//            double newMeasure = recipeIngredient.getMeasure() * desiredServings;
//            updatedMeasuresMap.put(recipeIngredient.getIngredient().getName(), newMeasure);
//        }
//    }

//    public Recipe updatedRecipe(Recipe recipe){
////        Recipe copyOfRecipe = recipe;
//        List<RecipeIngredient> ingredientsList = recipe.getRecipeIngredients();
//        for (RecipeIngredient recipeIngredient : ingredientsList){
//            double newMeasure = recipeIngredient.getMeasure() * desiredServings;
//            recipeIngredient.setMeasure(newMeasure);
//        }
//        return recipe;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDesiredServings() {
        return desiredServings;
    }

    public void setDesiredServings(int desiredServings) {
        this.desiredServings = desiredServings;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public ShoppingList getShopping_list() {
        return shopping_list;
    }

    public void setShopping_list(ShoppingList shopping_list) {
        this.shopping_list = shopping_list;
    }

    public Map<String, Double> getUpdatedMeasuresMap() {
        return updatedMeasuresMap;
    }

    public void setUpdatedMeasuresMap(Map<String, Double> updatedMeasuresMap) {
        this.updatedMeasuresMap = updatedMeasuresMap;
    }
}