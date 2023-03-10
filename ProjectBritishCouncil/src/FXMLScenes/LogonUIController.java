/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import projectbritishcouncil.Users.protik.LibraryMember;  // this is how you import other people's user if you need it

/**
 * FXML Controller class
 *
 * @author Abdullah
 */
public class LogonUIController implements Initializable {

    @FXML
    private Label Label_Forgot_Password;
    @FXML
    private TextField TF_EmailID;
    @FXML
    private PasswordField PasswordField_AccPassword;
    @FXML
    private Button Btn_Login;
    @FXML
    private MenuItem Debug_OpenLibrarianDashboard;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void click_Forgot_Password(MouseEvent event) {
    }

    @FXML
    private void click_Login(MouseEvent event) {
    }

    @FXML
    private void Debug_OpenDashboard(ActionEvent event)
    {
        // we only need a handle to stage, it doesnt matter what element we use to get it
        Stage cur_stage = (Stage) Btn_Login.getScene().getWindow();
                
        if (event.getSource().equals(Debug_OpenLibrarianDashboard))
        {
            try
            {
                Parent root = FXMLLoader.load(getClass().getResource("/FXMLScenes/Users/abdullah/LibrarianDashboard.fxml"));

                Scene scene = new Scene(root);
                cur_stage.setScene(scene);
                cur_stage.setResizable(true);
                cur_stage.show();
            }
            catch (Throwable t)
            {
                t.printStackTrace();
            }
        
        }
        
    }
    
}
