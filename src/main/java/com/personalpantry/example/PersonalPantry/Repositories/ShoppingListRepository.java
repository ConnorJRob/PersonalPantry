package com.personalpantry.example.PersonalPantry.Repositories;

import com.personalpantry.example.PersonalPantry.Models.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {

}
