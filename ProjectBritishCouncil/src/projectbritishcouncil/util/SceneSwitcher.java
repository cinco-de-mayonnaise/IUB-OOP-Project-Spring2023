/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.util;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Abdullah
 */
public class SceneSwitcher
{
    /* holds a getClass() to the project that allows us to get URLs to FXML files easily*/
    static public Class<?> global_class_handle; 
    
    /* the top level highest window/stage of this application. 
    This may change fron login screen to a dashboard, but 
    will always be the parent of all other created windows. 
    If this window is closed, the application exits.*/
    static public Stage mainstage;              


    // Changes the window(in cur_stage) to the Scene(fxml_url) described in 
    public static void switchToScene(Stage cur_stage, String fxml_url)
    {
        try
        {
            Parent root = FXMLLoader.load(global_class_handle.getResource(fxml_url));

            Scene scene = new Scene(root);
            cur_stage.setScene(scene);
            cur_stage.show();
        }
        catch (Throwable t)
        { 
            t.printStackTrace();
        }
    }
    
    // Creates a new window with the Scene, and returns the stage associated with the window.
    public static Stage CreateStagewithScene(String fxml_url, boolean resizable)
    {
        Stage newstage = new Stage();
        try
        {
            Parent root = FXMLLoader.load(global_class_handle.getResource(fxml_url));

            Scene scene = new Scene(root);
            newstage.setScene(scene);
            newstage.setResizable(resizable);
            newstage.initOwner(mainstage);
            newstage.show();
        }
        catch (Throwable t)
        { 
            t.printStackTrace();
        }
        
        return newstage;
    }
    
    public static Stage CreateStagewithScene(String fxml_url, boolean resizable, int width, int height)
    {
        Stage newstage = new Stage();
        try
        {
            Parent root = FXMLLoader.load(global_class_handle.getResource(fxml_url));

            Scene scene = new Scene(root, width, height);
            newstage.setScene(scene);
            newstage.setResizable(resizable);
            newstage.initOwner(mainstage);
            newstage.show();
        }
        catch (Throwable t)
        { 
            t.printStackTrace();
        }
        
        return newstage;
    }
}
