package com.personalpantry.example.PersonalPantry;

import com.personalpantry.example.PersonalPantry.Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvancedMethodTests {

    private Recipe recipe;
    private SelectedRecipe selectedRecipe;
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private RecipeIngredient recipeIngredient1;
    private RecipeIngredient recipeIngredient2;
    private ShoppingList shoppingList;

@BeforeEach
    public void before() {
    recipe = new Recipe("banana omelette", 5, 690, "egg pancake with mashed bananas");
    ingredient1 = new Ingredient("Banana", Category.PRODUCE, UnitType.SINGLEUNIT);
    recipeIngredient1 = new RecipeIngredient(ingredient1, 1, recipe);
    ingredient2 = new Ingredient("egg", Category.DAIRYANDEGGS, UnitType.SINGLEUNIT);
    recipeIngredient2 = new RecipeIngredient(ingredient2, 6.2, recipe);
    recipe.addIngredientToRecipe(recipeIngredient1);
    recipe.addIngredientToRecipe(recipeIngredient2);
}

@Test
    public void canUpdateRecipeIngredientMeasuresByDesiredServings() {
    selectedRecipe = new SelectedRecipe(recipe, 4, shoppingList);
    recipe = selectedRecipe.getRecipe();
    List<RecipeIngredient> ingredientsList = recipe.getIngredients();
    assertEquals(4, ingredientsList.get(0).getMeasure());
    assertEquals(24.8, ingredientsList.get(1).getMeasure());
}

}