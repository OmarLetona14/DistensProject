/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject;

import distensproject.model.SystemUser;
import distensproject.model.SystemUserTableModel;
import distensproject.view.Login;

public class Main {
    
    public static void main(String[] args) {
        SystemUser user = new SystemUser(SystemUserTableModel.pointer()+1, "2988116930101", "", "", "");
        SystemUserTableModel.users[SystemUserTableModel.pointer()]  = user;
        Login login = new Login();
        login.setVisible(true);
    }
    
}
