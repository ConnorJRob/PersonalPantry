package com.personalpantry.example.PersonalPantry.Repositories;

import com.personalpantry.example.PersonalPantry.Models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
