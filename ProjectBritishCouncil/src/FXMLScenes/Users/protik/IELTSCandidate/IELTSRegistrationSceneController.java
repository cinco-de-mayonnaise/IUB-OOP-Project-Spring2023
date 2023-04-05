/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXMLScenes.Users.protik.IELTSCandidate;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Protik Hasan
 */
public class IELTSRegistrationSceneController implements Initializable {

    @FXML
    private TextField namefxid;
    @FXML
    private TextField mothersnamefxid;
    @FXML
    private TextField passportnofxid;
    @FXML
    private TextField fathersnamefxid;
    @FXML
    private TextField contactnofxid;
    @FXML
    private RadioButton maleradiofxid;
    @FXML
    private RadioButton femaleradiofxid;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackbuttonOnClick(ActionEvent event) {
    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.close();
    }

    @FXML
    private void RegisterbuttonOnClick(ActionEvent event) {
    }
    
}
