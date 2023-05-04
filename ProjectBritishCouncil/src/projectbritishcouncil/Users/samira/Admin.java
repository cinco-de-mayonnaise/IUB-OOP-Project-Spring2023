/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.samira;

import java.io.Serializable;
import java.util.Date;
import projectbritishcouncil.common.BasicUser;

/**
 *
 * @author samir
 */
public class Admin extends BasicUser implements Serializable{

    public Admin(String Name, String Email, String Password, Date DOJ, Date DOB) {
        super(Name, Email, Password, DOJ, DOB);
    }
    
}
