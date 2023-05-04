/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.protik.IELTSCandidate;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Protik Hasan
 */
public class PaymentMethodController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gPayOnClick(MouseEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void applePayOnClick(MouseEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void bKashPayOnClick(MouseEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void nagadPayOnClick(MouseEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/protik/IELTSCandidate/IELTSRegistrationScene.fxml", false);
    }
    
}
