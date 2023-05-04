/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author samir
 */
public class AdminViewBulletinBoardSceneController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private MenuButton MenuMenuBar;
    @FXML
    private MenuButton settingsMenuBar;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextArea noticeTextArea;
    private Stage stage;
    @FXML
    private RadioButton allUserRB;
    @FXML
    private RadioButton specificUserRB;
    @FXML
    private ComboBox<String> specifyUsersComboBox;
    private ArrayList<String> usersList;
     private ToggleGroup tg;
   
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usersList  = new ArrayList<String>();
        tg = new ToggleGroup();
        allUserRB.setToggleGroup(tg);
        specificUserRB.setToggleGroup(tg);    
        allUserRB.setSelected(true);
      
        if(specificUserRB.isSelected()){
             specifyUsersComboBox.getItems().addAll("Librarian", "Private Candidate", "IELTS Candidate", "Library Member", "Examiner", "Instructor", "Invigilator" );
        // TODO
        }
    }    

    @FXML
    private void goHomeButtonOnClick(ActionEvent event) {
         SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/Users/samira/ExaminerDashboardScene.fxml");
    }


    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
          Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Go Back");
    alert.setHeaderText("You're about to leave this page");
    alert.setContentText("Are you sure you want to leave this page?");

    ButtonType confirmButtonType = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
    ButtonType cancelButtonType = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
    alert.getButtonTypes().setAll(confirmButtonType, cancelButtonType);

    Optional<ButtonType> result = alert.showAndWait();
    if (result.isPresent() && result.get() == confirmButtonType) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/FXMLScenes.Users.samira/AdminDashboardScene.fxml", true);
     }
  }



    @FXML
    private void postButtonOnClick(ActionEvent event) {
        if(allUserRB.isSelected() || specificUserRB.isSelected()){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save File");
        fileChooser.setInitialFileName("Untitled.txt");
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(noticeTextArea.getText());
                fileWriter.close();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("File Saved");
                alert.setContentText("The file has been saved successfully.");
                alert.showAndWait();
            } catch (IOException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Error Saving File");
                alert.setContentText("An error occurred while saving the file.");
                alert.showAndWait();
            }
          }
       }
        else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Error Saving File");
                alert.setContentText("Please specify the receievers of the notice");
                alert.showAndWait();
        }
    }

    @FXML
    private void viewComplaints(ActionEvent event) {
         SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/Users/samira/AdminViewComplaintsScene.fxml");
    }

    @FXML
    private void addUser(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/Users/samira/AdminViewComplaintsScene.fxml");
    }

    @FXML
    private void removeUser(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/Users/samira/ViewListsOfUsersScene.fxml");
    }



    private void resolveRequests(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/Users/samira/AdminViewComplaintsScene.fxml");
    }

    private void help(ActionEvent event) {
        SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "/FXMLScenes/Users/samira/AdminViewComplaintsScene.fxml");
    }

    private void logout(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("Are you sure you want to Logout?");
            alert.setContentText("Click OK to Confirm");
       
           Optional <ButtonType> result = alert.showAndWait();
            if(result.get() == ButtonType.OK){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ExaminerDashboardScene.fxml"));
                Parent homePageParent = loader.load();
                Scene homaPageScene = new Scene(homePageParent);
           
                Stage currentStage = (Stage)settignsMenuBar.getScene().getWindow();
                currentStage.setScene(homaPageScene);
                currentStage.show();
           
       }
       
       else{
           
       }
    }
}
    

