/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Abdullah
 */
// All users of British council have the following things in common. Ensure to inherit from this
public abstract class BasicUser implements Serializable
{
    final protected String Email;
    protected String Password;
    final protected Date DOJ;
    final protected Date DOB;

    public BasicUser(String Email, String Password, Date DOJ, Date DOB) {
        this.Email = Email;
        this.Password = Password;
        this.DOJ = DOJ;
        this.DOB = DOB;
    }
    
    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Date getDOJ() {
        return DOJ;
    }

    public Date getDOB() {
        return DOB;
    }
    
}
