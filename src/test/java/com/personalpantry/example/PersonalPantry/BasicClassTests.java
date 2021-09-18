package com.personalpantry.example.PersonalPantry;

import com.personalpantry.example.PersonalPantry.Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BasicClassTests {

    private Ingredient flour;
    private RecipeIngredient recipeFlour;
    private Recipe recipeCake;
    private Ingredient sugar;
    private RecipeIngredient recipeSugar;
    private String step1;
    private String step2;
    private String step3;
    private String step4;
    private String step5;
    private SelectedRecipe selectedCakeRecipe;
    private ShoppingList shoppingList;

//    @BeforeEach
//    public void before(){
//        flour = new Ingredient("Flour", Category.BAKING, UnitType.GRAMS);
//        recipeFlour = new RecipeIngredient(flour, 40, recipeCake);
//        recipeCake = new Recipe("Cake", 50, 126, "Easy 3 Ingredient Sponge Cake Recipe");
//        shoppingList = new ShoppingList();
//    }
//
//    @Test
//    public void ingredientHasName(){
//        assertEquals("Flour", flour.getName());
//    }
//
//    @Test
//    public void ingredientHasCategory(){
//        assertEquals(Category.BAKING, flour.getCategory());
//    }
//
//    @Test
//    public void ingredientCategoryHasOrder(){
//        assertEquals(2, flour.getCategory().getOrder());
//    }
//
//    @Test
//    public void ingredientHasUnitType(){
//        assertEquals(UnitType.GRAMS, flour.getUnitType());
//    }
//
//    @Test
//    public void ingredientUnitTypeHasShortMeasurementUnit(){
//        assertEquals("g", flour.getUnitType().getMeasurementUnit());
//    }
//
//    @Test
//    public void recipeIngredientHasIngredient(){
//        assertEquals(flour, recipeFlour.getIngredient());
//    }
//
//    @Test
//    public void recipeIngredientHasMeasure(){
//        assertEquals(40, recipeFlour.getMeasure());
//    }
//
//    @Test
//    public void recipeIngredientHasPickedUp(){
//        assertFalse(recipeFlour.isPickedUp());
//    }
//
//    @Test
//    public void recipeHasName(){
//        assertEquals("Cake", recipeCake.getName());
//    }
//
//    @Test
//    public void recipeHasReadyInMinutes(){
//        assertEquals(50, recipeCake.getReadyInMinutes());
//    }
//
//    @Test
//    public void recipeHasCaloriesPerServing(){
//        assertEquals(126, recipeCake.getCaloriesPerServing());
//    }
//
//    @Test
//    public void recipeHasDescription(){
//        assertEquals("Easy 3 Ingredient Sponge Cake Recipe", recipeCake.getDescription());
//    }
//
//    @Test
//    public void recipeCanAddIngredients(){
//        recipeCake.addIngredientToRecipe(recipeFlour);
//        sugar = new Ingredient("Sugar", Category.BAKING, UnitType.GRAMS);
//        recipeSugar = new RecipeIngredient(sugar, 60, recipeCake);
//        recipeCake.addIngredientToRecipe(recipeSugar);
//        assertEquals(2, recipeCake.getIngredients().size());
//    }
//
//    @Test
//    public void recipeHasIngredients(){
//        recipeCake.addIngredientToRecipe(recipeFlour);
//        assertEquals("Flour", recipeCake.getIngredients().get(0).getIngredient().getName());
//    }
//
//    @Test
//    public void recipeCanAddInstructions(){
//        step1 = "Preheat oven to 180C. Line a 9x9 inch baking pan with baking paper";
//        step2 = "In a large bowl, add the egg yolks and half of the sugar (30 g). Whisk together until completely combined. Sift in the flour. Whisk together until a smooth paste forms.";
//        step3 = "In the bowl of a stand mixer, add egg whites and mix at highest speed with a wire whisk attachment until egg whites turn foamy. Add in the remaining 30 g of sugar. Continue mixing at highest speed until egg whites form stiff peaks.";
//        step4 = "Add 1/3 of the egg white mixture into the cake batter Gently fold with a spatula until no white streaks remain. Repeat with another 1/3. Repeat with remaining 1/3. Be careful to only mix until egg whites are just incorporated and to do so in a gentle folding motion using a spatula and not a mixer or whisk. If you mix too hard you will deflate the egg whites.";
//        step5 = "Pour batter into prepared baking pan. Bake in oven for about 10 minutes or until a toothpick inserted comes out clean. Let cake cool completely before slicing and decorating.";
//        recipeCake.addRecipeInstruction(step1);
//        recipeCake.addRecipeInstruction(step2);
//        recipeCake.addRecipeInstruction(step3);
//        recipeCake.addRecipeInstruction(step4);
//        recipeCake.addRecipeInstruction(step5);
//        assertEquals(5, recipeCake.getInstructions().size());
//    }
//
//    @Test
//    public void recipeHasInstructions(){
//        step1 = "Preheat oven to 180C. Line a 9x9 inch baking pan with baking paper";
//        step2 = "In a large bowl, add the egg yolks and half of the sugar (30 g). Whisk together until completely combined. Sift in the flour. Whisk together until a smooth paste forms.";
//        step3 = "In the bowl of a stand mixer, add egg whites and mix at highest speed with a wire whisk attachment until egg whites turn foamy. Add in the remaining 30 g of sugar. Continue mixing at highest speed until egg whites form stiff peaks.";
//        step4 = "Add 1/3 of the egg white mixture into the cake batter Gently fold with a spatula until no white streaks remain. Repeat with another 1/3. Repeat with remaining 1/3. Be careful to only mix until egg whites are just incorporated and to do so in a gentle folding motion using a spatula and not a mixer or whisk. If you mix too hard you will deflate the egg whites.";
//        step5 = "Pour batter into prepared baking pan. Bake in oven for about 10 minutes or until a toothpick inserted comes out clean. Let cake cool completely before slicing and decorating.";
//        recipeCake.addRecipeInstruction(step1);
//        recipeCake.addRecipeInstruction(step2);
//        recipeCake.addRecipeInstruction(step3);
//        recipeCake.addRecipeInstruction(step4);
//        recipeCake.addRecipeInstruction(step5);
//        assertEquals("Pour batter into prepared baking pan. Bake in oven for about 10 minutes or until a toothpick inserted comes out clean. Let cake cool completely before slicing and decorating.", recipeCake.getInstructions().get(4));
//    }
//
//    @Test
//    public void selectedRecipeHasRecipe(){
//        selectedCakeRecipe = new SelectedRecipe(recipeCake, 4, shoppingList);
//        assertEquals(recipeCake, selectedCakeRecipe.getRecipe());
//    }
//
//    @Test
//    public void selectedRecipeHasDesiredServings(){
//        selectedCakeRecipe = new SelectedRecipe(recipeCake, 4, shoppingList);
//        assertEquals(4, selectedCakeRecipe.getDesiredServings());
//    }
//
//
//

}

