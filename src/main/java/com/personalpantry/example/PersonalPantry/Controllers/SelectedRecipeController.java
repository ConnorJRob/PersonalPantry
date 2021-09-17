package com.personalpantry.example.PersonalPantry.Controllers;

import com.personalpantry.example.PersonalPantry.Models.SelectedRecipe;
import com.personalpantry.example.PersonalPantry.Repositories.SelectedRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelectedRecipeController {
    @Autowired
    SelectedRecipeRepository selectedRecipeRepository;

    @GetMapping(value = "/selectedRecipes")
    public ResponseEntity <List<SelectedRecipe>>getAllSelectedRecipes(){
        return new ResponseEntity<>(selectedRecipeRepository.findAll(), HttpStatus.OK);
    }
}
