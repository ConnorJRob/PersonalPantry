package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name = "shopping_lists")
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"shopping_list"})
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "shopping_list", fetch = FetchType.LAZY)
    private List<SelectedRecipe> recipeList;

    private HashMap<String, Integer> ingredientList;

    public ShoppingList() {
        this.recipeList = new ArrayList<>();
        this.ingredientList = new HashMap<>();
    }

    public void addRecipeToShoppingList(SelectedRecipe selectedRecipe){
        this.recipeList.add(selectedRecipe);
    }

    public List<SelectedRecipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<SelectedRecipe> recipeList) {
        this.recipeList = recipeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HashMap<String, Integer> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(HashMap<String, Integer> ingredientList) {
        this.ingredientList = ingredientList;
    }

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
//        ingredientList.put(ingredient.getName(), ingredient.getCategory());
//    }
//    //loop through hashMap keys
//    // If key doesn't exist - .put()
//    // If key exists add new value to existing value

//    public void createShoppingList(){}
}
