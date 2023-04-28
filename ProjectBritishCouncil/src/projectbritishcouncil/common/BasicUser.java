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
    final protected String Name;
    final protected String Email;
    protected String Password;
    final protected Date DOJ;
    final protected Date DOB;

    public String getName() {
        return Name;
    }

    public BasicUser(String Name, String Email, String Password, Date DOJ, Date DOB) {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.DOJ = DOJ;
        this.DOB = DOB;
    }
    
    public String getEmail() {
        return Email;
    }

    public final boolean verifyPassword(String password) {
        if (this.Password.equals(password))
            return true;
        else
            return false;
    }

    protected final boolean setPassword(String oldPassword, String newPassword) {
        if (this.Password.equals(oldPassword))
        {
            this.Password = newPassword;
            return true;
        }
        else
            return false;
    }

    public Date getDOJ() {
        return DOJ;
    }

    public Date getDOB() {
        return DOB;
    }
    
}
