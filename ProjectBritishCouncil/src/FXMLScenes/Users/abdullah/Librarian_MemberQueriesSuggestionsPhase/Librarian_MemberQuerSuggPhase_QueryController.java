/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.abdullah.Librarian_MemberQueriesSuggestionsPhase;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Abdullah
 */
public class Librarian_MemberQuerSuggPhase_QueryController implements Initializable {

    @FXML
    private HBox topbarWizardHBoxLibrarian;
    @FXML
    private Button Btn_Close;
    @FXML
    private Label Label_Timestamp;
    @FXML
    private Label Label_QueryType;
    @FXML
    private Label Label_UserName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void click_Close(ActionEvent event)
    {
        SceneSwitcher.getStageFromEvent(event).close();
    }
    
}
