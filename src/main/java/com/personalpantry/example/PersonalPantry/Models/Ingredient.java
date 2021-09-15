package com.personalpantry.example.PersonalPantry.Models;

public class Ingredient {

    private String name; //establish name variable as a String
    private Category category; //establish categoryType variable as a categoryType Enum
    private UnitType unitType; //establish unitType variable as a unitType Enum


    //establish Ingredient constructor which takes the properties required for new ingredient
    public Ingredient(String name, Category category, UnitType unitType){
        this.name = name; //name given when Ingredient is created is saved as name
        this.category = category; //CategoryType enum given when Ingredient is created is saved as categoryType
        this.unitType = unitType; //unitType enum given when Ingredient is created is saved as unitType
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
}
