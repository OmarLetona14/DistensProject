/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.model;

/*Modela todos los datos que se quieren guardar como ingredientes*/
public class Ingredient {
    
    private int idIngredient;
    private int identifier;
    private String name;
    private double calories;
    private double price;
    private int inventory;
    private int used;
    private String imageURL;

    public Ingredient(int idIngredient, int identifier, String name, double calories, double price, int inventory, int used, String imageURL) {
        this.idIngredient = idIngredient;
        this.identifier = identifier;
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.inventory = inventory;
        this.used = used;
        this.imageURL = imageURL;
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
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

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
