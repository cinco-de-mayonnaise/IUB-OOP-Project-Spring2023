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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author samir
 */
public class AdminViewBulletinBoardSceneController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private MenuButton MenuMenuBar;
    @FXML
    private MenuButton settignsMenuBar;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextArea noticeTextArea;
    @FXML
    private RadioButton allUserRB;
    @FXML
    private RadioButton specificUserRB;
    @FXML
    private ComboBox<?> specifyUsersComboBox;

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
    private void goBackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void postButtonOnClick(ActionEvent event) {
    }
    
}
