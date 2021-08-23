package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pizza> pizza = new ArrayList<>();
        pizza.add(new Pizza("PIZZA CALABRIA",
                "Recipe for Pizza Calabria with Spianata Calabrese Piccante. A delicious specialty with Italian salami from Calabria. As the Piccante suggests in the name of the salami, the Spianata Calabrese Piccante contains 5 to 10 percent of spicy Calabrian chili. The chili variety is the \"Calabrese Piccante\", a round, medium-caliber Chili from Calabria. One of my favorite pizza toppings, just delicious!", "275 g Italian pizza dough, Italian pizza sauce, 60 g Buffalo Mozzarella, 8 Slices Spianata Calabrese Piccante (spicy Calabrian salami), Hot Calabrian chilies, Fresh basil leaves, Italian herbs\n Garlic",
                "First shape the pizza dough into a round and thin pizza with your hands. Rolling out the dough with a rolling pin should be avoided. By rolling out the dough, the pizza is less airy and does not bake properly. You can find a recipe for an original Italian pizza dough here. \n 2. Spread the pizza with tomato sauce and season to taste with Italian herbs. Add some finely chopped garlic to taste. 3. Cut the mozzarella into thin slices and spread on the pizza.);",
                 R.drawable.pizza_calabria));
        pizza.add(new Pizza("PIZZA MARINITA",
                "Original recipe for Pizza Marinita™ with mozzarella, garlic, chilli and basil. The best of Marinara meets Margherita. The Marinita is basically a Marinara with mozzarella and chili or a Margherita with garlic and chilli. The vegetarian Marinita combines the fine taste of the two classic Neapolitan pizzas. Only the finest buffalo mozzarella and sun-ripened San Marzano tomatoes are used. As a contrast in taste the Pizza Marinita is topped with fresh basil leaves and a pinch of Italian herbs after baking. The Marinita was - like some other new pizza creations - invented by Alexander Herder in the 21st century.", "275 g Italian pizza dough, Italian pizza sauce, 60 g Buffalo Mozzarella, 8 Slices Spianata Calabrese Piccante (spicy Calabrian salami), Hot Calabrian chilies, Fresh basil leaves, Italian herbs\n Garlic",
                "First shape the pizza dough into a round and thin pizza with your hands. Rolling out the dough with a rolling pin should be avoided. By rolling out the dough, the pizza is less airy and does not bake properly. You can find a recipe for an original Italian pizza dough here. \n 2. Spread the pizza with tomato sauce and season to taste with Italian herbs. Add some finely chopped garlic to taste. 3. Cut the mozzarella into thin slices and spread on the pizza.);",
                R.drawable.pizza_marinara));
        pizza.add(new Pizza("NEW YORK STYLE PIZZA",
                "The New York Style Pizza is the most popular pizza variant in the USA. It is similar in many ways to the Neapolitan Margherita. The specialty also called New York Slice uses more cheese. The only topping used is dry, grated mozzarella or fresh mozzarella, as well as chili flakes and oregano. NY Slice Pizza is on sale in over 400 restaurants in New York. It is distributed nationwide in the United States, but most often it is sold at its birthplace, the New York metropolitan area. Mostly it is sold in slices, jumbo slices or in the whole.", "275 g Italian pizza dough, Italian pizza sauce, 60 g Buffalo Mozzarella, 8 Slices Spianata Calabrese Piccante (spicy Calabrian salami), Hot Calabrian chilies, Fresh basil leaves, Italian herbs\n Garlic",
                "First shape the pizza dough into a round and thin pizza with your hands. Rolling out the dough with a rolling pin should be avoided. By rolling out the dough, the pizza is less airy and does not bake properly. You can find a recipe for an original Italian pizza dough here. \n 2. Spread the pizza with tomato sauce and season to taste with Italian herbs. Add some finely chopped garlic to taste. 3. Cut the mozzarella into thin slices and spread on the pizza.);",
                R.drawable.pizza_calabria));

        recyclerView = findViewById(R.id.RecyclerViewPizza);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaAdapter(pizza);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);




    }
}