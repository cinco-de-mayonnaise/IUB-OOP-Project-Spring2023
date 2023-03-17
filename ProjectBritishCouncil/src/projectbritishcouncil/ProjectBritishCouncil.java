/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package projectbritishcouncil;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 *
 * @author Abdullah
 */
public class ProjectBritishCouncil extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        ///// Global function setups
        SceneSwitcher.global_class_handle = getClass();
        SceneSwitcher.mainstage = stage;
        
        
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
