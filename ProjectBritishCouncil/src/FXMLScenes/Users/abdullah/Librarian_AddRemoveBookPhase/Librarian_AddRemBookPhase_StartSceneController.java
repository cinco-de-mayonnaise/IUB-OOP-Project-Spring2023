/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.abdullah.Librarian_AddRemoveBookPhase;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Abdullah
 */
public class Librarian_AddRemBookPhase_StartSceneController implements Initializable {

    @FXML
    private Button Btn_Close;
    @FXML
    private Button Btn_Next;
    @FXML
    private RadioButton RB_AddBook;
    @FXML
    private RadioButton RB_RemoveBook;
    @FXML
    private RadioButton RB_ModifyCount;

    private ToggleGroup TG_RB;
    @FXML
    private HBox topbarWizardHBoxLibrarian;
    @FXML
    private HBox leftbarWizardHBoxLibrarian;
    @FXML
    private AnchorPane centerWizardAnchorpaneLibrarian;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        TG_RB = new ToggleGroup();
        
        TG_RB.getToggles().add(RB_AddBook);
        TG_RB.getToggles().add(RB_RemoveBook);
        TG_RB.getToggles().add(RB_ModifyCount);
        
        Btn_Next.setDisable(true);
    }    

    @FXML
    private void click_Close(ActionEvent event)
    {
        // close the window
        SceneSwitcher.getStageFromEvent(event).close();
    }

    @FXML
    private void click_Next(ActionEvent event)
    {
        String fxml_url;
        if (TG_RB.getSelectedToggle() != null)
        {
            if (TG_RB.getSelectedToggle().equals(RB_AddBook))
                fxml_url = "/FXMLScenes/Users/abdullah/Librarian_AddRemoveBookPhase/Librarian_AddRemBookPhase_AddBook.fxml";
            else if (TG_RB.getSelectedToggle().equals(RB_RemoveBook))
                fxml_url = "/FXMLScenes/Users/abdullah/Librarian_AddRemoveBookPhase/Librarian_AddRemBookPhase_RemoveBook.fxml";
            else
                fxml_url = "/FXMLScenes/Users/abdullah/Librarian_AddRemoveBookPhase/Librarian_AddRemBookPhase_ModifyCount.fxml";
            
            SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), fxml_url);
        }
    }

    @FXML
    private void click_RB_UpdateNextButton(ActionEvent event) 
    {
        if (TG_RB.getSelectedToggle() != null)
            Btn_Next.setDisable(false);
    }
    
}
