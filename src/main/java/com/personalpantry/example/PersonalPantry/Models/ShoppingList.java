package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "shopping_lists")
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "shopping_list")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "shopping_list", fetch = FetchType.LAZY)
    private List<SelectedRecipe> recipeList;

//    @ElementCollection
//    @CollectionTable(name = "order_item_mapping",
//            joinColumns = {@JoinColumn(name = "order_id", referencedColumnName = "id")})
//    @MapKeyColumn(name = "item_name")
//    @Column(name = "price")

    @ElementCollection
    @CollectionTable(name = "ingredients_list", joinColumns = {@JoinColumn(name = "shopping_list_id", referencedColumnName = "id")})
    @MapKeyColumn(name="required_ingredients_key")
    @Column(name = "required_ingredients_value")
    private Map<String, Double> ingredientList;

//    @Column(name = "ingredient_list")

    public ShoppingList() {
        this.recipeList = new ArrayList<>();
        this.ingredientList = new HashMap<>();
    }

    public void createShoppingList(){
        ingredientList.clear();
        for (SelectedRecipe selectedRecipe : recipeList) {

            for (RecipeIngredient recipeIngredient : selectedRecipe.getRecipe().getRecipeIngredients()) {

                if(ingredientList.containsKey(recipeIngredient.getIngredient().getName())) {

                    String ingredientName = recipeIngredient.getIngredient().getName();
                    double newValue = ingredientList.get(ingredientName) + recipeIngredient.getMeasure();
                    ingredientList.replace(ingredientName, newValue);

                }

                else {
                    ingredientList.put(recipeIngredient.getIngredient().getName(), recipeIngredient.getMeasure());
                }
            }
        }
    }

    public void addRecipeToShoppingList(SelectedRecipe selectedRecipe){
        this.recipeList.add(selectedRecipe);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SelectedRecipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<SelectedRecipe> recipeList) {
        this.recipeList = recipeList;
    }

    public Map<String, Double> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(Map<String, Double> ingredientList) {
        this.ingredientList = ingredientList;
    }

}

//    List<RecipeIngredient> ingredientsList = recipe.getIngredients();
//        for (RecipeIngredient ingredient : ingredientsList) {
//                double newMeasure = ingredient.getMeasure() * desiredServings;
//                requiredIngredientsMap.put(ingredient.getIngredient().getName(), newMeasure);
//                }


