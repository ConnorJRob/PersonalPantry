package com.personalpantry.example.PersonalPantry.Controllers;

import com.personalpantry.example.PersonalPantry.Models.ShoppingList;
import com.personalpantry.example.PersonalPantry.Repositories.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingListController {
    @Autowired
    ShoppingListRepository shoppingListRepository;

    @GetMapping(value = "/shoppingLists")
    public ResponseEntity <List<ShoppingList>>getAllShoppingLists(){
        return new ResponseEntity<>(shoppingListRepository.findAll(), HttpStatus.OK);
    }


}
