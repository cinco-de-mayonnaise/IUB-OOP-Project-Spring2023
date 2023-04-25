/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil;

import java.util.ArrayList;
import java.util.Date;
import projectbritishcouncil.Users.abdullah.Librarian;
import projectbritishcouncil.Users.abdullah.PrivateCandidate;
import projectbritishcouncil.common.BasicUser;
import projectbritishcouncil.common.util.CommonInstancesClass;
import static projectbritishcouncil.common.util.Identifiers.ALL_USER_LIST;

/**
 *
 * @author Abdullah
 */
public class Experimental
{  
    static void insert_some_stuff_in_ht()
    {
        CommonInstancesClass c = CommonInstancesClass.getInstance();
        
        // we gon insert some stuf hee hee
        ArrayList<BasicUser> userlist = new ArrayList<BasicUser>();
        
        userlist.add(new Librarian("2130223@britishcouncil.com", "123passwordo", new Date(), new Date()));
        userlist.add(new PrivateCandidate("rejwan_b0ss@gmail.com", "cikokrem", new Date(), new Date()));
        userlist.add(new PrivateCandidate("anything goes", "yes indeed", new Date(), new Date()));
        userlist.add(new Librarian("laban@aarong.com", "Laban j00s", new Date(), new Date()));
        
       
        c.putObject(ALL_USER_LIST, userlist);
    }
    
    static void do_stuff_and_exit()
    {
     
        
        
        
        System.exit(420);
    }
}
