/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package FXMLScenes.Users.samira;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
public class GradeBoundary extends Application {

    public GradeBoundary(String jan, String string) {
    }
    
    @Override
    public void start(Stage Stage) throws Exception {
        AnchorPane root = FXMLLoader.load(getClass().getResource("GradeBoundaryScene.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("EmployeeAverageSalaryScene.fxml"));
     
       
        
        Scene scene = new Scene(root);
        
        
        Stage.setScene(scene);
        Stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}