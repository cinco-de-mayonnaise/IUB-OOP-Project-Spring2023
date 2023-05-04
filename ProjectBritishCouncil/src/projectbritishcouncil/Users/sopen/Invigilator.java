/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.sopen;

import java.io.Serializable;
import java.util.Date;
import projectbritishcouncil.common.BasicUser;

/**
 *
 * @author Abdullah
 */
public class Invigilator extends BasicUser implements Serializable
{
    public Invigilator(String Name, String Email, String Password, Date DOJ, Date DOB) {
        super(Name, Email, Password, DOJ, DOB);
    }
    
    
}
