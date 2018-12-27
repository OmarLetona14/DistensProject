/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.view;

import distensproject.helper.RandomNumber;
import distensproject.helper.Separator;
import distensproject.model.Ingredient;
import distensproject.model.InventoryTableModel;
import distensproject.model.Recipe;
import javax.swing.JOptionPane;

public class CreateRecipe extends javax.swing.JFrame {
    
    private Ingredient[] recipeIngredients = new Ingredient[100];
    Ingredient currIngredient;
    double price, calories;
    RandomNumber random = RandomNumber.getSingletonInstance();
    
    
    public CreateRecipe() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        generateCbIngredients();
        
    }
    
    private void generateCbIngredients(){
        for(Ingredient ingred: InventoryTableModel.inventory){
            if(ingred!=null){
                ingredientsCb.addItem(ingred.getName());
            }
        }      
    }
    
    private int pointer(){
        int count = 0;
        for(Ingredient i: recipeIngredients){
            if(i!=null){
                count++;
            }
        }
    return count;
    }
    
    private Ingredient getIngredientByName(String name){
        for(Ingredient ig: InventoryTableModel.inventory){
            if(ig!=null){
                if(ig.getName().equals(name)){
                    return ig;
                }
            }        
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        ingredientsCb = new javax.swing.JComboBox<>();
        addIngredientBtn = new javax.swing.JButton();
        recipeTypeTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        newIngredientBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel4.setText("Lista de ingredientes");

        jLabel5.setText("Tipo de receta");

        ingredientsCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        addIngredientBtn.setText("Agregar ingrediente");
        addIngredientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngredientBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        addBtn.setText("Agregar");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        newIngredientBtn.setText("Nuevo ingrediente");
        newIngredientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newIngredientBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(newIngredientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recipeTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ingredientsCb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addIngredientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(recipeTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ingredientsCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addIngredientBtn)))
                .addGap(18, 18, 18)
                .addComponent(newIngredientBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(addBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addIngredientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngredientBtnActionPerformed

        currIngredient = getIngredientByName((String) ingredientsCb.getSelectedItem());
        if(currIngredient!=null && !ingredientExists(currIngredient)){
            recipeIngredients[pointer()] = getIngredientByName((String) ingredientsCb.getSelectedItem());
            price += getIngredientByName((String) ingredientsCb.getSelectedItem()).getPrice();
            calories += getIngredientByName((String) ingredientsCb.getSelectedItem()).getCalories();
            JOptionPane.showMessageDialog(this, "Ingrediente agregado correctamente", "Agregado",
                            JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo agregar este ingrediente", "Error",
                            JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_addIngredientBtnActionPerformed

    private void newIngredientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newIngredientBtnActionPerformed
        EnterIngredient ingredientWindow = new EnterIngredient();
        ingredientWindow.setVisible(true);
    }//GEN-LAST:event_newIngredientBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(pointer()!=0){
            try{
                Recipe recipe = new Recipe(Separator.recipesPointer()+1, random.generateIdentifier(), nameTxt.getText(), 
                calories, price,recipeIngredients, recipeTypeTxt.getText(),
                0);
                Separator.recipes[Separator.recipesPointer()] = recipe;
                JOptionPane.showMessageDialog(this, "Receta agregada correctamente", "Agregado",
                            JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ocurrio un error al agregar la receta", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_addBtnActionPerformed
    
    private boolean ingredientExists(Ingredient currentIngredient){
        for(Ingredient ingred: recipeIngredients){
            if(ingred!=null){
                if(ingred==currentIngredient){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateRecipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addIngredientBtn;
    private javax.swing.JComboBox<String> ingredientsCb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton newIngredientBtn;
    private javax.swing.JTextField recipeTypeTxt;
    // End of variables declaration//GEN-END:variables
}
