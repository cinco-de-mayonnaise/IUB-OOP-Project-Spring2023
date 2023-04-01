/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.abdullah.AddRemoveBookPhase;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

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
    }    
    
}
