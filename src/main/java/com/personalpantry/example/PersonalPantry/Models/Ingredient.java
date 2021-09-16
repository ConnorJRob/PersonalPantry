package com.personalpantry.example.PersonalPantry.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name; //establish name variable as a String

    @Column
    private Category category; //establish categoryType variable as a categoryType Enum

    @Column(name = "unit_type")
    private UnitType unitType; //establish unitType variable as a unitType Enum

    @JsonIgnoreProperties({"ingredient"})
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "ingredient", fetch = FetchType.LAZY)
    private List<RecipeIngredient> recipeIngredients;

    //establish Ingredient constructor which takes the properties required for new ingredient
    public Ingredient(String name, Category category, UnitType unitType){
        this.name = name; //name given when Ingredient is created is saved as name
        this.category = category; //CategoryType enum given when Ingredient is created is saved as categoryType
        this.unitType = unitType; //unitType enum given when Ingredient is created is saved as unitType
        this.recipeIngredients = new ArrayList<>();
    }

    public Ingredient(){}; //blank constructor - required for spring boot server

    public String getName() { //setter function for name
        return name;
    }

    public void setName(String name) { //setter function for name
        this.name = name;
    }

    public Category getCategory() { //getter function for Category
        return category;
    }

    public void setCategory(Category category) { //setter function for Category
        this.category = category;
    }

    public UnitType getUnitType() { //getter function for unitType
        return unitType;
    }

    public void setUnitType(UnitType unitType) { //setter function for unitType
        this.unitType = unitType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }
}
