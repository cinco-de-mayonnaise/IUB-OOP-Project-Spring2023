/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package FXMLScenes.Users.samira;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author samir
 */
public class MainApplication extends Application {
    
    @Override
    public void start(Stage Stage) throws Exception {
       Parent root;
        root = FXMLLoader.load(getClass().getResource("AdminDashboardScene.fxml"));
          
        Scene scene = new Scene(root);
        
        Stage.setScene(scene);
        Stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
