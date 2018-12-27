/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.model;

import java.util.Date;

public class Dispensed {
    
    private int idDispensed;
    private Recipe recipe;
    private Ingredient[] dispensed;
    private Ingredient[] noDispensed;
    private Date currentDate;

    public Dispensed(int idDispensed, Recipe recipe, Ingredient[] dispensed, Ingredient[] noDispensed, Date currentDate) {
        this.idDispensed = idDispensed;
        this.recipe = recipe;
        this.dispensed = dispensed;
        this.noDispensed = noDispensed;
        this.currentDate = currentDate;
    }
    
    public int getIdDispensed() {
        return idDispensed;
    }

    public void setIdDispensed(int idDispensed) {
        this.idDispensed = idDispensed;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient[] getDispensed() {
        return dispensed;
    }

    public void setDispensed(Ingredient[] dispensed) {
        this.dispensed = dispensed;
    }

    public Ingredient[] getNoDispensed() {
        return noDispensed;
    }

    public void setNoDispensed(Ingredient[] noDispensed) {
        this.noDispensed = noDispensed;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}
