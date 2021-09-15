package com.personalpantry.example.PersonalPantry.Models;

public enum UnitType {
    // each UnityType with a shorthand value.
    GRAMS("g"),
    MILLILITRES("ml"),
    LITRES("L"),
    TABLESPOON("tbsp"),
    TEASPOON("tsp"),
    LARGE("large"),
    MEDIUM("medium"),
    SMALL("small"),
    BLANK("");

    private final String value;

    // constructor for enum, UnitType takes a String and sets this as value property.
    UnitType(String value) {
        this.value = value;
    }

    // getter for value property, to give us access to this elsewhere.
    public String getValue() {
        return value;
    }
}
