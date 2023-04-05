/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.abdullah.Librarian_AddRemoveBookPhase;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Abdullah
 */
public class Librarian_AddRemBookPhase_AddBookController implements Initializable {

    @FXML
    private HBox topbarWizardHBoxLibrarian;
    @FXML
    private HBox leftbarWizardHBoxLibrarian;
    @FXML
    private Button Btn_Close;
    @FXML
    private AnchorPane centerWizardAnchorpaneLibrarian;
    @FXML
    private TextField TF_Name;
    @FXML
    private TextField TF_ISBN;
    @FXML
    private ComboBox<String> CB_Category;
    @FXML
    private Button Btn_Choose_Image;
    @FXML
    private ImageView IV_InvalidInfo;
    @FXML
    private Label Label_InvalidInfo;
    @FXML
    private Button Btn_Add_Book;
    @FXML
    private ImageView IV_BookImage;

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
        // close the window
        SceneSwitcher.getStageFromEvent(event).close();
    }

    @FXML
    private void click_Add_Book(ActionEvent event)
    {
        // close the window
        SceneSwitcher.getStageFromEvent(event).close();
    }

    @FXML
    private void click_Choose_Image(ActionEvent event)
    {
        FileChooser fc = new FileChooser();
        fc.setTitle("Open Image for Book");
        File selectedImage = fc.showOpenDialog(SceneSwitcher.getStageFromEvent(event));
    }
}
