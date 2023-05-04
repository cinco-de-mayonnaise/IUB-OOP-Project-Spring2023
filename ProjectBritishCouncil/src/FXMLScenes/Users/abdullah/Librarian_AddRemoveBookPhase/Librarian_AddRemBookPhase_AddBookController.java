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
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Window;
import projectbritishcouncil.Users.abdullah.Book;
import projectbritishcouncil.common.DataImage;
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
    
    String newBookName;
    String newBookISBN;
    String newBookCategory;
    DataImage newBookCover;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        Btn_Add_Book.setDisable(true);
        CB_Category.getItems().addAll("Sci-Fi", "Horror", "Non-Fiction", "Educational");
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
        Book b = new Book(newBookName, newBookISBN, newBookCategory, newBookCover);
        
        // close the window
        SceneSwitcher.getStageFromEvent(event).close();
    }
    
    
    @FXML
    private void click_Choose_Image(ActionEvent event)
    {
        FileChooser fc = new FileChooser();
        fc.setTitle("Open Image for Book");
        fc.setSelectedExtensionFilter(new ExtensionFilter("*.png", "*.bmp", "*.gif", ".jpeg"));
        
        File selectedImage = fc.showOpenDialog(SceneSwitcher.getStageFromEvent(event));
        if (selectedImage == null)
            return;    // file was not selected.
        
        
        newBookCover = new DataImage(selectedImage.getPath());
        
    }

    @FXML
    private void check_if_done(ActionEvent event)
    {
        //if (TF_Name.getText() == null || TF_ISBN == null || TF_)
            
    }
}
