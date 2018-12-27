/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.helper;

import java.util.Random;

public class RandomNumber {
    
  
    
    public int generateIdentifier(){
        Random r = new Random();
        int valorEntero =r.nextInt(1000)+1;
        return valorEntero;
    }
    
}
