/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil;

import java.util.ArrayList;
import java.util.Date;
import projectbritishcouncil.Users.abdullah.Librarian;
import projectbritishcouncil.Users.abdullah.PrivateCandidate;
import projectbritishcouncil.Users.protik.LibraryMember;
import projectbritishcouncil.Users.samira.Admin;
import projectbritishcouncil.Users.samira.Examiner;
import projectbritishcouncil.Users.sopen.Invigilator;
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
        
        userlist.add(new Librarian("Ahnaf Abdullah", "2130223@britishcouncil.com", "123passwordo", new Date(), new Date()));
        userlist.add(new PrivateCandidate("rejowan", "rejwan_b0ss@gmail.com", "cikokrem", new Date(), new Date()));
        userlist.add(new Admin("trash", "anything goes", "yes indeed", new Date(), new Date()));
        userlist.add(new LibraryMember("laban solveR", "laban@aarong.com", "Laban j00s", new Date(), new Date()));
        userlist.add(new Examiner("examination woman", "examgurl@exam.lel", "yes we da supapowaz", new Date(), new Date()));
        userlist.add(new Invigilator("okashii zooo", "yeesinvigilatar", "chocowet ice kweam", new Date(), new Date()));
        //userlist.add(new LibraryMember("laban@aarong.com", "Laban j00s", new Date(), new Date()));
        //userlist.add(new LibraryMember("laban@aarong.com", "Laban j00s", new Date(), new Date()));
        
       
        c.putObject(ALL_USER_LIST, userlist);
    }
    
    static void do_stuff_and_exit()
    {
     
        
        
        
        System.exit(420);
    }
}
