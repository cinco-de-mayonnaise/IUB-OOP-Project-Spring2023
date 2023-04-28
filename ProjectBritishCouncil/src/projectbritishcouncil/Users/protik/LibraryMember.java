/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.protik;

import java.util.Date;
import projectbritishcouncil.common.BasicUser;

/**
 *
 * @author Abdullah
 */
public class LibraryMember extends BasicUser{

    public LibraryMember(String Name, String Email, String Password, Date DOJ, Date DOB) {
        super(Name, Email, Password, DOJ, DOB);
    }
    
}
