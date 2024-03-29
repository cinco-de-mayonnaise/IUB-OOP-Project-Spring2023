/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common;

import javafx.scene.image.Image;

/**
 *
 * @author Abdullah
 */

// ALL PICTURES/IMAGES USED IN THIS PROJECT MUST USE THIS CLASS
public class DataImage extends ResourceImage 
{
    protected String description = "None";
    
    public DataImage(String url) throws Exception{
        super(url);
    }
    
    public DataImage(String url, String description) throws Exception{
        super(url);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
