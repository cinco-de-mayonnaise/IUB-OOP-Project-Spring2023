/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.samira;

import java.util.Date;
import projectbritishcouncil.common.BasicUser;

/**
 *
 * @author samir
 */
public class Examiner extends BasicUser {
    
    public Examiner(String Email, String Password, Date DOJ, Date DOB) {
        super(Email, Password, DOJ, DOB);
    }
    
}