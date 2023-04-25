/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common.util;

/**
 *
 * @author Abdullah
 */
public abstract class TableViewAdapter
{  
    /* 
        Marker indicating this is a helper class that is only meant to be used to put in any type of data inside a tableview easily.
    */
    final Object DATA_INSTANCE; 
    
    public TableViewAdapter(Object o)
    {
        this.DATA_INSTANCE = o;
    }
    
    // every adapter should have a reference to the original object... duh
    
    
    // every adapter should implement a way to update itself if the original object changes...
    boolean syncWithObject() // return true if sync occurred, false if adapter was not synced
    {
        // PS: if you don't want a sync, just have it return false
        return false;
    }
    
    abstract boolean changed(); // return false if object is equal to tableview data, true if the data has changed,
}
