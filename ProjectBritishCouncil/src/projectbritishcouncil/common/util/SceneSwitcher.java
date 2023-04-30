/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common.util;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import static projectbritishcouncil.common.util.Identifiers.GLOBAL_CLASS_HANDLE;
import static projectbritishcouncil.common.util.Identifiers.MAIN_STAGE;

/**
 *
 * @author Abdullah
 */
public class SceneSwitcher
{
    // Changes the window(in cur_stage) to the Scene(in fxml_url). No other properties are changed. 
    public static void switchToScene(Stage cur_stage, String fxml_url)
    {
        CommonInstancesClass CIC = CommonInstancesClass.getInstance();
        
        Class <?> global_class_handle = (Class<?>) CIC.getObject(GLOBAL_CLASS_HANDLE);
        try
        {
            FXMLLoader loader = new FXMLLoader(global_class_handle.getResource(fxml_url));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            cur_stage.setScene(scene);
            cur_stage.show();
        }
        catch (Throwable t)
        { 
            t.printStackTrace();
            if (global_class_handle.getResource(fxml_url) == null)
            {
                System.out.println("\n-----getResource failed! Ensure fxml_url is correct...\nfxml_url: " + fxml_url + "\n");
            }
        }
    }
    
    // Creates a new child window with the Scene, and returns the stage associated with the window.
    public static Stage createStagewithScene(String fxml_url, boolean resizable)
    {
        CommonInstancesClass CIC = CommonInstancesClass.getInstance();
        Class <?> global_class_handle = (Class<?>) CIC.getObject(GLOBAL_CLASS_HANDLE);
        Stage mainstage = (Stage) CIC.getObject(MAIN_STAGE);
        
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
            if (global_class_handle.getResource(fxml_url) == null)
            {
                System.out.println("\n-----getResource failed! Ensure fxml_url is correct...\nfxml_url: " + fxml_url + "\n");
            }
        }
        
        return newstage;
    }
    
    public static Stage createStagewithScene(String fxml_url, boolean resizable, int width, int height)
    {
        CommonInstancesClass CIC = CommonInstancesClass.getInstance();
        Class <?> global_class_handle = (Class<?>) CIC.getObject(GLOBAL_CLASS_HANDLE);
        Stage mainstage = (Stage) CIC.getObject(MAIN_STAGE);
        
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
            if (global_class_handle.getResource(fxml_url) == null)
            {
                System.out.println("\n-----getResource failed! Ensure fxml_url is correct...\nfxml_url: " + fxml_url + "\n");
            }
        }
        
        return newstage;
    }
    
    public static Parent getRootNodeFromURL(String fxml_url)
    {
        CommonInstancesClass CIC = CommonInstancesClass.getInstance();
        
        Class <?> global_class_handle = (Class<?>) CIC.getObject(GLOBAL_CLASS_HANDLE);
        try
        {
            Parent root = FXMLLoader.load(global_class_handle.getResource(fxml_url));
            
            return root;
        }
        catch (Throwable t)
        { 
            t.printStackTrace();
            if (global_class_handle.getResource(fxml_url) == null)
            {
                System.out.println("\n-----getResource failed! Ensure fxml_url is correct...\nfxml_url: " + fxml_url + "\n");
            }
            return null;
        }
    }
    
    public static Stage getStageFromEvent(Event event)
    {
        return (Stage)((Node)event.getSource()).getScene().getWindow();
    }
    
    public static Stage getStageFromNode(Node n)
    {
        return (Stage)(n.getScene().getWindow());
    }
    
    public static void raiseAlert_NotImplemented()
    {
        Alert win = new Alert(AlertType.WARNING);
        win.setContentText("This feature has not been implemented yet.");
    
        win.showAndWait();
    }
    
    public static void raiseAlert_BugCheck(String errorstr)
    {
        Alert win = new Alert(AlertType.WARNING);
        win.setHeaderText("Oh no! A bug!");
        win.setContentText("You shouldn't be seeing this dialog box! If you see this, let the developers know.\nHere's some additional information that could help them...\n\n\n" + errorstr);
        
        win.showAndWait();
    }
    
    public static void raiseAlert_GenericError(String title, String header, String content)
    {
        Alert win = new Alert(AlertType.ERROR);
        if (!title.equals(""))
            win.setTitle(title);
        
        if (!header.equals(""))
            win.setHeaderText(header);
        
        if (!content.equals(""))
            win.setContentText(content);
        
        win.showAndWait();
    }
    
    public static void raiseAlert_GenericWarning(String title, String header, String content)
    {
        Alert win = new Alert(AlertType.WARNING);
        if (!title.equals(""))
            win.setTitle(title);
        
        if (!header.equals(""))
            win.setHeaderText(header);
        
        if (!content.equals(""))
            win.setContentText(content);
        
        win.showAndWait();
    }
}
