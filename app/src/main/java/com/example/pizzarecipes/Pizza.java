package com.example.pizzarecipes;

public class Pizza {
    private String title;
    private String shortDescription;
    private String ingredients;
    private String recipe;
    private int resId;

    public Pizza(String title, String shortDescription, String ingredients, String recipe, int resId) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public int getResId() {
        return resId;
    }
}
