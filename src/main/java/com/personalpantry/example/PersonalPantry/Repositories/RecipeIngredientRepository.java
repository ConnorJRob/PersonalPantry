package com.personalpantry.example.PersonalPantry.Repositories;

import com.personalpantry.example.PersonalPantry.Models.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long> {
}
