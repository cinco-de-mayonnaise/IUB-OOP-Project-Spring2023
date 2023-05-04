package FXMLScenes.Users.protik.IELTSCandidate;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Protik Hasan
 */
public class IELTSCandidateDashboardController implements Initializable {

    @FXML
    private Button logoutfxId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
