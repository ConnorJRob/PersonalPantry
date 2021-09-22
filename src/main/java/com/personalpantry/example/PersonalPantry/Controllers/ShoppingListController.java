package com.personalpantry.example.PersonalPantry.Controllers;

import com.personalpantry.example.PersonalPantry.Models.SelectedRecipe;
import com.personalpantry.example.PersonalPantry.Models.ShoppingList;
import com.personalpantry.example.PersonalPantry.Repositories.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ShoppingListController {
    @Autowired
    ShoppingListRepository shoppingListRepository;

    @GetMapping(value = "/shoppingLists")
    public ResponseEntity <List<ShoppingList>> getAllShoppingLists(){
        return new ResponseEntity<>(shoppingListRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/shoppingLists/{id}")
    public ResponseEntity<Optional<ShoppingList>> getShoppingList(@PathVariable Long id){
        return new ResponseEntity<>(shoppingListRepository.findById(id), HttpStatus.OK);
    }
}
