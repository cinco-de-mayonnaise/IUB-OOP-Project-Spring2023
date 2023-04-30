/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Abdullah
 */
public class TheFileDatabase implements Serializable
{
    // This is the object that will be written and saved into a single "database.dat" file.
    // 
    static String dir;
    
    
    //****// File Structure: The following things exist in order, and must be read/written to in the same order or will crash
    //*** User Information: Store all users that can login/that exist, in here
    static ArrayList<BasicUser> UserList;
    
    
    static int WriteToDisk()
    {
        
        return 0;
    }
    
    static int ReadFromFile()
    {
        return 0;
    }
}
