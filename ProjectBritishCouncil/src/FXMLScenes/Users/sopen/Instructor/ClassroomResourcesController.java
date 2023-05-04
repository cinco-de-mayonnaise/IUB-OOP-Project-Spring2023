/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXMLScenes.Users.sopen.Instructor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Mohd. Inkead Sopen
 */
public class ClassroomResourcesController implements Initializable {
    

    @FXML
    private ComboBox<String> combobox;
    @FXML
    private Button post;
    @FXML
    private Button load;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.getItems().addAll("IELTS", "Cambridge English", "Trinity College London", "LanguageCert", "TOEFL", "OET");
        combobox.setValue("Select Course");
        // TODO
    }    

    @FXML
    private void comboboxbtn(ActionEvent event) {
    }

    @FXML
    private void postbtn(ActionEvent event) {
    }

    @FXML
    private void loadbtn(ActionEvent event) {
    }
    
}
