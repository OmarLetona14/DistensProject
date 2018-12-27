/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.model;

import javax.swing.table.AbstractTableModel;

public class InventoryTableModel extends AbstractTableModel {
    
    public static Ingredient[] inventory = new Ingredient[100];
    private final String[] columnNames = new String[]{
        "Nombre", "Calorias", "Precio", "Existencias"
    };
    
    public static int pointer(){
        int count = 0;
        for(Ingredient i: inventory){
            if(!(i==null)){
                count += 1;
            }
        }return count;
    }
    
    private final Class[] columnClass = new Class[] {
        String.class, double.class, double.class, Integer.class
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
        Ingredient row = inventory[rowIndex];
        switch (columnIndex) {
            case 0:
                return row.getName();
            case 1:
                return row.getCalories();
            case 2:
                return row.getPrice();
            case 3:
                return row.getInventory();
            default:
                break;
        }
        return null;
    }
    
   @Override
   public void setValueAt(Object aValue, int rowIndex, int columnIndex)
   {    
       Ingredient instance = (Ingredient)aValue;
       Ingredient row = inventory[rowIndex];
        switch (columnIndex) {
            case 0:
                row.setName((String) instance.getName());
                break;
            case 1:
                row.setCalories((double) instance.getCalories());
                break;
            case 2:
                row.setPrice((double) instance.getPrice());
                break;
            case 3:
                row.setInventory((Integer) instance.getInventory());
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
