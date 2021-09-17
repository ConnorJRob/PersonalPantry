package com.personalpantry.example.PersonalPantry.Controllers;

import com.personalpantry.example.PersonalPantry.Models.Ingredient;
import com.personalpantry.example.PersonalPantry.Repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngredientController {

        @Autowired
        IngredientRepository ingredientRepository;

        @GetMapping(value = "/ingredients")
        public ResponseEntity <List<Ingredient>>getAllIngredients(){
                return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
        }
}
