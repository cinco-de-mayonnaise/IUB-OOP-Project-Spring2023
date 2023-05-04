/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common;

import java.io.Serializable;
import java.util.ArrayList;
import projectbritishcouncil.common.util.CommonInstancesClass;

/**
 *
 * @author Abdullah
 */
public class CommonsFileChunk implements Serializable
{
    
    // it is the responsibility of a file chunk manager (programmer) to ensure that all data in this class is exposed to other classes that need them
    // and also handle instantiation if the file chunk is empty...
    
    //// list of all users, required when logging in...
    public ArrayList<BasicUser> allusers;
    
    public CommonsFileChunk()
    {
        
    }
}
