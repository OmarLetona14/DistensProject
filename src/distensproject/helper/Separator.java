/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.helper;

import distensproject.model.Ingredient;
import distensproject.model.InventoryTableModel;
import distensproject.model.Recipe;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Separator {
    
    public static Recipe[] recipes = new Recipe[100];
    Ingredient[] ingredients;
    double calories, price;
    Ingredient currentInventory;
    String nameRecipe, typeRecipe, sinSaltos, sinEspacios;
    RandomNumber random = RandomNumber.getSingletonInstance();
    
    public static int recipesPointer(){
        int count = 0;
        for(Recipe r: recipes){
            if(r!=null){
                count++;
            }
        }
    return count;
    }
    
    public void readString(String input, JFrame enviroment){
        String[] recipeStr = input.split(";");
        for(int i=0; i<recipeStr.length;i++){
            sinEspacios = recipeStr[i].trim();
            sinSaltos = sinEspacios.replaceAll("/n", "");
            if(sinSaltos.equalsIgnoreCase("INGRE")){
                StringTokenizer ingredientStr = new StringTokenizer(recipeStr[i+1],"+"); 
                while(ingredientStr.hasMoreTokens()){
                    String[] elements = ingredientStr.nextToken().split("-");
                    try{
                        Ingredient nuevoIngrediente = new Ingredient(InventoryTableModel.pointer()+1, random.generateIdentifier(), elements[0],
                        Double.valueOf(elements[1]), Double.valueOf(elements[2]), Integer.valueOf(elements[3]), 0, elements[4]);
                        InventoryTableModel.inventory[InventoryTableModel.pointer()] = nuevoIngrediente;
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(enviroment, "Ocurrió un error al leer los ingredientes", "Error",
                            JOptionPane.ERROR_MESSAGE);
                            System.out.println(e.getMessage());
                    } 
                }
            }else if(sinSaltos.equalsIgnoreCase("RECE")){
                StringTokenizer recipeString = new StringTokenizer(recipeStr[i+1],"+");
                while(recipeString.hasMoreTokens()){
                    String[] facc = recipeString.nextToken().split("-");
                    String[] name = facc[0].split("%");
                    nameRecipe = name[0];
                    typeRecipe = name[1];
                    String[] ingredientsRec = facc[1].split(",");
                    ingredients = new Ingredient[ingredientsRec.length];
                    for(String inElements: ingredientsRec){                   
                        ingredients[ingredientsPointer()] = serchByName(inElements);
                        calories += serchByName(inElements).getCalories();
                        price += serchByName(inElements).getPrice();
                    }
                    try{
                        Recipe nuevaReceta = new Recipe(recipesPointer()+1, random.generateIdentifier(), nameRecipe, calories, price,
                        ingredients,typeRecipe,0);
                        recipes[recipesPointer()] = nuevaReceta;
                        calories = 0;
                        price = 0;
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(enviroment, "Ocurrió un error al leer las recetas", "Error",
                            JOptionPane.ERROR_MESSAGE);
                            System.out.println(e.getMessage());
                    }
                }         
            }
        }
    }
    
    public void inventoryString(String input, JFrame enviroment){
        String[] inventoryStr = input.split(";");
        for(int i = 0; i<inventoryStr.length;i++){
            if(inventoryStr[i].equalsIgnoreCase("EXIS")){
                StringTokenizer inventories = new StringTokenizer(inventoryStr[i+1],"+");
                while(inventories.hasMoreTokens()){
                    String[] elements = inventories.nextToken().split(",");
                    currentInventory = serchByName(elements[0]);
                    if(currentInventory!=null){
                        try{
                            currentInventory.setInventory(currentInventory.getInventory()+Integer.valueOf(elements[1]));
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(enviroment, "Ocurrió un error al leer los inventarios", "Error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(enviroment, "Ocurrió un error al leer los inventarios, "
                                + "el ingrediente "+elements[1] + " no existe", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }
    
    private int ingredientsPointer(){
        int count = 0;
        for(Ingredient in: ingredients){
            if(in!=null){
                count++;
            }
        }return count;
    }
    
    private Ingredient serchByName(String name){
        for(Ingredient ingredient: InventoryTableModel.inventory){
            if(ingredient !=null){
                if(ingredient.getName().equals(name)){
                    return ingredient;
                }
            }
        }
        return null;
    }
    
}
