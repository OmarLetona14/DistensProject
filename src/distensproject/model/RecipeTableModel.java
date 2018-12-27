/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.model;

import distensproject.helper.Separator;
import javax.swing.table.AbstractTableModel;


public class RecipeTableModel extends AbstractTableModel{
    
    private final String[] columnNames = new String[]{
        "Nombre", "Tipo de receta", "Ganancias",
    };
    
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
        return Separator.recipesPointer();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Recipe row = Separator.recipes[rowIndex];
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
       Recipe row = Separator.recipes[rowIndex];
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
