package com.personalpantry.example.PersonalPantry.Controllers;

import com.personalpantry.example.PersonalPantry.Models.Recipe;
import com.personalpantry.example.PersonalPantry.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecipeController {
    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping(value = "/recipes")
    public ResponseEntity <List<Recipe>>getAllRecipes(){
        return new ResponseEntity<>(recipeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/recipes/{id}")
    public ResponseEntity<Optional<Recipe>> getRecipe(@PathVariable Long id){
        return new ResponseEntity<>(recipeRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/recipes")
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe){
        recipeRepository.save(recipe);
        return new ResponseEntity<>(recipe, HttpStatus.CREATED);
    }
}
