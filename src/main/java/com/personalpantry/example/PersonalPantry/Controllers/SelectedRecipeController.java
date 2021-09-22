package com.personalpantry.example.PersonalPantry.Controllers;

import com.personalpantry.example.PersonalPantry.Models.Recipe;
import com.personalpantry.example.PersonalPantry.Models.SelectedRecipe;
import com.personalpantry.example.PersonalPantry.Models.ShoppingList;
import com.personalpantry.example.PersonalPantry.Repositories.SelectedRecipeRepository;
import com.personalpantry.example.PersonalPantry.Repositories.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SelectedRecipeController {
    @Autowired
    SelectedRecipeRepository selectedRecipeRepository;

    @Autowired
    ShoppingListRepository shoppingListRepository;

    @GetMapping(value = "/selectedRecipes")
    public ResponseEntity <List<SelectedRecipe>>getAllSelectedRecipes(){
        return new ResponseEntity<>(selectedRecipeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/selectedRecipes/{id}")
    public ResponseEntity<Optional<SelectedRecipe>> getRecipe(@PathVariable Long id){
        return new ResponseEntity<>(selectedRecipeRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/selectedRecipes")
    public ResponseEntity<SelectedRecipe> createSelectedRecipe(@RequestBody SelectedRecipe selectedRecipe){
        selectedRecipe.setUpdatedMeasuresMap(selectedRecipe.updatedRecipe(selectedRecipe.getRecipe()));
        selectedRecipeRepository.save(selectedRecipe);
        ShoppingList shoppingList = shoppingListRepository.getById(1L);
        shoppingList.addRecipeToShoppingList(selectedRecipe);
        shoppingList.createShoppingList();
        shoppingListRepository.save(shoppingList);

//        ShoppingList shoppingList = shoppingListRepository.findById(1L).orElse(null);
//        selectedRecipe.setShoppingList(shoppingList);

//        selectedRecipe.getShoppingList().addRecipeToShoppingList(selectedRecipe);
//        Optional<ShoppingList> updatedShoppingList = shoppingListRepository.findById(1L);
//        System.out.println(selectedRecipe.getShoppingList().getRecipeList().size());
//        updatedShoppingList.createShoppingList();
//        shoppingListRepository.save(updatedShoppingList);
        return new ResponseEntity<>(selectedRecipe, HttpStatus.OK);
    }

    @DeleteMapping(value = "/selectedRecipes")
    public ResponseEntity<List<SelectedRecipe>> deleteAllSelectedRecipes(){
        selectedRecipeRepository.deleteAll();
        return new ResponseEntity<>(selectedRecipeRepository.findAll(), HttpStatus.OK);
    }
}
