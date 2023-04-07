/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author samir
 */
public class CheckingPaperSceneController implements Initializable {

    @FXML
    private MenuButton MenuMenuBar;
    @FXML
    private MenuButton settignsMenuBar;
    @FXML
    private ComboBox<?> studentIDComboBox;
    @FXML
    private TextArea answerTextArea;
    @FXML
    private TextArea MSanswerTextArea;
    @FXML
    private ComboBox<?> QuestionNumberComboBox1;
    @FXML
    private ComboBox<?> selectMarkSchemeComboBox2;
    @FXML
    private TextField marksTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goHomeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void showMenuOptionsOnClick(ActionEvent event) {
    }

    @FXML
    private void showSettingsOnClick(ActionEvent event) {
    }

    @FXML
    private void goToNextSceneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }
    
}
