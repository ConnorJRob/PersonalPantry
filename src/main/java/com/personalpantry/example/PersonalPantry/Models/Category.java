package com.personalpantry.example.PersonalPantry.Models;

public enum Category {
 PRODUCE(1),
 BAKING(2),
 BAKERY(3),
 PASTAANDRICE(4),
 REFRIGERATED(5),
 CHEESE(6),
 CANNEDANDJARS(7),
 FROZEN(8),
 SPICESANDSEASONINGS(9),
 NUTBUTTERS(10),
 OIL(11),
 CONDIMENTS(12),
 SAVOURY(13),
 DAIRYANDEGGS(14),
 ETHNICFOODS(15),
 TEAANDCOFFEE(16),
 MEATANDFISH(17),
 GOURMET(18),
 HEALTHFOODS(19),
 CONFECTIONERY(20),
 GLUTEN(21),
 CEREAL(22),
 NUTS(23),
 BEVERAGES(24),
 SEAFOOD(25),
 DRIEDFRUITS(26),
 ALCOHOL(27);

    private final int order;

    // constructor for enum, UnitType takes a String and sets this as value property.
    Category(int order) {
     this.order = order;
    }

    // getter for value property, to give us access to this elsewhere.
    public int getOrder() {
     return order;
    }
}
