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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Abdullah
 */
public class Librarian_MemberQuerSuggPhase_Main__frameController implements Initializable {

    @FXML
    private HBox topbarMemberQuerSuggLibrarian;
    @FXML
    private Button Btn_Close;
    @FXML
    private Line liine33;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        liine33.endXProperty().bind(topbarMemberQuerSuggLibrarian.widthProperty());
    }    

    private void click_Btn_Select_Query_Debug(ActionEvent event)
    {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/abdullah/Librarian_MemberQueriesSuggestionsPhase/Librarian_MemberQuerSuggPhase_Query.fxml", true);
    }


    @FXML
    private void click_Close(ActionEvent event) 
    {
        SceneSwitcher.getStageFromNode(Btn_Close).close();
    }

    

}
