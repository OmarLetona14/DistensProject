/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.model;

import javax.swing.table.AbstractTableModel;


public class RecipeTableModel extends AbstractTableModel{
    
     public static Recipe[] reportRecipes = new Recipe[100];
    private final String[] columnNames = new String[]{
        "Nombre", "Tipo de receta", "Ganancias",
    };
    
    public static int pointer(){
        int count = 0;
        for(Recipe r: reportRecipes){
            if(!(r==null)){
                count += 1;
            }
        }return count;
    }
    
    private final Class[] columnClass = new Class[] {
        String.class, String.class, double.class
    };
    
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }
    @Override
    public int getRowCount()
    {
        return pointer();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Recipe row = reportRecipes[rowIndex];
        switch (columnIndex) {
            case 0:
                return row.getName();
            case 1:
                return row.getRecipeType();
            case 2:
                return row.getGain();
        }
        return null;
    }
    
   @Override
   public void setValueAt(Object aValue, int rowIndex, int columnIndex)
   {    
       Recipe instance = (Recipe)aValue;
       Recipe row = reportRecipes[rowIndex];
        switch (columnIndex) {
            case 0:
                row.setName((String) instance.getName());
                break;
            case 1:
                row.setRecipeType((String) instance.getRecipeType());
                break;
            case 2:
                row.setGain((double) instance.getGain());
                break;
            default:
                break;
        }
   }
   
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }
    
}
