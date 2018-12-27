/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.model;

import javax.swing.table.AbstractTableModel;

/*En esta clase se modelan los datos que van a ser introducidos a la tabla de usuarios
Contiene la lista de usuarios que se han registrado en el sistema*/
public class SystemUserTableModel extends AbstractTableModel {
    
    public static SystemUser[] users = new SystemUser[100]; //Creamos la lista estatica
    private final String[] columnNames = new String[]{ //Definimos los nombres de las columnas
        "CUI", "Nombre Completo", "Nombre de usuario", "Contraseña"
    };
    
    public static int pointer(){
        int count = 0;
        for(SystemUser u: users){
            if(u!=null){
                count += 1;
            }
        }return count;
    }
    
    private final Class[] columnClass = new Class[] { //Definimos los tipos de datos que se mostrarán en las columnas
        String.class, String.class, String.class, String.class
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
        SystemUser row = users[rowIndex];
        switch (columnIndex) {
            case 0:
                return row.getCUI();
            case 1:
                return row.getName();
            case 2:
                return row.getNickname();
            case 3:
                return row.getPassword();
            default:
                break;
        }
        return null;
    }
    
   @Override
   public void setValueAt(Object aValue, int rowIndex, int columnIndex)
   {    
       SystemUser instance = (SystemUser)aValue;
       SystemUser row = users[rowIndex];
        switch (columnIndex) {
            case 0:
                row.setCUI((String) instance.getCUI());
                break;
            case 1:
                row.setName((String) instance.getName());
                break;
            case 2:
                row.setNickname((String) instance.getNickname());
                break;
            case 3:
                row.setPassword((String) instance.getPassword());
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
