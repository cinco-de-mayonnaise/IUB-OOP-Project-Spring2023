/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common.util;

import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Abdullah
 */

/* COMMON DATA CLASS: A singleton class which can be accessed by every FXML scene that is loaded in this project. 
 This class is meant to be used to communicate information/data across scenes.
 Some important information held in this class include
    - Database (loaded from file into class at startup)
    - Runtime Object holders (that can hold any object)


    How to access?
    ----------------
    Just import CommonInstancesClass and then do CommonInstancesClass.getInstance() to get the handle to the instance.
    Then use get/setObjects to grab Object references from inside.

    CommonInstancesClass CIC = CommonInstancesClass.getInstance();
    Arraylist<Users> userlist = ...;
    User SomePerson;

    // Put Array of Users in CIC
    CIC.putObject("any string, has to be unique", userlist);
    
    // Get some information from CIC
    SomePerson = (User) CIC.getObject("Show in Scene");
    // do work with SomePerson...
*/
public class CommonInstancesClass
{
    private final static CommonInstancesClass INSTANCE = new CommonInstancesClass();
    private final ConcurrentHashMap<String, Object> RuntimeObjects; // to get access to some data, you need to know what string
    
    private CommonInstancesClass()
    { 
        RuntimeObjects = new ConcurrentHashMap<>();
    }
    
    public static CommonInstancesClass getInstance()
    {
        return INSTANCE;
    }
    
    public Object getObject(String identifier)
    {
        return RuntimeObjects.get(identifier);
    }
    
    public Object putObject(String identifier, Object obj)
    {
        return RuntimeObjects.putIfAbsent(identifier, obj);
    }
    
    public Object deleteObject(String identifier)
    {
        return RuntimeObjects.remove(identifier);
    }
    
    public void overwriteObject(String identifier, Object obj)
    {
        RuntimeObjects.put(identifier, obj);
    }
}
