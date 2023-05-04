package FXMLScenes.Users.protik.IELTSCandidate;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Protik Hasan
 */
public class IELTSCandidateDashboardController implements Initializable {

    @FXML
    private TextArea statusfxid;
    @FXML
    private Label welcomeLabel;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void registerforIELTSonClick(ActionEvent event) {

    SceneSwitcher.createStagewithScene("/FXMLScenes/Users/protik/IELTSCandidate/IELTSRegistrationScene.fxml", false);

    //SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/Users/protik/IELTSCandidate/IELTSRegistrationScene.fxml");

    }

    @FXML
    private void cancelRegistrationonClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/protik/IELTSCandidate/CancelRegistration.fxml", false);
    }

    @FXML
    private void makePaymentonClick(ActionEvent event) {
    }

    @FXML
    private void ieltsCertificateonClick(ActionEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void IeltsResourcesOnClick(ActionEvent event) {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {

    //SceneSwitcher.createStagewithScene("/FXMLScenes/LogonUI.fxml", false);
    SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/LogonUI.fxml");

    }
}
