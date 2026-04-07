package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.example.pizzarecipes.R;


public class ProduitService implements IDao<Produit> {
    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed();
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    private void seed() {
        // Pizza 1
        data.add(new Produit("SPINACH PIZZA", 2.0,
                R.drawable.pizza2, "25 min",
                "1 package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend",
                "This tasty pizza is so easy to prepare. My family, including my young daughter, loves it.",
                "STEP 1: Prepare pizza dough.\nSTEP 2: Spread Alfredo sauce.\nSTEP 3: Bake at 450° for 10-15 minutes."));

        // Pizza 2
        data.add(new Produit("DEEP-DISH SAUSAGE PIZZA", 8.0,
                R.drawable.pizza4, "45 min",
                "1 package active dry yeast\n- 2/3 cup warm water\n- 1-3/4 cups flour\n- 1/4 cup vegetable oil\n- 1 teaspoon oregano",
                "My Grandma made the tastiest snacks for us when we stayed the night at her farm.",
                "STEP 1: Dissolve yeast in water.\nSTEP 2: Knead dough.\nSTEP 3: Bake at 400° for 20 minutes."));

        // Pizza 3
        data.add(new Produit("HOMEMADE PIZZA", 4.0,
                R.drawable.pizza5, "50 min",
                "1 package active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups flour",
                "This recipe is a hearty, zesty main dish with a crisp, golden crust.",
                "STEP 1: Dissolve yeast and sugar in water.\nSTEP 2: Knead dough.\nSTEP 3: Bake at 400° for 25-30 minutes."));

        // Pizza 4
        data.add(new Produit("PESTO CHICKEN PIZZA", 3.0,
                R.drawable.pizza6, "50 min",
                "2 teaspoons active dry yeast\n- 1 cup warm water\n- 2-3/4 cups bread flour\n- 1 tablespoon olive oil\n- 1/2 pound chicken breasts",
                "This is the only pizza I make now. We love it!",
                "STEP 1: Dissolve yeast in warm water.\nSTEP 2: Knead dough.\nSTEP 3: Bake at 400° for 18-20 minutes."));

        // Pizza 5
        data.add(new Produit("MARGHERITA PIZZA", 5.0,
                R.drawable.pizza1, "30 min",
                "3 teaspoons active dry yeast\n- 1 cup warm water\n- 2 tablespoons olive oil\n- 3 cups bread flour\n- Fresh tomatoes\n- Mozzarella cheese\n- Fresh basil",
                "A classic Pizza Margherita shows off the colors of the Italian flag.",
                "STEP 1: Dissolve yeast in warm water.\nSTEP 2: Knead dough.\nSTEP 3: Top with tomatoes, basil and cheese.\nSTEP 4: Bake at 450° for 15-20 minutes."));

        // Pizza 6
        data.add(new Produit("PEPPERONI PIZZA", 6.0,
                R.drawable.pizza3, "35 min",
                "Pizza crust\n- Pizza sauce\n- Pepperoni\n- Mozzarella cheese\n- Oregano",
                "A classic pepperoni pizza that everyone loves.",
                "STEP 1: Spread sauce on crust.\nSTEP 2: Add pepperoni and cheese.\nSTEP 3: Bake at 425° for 15-20 minutes."));

        // Pizza 7
        data.add(new Produit("VEGGIE PIZZA", 5.5,
                R.drawable.pizza7, "30 min",
                "Pizza crust\n- Pizza sauce\n- Mushrooms\n- Bell peppers\n- Onions\n- Olives\n- Mozzarella cheese",
                "Loaded with fresh vegetables, this pizza is healthy and delicious.",
                "STEP 1: Spread sauce on crust.\nSTEP 2: Add all vegetables.\nSTEP 3: Top with cheese.\nSTEP 4: Bake at 425° for 15-20 minutes."));

        // Pizza 8
        data.add(new Produit("BBQ CHICKEN PIZZA", 7.0,
                R.drawable.pizza8, "40 min",
                "Pizza crust\n- BBQ sauce\n- Grilled chicken\n- Red onions\n- Cilantro\n- Mozzarella cheese",
                "Sweet and tangy BBQ sauce makes this pizza a crowd favorite.",
                "STEP 1: Spread BBQ sauce on crust.\nSTEP 2: Add chicken and onions.\nSTEP 3: Top with cheese.\nSTEP 4: Bake at 425° for 15-20 minutes."));

        // Pizza 9
        data.add(new Produit("HAWAIIAN PIZZA", 6.5,
                R.drawable.pizza9, "35 min",
                "Pizza crust\n- Pizza sauce\n- Ham\n- Pineapple\n- Mozzarella cheese",
                "Sweet pineapple and salty ham - a perfect combination.",
                "STEP 1: Spread sauce on crust.\nSTEP 2: Add ham and pineapple.\nSTEP 3: Top with cheese.\nSTEP 4: Bake at 425° for 15-20 minutes."));

        // Pizza 10
        data.add(new Produit("FOUR CHEESE PIZZA", 6.0,
                R.drawable.pizza10, "30 min",
                "Pizza crust\n- Pizza sauce\n- Mozzarella cheese\n- Parmesan cheese\n- Gouda cheese\n- Blue cheese",
                "A cheese lover's dream pizza with four different cheeses.",
                "STEP 1: Spread sauce on crust.\nSTEP 2: Add all four cheeses.\nSTEP 3: Bake at 425° for 15-20 minutes."));
    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}
