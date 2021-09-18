package com.personalpantry.example.PersonalPantry.Controllers;

import com.personalpantry.example.PersonalPantry.Models.Recipe;
import com.personalpantry.example.PersonalPantry.Models.SelectedRecipe;
import com.personalpantry.example.PersonalPantry.Repositories.SelectedRecipeRepository;
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
        selectedRecipeRepository.save(selectedRecipe);
        return new ResponseEntity<>(selectedRecipe, HttpStatus.OK);
    }
}
