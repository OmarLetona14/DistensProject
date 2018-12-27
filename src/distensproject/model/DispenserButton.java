package distensproject.model;

import distensproject.view.Dispenser;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*En esta clase se define el boton que representará un ingrediente en el dispensador*/
public class DispenserButton extends JButton implements ActionListener {
    
    private final Ingredient ingredient;
    JComboBox noIngredientsCb;
    
    public DispenserButton(int x, int y, int ancho, int alto, Ingredient ingredient, JComboBox noIngredientsCb, String imageURL){
        this.noIngredientsCb=noIngredientsCb;
        this.ingredient = ingredient;
        setSize(ancho, alto);
        setLocation(x, y);
        try{
            Image backgroundImages = new ImageIcon(imageURL).getImage();
            ImageIcon backgroundImageScaled = new ImageIcon (backgroundImages.getScaledInstance(ancho,alto,Image.SCALE_DEFAULT));
            setIcon(backgroundImageScaled);
        }catch(Exception e){}
        setText(ingredient.getName());
        addActionListener(this); 
    }
    
    private boolean restIngredient(){
        for(Ingredient ingred: InventoryTableModel.inventory){
            if(ingred!=null){
                if(ingred == ingredient){
                    if(ingred.getInventory()!=0){
                        ingred.setInventory(ingred.getInventory()-1);
                        ingred.setUsed(ingred.getUsed()+1);
                        return true;
                    }
                } 
            }
        }return false;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(restIngredient()){
            setEnabled(false);
            noIngredientsCb.removeItem(this.getText());
            Dispenser.dispensedMatrix[Dispenser.dispensedMatrixPointer()] = ingredient;
        }else{
            JOptionPane.showMessageDialog(this, "Inventario insuficiente", "Error",
                            JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
