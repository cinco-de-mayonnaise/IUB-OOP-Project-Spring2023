/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package projectbritishcouncil;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import projectbritishcouncil.common.TheFileDatabase;
import projectbritishcouncil.common.util.CommonInstancesClass;
import static projectbritishcouncil.common.util.Identifiers.GLOBAL_CLASS_HANDLE;
import static projectbritishcouncil.common.util.Identifiers.MAIN_STAGE;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 *
 * @author Abdullah
 */
public class ProjectBritishCouncil extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        ///// Global/Project-wide function setups
        CommonInstancesClass c = CommonInstancesClass.getInstance();
        
        /* holds a getClass() to the project that allows us to get URLs to FXML files easily*/
        c.putObject(GLOBAL_CLASS_HANDLE, getClass());
        
        /* the top level highest window/stage of this application. 
        This may change fron login screen to a dashboard, but 
        will always be the parent of all other created windows. 
        If this window is closed, the application exits. */
        c.putObject(MAIN_STAGE, stage);      
        /////
        
        // default file loading: load a file called database.dat at root, or create a file database.dat if it doesnt exist, 
        File dbfile = new File("database.dat");
        
        // check if file exists or not
        if (!dbfile.exists())
        {
            SceneSwitcher.raiseAlert_GenericWarning("Database file not found", "", "The database file does not exist. A new database file will be created. If necessary, please override the database file from the debug menu. ");
            // handle creating new file here, it should at least contain a dummy user of every type so that login is possible...
            dbfile.createNewFile();
            TheFileDatabase.setFile(dbfile);
            TheFileDatabase.CreateNewFile();
        }
        else
        {
            TheFileDatabase.setFile(dbfile);
            // read the file into memory.
            TheFileDatabase.ReadFromFile();
        }
        
        
        
        ///// Experimental stuff: if we need to overload standard file loading/saving behavior
        Experimental.insert_some_stuff_in_ht();
        
        ///// Initializing login screen (and creating window for it)
        Parent root = FXMLLoader.load(getClass().getResource("/FXMLScenes/LogonUI.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
