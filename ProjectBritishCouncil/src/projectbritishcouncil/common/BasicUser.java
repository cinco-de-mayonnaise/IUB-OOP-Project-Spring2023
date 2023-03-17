/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common;

import java.util.Date;

/**
 *
 * @author Abdullah
 */
// All users of British council have the following things in common. Ensure to inherit from this
abstract class BasicUser
{
    final protected String Email;
    protected String Password;
    final protected Date DOJ;

    public BasicUser(String Email, String Password, Date DOJ) {
        this.Email = Email;
        this.Password = Password;
        this.DOJ = DOJ;
    }
    
    public String getEmail() {
        return Email;
    }

    protected String getPassword() {
        return Password;
    }

    protected void setPassword(String Password) {
        this.Password = Password;
    }

    public Date getDOJ() {
        return DOJ;
    }

}
