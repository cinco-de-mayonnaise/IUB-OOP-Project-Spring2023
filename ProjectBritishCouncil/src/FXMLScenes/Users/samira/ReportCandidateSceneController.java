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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author samir
 */
public class ReportCandidateSceneController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private MenuButton MenuMenuBar;
    @FXML
    private MenuButton settignsMenuBar;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField studentIdTextField;
    @FXML
    private CheckBox paymentUnclearCheckBox;
    @FXML
    private CheckBox misconductCheckBox;
    @FXML
    private CheckBox PlagiarismCheckBox;
    @FXML
    private CheckBox violationCheckBox;
    @FXML
    private CheckBox OtherCheckBox;
    @FXML
    private TextArea reasonTextArea;
    @FXML
    private Button goBackButtonOnClick;

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
    private void reportStudentOnClick(ActionEvent event) {
    }
    
}
