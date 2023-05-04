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

public class IELTSCandidateDashboardController implements Initializable {

    @FXML
    private Label statusfxid;
    @FXML
    private Label welcomeLabel;
    @FXML
    private TextArea textareafxid;
    @FXML
    private Button registerButton;    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    try {
    File f = new File("Registration_Data.txt");
    Scanner sc; String str; String[] tokens;
    sc = new Scanner(f);
    if(f.exists()){
        textareafxid.appendText("You are not registered for IELTS\n");
        while(sc.hasNextLine()){
            str=sc.nextLine();
            tokens = str.split(",");
            textareafxid.appendText("Candidate Name: "+tokens[0]+"\nYour exam is in :"+tokens[6]+",\nCity:"+tokens[7]+",\nVenue:"+tokens[8]+",\nTime:"+tokens[9]+",\nTest:"+tokens[10]+",\nDisability Requirement:"+tokens[11]+"\n");
            statusfxid.setText("You are Registered For IELTS");
            registerButton.setDisable(true);
        }
    }
    // TODO
}  catch (FileNotFoundException ex) {
    Logger.getLogger(IELTSCandidateDashboardController.class.getName()).log(Level.SEVERE, null, ex);
}

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
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/protik/IELTSCandidate/PaymentMethod.fxml", false);
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
