/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.model;

/*Modela todos los datos que se quieren guardar como recetas*/
public class Recipe {
    
    private int idRecipe;
    private int identifier;
    private String name;
    private double calories;
    private double price;
    private Ingredient[] ingredients;
    private String recipeType;
    private double gain;

    public Recipe(int idRecipe, int identifier, String name, double calories, double price, Ingredient[] ingredients, String recipeType, double gain) {
        this.idRecipe = idRecipe;
        this.identifier = identifier;
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.ingredients = ingredients;
        this.recipeType = recipeType;
        this.gain = gain;
    }

    public int getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(int idRecipe) {
        this.idRecipe = idRecipe;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    } 
}
