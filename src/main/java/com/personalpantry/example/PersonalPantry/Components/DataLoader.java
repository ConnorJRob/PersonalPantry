package com.personalpantry.example.PersonalPantry.Components;

import com.personalpantry.example.PersonalPantry.Models.*;
import com.personalpantry.example.PersonalPantry.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeIngredientRepository recipeIngredientRepository;

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    SelectedRecipeRepository selectedRecipeRepository;

    @Autowired
    ShoppingListRepository shoppingListRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {

        // Order for Each Recipe: //
        /////// Create Recipe //////
        ////// Write Instructions ////////
        ////// Add Instructions to Recipe /////////
        /////// Save Recipe to Recipe Repo ////////
        //// Create New Ingredients /////
        /////// Create Recipe Ingredients from Ingredients & Save to RecipeIngredients Repo ////////

        /////////       Easy Steak Pie          //////////

        /////// Recipe //////
        Recipe steakPie = new Recipe("Easy Steak Pie", 195, 611, "Nothing beats a classic homemade steak pie, complete with golden-brown flaky pastry and a rich filling. This easy family feast only takes 15 minutes to prep");

        ////// Instructions ////////
        String step1 = "Nothing beats a classic homemade steak pie, complete with golden-brown flaky pastry and a rich filling. This easy family feast only takes 15 minutes to prep";
        String step2 = "Scatter over the flour, stirring until the flour turns brown. Tip the meat and any juices back into the pan along with the ketchup and give it all a good stir. Pour over the stock, season, and bring to a simmer then cover with a lid and put in the oven for about 2 hrs, until the meat is tender. The filling can be made up to three days ahead and chilled or frozen for up to three months.";
        String step3 = "To make the pie, heat the oven to 220C/200C fan/gas 7. Tip the filling into a 24-26cm rimmed pie dish and brush the rim of the dish with some yolk. Unravel the pastry, drape over the dish and use a knife to trim and press the edges against the side of the dish. Re-roll your trimmings to make a decoration if you like. Brush the pie heavily with egg yolk. Make a few little slits in the centre of the pie and bake for 40 mins until golden. Leave to stand for a few minutes before serving.";

        ////// Add Instructions to Recipe /////////
        steakPie.addRecipeInstruction(step1);
        steakPie.addRecipeInstruction(step2);
        steakPie.addRecipeInstruction(step3);

        /////// Save Recipe to Recipe Repo ////////
        recipeRepository.save(steakPie);

        //// New Ingredients /////
        Ingredient sunflowerOil = new Ingredient("Sunflower Oil", Category.OIL, UnitType.MILLILITRES);
        ingredientRepository.save(sunflowerOil);

        Ingredient steak = new Ingredient("Braising Steak", Category.MEATANDFISH, UnitType.GRAMS);
        ingredientRepository.save(steak);

        Ingredient onion = new Ingredient("Onion", Category.PRODUCE, UnitType.SINGLEUNIT);
        ingredientRepository.save(onion);

        Ingredient flour = new Ingredient("Flour", Category.BAKING, UnitType.GRAMS);
        ingredientRepository.save(flour);

        Ingredient ketchup = new Ingredient("Tomato Ketchup", Category.CONDIMENTS, UnitType.MILLILITRES);
        ingredientRepository.save(ketchup);

        Ingredient beefStockCubes = new Ingredient("Beef Stock Cubes", Category.SPICESANDSEASONINGS, UnitType.SINGLEUNIT);
        ingredientRepository.save(beefStockCubes);

        Ingredient puffPastry = new Ingredient("Ready-rolled Puff Pastry", Category.BAKING, UnitType.GRAMS);
        ingredientRepository.save(puffPastry);

        Ingredient egg = new Ingredient("Egg Yolk", Category.DAIRYANDEGGS, UnitType.SINGLEUNIT);
        ingredientRepository.save(egg);

        /////// Recipe Ingredients ////////
        RecipeIngredient steakPieSunflowerOil = new RecipeIngredient(sunflowerOil, 7.5, steakPie);
        recipeIngredientRepository.save(steakPieSunflowerOil);

        RecipeIngredient steakPieSteak = new RecipeIngredient(steak, 166, steakPie);
        recipeIngredientRepository.save(steakPieSteak);

        RecipeIngredient steakPieOnion = new RecipeIngredient(onion, 0.333, steakPie);
        recipeIngredientRepository.save(steakPieOnion);

        RecipeIngredient steakPieFlour = new RecipeIngredient(flour, 3.8, steakPie);
        recipeIngredientRepository.save(steakPieFlour);

        RecipeIngredient steakPieKetchup = new RecipeIngredient(ketchup, 2.5, steakPie);
        recipeIngredientRepository.save(steakPieKetchup);

        RecipeIngredient steakPieBeefStockCubes = new RecipeIngredient(beefStockCubes, 0.333, steakPie);
        recipeIngredientRepository.save(steakPieBeefStockCubes);

        RecipeIngredient steakPiePuffPastry = new RecipeIngredient(puffPastry, 62.5, steakPie);
        recipeIngredientRepository.save(steakPiePuffPastry);

        RecipeIngredient steakPieEgg = new RecipeIngredient(egg, 0.1666, steakPie);
        recipeIngredientRepository.save(steakPieEgg);

//        /////// Add RecipeIngredients to Recipe ////////
//        steakPie.addIngredientToRecipe(steakPieSunflowerOil);
//        steakPie.addIngredientToRecipe(steakPieSteak);
//        steakPie.addIngredientToRecipe(steakPieOnion);
//        steakPie.addIngredientToRecipe(steakPieFlour);
//        steakPie.addIngredientToRecipe(steakPieKetchup);
//        steakPie.addIngredientToRecipe(steakPieBeefStockCubes);
//        steakPie.addIngredientToRecipe(steakPiePuffPastry);
//        steakPie.addIngredientToRecipe(steakPieEgg);

//        /////////       BBQ Chicken Tenders             /////////////
//
//        /////// Create Recipe //////
//        Recipe bbqChickenTendies = new Recipe("BBQ Chicken Tenders", 30, 246, "Yummy & Easy BBQ Chicken Tenders");
//
//        /////// Save Recipe to Recipe Repo ////////
//        recipeRepository.save(bbqChickenTendies);
//
//        //// Create New Ingredients /////
//        Ingredient chickenBreast = new Ingredient("Chicken Breast", Category.MEATANDFISH, UnitType.SINGLEUNIT);
//        ingredientRepository.save(chickenBreast);
//
//        Ingredient breadCrumbs = new Ingredient("Seasoned Bread Crumbs", Category.BAKING, UnitType.GRAMS);
//        ingredientRepository.save(breadCrumbs);
//
//        Ingredient bbqSauce = new Ingredient("BBQ Sauce", Category.CONDIMENTS, UnitType.GRAMS);
//        ingredientRepository.save(bbqSauce);
//
//        ////// Write Instructions ////////
//        String chickenTendiesStep1 = "Preheat oven to 190°C.";
//        String chickenTendiesStep2 = "Slice the chicken into even strips.";
//        String chickenTendiesStep3 = "Dip the chicken strips into the BBQ sauce, then coat them in the bread crumbs.";
//        String chickenTendiesStep4 = "Place on a baking sheet lined with parchment paper and bake for 15 minutes.";
//        String chickenTendiesStep5 = "Brush the remaining BBQ sauce evenly on both sides of the chicken strips and bake for another 10 minutes and serve.";
//
//        ////// Add Instructions to Recipe /////////
//        bbqChickenTendies.addRecipeInstruction(chickenTendiesStep1);
//        bbqChickenTendies.addRecipeInstruction(chickenTendiesStep2);
//        bbqChickenTendies.addRecipeInstruction(chickenTendiesStep3);
//        bbqChickenTendies.addRecipeInstruction(chickenTendiesStep4);
//        bbqChickenTendies.addRecipeInstruction(chickenTendiesStep5);
//
//        /////// Create Recipe Ingredients from Ingredients ////////
//        RecipeIngredient bbqChickenTendiesChickenBreast = new RecipeIngredient(chickenBreast, 1, bbqChickenTendies);
//        RecipeIngredient bbqChickenTendiesBreadCrumbs = new RecipeIngredient(breadCrumbs, 120, bbqChickenTendies);
//        RecipeIngredient bbqChickenTendiesBbqSauce = new RecipeIngredient(bbqSauce, 290, bbqChickenTendies);
//
//        /////// Add RecipeIngredients to Recipe ////////
//        bbqChickenTendies.addIngredientToRecipe(bbqChickenTendiesChickenBreast);
//        bbqChickenTendies.addIngredientToRecipe(bbqChickenTendiesBreadCrumbs);
//        bbqChickenTendies.addIngredientToRecipe(bbqChickenTendiesBbqSauce);
//
//        /////////       Pesto Chicken Burgers           /////////////
//
//        /////// Create Recipe //////
//        Recipe pestoBurgers = new Recipe("Pesto Chicken Burgers", 40, 709, "Adding pesto into the mix for this crispy chicken burger turns the flavour up to eleven, pairing perfectly with gooey mozzarella for an Italian-inspired meal. Serve with a side of roasted sweet potato wedges for a filling dinner that will leave you perfectly satisfied.");
//
//        /////// Save Recipe to Recipe Repo ////////
//        recipeRepository.save(pestoBurgers);
//
//        //// Create New Ingredients /////
//        Ingredient breadedChickenSteaks = new Ingredient("Breaded Chicken Steaks", Category.FROZEN, UnitType.SINGLEUNIT);
//        ingredientRepository.save(breadedChickenSteaks);
//
//        Ingredient sweetPotatoes = new Ingredient("Sweet Potatoes", Category.PRODUCE, UnitType.GRAMS);
//        ingredientRepository.save(sweetPotatoes);
//
//        Ingredient oliveOil = new Ingredient("Olive Oil", Category.OIL, UnitType.MILLILITRES);
//        ingredientRepository.save(oliveOil);
//
//        Ingredient mozzarella = new Ingredient("Reduced-Fat Mozzarella Ball", Category.DAIRYANDEGGS, UnitType.GRAMS);
//        ingredientRepository.save(mozzarella);
//
//        Ingredient rolls = new Ingredient("Soft White Rolls", Category.BAKERY, UnitType.SINGLEUNIT);
//        ingredientRepository.save(rolls);
//
//        Ingredient pesto = new Ingredient("Free Form Pesto", Category.SPICESANDSEASONINGS, UnitType.GRAMS);
//        ingredientRepository.save(pesto);
//
//        Ingredient rocketLeaves = new Ingredient("Rocket Leaves", Category.PRODUCE, UnitType.GRAMS);
//        ingredientRepository.save(rocketLeaves);
//
//        ////// Write Instructions ////////
//        String pestoBurgersStep1 = "Preheat the oven to gas 6, 200°C, fan 180°C. Tip the sweet potatoes onto a baking tray, season and toss with the oil to coat. Roast on the top shelf for 30-35 mins, turning halfway, until tender.";
//        String pestoBurgersStep2 = "Meanwhile, put the chicken steaks on a separate tray and bake on the shelf beneath the wedges for 25 mins until crisp. Top the crispy chicken with the mozzarella slices and bake for 5 mins more until the cheese has melted.";
//        String pestoBurgersStep3 = "Halve and toast the rolls, then spread half the pesto onto the bases. Add the chicken and top with the remaining pesto and the rocket. Sandwich with the tops of the buns and serve alongside the sweet potato wedges.";
//
//        ////// Add Instructions to Recipe /////////
//        pestoBurgers.addRecipeInstruction(pestoBurgersStep1);
//        pestoBurgers.addRecipeInstruction(pestoBurgersStep2);
//        pestoBurgers.addRecipeInstruction(pestoBurgersStep3);
//
//        /////// Create Recipe Ingredients from Ingredients ////////
//        RecipeIngredient pestoBurgersBreadedChickenSteaks = new RecipeIngredient(breadedChickenSteaks, 1, pestoBurgers);
//        RecipeIngredient pestoBurgersSweetPotatoes = new RecipeIngredient(sweetPotatoes, 187.5, pestoBurgers);
//        RecipeIngredient pestoBurgersOliveOil = new RecipeIngredient(oliveOil, 3.75, pestoBurgers);
//        RecipeIngredient pestoBurgersMozzarella = new RecipeIngredient(mozzarella, 62.5, pestoBurgers);
//        RecipeIngredient pestoBurgersRolls = new RecipeIngredient(rolls, 1, pestoBurgers);
//        RecipeIngredient pestoBurgersPesto = new RecipeIngredient(pesto, 12.5, pestoBurgers );
//        RecipeIngredient pestoBurgersRocketLeaves = new RecipeIngredient(rocketLeaves, 5, pestoBurgers);
//
//        /////// Add RecipeIngredients to Recipe ////////
//        pestoBurgers.addIngredientToRecipe(pestoBurgersBreadedChickenSteaks);
//        pestoBurgers.addIngredientToRecipe(pestoBurgersSweetPotatoes);
//        pestoBurgers.addIngredientToRecipe(pestoBurgersOliveOil);
//        pestoBurgers.addIngredientToRecipe(pestoBurgersMozzarella);
//        pestoBurgers.addIngredientToRecipe(pestoBurgersRolls);
//        pestoBurgers.addIngredientToRecipe(pestoBurgersPesto);
//        pestoBurgers.addIngredientToRecipe(pestoBurgersRocketLeaves);
//
//        /////////       Halloumi stuffed peppers           /////////////
//
//        /////// Create Recipe //////
//        Recipe halloumiStuffedPeppers = new Recipe("Halloumi Stuffed Peppers", 35, 317, "Whip up these flavoursome veggie delights in no time – perfect for sharing during sunny evenings. Roasting red peppers and cherry tomatoes gives this snack a sweet and tangy base, with the salty halloumi and olives giving a savoury balance. Give this a go and you'll be making it again for sure!");
//        recipeRepository.save(halloumiStuffedPeppers);
//
//        //// Create New Ingredients /////
//        Ingredient redPepper = new Ingredient("Red Pepper", Category.PRODUCE, UnitType.SINGLEUNIT);
//        ingredientRepository.save(redPepper);
//
//        // Olive Oil Ingredient already created
//
//        Ingredient cherryTomatoes = new Ingredient("Piccolo Cherry Tomatoes", Category.PRODUCE, UnitType.GRAMS);
//        ingredientRepository.save(cherryTomatoes);
//
//        Ingredient pilauRice = new Ingredient("Pilau Rice", Category.ETHNICFOODS, UnitType.GRAMS);
//        ingredientRepository.save(pilauRice);
//
//        Ingredient blackOlives = new Ingredient("Black Olives", Category.PRODUCE, UnitType.GRAMS);
//        ingredientRepository.save(blackOlives);
//
//        Ingredient sultanas = new Ingredient("Sultanas", Category.DRIEDFRUITS, UnitType.GRAMS);
//        ingredientRepository.save(sultanas);
//
//        Ingredient halloumi = new Ingredient("Halloumi", Category.DAIRYANDEGGS, UnitType.GRAMS);
//        ingredientRepository.save(halloumi);
//
//        Ingredient freshParsley = new Ingredient("Fresh Parsley", Category.PRODUCE, UnitType.GRAMS);
//        ingredientRepository.save(freshParsley);
//
//        ////// Write Instructions ////////
//        String halloumiStuffedPeppersStep1 = "Preheat the oven to gas 6, 200°C, fan 180°C. Halve the peppers, leaving the stalks intact but removing the core and membrane.";
//        String halloumiStuffedPeppersStep2 = "Rub with 1 tbsp oil and place, cut side down, in a roasting tin. Put the cherry tomatoes in a separate small roasting tin, season and toss in ½ tbsp oil. Roast alongside the peppers for 15 mins.";
//        String halloumiStuffedPeppersStep3 = "Heat the rice to pack instructions. Fork into a bowl and stir in the rest of the ingredients, reserving a little of the halloumi and parsley.";
//        String halloumiStuffedPeppersStep4 = "Fill the pepper halves with the rice mixture and top with the tomatoes and reserved halloumi. Return to the oven for 15-20 mins or until the halloumi is golden. Scatter with the remaining parsley to serve.";
//
//        ////// Add Instructions to Recipe /////////
//        halloumiStuffedPeppers.addRecipeInstruction(halloumiStuffedPeppersStep1);
//        halloumiStuffedPeppers.addRecipeInstruction(halloumiStuffedPeppersStep2);
//        halloumiStuffedPeppers.addRecipeInstruction(halloumiStuffedPeppersStep3);
//        halloumiStuffedPeppers.addRecipeInstruction(halloumiStuffedPeppersStep4);
//
//        /////// Create Recipe Ingredients from Ingredients ////////
//        RecipeIngredient halloumiStuffedPeppersRedPepper = new RecipeIngredient(redPepper, 1, halloumiStuffedPeppers);
//        RecipeIngredient halloumiStuffedPeppersOliveOil = new RecipeIngredient(oliveOil, 5.75, halloumiStuffedPeppers);
//        RecipeIngredient halloumiStuffedPeppersCherryTomatoes = new RecipeIngredient(cherryTomatoes, 55, halloumiStuffedPeppers);
//        RecipeIngredient halloumiStuffedPeppersPilauRice = new RecipeIngredient(pilauRice, 62.5, halloumiStuffedPeppers);
//        RecipeIngredient halloumiStuffedPeppersBlackOlives = new RecipeIngredient(blackOlives, 10, halloumiStuffedPeppers);
//        RecipeIngredient halloumiStuffedPeppersSultanas = new RecipeIngredient(sultanas, 8.75, halloumiStuffedPeppers);
//        RecipeIngredient halloumiStuffedPeppersHalloumi = new RecipeIngredient(halloumi, 20, halloumiStuffedPeppers);
//        RecipeIngredient halloumiStuffedPeppersFreshParsley = new RecipeIngredient(freshParsley, 2.5, halloumiStuffedPeppers);
//
//        /////// Add RecipeIngredients to Recipe ////////
//        halloumiStuffedPeppers.addIngredientToRecipe(halloumiStuffedPeppersRedPepper);
//        halloumiStuffedPeppers.addIngredientToRecipe(halloumiStuffedPeppersOliveOil);
//        halloumiStuffedPeppers.addIngredientToRecipe(halloumiStuffedPeppersCherryTomatoes);
//        halloumiStuffedPeppers.addIngredientToRecipe(halloumiStuffedPeppersPilauRice);
//        halloumiStuffedPeppers.addIngredientToRecipe(halloumiStuffedPeppersBlackOlives);
//        halloumiStuffedPeppers.addIngredientToRecipe(halloumiStuffedPeppersSultanas);
//        halloumiStuffedPeppers.addIngredientToRecipe(halloumiStuffedPeppersHalloumi);
//        halloumiStuffedPeppers.addIngredientToRecipe(halloumiStuffedPeppersFreshParsley);
//
//        /////////       Grilled Steak with Pineapple Rice         /////////////
//
//        /////// Create Recipe //////
//        Recipe grilledSteakWPineappleRice = new Recipe("Grilled Steak with Pineapple Rice", 30, 382, "Add a touch of tropical flair to your steak dinner with a flavorful side of grilled pineapple rice. From grill pan to table, this dish is dinner-ready in under 30-minutes; so quick, it's basically a vacation from stressful supper prep.");
//
//        /////// Save Recipe to Recipe Repo ////////
//        recipeRepository.save(grilledSteakWPineappleRice);
//
//        //// Create New Ingredients /////
//        Ingredient soySauce = new Ingredient("Low-Sodium Soy Sauce", Category.ETHNICFOODS, UnitType.MILLILITRES);
//        ingredientRepository.save(soySauce);
//
//        Ingredient groundBlackPepper = new Ingredient("Ground Black Pepper", Category.SPICESANDSEASONINGS, UnitType.GRAMS);
//        ingredientRepository.save(groundBlackPepper);
//
//        Ingredient beefTenderloinFillets = new Ingredient("Beef Tenderloin Fillets", Category.MEATANDFISH, UnitType.GRAMS);
//        ingredientRepository.save(beefTenderloinFillets);
//
//        // Olive Oil Ingredient already created
//
//        Ingredient pineappleSlices = new Ingredient("Pineapple Slices", Category.CANNEDANDJARS, UnitType.GRAMS);
//        ingredientRepository.save(pineappleSlices);
//
//        Ingredient greenOnions = new Ingredient("Green Onions", Category.PRODUCE, UnitType.SINGLEUNIT);
//        ingredientRepository.save(greenOnions);
//
//        Ingredient precookedBrownRice = new Ingredient("Precooked Brown Rice", Category.ETHNICFOODS, UnitType.GRAMS);
//        ingredientRepository.save(precookedBrownRice);
//
//        Ingredient cookingSalt = new Ingredient("Cooking Salt", Category.SPICESANDSEASONINGS, UnitType.GRAMS);
//        ingredientRepository.save(cookingSalt);
//
//        ////// Write Instructions ////////
//        String grilledSteakWPineappleRiceStep1 = "Combine soy sauce, pepper, and beef in a large zip-top plastic bag. Massage sauce into beef; let stand at room temperature 7 minutes, turning bag occasionally.";
//        String grilledSteakWPineappleRiceStep2 = "While steak marinates, heat a large grill pan over medium-high heat. Coat pan with olive oil. Arrange pineapple and green onions in pan; cook 5 minutes or until well charred, turning to char evenly. Cut onions and pineapple into bite-sized pieces. Heat rice according to package directions; stir in pineapple, onions, and salt. Keep warm.";
//        String grilledSteakWPineappleRiceStep3 = "Add beef to grill pan coated with olive oil; cook 3 minutes on each side or until desired degree of doneness. Serve beef with rice mixture.";
//
//        ////// Add Instructions to Recipe /////////
//        grilledSteakWPineappleRice.addRecipeInstruction(grilledSteakWPineappleRiceStep1);
//        grilledSteakWPineappleRice.addRecipeInstruction(grilledSteakWPineappleRiceStep2);
//        grilledSteakWPineappleRice.addRecipeInstruction(grilledSteakWPineappleRiceStep3);
//
//        /////// Create Recipe Ingredients from Ingredients ////////
//        RecipeIngredient grilledSteakWPineappleRiceSoySauce = new RecipeIngredient(soySauce, 15, grilledSteakWPineappleRice);
//        RecipeIngredient grilledSteakWPineappleRiceGroundBlackPepper = new RecipeIngredient(groundBlackPepper, 1, grilledSteakWPineappleRice);
//        RecipeIngredient grilledSteakWPineappleRiceBeefTenderloinFillets = new RecipeIngredient(beefTenderloinFillets, 113, grilledSteakWPineappleRice);
//        RecipeIngredient grilledSteakWPineappleRiceOliveOil = new RecipeIngredient(oliveOil, 15, grilledSteakWPineappleRice);
//        RecipeIngredient grilledSteakWPineappleRicePineappleSlices = new RecipeIngredient(pineappleSlices, 62.5, grilledSteakWPineappleRice);
//        RecipeIngredient grilledSteakWPineappleRiceGreenOnions = new RecipeIngredient(greenOnions, 1.5, grilledSteakWPineappleRice);
//        RecipeIngredient grilledSteakWPineappleRicePrecookedBrownRice = new RecipeIngredient(precookedBrownRice, 62.5, grilledSteakWPineappleRice);
//        RecipeIngredient grilledSteakWPineappleRiceCookingSalt = new RecipeIngredient(cookingSalt, 3.5, grilledSteakWPineappleRice);
//
//        /////// Add RecipeIngredients to Recipe ////////
//        grilledSteakWPineappleRice.addIngredientToRecipe(grilledSteakWPineappleRiceSoySauce);
//        grilledSteakWPineappleRice.addIngredientToRecipe(grilledSteakWPineappleRiceGroundBlackPepper);
//        grilledSteakWPineappleRice.addIngredientToRecipe(grilledSteakWPineappleRiceBeefTenderloinFillets);
//        grilledSteakWPineappleRice.addIngredientToRecipe(grilledSteakWPineappleRiceOliveOil);
//        grilledSteakWPineappleRice.addIngredientToRecipe(grilledSteakWPineappleRicePineappleSlices);
//        grilledSteakWPineappleRice.addIngredientToRecipe(grilledSteakWPineappleRiceGreenOnions);
//        grilledSteakWPineappleRice.addIngredientToRecipe(grilledSteakWPineappleRicePrecookedBrownRice);
//        grilledSteakWPineappleRice.addIngredientToRecipe(grilledSteakWPineappleRiceCookingSalt);
//    }
}
}
