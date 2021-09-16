package com.personalpantry.example.PersonalPantry.Repositories;

import com.personalpantry.example.PersonalPantry.Models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
