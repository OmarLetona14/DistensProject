/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distensproject.model;

/*Modela todos los datos que se quieren guardar como usuarios*/
public class SystemUser {
    
    private int idUser;
    private String CUI;
    private String name;
    private String nickname;
    private String password;

    public SystemUser(int idUser, String CUI, String name, String nickname, String password) {
        this.idUser = idUser;
        this.CUI = CUI;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
