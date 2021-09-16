package com.personalpantry.example.PersonalPantry.Repositories;

import com.personalpantry.example.PersonalPantry.Models.SelectedRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedRecipeRepository extends JpaRepository<SelectedRecipe, Long> {
}
