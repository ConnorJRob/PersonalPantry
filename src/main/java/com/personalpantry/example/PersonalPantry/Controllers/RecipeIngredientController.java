package com.personalpantry.example.PersonalPantry.Controllers;

import com.personalpantry.example.PersonalPantry.Models.RecipeIngredient;
import com.personalpantry.example.PersonalPantry.Repositories.RecipeIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeIngredientController {

    @Autowired
    RecipeIngredientRepository recipeIngredientRepository;

    @GetMapping(value = "/recipeIngredients")
    public ResponseEntity<List<RecipeIngredient>> getAllRecipeIngredients() {
        return new ResponseEntity<>(recipeIngredientRepository.findAll(), HttpStatus.OK);
    }
}
