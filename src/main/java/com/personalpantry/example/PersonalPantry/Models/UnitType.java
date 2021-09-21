package com.personalpantry.example.PersonalPantry.Models;

public enum UnitType {
    // each UnityType with a shorthand value.
    G("grams"),
    ML("millilitres"),
    X("singleunit");
//    LITRES("L"),
//    TABLESPOON("tbsp"),
//    TEASPOON("tsp"),
//    LARGE("large"),
//    MEDIUM("medium"),
//    SMALL("small"),

    private final String measurementUnit;

    // constructor for enum, UnitType takes a String and sets this as value property.
    UnitType(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    // getter for value property, to give us access to this elsewhere.
    public String getMeasurementUnit() {
        return measurementUnit;
    }
}
