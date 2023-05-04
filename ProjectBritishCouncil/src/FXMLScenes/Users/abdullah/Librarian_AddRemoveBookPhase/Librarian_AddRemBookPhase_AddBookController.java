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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Window;
import projectbritishcouncil.Users.abdullah.Book;
import projectbritishcouncil.common.DataImage;
import projectbritishcouncil.common.util.CommonInstancesClass;
import static projectbritishcouncil.common.util.Identifiers.IMAGE_NOTOK;
import static projectbritishcouncil.common.util.Identifiers.IMAGE_OK;
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
    @FXML
    private HBox HBox_InvalidInfo;
    
    String newBookName;
    String newBookISBN;
    String newBookCategory;
    DataImage newBookCover;
    
    CommonInstancesClass cic = CommonInstancesClass.getInstance();
    Image im_ok, im_notok;
    final String[] invalidinfo_messages = {"Please fill in the empty fields.", "Please enter a valid ISBN"};
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        im_ok = (Image) cic.getObject(IMAGE_OK);
        im_notok = (Image) cic.getObject(IMAGE_NOTOK);
        
        Btn_Add_Book.setDisable(true);
        CB_Category.getItems().addAll("Sci-Fi", "Horror", "Non-Fiction", "Educational");
    
        IV_BookImage.setPreserveRatio(true);
        IV_BookImage.setFitHeight(IV_BookImage.getLayoutY());
        
       
        IV_InvalidInfo.setPreserveRatio(true);
        IV_InvalidInfo.setFitHeight(IV_InvalidInfo.getLayoutY());
        
         // initially fields are empty so its not ok
        IV_InvalidInfo.setImage(im_notok);
        Label_InvalidInfo.setText(invalidinfo_messages[0]);
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
    private void check_if_done_A(ActionEvent event)
    {
        if (TF_Name.getText().equals("") || TF_ISBN.getText().equals("") || CB_Category.getValue() == null)
        {
            Btn_Add_Book.setDisable(true);
        }
        else
        {
            Btn_Add_Book.setDisable(false);
        }
    }
    
    static boolean isValidISBN(String isbn)
    {
        // length must be 10
        int n = isbn.length();
        if (n != 10)
            return false;
  
        // Computing weighted sum
        // of first 9 digits
        int sum = 0;
        for (int i = 0; i < 9; i++) 
        {
            int digit = isbn.charAt(i) - '0';
            if (0 > digit || 9 < digit)
                return false;
            sum += (digit * (10 - i));
        }
  
        // Checking last digit.
        char last = isbn.charAt(9);
        if (last != 'X' && (last < '0' || 
                            last > '9'))
            return false;
  
        // If last digit is 'X', add 10 
        // to sum, else add its value
        sum += ((last == 'X') ? 10 : (last - '0'));
  
        // Return true if weighted sum 
        // of digits is divisible by 11.
        return (sum % 11 == 0);
    }
   
    @FXML
    private void check_if_done_I(InputEvent event)
    {
        boolean namenotok = TF_Name.getText().equals("");
        boolean isbnnotok = TF_ISBN.getText().equals("");
        boolean catnotok = CB_Category.getValue() == null;
        
        if (namenotok || isbnnotok || catnotok)
        {
            Btn_Add_Book.setDisable(true);
            IV_InvalidInfo.setImage(im_notok);
            Label_InvalidInfo.setText(invalidinfo_messages[0]);
        }
        
        else
        {
            Btn_Add_Book.setDisable(false);
            IV_InvalidInfo.setImage(im_ok);
            Label_InvalidInfo.setText("");
        }
    }
}
