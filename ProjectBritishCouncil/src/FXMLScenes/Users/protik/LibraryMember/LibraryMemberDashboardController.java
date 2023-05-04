/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXMLScenes.Users.protik.LibraryMember;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Protik Hasan
 */
public class LibraryMemberDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void availableBooksOnClick(ActionEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void borrowBookOnClick(ActionEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void extendBorrowaldateonClick(ActionEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void makePaymentonClick(ActionEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void requestforanUnavailableBookonClick(ActionEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void bookRoomOnClick(ActionEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/LogonUI.fxml");
    }
    
}
