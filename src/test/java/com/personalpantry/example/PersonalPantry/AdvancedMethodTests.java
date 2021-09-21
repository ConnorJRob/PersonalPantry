package com.personalpantry.example.PersonalPantry;

import com.personalpantry.example.PersonalPantry.Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvancedMethodTests {

    private Recipe recipe;
//    private Recipe recipe2;
    private SelectedRecipe selectedRecipe1;
    private SelectedRecipe selectedRecipe2;
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private RecipeIngredient recipeIngredient1;
    private RecipeIngredient recipeIngredient2;
    private RecipeIngredient recipeIngredient3;
    private RecipeIngredient recipeIngredient4;
    private ShoppingList shoppingList;

@BeforeEach
    public void before() {

    shoppingList = new ShoppingList();

    recipe = new Recipe("banana omelette", 5, 690, "egg pancake with mashed bananas", "URLSTRING");
//    recipe2 = new Recipe("banana omelette", 5, 690, "egg pancake with mashed bananas");

    ingredient1 = new Ingredient("Banana", Category.PRODUCE, UnitType.X);
    ingredient2 = new Ingredient("Egg", Category.DAIRYANDEGGS, UnitType.X);

    recipeIngredient1 = new RecipeIngredient(ingredient1, 1, recipe);
//    recipeIngredient2 = new RecipeIngredient(ingredient1, 1, recipe2);
    recipeIngredient3 = new RecipeIngredient(ingredient2, 6.2, recipe);
//    recipeIngredient4 = new RecipeIngredient(ingredient2, 6.2, recipe2);


    recipe.getRecipeIngredients().add(recipeIngredient1);
    recipe.getRecipeIngredients().add(recipeIngredient3);

//    recipe2.getRecipeIngredients().add(recipeIngredient2);
//    recipe2.getRecipeIngredients().add(recipeIngredient4);
}
//
//@Test
//    public void canUpdateRecipeIngredientMeasuresByDesiredServings() {
//    selectedRecipe = new SelectedRecipe(recipe, 4, shoppingList);
//    recipe = selectedRecipe.getRecipe();
//    List<RecipeIngredient> ingredientsList = recipe.getIngredients();
//    assertEquals(4, ingredientsList.get(0).getMeasure());
//    assertEquals(24.8, ingredientsList.get(1).getMeasure());
//    }

    @Test
    public void canGenerateShoppingList() {
    selectedRecipe1 = new SelectedRecipe(recipe, 4, shoppingList);
    shoppingList.addRecipeToShoppingList(selectedRecipe1);
    shoppingList.createShoppingList();
    assertEquals(4, shoppingList.getIngredientList().get("Banana"));
    assertEquals(24.8, shoppingList.getIngredientList().get("Egg"));
    }

    @Test
    public void canGenerateShoppingListWithMultipleSelectedRecipes() {
        selectedRecipe1 = new SelectedRecipe(recipe, 2, shoppingList);
        selectedRecipe2 = new SelectedRecipe(recipe, 1, shoppingList);
        shoppingList.addRecipeToShoppingList(selectedRecipe1);
        shoppingList.addRecipeToShoppingList(selectedRecipe2);
        shoppingList.createShoppingList();
        assertEquals(3, shoppingList.getIngredientList().get("Banana"));
        assertEquals(18.6, shoppingList.getIngredientList().get("Egg"));
    }

//    @Test
//    public void canGenerateShoppingList() {
//        selectedRecipe1 = new SelectedRecipe(recipe, 4, shoppingList);
//        shoppingList.addRecipeToShoppingList(selectedRecipe1);
//        shoppingList.createShoppingList();
//        assertEquals(4, shoppingList.getIngredientList().get("Banana"));
//        assertEquals(24.8, shoppingList.getIngredientList().get("Egg"));
//    }
}